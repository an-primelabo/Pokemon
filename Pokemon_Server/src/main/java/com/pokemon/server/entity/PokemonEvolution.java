package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokemon_evolution")
public class PokemonEvolution implements Serializable {
	private static final long serialVersionUID = -4345826356740848020L;

	@Id
	@Column(name = "pokemon_evolution_id", unique = true, nullable = false)
	private Integer pokemonEvolutionId;

	@Column(name = "evolved_species_id")
	private Integer evolvedSpeciesId;

	@Column(name = "evolution_trigger_id")
	private Integer evolutionTriggerId;

	@Column(name = "trigger_item_id")
	private Integer triggerItemId;

	@Column(name = "minimum_level")
	private Integer minimumLevel;

	@Column(name = "gender_id")
	private Integer genderId;

	@Column(name = "location_id")
	private Integer locationId;

	@Column(name = "held_item_id")
	private Integer heldItemId;

	@Column(name = "time_of_day", length = 16)
	private String timeOfDay;

	@Column(name = "known_move_id")
	private Integer knownMoveId;

	@Column(name = "known_move_type_id")
	private Integer knownMoveTypeId;

	@Column(name = "minimum_happiness")
	private Integer minimumHappiness;

	@Column(name = "minimum_beauty")
	private Integer minimumBeauty;

	@Column(name = "minimum_affection")
	private Integer minimumAffection;

	@Column(name = "relative_physical_stats")
	private Integer relativePhysicalStats;

	@Column(name = "party_species_id")
	private Integer partySpeciesId;

	@Column(name = "party_type_id")
	private Integer partyTypeId;

	@Column(name = "trade_species_id")
	private Integer tradeSpeciesId;

	@Column(name = "needs_overworld_rain")
	private Boolean needsOverworldRain;

	@Column(name = "turn_upside_down")
	private Boolean turnUpsideDown;

	public PokemonEvolution() {
	}

	public PokemonEvolution(Integer pokemonEvolutionId, Integer evolvedSpeciesId, Integer evolutionTriggerId,
			Integer triggerItemId, Integer minimumLevel, Integer genderId, Integer locationId, Integer heldItemId,
			String timeOfDay, Integer knownMoveId, Integer knownMoveTypeId, Integer minimumHappiness,
			Integer minimumBeauty, Integer minimumAffection, Integer relativePhysicalStats, Integer partySpeciesId,
			Integer partyTypeId, Integer tradeSpeciesId, Boolean needsOverworldRain, Boolean turnUpsideDown) {
		this.pokemonEvolutionId = pokemonEvolutionId;
		this.evolvedSpeciesId = evolvedSpeciesId;
		this.evolutionTriggerId = evolutionTriggerId;
		this.triggerItemId = triggerItemId;
		this.minimumLevel = minimumLevel;
		this.genderId = genderId;
		this.locationId = locationId;
		this.heldItemId = heldItemId;
		this.timeOfDay = timeOfDay;
		this.knownMoveId = knownMoveId;
		this.knownMoveTypeId = knownMoveTypeId;
		this.minimumHappiness = minimumHappiness;
		this.minimumBeauty = minimumBeauty;
		this.minimumAffection = minimumAffection;
		this.relativePhysicalStats = relativePhysicalStats;
		this.partySpeciesId = partySpeciesId;
		this.partyTypeId = partyTypeId;
		this.tradeSpeciesId = tradeSpeciesId;
		this.needsOverworldRain = (needsOverworldRain != null) ? needsOverworldRain : Boolean.FALSE;
		this.turnUpsideDown = (turnUpsideDown != null) ? turnUpsideDown : Boolean.FALSE;
	}

	public PokemonEvolution(Integer pokemonEvolutionId, Integer evolvedSpeciesId, Integer evolutionTriggerId,
			Integer triggerItemId, Integer minimumLevel, Integer genderId, Integer locationId, Integer heldItemId,
			String timeOfDay, Integer knownMoveId, Integer knownMoveTypeId, Integer minimumHappiness,
			Integer minimumBeauty, Integer minimumAffection, Integer relativePhysicalStats, Integer partySpeciesId,
			Integer partyTypeId, Integer tradeSpeciesId) {
		this.pokemonEvolutionId = pokemonEvolutionId;
		this.evolvedSpeciesId = evolvedSpeciesId;
		this.evolutionTriggerId = evolutionTriggerId;
		this.triggerItemId = triggerItemId;
		this.minimumLevel = minimumLevel;
		this.genderId = genderId;
		this.locationId = locationId;
		this.heldItemId = heldItemId;
		this.timeOfDay = timeOfDay;
		this.knownMoveId = knownMoveId;
		this.knownMoveTypeId = knownMoveTypeId;
		this.minimumHappiness = minimumHappiness;
		this.minimumBeauty = minimumBeauty;
		this.minimumAffection = minimumAffection;
		this.relativePhysicalStats = relativePhysicalStats;
		this.partySpeciesId = partySpeciesId;
		this.partyTypeId = partyTypeId;
		this.tradeSpeciesId = tradeSpeciesId;
		this.needsOverworldRain = Boolean.FALSE;
		this.turnUpsideDown = Boolean.FALSE;
	}

	public Integer getPokemonEvolutionId() {
		return pokemonEvolutionId;
	}

	public void setPokemonEvolutionId(Integer pokemonEvolutionId) {
		this.pokemonEvolutionId = pokemonEvolutionId;
	}

	public Integer getEvolvedSpeciesId() {
		return evolvedSpeciesId;
	}

	public void setEvolvedSpeciesId(Integer evolvedSpeciesId) {
		this.evolvedSpeciesId = evolvedSpeciesId;
	}

	public Integer getEvolutionTriggerId() {
		return evolutionTriggerId;
	}

	public void setEvolutionTriggerId(Integer evolutionTriggerId) {
		this.evolutionTriggerId = evolutionTriggerId;
	}

	public Integer getTriggerItemId() {
		return triggerItemId;
	}

	public void setTriggerItemId(Integer triggerItemId) {
		this.triggerItemId = triggerItemId;
	}

	public Integer getMinimumLevel() {
		return minimumLevel;
	}

	public void setMinimumLevel(Integer minimumLevel) {
		this.minimumLevel = minimumLevel;
	}

	public Integer getGenderId() {
		return genderId;
	}

	public void setGenderId(Integer genderId) {
		this.genderId = genderId;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public Integer getHeldItemId() {
		return heldItemId;
	}

	public void setHeldItemId(Integer heldItemId) {
		this.heldItemId = heldItemId;
	}

	public String getTimeOfDay() {
		return timeOfDay;
	}

	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}

	public Integer getKnownMoveId() {
		return knownMoveId;
	}

	public void setKnownMoveId(Integer knownMoveId) {
		this.knownMoveId = knownMoveId;
	}

	public Integer getKnownMoveTypeId() {
		return knownMoveTypeId;
	}

	public void setKnownMoveTypeId(Integer knownMoveTypeId) {
		this.knownMoveTypeId = knownMoveTypeId;
	}

	public Integer getMinimumHappiness() {
		return minimumHappiness;
	}

	public void setMinimumHappiness(Integer minimumHappiness) {
		this.minimumHappiness = minimumHappiness;
	}

	public Integer getMinimumBeauty() {
		return minimumBeauty;
	}

	public void setMinimumBeauty(Integer minimumBeauty) {
		this.minimumBeauty = minimumBeauty;
	}

	public Integer getMinimumAffection() {
		return minimumAffection;
	}

	public void setMinimumAffection(Integer minimumAffection) {
		this.minimumAffection = minimumAffection;
	}

	public Integer getRelativePhysicalStats() {
		return relativePhysicalStats;
	}

	public void setRelativePhysicalStats(Integer relativePhysicalStats) {
		this.relativePhysicalStats = relativePhysicalStats;
	}

	public Integer getPartySpeciesId() {
		return partySpeciesId;
	}

	public void setPartySpeciesId(Integer partySpeciesId) {
		this.partySpeciesId = partySpeciesId;
	}

	public Integer getPartyTypeId() {
		return partyTypeId;
	}

	public void setPartyTypeId(Integer partyTypeId) {
		this.partyTypeId = partyTypeId;
	}

	public Integer getTradeSpeciesId() {
		return tradeSpeciesId;
	}

	public void setTradeSpeciesId(Integer tradeSpeciesId) {
		this.tradeSpeciesId = tradeSpeciesId;
	}

	public Boolean getNeedsOverworldRain() {
		return needsOverworldRain;
	}

	public void setNeedsOverworldRain(Boolean needsOverworldRain) {
		this.needsOverworldRain = needsOverworldRain;
	}

	public Boolean getTurnUpsideDown() {
		return turnUpsideDown;
	}

	public void setTurnUpsideDown(Boolean turnUpsideDown) {
		this.turnUpsideDown = turnUpsideDown;
	}

	@Override
	public String toString() {
		return "PokemonEvolution [pokemonEvolutionId=" + pokemonEvolutionId + ", evolvedSpeciesId=" + evolvedSpeciesId
				+ ", evolutionTriggerId=" + evolutionTriggerId + ", triggerItemId=" + triggerItemId + ", minimumLevel="
				+ minimumLevel + ", genderId=" + genderId + ", locationId=" + locationId + ", heldItemId=" + heldItemId
				+ ", timeOfDay=" + timeOfDay + ", knownMoveId=" + knownMoveId + ", knownMoveTypeId=" + knownMoveTypeId
				+ ", minimumHappiness=" + minimumHappiness + ", minimumBeauty=" + minimumBeauty + ", minimumAffection="
				+ minimumAffection + ", relativePhysicalStats=" + relativePhysicalStats + ", partySpeciesId="
				+ partySpeciesId + ", partyTypeId=" + partyTypeId + ", tradeSpeciesId=" + tradeSpeciesId
				+ ", needsOverworldRain=" + needsOverworldRain + ", turnUpsideDown=" + turnUpsideDown + "]";
	}
}