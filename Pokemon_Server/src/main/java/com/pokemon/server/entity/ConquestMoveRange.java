package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_move_ranges")
public class ConquestMoveRange implements Serializable {
	private static final long serialVersionUID = -4797926440235808508L;

	@Id
	@Column(name = "conquest_move_range_id", unique = true, nullable = false)
	private Integer conquestMoveRangeId;

	@Column(name = "name", length = 32)
	private String name;

	@Column(name = "name_alias", length = 32)
	private String nameAlias;

	@Column(name = "targets")
	private Integer targets;

	@Column(name = "description")
	private String description;

	public ConquestMoveRange() {
	}

	public ConquestMoveRange(Integer conquestMoveRangeId, String name, String nameAlias, Integer targets,
			String description) {
		this.conquestMoveRangeId = conquestMoveRangeId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.targets = targets;
		this.description = description;
	}

	public Integer getConquestMoveRangeId() {
		return conquestMoveRangeId;
	}

	public void setConquestMoveRangeId(Integer conquestMoveRangeId) {
		this.conquestMoveRangeId = conquestMoveRangeId;
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

	public Integer getTargets() {
		return targets;
	}

	public void setTargets(Integer targets) {
		this.targets = targets;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ConquestMoveRange [conquestMoveRangeId=" + conquestMoveRangeId + ", name=" + name + ", nameAlias="
				+ nameAlias + ", targets=" + targets + ", description=" + description + "]";
	}
}