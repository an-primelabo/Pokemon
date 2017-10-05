package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_move_damage_classes")
public class MoveDamageClass implements Serializable {
	private static final long serialVersionUID = -2937381973463069344L;

	@Id
	@Column(name = "move_damage_class_id", unique = true, nullable = false)
	private Integer moveDamageClassId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	@Column(name = "description")
	private String description;

	public MoveDamageClass() {
	}

	public MoveDamageClass(Integer moveDamageClassId, String name, String nameAlias, String description) {
		this.moveDamageClassId = moveDamageClassId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.description = description;
	}

	public Integer getMoveDamageClassId() {
		return moveDamageClassId;
	}

	public void setMoveDamageClassId(Integer moveDamageClassId) {
		this.moveDamageClassId = moveDamageClassId;
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
		return "MoveDamageClass [moveDamageClassId=" + moveDamageClassId + ", name=" + name + ", nameAlias=" + nameAlias
				+ ", description=" + description + "]";
	}
}