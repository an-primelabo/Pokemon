package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_warrior_ranks")
public class ConquestWarriorRank implements Serializable {
	private static final long serialVersionUID = -737235750055597422L;

	@Id
	@Column(name = "conquest_warrior_rank_id", unique = true, nullable = false)
	private Integer conquestWarriorRankId;

	@Column(name = "conquest_warrior_id")
	private Integer conquestWarriorId;

	@Column(name = "rank")
	private Integer rank;

	@Column(name = "conquestWarriorSkillId")
	private Integer conquest_warrior_skill_id;

	public ConquestWarriorRank() {
	}

	public ConquestWarriorRank(Integer conquestWarriorRankId, Integer conquestWarriorId, Integer rank,
			Integer conquest_warrior_skill_id) {
		this.conquestWarriorRankId = conquestWarriorRankId;
		this.conquestWarriorId = conquestWarriorId;
		this.rank = rank;
		this.conquest_warrior_skill_id = conquest_warrior_skill_id;
	}

	public Integer getConquestWarriorRankId() {
		return conquestWarriorRankId;
	}

	public void setConquestWarriorRankId(Integer conquestWarriorRankId) {
		this.conquestWarriorRankId = conquestWarriorRankId;
	}

	public Integer getConquestWarriorId() {
		return conquestWarriorId;
	}

	public void setConquestWarriorId(Integer conquestWarriorId) {
		this.conquestWarriorId = conquestWarriorId;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Integer getConquest_warrior_skill_id() {
		return conquest_warrior_skill_id;
	}

	public void setConquest_warrior_skill_id(Integer conquest_warrior_skill_id) {
		this.conquest_warrior_skill_id = conquest_warrior_skill_id;
	}

	@Override
	public String toString() {
		return "ConquestWarriorRank [conquestWarriorRankId=" + conquestWarriorRankId + ", conquestWarriorId="
				+ conquestWarriorId + ", rank=" + rank + ", conquest_warrior_skill_id=" + conquest_warrior_skill_id
				+ "]";
	}
}