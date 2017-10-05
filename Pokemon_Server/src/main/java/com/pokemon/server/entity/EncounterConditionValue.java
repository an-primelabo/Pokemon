package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_encounter_condition_values")
public class EncounterConditionValue implements Serializable {
	private static final long serialVersionUID = -5778962832465733316L;

	@Id
	@Column(name = "encounter_condition_value_id", unique = true, nullable = false)
	private Integer encounterConditionValueId;

	@Column(name = "encounter_condition_id")
	private Integer encounterConditionId;

	@Column(name = "name", length = 32)
	private String name;

	@Column(name = "name_alias", length = 32)
	private String nameAlias;

	@Column(name = "is_default")
	private Boolean isDefault;

	public EncounterConditionValue() {
	}

	public EncounterConditionValue(Integer encounterConditionValueId, Integer encounterConditionId, String name,
			String nameAlias, Boolean isDefault) {
		this.encounterConditionValueId = encounterConditionValueId;
		this.encounterConditionId = encounterConditionId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.isDefault = (isDefault != null) ? isDefault : Boolean.FALSE;
	}

	public EncounterConditionValue(Integer encounterConditionValueId, Integer encounterConditionId, String name,
			String nameAlias) {
		this.encounterConditionValueId = encounterConditionValueId;
		this.encounterConditionId = encounterConditionId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.isDefault = Boolean.FALSE;
	}

	public Integer getEncounterConditionValueId() {
		return encounterConditionValueId;
	}

	public void setEncounterConditionValueId(Integer encounterConditionValueId) {
		this.encounterConditionValueId = encounterConditionValueId;
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

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	@Override
	public String toString() {
		return "EncounterConditionValue [encounterConditionValueId=" + encounterConditionValueId
				+ ", encounterConditionId=" + encounterConditionId + ", name=" + name + ", nameAlias=" + nameAlias
				+ ", isDefault=" + isDefault + "]";
	}
}