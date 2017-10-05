package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_episode_warriors")
public class ConquestEpisodeWarrior implements Serializable {
	private static final long serialVersionUID = 6283937093251930585L;

	@Id
	@Column(name = "conquest_episode_warrior_id", unique = true, nullable = false)
	private Integer conquestEpisodeWarriorId;

	@Column(name = "conquest_warrior_id")
	private Integer conquestWarriorId;

	public ConquestEpisodeWarrior() {
	}

	public ConquestEpisodeWarrior(Integer conquestEpisodeWarriorId, Integer conquestWarriorId) {
		this.conquestEpisodeWarriorId = conquestEpisodeWarriorId;
		this.conquestWarriorId = conquestWarriorId;
	}

	public Integer getConquestEpisodeWarriorId() {
		return conquestEpisodeWarriorId;
	}

	public void setConquestEpisodeWarriorId(Integer conquestEpisodeWarriorId) {
		this.conquestEpisodeWarriorId = conquestEpisodeWarriorId;
	}

	public Integer getConquestWarriorId() {
		return conquestWarriorId;
	}

	public void setConquestWarriorId(Integer conquestWarriorId) {
		this.conquestWarriorId = conquestWarriorId;
	}

	@Override
	public String toString() {
		return "ConquestEpisodeWarrior [conquestEpisodeWarriorId=" + conquestEpisodeWarriorId + ", conquestWarriorId="
				+ conquestWarriorId + "]";
	}
}