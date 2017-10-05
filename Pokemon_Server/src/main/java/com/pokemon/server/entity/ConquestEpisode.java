package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_episodes")
public class ConquestEpisode implements Serializable {
	private static final long serialVersionUID = 3753799449241371702L;

	@Id
	@Column(name = "conquest_episode_id", unique = true, nullable = false)
	private Integer conquestEpisodeId;

	@Column(name = "name", length = 256)
	private String name;

	@Column(name = "name_alias", length = 256)
	private String nameAlias;

	public ConquestEpisode() {
	}

	public ConquestEpisode(Integer conquestEpisodeId, String name, String nameAlias) {
		this.conquestEpisodeId = conquestEpisodeId;
		this.name = name;
		this.nameAlias = nameAlias;
	}

	public Integer getConquestEpisodeId() {
		return conquestEpisodeId;
	}

	public void setConquestEpisodeId(Integer conquestEpisodeId) {
		this.conquestEpisodeId = conquestEpisodeId;
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
		return "ConquestEpisode [conquestEpisodeId=" + conquestEpisodeId + ", name=" + name + ", nameAlias=" + nameAlias
				+ "]";
	}
}