package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_warrior_rank_stat_map")
public class ConquestWarriorRankStatMap implements Serializable {
	private static final long serialVersionUID = 916379915686777096L;

	@Column(name = "conquest_warrior_rank_id")
	private Integer conquestWarriorRankId;

	@Column(name = "conquest_warrior_stat_id")
	private Integer conquestWarriorStatId;

	@Column(name = "base_stat")
	private Integer baseStat;

	public ConquestWarriorRankStatMap() {
	}

	public ConquestWarriorRankStatMap(Integer conquestWarriorRankId, Integer conquestWarriorStatId, Integer baseStat) {
		this.conquestWarriorRankId = conquestWarriorRankId;
		this.conquestWarriorStatId = conquestWarriorStatId;
		this.baseStat = baseStat;
	}

	public Integer getConquestWarriorRankId() {
		return conquestWarriorRankId;
	}

	public void setConquestWarriorRankId(Integer conquestWarriorRankId) {
		this.conquestWarriorRankId = conquestWarriorRankId;
	}

	public Integer getConquestWarriorStatId() {
		return conquestWarriorStatId;
	}

	public void setConquestWarriorStatId(Integer conquestWarriorStatId) {
		this.conquestWarriorStatId = conquestWarriorStatId;
	}

	public Integer getBaseStat() {
		return baseStat;
	}

	public void setBaseStat(Integer baseStat) {
		this.baseStat = baseStat;
	}

	@Override
	public String toString() {
		return "ConquestWarriorRankStatMap [conquestWarriorRankId=" + conquestWarriorRankId + ", conquestWarriorStatId="
				+ conquestWarriorStatId + ", baseStat=" + baseStat + "]";
	}
}