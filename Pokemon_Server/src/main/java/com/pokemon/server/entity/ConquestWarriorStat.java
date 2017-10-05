package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_warrior_stats")
public class ConquestWarriorStat implements Serializable {
	private static final long serialVersionUID = 5404300508508752655L;

	@Id
	@Column(name = "conquest_warrior_stat_id", unique = true, nullable = false)
	private Integer conquestWarriorStatId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	public ConquestWarriorStat() {
	}

	public ConquestWarriorStat(Integer conquestWarriorStatId, String name, String nameAlias) {
		this.conquestWarriorStatId = conquestWarriorStatId;
		this.name = name;
		this.nameAlias = nameAlias;
	}

	public Integer getConquestWarriorStatId() {
		return conquestWarriorStatId;
	}

	public void setConquestWarriorStatId(Integer conquestWarriorStatId) {
		this.conquestWarriorStatId = conquestWarriorStatId;
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

	@Override
	public String toString() {
		return "ConquestWarriorStat [conquestWarriorStatId=" + conquestWarriorStatId + ", name=" + name + ", nameAlias="
				+ nameAlias + "]";
	}
}