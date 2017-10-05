package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_encounter_methods")
public class EncounterMethod implements Serializable {
	private static final long serialVersionUID = -73467616835599971L;

	@Id
	@Column(name = "encounter_method_id", unique = true, nullable = false)
	private Integer encounterMethodId;

	@Column(name = "name", length = 32)
	private String name;

	@Column(name = "name_alias", length = 32)
	private String nameAlias;

	@Column(name = "order_no")
	private Integer orderNo;

	public EncounterMethod() {
	}

	public EncounterMethod(Integer encounterMethodId, String name, String nameAlias, Integer orderNo) {
		this.encounterMethodId = encounterMethodId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.orderNo = orderNo;
	}

	public Integer getEncounterMethodId() {
		return encounterMethodId;
	}

	public void setEncounterMethodId(Integer encounterMethodId) {
		this.encounterMethodId = encounterMethodId;
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

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	@Override
	public String toString() {
		return "EncounterMethod [encounterMethodId=" + encounterMethodId + ", name=" + name + ", nameAlias=" + nameAlias
				+ ", orderNo=" + orderNo + "]";
	}
}