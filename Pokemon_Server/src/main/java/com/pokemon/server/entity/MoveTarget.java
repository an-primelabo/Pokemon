package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_move_targets")
public class MoveTarget implements Serializable {
	private static final long serialVersionUID = 4662617518845915988L;

	@Column(name = "move_target_id")
	private Integer moveTargetId;

	@Column(name = "name", length = 32)
	private String name;

	@Column(name = "name_alias", length = 32)
	private String nameAlias;

	@Column(name = "description")
	private String description;

	public MoveTarget() {
	}

	public MoveTarget(Integer moveTargetId, String name, String nameAlias, String description) {
		this.moveTargetId = moveTargetId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.description = description;
	}

	public Integer getMoveTargetId() {
		return moveTargetId;
	}

	public void setMoveTargetId(Integer moveTargetId) {
		this.moveTargetId = moveTargetId;
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
		return "MoveTarget [moveTargetId=" + moveTargetId + ", name=" + name + ", nameAlias=" + nameAlias
				+ ", description=" + description + "]";
	}
}