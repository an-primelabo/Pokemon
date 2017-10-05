package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_pokemon_evolution")
public class ConquestPokemonEvolution implements Serializable {
	private static final long serialVersionUID = -2764669187386318108L;

	@Column(name = "evolved_species_id")
	private Integer evolvedSpeciesId;

	@Column(name = "required_stat_id")
	private Integer requiredStatId;

	@Column(name = "minimum_stat")
	private Integer minimumStat;

	@Column(name = "minimum_link")
	private Integer minimumLink;

	@Column(name = "conquest_kingdom_id")
	private Integer conquestKingdomId;

	@Column(name = "warrior_gender_id")
	private Integer warriorGenderId;

	@Column(name = "item_id")
	private Integer itemId;

	@Column(name = "recruiting_ko_required")
	private Boolean recruitingKoRequired;

	public ConquestPokemonEvolution() {
	}

	public ConquestPokemonEvolution(Integer evolvedSpeciesId, Integer requiredStatId, Integer minimumStat,
			Integer minimumLink, Integer conquestKingdomId, Integer warriorGenderId, Integer itemId,
			Boolean recruitingKoRequired) {
		this.evolvedSpeciesId = evolvedSpeciesId;
		this.requiredStatId = requiredStatId;
		this.minimumStat = minimumStat;
		this.minimumLink = minimumLink;
		this.conquestKingdomId = conquestKingdomId;
		this.warriorGenderId = warriorGenderId;
		this.itemId = itemId;
		this.recruitingKoRequired = (recruitingKoRequired != null) ? recruitingKoRequired : Boolean.FALSE;
	}

	public ConquestPokemonEvolution(Integer evolvedSpeciesId, Integer requiredStatId, Integer minimumStat,
			Integer minimumLink, Integer conquestKingdomId, Integer warriorGenderId, Integer itemId) {
		this.evolvedSpeciesId = evolvedSpeciesId;
		this.requiredStatId = requiredStatId;
		this.minimumStat = minimumStat;
		this.minimumLink = minimumLink;
		this.conquestKingdomId = conquestKingdomId;
		this.warriorGenderId = warriorGenderId;
		this.itemId = itemId;
		this.recruitingKoRequired = Boolean.FALSE;
	}

	public Integer getEvolvedSpeciesId() {
		return evolvedSpeciesId;
	}

	public void setEvolvedSpeciesId(Integer evolvedSpeciesId) {
		this.evolvedSpeciesId = evolvedSpeciesId;
	}

	public Integer getRequiredStatId() {
		return requiredStatId;
	}

	public void setRequiredStatId(Integer requiredStatId) {
		this.requiredStatId = requiredStatId;
	}

	public Integer getMinimumStat() {
		return minimumStat;
	}

	public void setMinimumStat(Integer minimumStat) {
		this.minimumStat = minimumStat;
	}

	public Integer getMinimumLink() {
		return minimumLink;
	}

	public void setMinimumLink(Integer minimumLink) {
		this.minimumLink = minimumLink;
	}

	public Integer getConquestKingdomId() {
		return conquestKingdomId;
	}

	public void setConquestKingdomId(Integer conquestKingdomId) {
		this.conquestKingdomId = conquestKingdomId;
	}

	public Integer getWarriorGenderId() {
		return warriorGenderId;
	}

	public void setWarriorGenderId(Integer warriorGenderId) {
		this.warriorGenderId = warriorGenderId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Boolean getRecruitingKoRequired() {
		return recruitingKoRequired;
	}

	public void setRecruitingKoRequired(Boolean recruitingKoRequired) {
		this.recruitingKoRequired = recruitingKoRequired;
	}

	@Override
	public String toString() {
		return "ConquestPokemonEvolution [evolvedSpeciesId=" + evolvedSpeciesId + ", requiredStatId=" + requiredStatId
				+ ", minimumStat=" + minimumStat + ", minimumLink=" + minimumLink + ", conquestKingdomId="
				+ conquestKingdomId + ", warriorGenderId=" + warriorGenderId + ", itemId=" + itemId
				+ ", recruitingKoRequired=" + recruitingKoRequired + "]";
	}
}