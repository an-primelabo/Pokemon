package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_kingdoms")
public class ConquestKingdom implements Serializable {
	private static final long serialVersionUID = -4886948856310021436L;

	@Id
	@Column(name = "conquest_kingdom_id", unique = true, nullable = false)
	private Integer conquestKingdomId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	@Column(name = "type_id")
	private Integer typeId;

	public ConquestKingdom() {
	}

	public ConquestKingdom(Integer conquestKingdomId, String name, String nameAlias, Integer typeId) {
		this.conquestKingdomId = conquestKingdomId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.typeId = typeId;
	}

	public Integer getConquestKingdomId() {
		return conquestKingdomId;
	}

	public void setConquestKingdomId(Integer conquestKingdomId) {
		this.conquestKingdomId = conquestKingdomId;
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

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	@Override
	public String toString() {
		return "ConquestKingdom [conquestKingdomId=" + conquestKingdomId + ", name=" + name + ", nameAlias=" + nameAlias
				+ ", typeId=" + typeId + "]";
	}
}