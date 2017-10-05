package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokemon_species")
public class PokemonSpecies implements Serializable {
	private static final long serialVersionUID = 2544782659423507127L;

	@Id
	@Column(name = "pokemon_species_id", unique = true, nullable = false)
	private Integer pokemonSpeciesId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	@Column(name = "name_japanese", length = 16)
	private String nameJapanese;

	@Column(name = "genus", length = 32)
	private String genus;

	@Column(name = "generation_id")
	private Integer generationId;

	@Column(name = "evolves_from_species_id")
	private Integer evolvesFromSpeciesId;

	@Column(name = "evolution_chain_id")
	private Integer evolutionChainId;

	@Column(name = "pokemon_color_id")
	private Integer pokemonColorId;

	@Column(name = "pokemon_shape_id")
	private Integer pokemonShapeId;

	@Column(name = "pokemon_habitat_id")
	private Integer pokemonHabitatId;

	@Column(name = "gender_rate")
	private Integer genderRate;

	@Column(name = "capture_rate")
	private Integer captureRate;

	@Column(name = "base_happiness")
	private Integer baseHappiness;

	@Column(name = "is_baby")
	private Boolean isBaby;

	@Column(name = "hatch_counter")
	private Integer hatchCounter;

	@Column(name = "has_gender_differences")
	private Boolean hasGenderDifferences;

	@Column(name = "growth_rate_id")
	private Integer growthRateId;

	@Column(name = "forms_switchable")
	private Boolean formsSwitchable;

	@Column(name = "order_no")
	private Integer orderNo;

	@Column(name = "conquest_order")
	private Integer conquestOrder;

	@Column(name = "form_description")
	private String formDescription;

	public PokemonSpecies() {
	}

	public PokemonSpecies(Integer pokemonSpeciesId, String name, String nameAlias, String nameJapanese, String genus,
			Integer generationId, Integer evolvesFromSpeciesId, Integer evolutionChainId, Integer pokemonColorId,
			Integer pokemonShapeId, Integer pokemonHabitatId, Integer genderRate, Integer captureRate,
			Integer baseHappiness, Boolean isBaby, Integer hatchCounter, Boolean hasGenderDifferences,
			Integer growthRateId, Boolean formsSwitchable, Integer orderNo, Integer conquestOrder,
			String formDescription) {
		this.pokemonSpeciesId = pokemonSpeciesId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.nameJapanese = nameJapanese;
		this.genus = genus;
		this.generationId = generationId;
		this.evolvesFromSpeciesId = evolvesFromSpeciesId;
		this.evolutionChainId = evolutionChainId;
		this.pokemonColorId = pokemonColorId;
		this.pokemonShapeId = pokemonShapeId;
		this.pokemonHabitatId = pokemonHabitatId;
		this.genderRate = genderRate;
		this.captureRate = captureRate;
		this.baseHappiness = baseHappiness;
		this.isBaby = (isBaby != null) ? isBaby : Boolean.FALSE;
		this.hatchCounter = hatchCounter;
		this.hasGenderDifferences = (hasGenderDifferences != null) ? hasGenderDifferences : Boolean.FALSE;
		this.growthRateId = growthRateId;
		this.formsSwitchable = (formsSwitchable != null) ? formsSwitchable : Boolean.FALSE;
		this.orderNo = orderNo;
		this.conquestOrder = conquestOrder;
		this.formDescription = formDescription;
	}

	public PokemonSpecies(Integer pokemonSpeciesId, String name, String nameAlias, String nameJapanese, String genus,
			Integer generationId, Integer evolvesFromSpeciesId, Integer evolutionChainId, Integer pokemonColorId,
			Integer pokemonShapeId, Integer pokemonHabitatId, Integer genderRate, Integer captureRate,
			Integer baseHappiness, Integer hatchCounter, Integer growthRateId, Integer orderNo, Integer conquestOrder,
			String formDescription) {
		this.pokemonSpeciesId = pokemonSpeciesId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.nameJapanese = nameJapanese;
		this.genus = genus;
		this.generationId = generationId;
		this.evolvesFromSpeciesId = evolvesFromSpeciesId;
		this.evolutionChainId = evolutionChainId;
		this.pokemonColorId = pokemonColorId;
		this.pokemonShapeId = pokemonShapeId;
		this.pokemonHabitatId = pokemonHabitatId;
		this.genderRate = genderRate;
		this.captureRate = captureRate;
		this.baseHappiness = baseHappiness;
		this.isBaby = Boolean.FALSE;
		this.hatchCounter = hatchCounter;
		this.hasGenderDifferences = Boolean.FALSE;
		this.growthRateId = growthRateId;
		this.formsSwitchable = Boolean.FALSE;
		this.orderNo = orderNo;
		this.conquestOrder = conquestOrder;
		this.formDescription = formDescription;
	}

	public Integer getPokemonSpeciesId() {
		return pokemonSpeciesId;
	}

	public void setPokemonSpeciesId(Integer pokemonSpeciesId) {
		this.pokemonSpeciesId = pokemonSpeciesId;
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

	public String getNameJapanese() {
		return nameJapanese;
	}

	public void setNameJapanese(String nameJapanese) {
		this.nameJapanese = nameJapanese;
	}

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public Integer getGenerationId() {
		return generationId;
	}

	public void setGenerationId(Integer generationId) {
		this.generationId = generationId;
	}

	public Integer getEvolvesFromSpeciesId() {
		return evolvesFromSpeciesId;
	}

	public void setEvolvesFromSpeciesId(Integer evolvesFromSpeciesId) {
		this.evolvesFromSpeciesId = evolvesFromSpeciesId;
	}

	public Integer getEvolutionChainId() {
		return evolutionChainId;
	}

	public void setEvolutionChainId(Integer evolutionChainId) {
		this.evolutionChainId = evolutionChainId;
	}

	public Integer getPokemonColorId() {
		return pokemonColorId;
	}

	public void setPokemonColorId(Integer pokemonColorId) {
		this.pokemonColorId = pokemonColorId;
	}

	public Integer getPokemonShapeId() {
		return pokemonShapeId;
	}

	public void setPokemonShapeId(Integer pokemonShapeId) {
		this.pokemonShapeId = pokemonShapeId;
	}

	public Integer getPokemonHabitatId() {
		return pokemonHabitatId;
	}

	public void setPokemonHabitatId(Integer pokemonHabitatId) {
		this.pokemonHabitatId = pokemonHabitatId;
	}

	public Integer getGenderRate() {
		return genderRate;
	}

	public void setGenderRate(Integer genderRate) {
		this.genderRate = genderRate;
	}

	public Integer getCaptureRate() {
		return captureRate;
	}

	public void setCaptureRate(Integer captureRate) {
		this.captureRate = captureRate;
	}

	public Integer getBaseHappiness() {
		return baseHappiness;
	}

	public void setBaseHappiness(Integer baseHappiness) {
		this.baseHappiness = baseHappiness;
	}

	public Boolean getIsBaby() {
		return isBaby;
	}

	public void setIsBaby(Boolean isBaby) {
		this.isBaby = isBaby;
	}

	public Integer getHatchCounter() {
		return hatchCounter;
	}

	public void setHatchCounter(Integer hatchCounter) {
		this.hatchCounter = hatchCounter;
	}

	public Boolean getHasGenderDifferences() {
		return hasGenderDifferences;
	}

	public void setHasGenderDifferences(Boolean hasGenderDifferences) {
		this.hasGenderDifferences = hasGenderDifferences;
	}

	public Integer getGrowthRateId() {
		return growthRateId;
	}

	public void setGrowthRateId(Integer growthRateId) {
		this.growthRateId = growthRateId;
	}

	public Boolean getFormsSwitchable() {
		return formsSwitchable;
	}

	public void setFormsSwitchable(Boolean formsSwitchable) {
		this.formsSwitchable = formsSwitchable;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public Integer getConquestOrder() {
		return conquestOrder;
	}

	public void setConquestOrder(Integer conquestOrder) {
		this.conquestOrder = conquestOrder;
	}

	public String getFormDescription() {
		return formDescription;
	}

	public void setFormDescription(String formDescription) {
		this.formDescription = formDescription;
	}

	@Override
	public String toString() {
		return "PokemonSpecies [pokemonSpeciesId=" + pokemonSpeciesId + ", name=" + name + ", nameAlias=" + nameAlias
				+ ", nameJapanese=" + nameJapanese + ", genus=" + genus + ", generationId=" + generationId
				+ ", evolvesFromSpeciesId=" + evolvesFromSpeciesId + ", evolutionChainId=" + evolutionChainId
				+ ", pokemonColorId=" + pokemonColorId + ", pokemonShapeId=" + pokemonShapeId + ", pokemonHabitatId="
				+ pokemonHabitatId + ", genderRate=" + genderRate + ", captureRate=" + captureRate + ", baseHappiness="
				+ baseHappiness + ", isBaby=" + isBaby + ", hatchCounter=" + hatchCounter + ", hasGenderDifferences="
				+ hasGenderDifferences + ", growthRateId=" + growthRateId + ", formsSwitchable=" + formsSwitchable
				+ ", orderNo=" + orderNo + ", conquestOrder=" + conquestOrder + ", formDescription=" + formDescription
				+ "]";
	}
}