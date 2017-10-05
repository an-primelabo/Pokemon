package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_encounter_slots")
public class EncounterSlot implements Serializable {
	private static final long serialVersionUID = -3657677109661675732L;

	@Id
	@Column(name = "encounter_slot_id", unique = true, nullable = false)
	private Integer encounterSlotId;

	@Column(name = "version_group_id")
	private Integer versionGroupId;

	@Column(name = "encounter_method_id")
	private Integer encounterMethodId;

	@Column(name = "slot")
	private Integer slot;

	@Column(name = "rarity")
	private Integer rarity;

	public EncounterSlot() {
	}

	public EncounterSlot(Integer encounterSlotId, Integer versionGroupId, Integer encounterMethodId, Integer slot,
			Integer rarity) {
		this.encounterSlotId = encounterSlotId;
		this.versionGroupId = versionGroupId;
		this.encounterMethodId = encounterMethodId;
		this.slot = slot;
		this.rarity = rarity;
	}

	public Integer getEncounterSlotId() {
		return encounterSlotId;
	}

	public void setEncounterSlotId(Integer encounterSlotId) {
		this.encounterSlotId = encounterSlotId;
	}

	public Integer getVersionGroupId() {
		return versionGroupId;
	}

	public void setVersionGroupId(Integer versionGroupId) {
		this.versionGroupId = versionGroupId;
	}

	public Integer getEncounterMethodId() {
		return encounterMethodId;
	}

	public void setEncounterMethodId(Integer encounterMethodId) {
		this.encounterMethodId = encounterMethodId;
	}

	public Integer getSlot() {
		return slot;
	}

	public void setSlot(Integer slot) {
		this.slot = slot;
	}

	public Integer getRarity() {
		return rarity;
	}

	public void setRarity(Integer rarity) {
		this.rarity = rarity;
	}

	@Override
	public String toString() {
		return "EncounterSlot [encounterSlotId=" + encounterSlotId + ", versionGroupId=" + versionGroupId
				+ ", encounterMethodId=" + encounterMethodId + ", slot=" + slot + ", rarity=" + rarity + "]";
	}
}