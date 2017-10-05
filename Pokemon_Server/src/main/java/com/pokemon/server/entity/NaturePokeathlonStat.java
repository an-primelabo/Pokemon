package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_nature_pokeathlon_stats")
public class NaturePokeathlonStat implements Serializable {
	private static final long serialVersionUID = 230048510001408840L;

	@Column(name = "nature_id")
	private Integer natureId;

	@Column(name = "pokeathlon_stat_id")
	private Integer pokeathlonStatId;

	@Column(name = "max_change")
	private Integer maxChange;

	public NaturePokeathlonStat() {
	}

	public NaturePokeathlonStat(Integer natureId, Integer pokeathlonStatId, Integer maxChange) {
		this.natureId = natureId;
		this.pokeathlonStatId = pokeathlonStatId;
		this.maxChange = maxChange;
	}

	public Integer getNatureId() {
		return natureId;
	}

	public void setNatureId(Integer natureId) {
		this.natureId = natureId;
	}

	public Integer getPokeathlonStatId() {
		return pokeathlonStatId;
	}

	public void setPokeathlonStatId(Integer pokeathlonStatId) {
		this.pokeathlonStatId = pokeathlonStatId;
	}

	public Integer getMaxChange() {
		return maxChange;
	}

	public void setMaxChange(Integer maxChange) {
		this.maxChange = maxChange;
	}

	@Override
	public String toString() {
		return "NaturePokeathlonStat [natureId=" + natureId + ", pokeathlonStatId=" + pokeathlonStatId + ", maxChange="
				+ maxChange + "]";
	}
}