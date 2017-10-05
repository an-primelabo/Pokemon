package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_abilities")
public class Type implements Serializable {
	private static final long serialVersionUID = -3727246301367923167L;

	@Id
	@Column(name = "type_id", unique = true, nullable = false)
	private Integer typeId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	@Column(name = "generation_id")
	private Integer generationId;

	@Column(name = "move_damage_class_id")
	private Integer moveDamageClassId;

	public Type() {
	}

	public Type(Integer typeId, String name, String nameAlias, Integer generationId, Integer moveDamageClassId) {
		this.typeId = typeId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.generationId = generationId;
		this.moveDamageClassId = moveDamageClassId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
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

	public Integer getGenerationId() {
		return generationId;
	}

	public void setGenerationId(Integer generationId) {
		this.generationId = generationId;
	}

	public Integer getMoveDamageClassId() {
		return moveDamageClassId;
	}

	public void setMoveDamageClassId(Integer moveDamageClassId) {
		this.moveDamageClassId = moveDamageClassId;
	}

	@Override
	public String toString() {
		return "Type [typeId=" + typeId + ", name=" + name + ", nameAlias=" + nameAlias + ", generationId="
				+ generationId + ", moveDamageClassId=" + moveDamageClassId + "]";
	}
}