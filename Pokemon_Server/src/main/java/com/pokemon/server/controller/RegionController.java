package com.pokemon.server.controller;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.server.constant.Constants;
import com.pokemon.server.entity.Region;
import com.pokemon.server.service.IRegionService;
import com.pokemon.server.util.Utils;

@RestController
@RequestMapping("regions")
public class RegionController {
	final static Logger log = Logger.getLogger(RegionController.class);

	@Autowired
	IRegionService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Region> findById(@PathVariable("id") Integer id) {
		Region region = service.findById(id);

		if (region == null) {
			log.debug(Utils.getMessage(Constants.MSG_NOT_FOUND,
					new String[] { Constants.TABLE_REGION_ENTITY_NAME, id.toString() }));
			return new ResponseEntity<Region>(HttpStatus.NOT_FOUND);
		}
		log.debug(Utils.getMessage(Constants.MSG_FOUND_RECORD, new String[] { Constants.TABLE_REGION_ENTITY_NAME }));
		log.debug(region);
		return new ResponseEntity<Region>(region, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Region>> getAll() {
		List<Region> list = service.getAll();

		if (list.isEmpty()) {
			log.debug(Utils.getMessage(Constants.MSG_TABLE_EMPTY, new String[] { Constants.TABLE_REGION_NAME }));
			return new ResponseEntity<List<Region>>(HttpStatus.NO_CONTENT);
		}
		log.debug(Utils.getMessage(Constants.MSG_FOUND_LIST, new String[] { String.valueOf(list.size()) }));
		log.debug(list);
		log.debug(Arrays.toString(list.toArray()));
		return new ResponseEntity<List<Region>>(list, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Region> save(@RequestBody Region region) {
		boolean isExists = service.isExists(region);

		if (isExists) {
			log.debug(Utils.getMessage(Constants.MSG_CONFLICT,
					new String[] { Constants.TABLE_REGION_ENTITY_NAME, String.valueOf(region.getRegionId()) }));
			return new ResponseEntity<Region>(region, HttpStatus.CONFLICT);
		}
		service.save(region);

		log.debug(Utils.getMessage(Constants.MSG_CREATED, new String[] { Constants.TABLE_REGION_ENTITY_NAME }));
		log.debug(region);
		return new ResponseEntity<Region>(region, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Region region) {
		Region existingRegion = service.findById(region.getRegionId());

		if (existingRegion == null) {
			log.debug(Utils.getMessage(Constants.MSG_NOT_FOUND,
					new String[] { Constants.TABLE_REGION_ENTITY_NAME, String.valueOf(region.getRegionId()) }));
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		// service.save(region);

		log.debug(Utils.getMessage(Constants.MSG_UPDATED, new String[] { Constants.TABLE_REGION_ENTITY_NAME }));
		log.debug(region);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		Region region = service.findById(id);

		if (region == null) {
			log.debug(Utils.getMessage(Constants.MSG_NOT_FOUND,
					new String[] { Constants.TABLE_REGION_ENTITY_NAME, id.toString() }));
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		// service.delete(id);

		log.debug(Utils.getMessage(Constants.MSG_DELETED,
				new String[] { Constants.TABLE_REGION_ENTITY_NAME, id.toString() }));
		return new ResponseEntity<Void>(HttpStatus.GONE);
	}
}