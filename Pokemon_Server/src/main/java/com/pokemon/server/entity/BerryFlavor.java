package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_berry_flavors")
public class BerryFlavor implements Serializable {
	private static final long serialVersionUID = 6025614966727988644L;

	@Column(name = "berry_id")
	private Integer berryid;

	@Column(name = "contest_type_id")
	private Integer contestTypeId;

	@Column(name = "flavor")
	private Integer flavor;

	public BerryFlavor() {
	}

	public BerryFlavor(Integer berryid, Integer contestTypeId, Integer flavor) {
		this.berryid = berryid;
		this.contestTypeId = contestTypeId;
		this.flavor = flavor;
	}

	public Integer getBerryid() {
		return berryid;
	}

	public void setBerryid(Integer berryid) {
		this.berryid = berryid;
	}

	public Integer getContestTypeId() {
		return contestTypeId;
	}

	public void setContestTypeId(Integer contestTypeId) {
		this.contestTypeId = contestTypeId;
	}

	public Integer getFlavor() {
		return flavor;
	}

	public void setFlavor(Integer flavor) {
		this.flavor = flavor;
	}

	@Override
	public String toString() {
		return "BerryFlavor [berryid=" + berryid + ", contestTypeId=" + contestTypeId + ", flavor=" + flavor + "]";
	}
}