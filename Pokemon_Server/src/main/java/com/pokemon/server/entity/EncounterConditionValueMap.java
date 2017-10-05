package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_encounter_condition_value_map")
public class EncounterConditionValueMap implements Serializable {
	private static final long serialVersionUID = 427774827113054353L;

	@Column(name = "encounter_id")
	private Integer encounterId;

	@Column(name = "encounter_condition_value_id")
	private Integer encounterConditionValueId;

	public EncounterConditionValueMap() {
	}

	public EncounterConditionValueMap(Integer encounterId, Integer encounterConditionValueId) {
		this.encounterId = encounterId;
		this.encounterConditionValueId = encounterConditionValueId;
	}

	public Integer getEncounterId() {
		return encounterId;
	}

	public void setEncounterId(Integer encounterId) {
		this.encounterId = encounterId;
	}

	public Integer getEncounterConditionValueId() {
		return encounterConditionValueId;
	}

	public void setEncounterConditionValueId(Integer encounterConditionValueId) {
		this.encounterConditionValueId = encounterConditionValueId;
	}

	@Override
	public String toString() {
		return "EncounterConditionValueMap [encounterId=" + encounterId + ", encounterConditionValueId="
				+ encounterConditionValueId + "]";
	}
}