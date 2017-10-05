package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_warrior_specialties")
public class ConquestWarriorSpecialty implements Serializable {
	private static final long serialVersionUID = 3562010606371426078L;

	@Column(name = "conquest_warrior_id")
	private Integer conquestWarriorId;

	@Column(name = "type_id")
	private Integer typeId;

	@Column(name = "slot")
	private Integer slot;

	public ConquestWarriorSpecialty() {
	}

	public ConquestWarriorSpecialty(Integer conquestWarriorId, Integer typeId, Integer slot) {
		this.conquestWarriorId = conquestWarriorId;
		this.typeId = typeId;
		this.slot = slot;
	}

	public Integer getConquestWarriorId() {
		return conquestWarriorId;
	}

	public void setConquestWarriorId(Integer conquestWarriorId) {
		this.conquestWarriorId = conquestWarriorId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getSlot() {
		return slot;
	}

	public void setSlot(Integer slot) {
		this.slot = slot;
	}

	@Override
	public String toString() {
		return "ConquestWarriorSpecialty [conquestWarriorId=" + conquestWarriorId + ", typeId=" + typeId + ", slot="
				+ slot + "]";
	}
}