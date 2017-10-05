package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_move_meta_ailments")
public class MoveMetaAilment implements Serializable {
	private static final long serialVersionUID = -2562865877576405189L;

	@Id
	@Column(name = "move_meta_ailment_id", unique = true, nullable = false)
	private Integer moveMetaAilmentId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	public MoveMetaAilment() {
	}

	public MoveMetaAilment(Integer moveMetaAilmentId, String name, String nameAlias) {
		this.moveMetaAilmentId = moveMetaAilmentId;
		this.name = name;
		this.nameAlias = nameAlias;
	}

	public Integer getMoveMetaAilmentId() {
		return moveMetaAilmentId;
	}

	public void setMoveMetaAilmentId(Integer moveMetaAilmentId) {
		this.moveMetaAilmentId = moveMetaAilmentId;
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
		return "MoveMetaAilment [moveMetaAilmentId=" + moveMetaAilmentId + ", name=" + name + ", nameAlias=" + nameAlias
				+ "]";
	}
}