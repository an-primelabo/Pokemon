package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_stats")
public class ConquestStat implements Serializable {
	private static final long serialVersionUID = -6434633690532376214L;

	@Id
	@Column(name = "conquest_stat_id", unique = true, nullable = false)
	private Integer conquestStatId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	@Column(name = "is_base")
	private Boolean isBase;

	public ConquestStat() {
	}

	public ConquestStat(Integer conquestStatId, String name, String nameAlias, Boolean isBase) {
		this.conquestStatId = conquestStatId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.isBase = (isBase != null) ? isBase : Boolean.TRUE;
	}

	public ConquestStat(Integer conquestStatId, String name, String nameAlias) {
		this.conquestStatId = conquestStatId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.isBase = Boolean.TRUE;
	}

	public Integer getConquestStatId() {
		return conquestStatId;
	}

	public void setConquestStatId(Integer conquestStatId) {
		this.conquestStatId = conquestStatId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameAlias() {
		return nameAlias;
	}

	public void setNameAlias(String nameAlias) {
		this.nameAlias = nameAlias;
	}

	public Boolean getIsBase() {
		return isBase;
	}

	public void setIsBase(Boolean isBase) {
		this.isBase = isBase;
	}

	@Override
	public String toString() {
		return "ConquestStat [conquestStatId=" + conquestStatId + ", name=" + name + ", nameAlias=" + nameAlias
				+ ", isBase=" + isBase + "]";
	}
}