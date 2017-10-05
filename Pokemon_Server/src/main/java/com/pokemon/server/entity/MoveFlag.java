package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_move_flags")
public class MoveFlag implements Serializable {
	private static final long serialVersionUID = -7014213335826933144L;

	@Id
	@Column(name = "move_flag_id", unique = true, nullable = false)
	private Integer moveFlagId;

	@Column(name = "name", length = 32)
	private String name;

	@Column(name = "name_alias", length = 32)
	private String nameAlias;

	@Column(name = "description")
	private String description;

	public MoveFlag() {
	}

	public MoveFlag(Integer moveFlagId, String name, String nameAlias, String description) {
		this.moveFlagId = moveFlagId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.description = description;
	}

	public Integer getMoveFlagId() {
		return moveFlagId;
	}

	public void setMoveFlagId(Integer moveFlagId) {
		this.moveFlagId = moveFlagId;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "MoveFlag [moveFlagId=" + moveFlagId + ", name=" + name + ", nameAlias=" + nameAlias + ", description="
				+ description + "]";
	}
}