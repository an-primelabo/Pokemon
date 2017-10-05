package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_encounter_conditions")
public class EncounterCondition implements Serializable {
	private static final long serialVersionUID = 7112446943802161110L;

	@Id
	@Column(name = "encounter_condition_id", unique = true, nullable = false)
	private Integer encounterConditionId;

	@Column(name = "name", length = 32)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	public EncounterCondition() {
	}

	public EncounterCondition(Integer encounterConditionId, String name, String nameAlias) {
		this.encounterConditionId = encounterConditionId;
		this.name = name;
		this.nameAlias = nameAlias;
	}

	public Integer getEncounterConditionId() {
		return encounterConditionId;
	}

	public void setEncounterConditionId(Integer encounterConditionId) {
		this.encounterConditionId = encounterConditionId;
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
		return "EncounterCondition [encounterConditionId=" + encounterConditionId + ", name=" + name + ", nameAlias="
				+ nameAlias + "]";
	}
}