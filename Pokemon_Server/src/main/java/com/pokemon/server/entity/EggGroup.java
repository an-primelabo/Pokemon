package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_egg_groups")
public class EggGroup implements Serializable {
	private static final long serialVersionUID = 3076049717205631096L;

	@Id
	@Column(name = "egg_group_id", unique = true, nullable = false)
	private Integer eggGroupId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	public EggGroup() {
	}

	public EggGroup(Integer eggGroupId, String name, String nameAlias) {
		this.eggGroupId = eggGroupId;
		this.name = name;
		this.nameAlias = nameAlias;
	}

	public Integer getEggGroupId() {
		return eggGroupId;
	}

	public void setEggGroupId(Integer eggGroupId) {
		this.eggGroupId = eggGroupId;
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
		return "EggGroup [eggGroupId=" + eggGroupId + ", name=" + name + ", nameAlias=" + nameAlias + "]";
	}
}