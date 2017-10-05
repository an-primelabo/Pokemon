package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_contest_types")
public class ContestType implements Serializable {
	private static final long serialVersionUID = -3877631017377003832L;

	@Id
	@Column(name = "contest_type_id", unique = true, nullable = false)
	private Integer contestTypeId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	@Column(name = "flavor", length = 16)
	private String flavor;

	@Column(name = "color", length = 16)
	private String color;

	public ContestType() {
	}

	public ContestType(Integer contestTypeId, String name, String nameAlias, String flavor, String color) {
		this.contestTypeId = contestTypeId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.flavor = flavor;
		this.color = color;
	}

	public Integer getContestTypeId() {
		return contestTypeId;
	}

	public void setContestTypeId(Integer contestTypeId) {
		this.contestTypeId = contestTypeId;
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

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "ContestType [contestTypeId=" + contestTypeId + ", name=" + name + ", nameAlias=" + nameAlias
				+ ", flavor=" + flavor + ", color=" + color + "]";
	}
}