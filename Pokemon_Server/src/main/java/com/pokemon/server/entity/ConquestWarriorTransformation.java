package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_warrior_transformation")
public class ConquestWarriorTransformation implements Serializable {
	private static final long serialVersionUID = 3093663534336254344L;

	@Column(name = "transformed_warrior_rank_id")
	private Integer transformedWarriorRankId;

	@Column(name = "is_automatic")
	private Boolean isAutomatic;

	@Column(name = "required_link")
	private Integer requiredLink;

	@Column(name = "completed_episode_id")
	private Integer completedEpisodeId;

	@Column(name = "current_episode_id")
	private Integer currentEpisodeId;

	@Column(name = "distant_warrior_id")
	private Integer distantWarriorId;

	@Column(name = "female_warlord_count")
	private Integer femaleWarlordCount;

	@Column(name = "pokemon_count")
	private Integer pokemonCount;

	@Column(name = "collection_type_id")
	private Integer collectionTypeId;

	@Column(name = "warrior_count")
	private Integer warriorCount;

	public ConquestWarriorTransformation() {
	}

	public ConquestWarriorTransformation(Integer transformedWarriorRankId, Boolean isAutomatic, Integer requiredLink,
			Integer completedEpisodeId, Integer currentEpisodeId, Integer distantWarriorId, Integer femaleWarlordCount,
			Integer pokemonCount, Integer collectionTypeId, Integer warriorCount) {
		this.transformedWarriorRankId = transformedWarriorRankId;
		this.isAutomatic = (isAutomatic != null) ? isAutomatic : Boolean.FALSE;
		this.requiredLink = requiredLink;
		this.completedEpisodeId = completedEpisodeId;
		this.currentEpisodeId = currentEpisodeId;
		this.distantWarriorId = distantWarriorId;
		this.femaleWarlordCount = femaleWarlordCount;
		this.pokemonCount = pokemonCount;
		this.collectionTypeId = collectionTypeId;
		this.warriorCount = warriorCount;
	}

	public ConquestWarriorTransformation(Integer transformedWarriorRankId, Integer requiredLink,
			Integer completedEpisodeId, Integer currentEpisodeId, Integer distantWarriorId, Integer femaleWarlordCount,
			Integer pokemonCount, Integer collectionTypeId, Integer warriorCount) {
		this.transformedWarriorRankId = transformedWarriorRankId;
		this.isAutomatic = Boolean.FALSE;
		this.requiredLink = requiredLink;
		this.completedEpisodeId = completedEpisodeId;
		this.currentEpisodeId = currentEpisodeId;
		this.distantWarriorId = distantWarriorId;
		this.femaleWarlordCount = femaleWarlordCount;
		this.pokemonCount = pokemonCount;
		this.collectionTypeId = collectionTypeId;
		this.warriorCount = warriorCount;
	}

	public Integer getTransformedWarriorRankId() {
		return transformedWarriorRankId;
	}

	public void setTransformedWarriorRankId(Integer transformedWarriorRankId) {
		this.transformedWarriorRankId = transformedWarriorRankId;
	}

	public Boolean getIsAutomatic() {
		return isAutomatic;
	}

	public void setIsAutomatic(Boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}

	public Integer getRequiredLink() {
		return requiredLink;
	}

	public void setRequiredLink(Integer requiredLink) {
		this.requiredLink = requiredLink;
	}

	public Integer getCompletedEpisodeId() {
		return completedEpisodeId;
	}

	public void setCompletedEpisodeId(Integer completedEpisodeId) {
		this.completedEpisodeId = completedEpisodeId;
	}

	public Integer getCurrentEpisodeId() {
		return currentEpisodeId;
	}

	public void setCurrentEpisodeId(Integer currentEpisodeId) {
		this.currentEpisodeId = currentEpisodeId;
	}

	public Integer getDistantWarriorId() {
		return distantWarriorId;
	}

	public void setDistantWarriorId(Integer distantWarriorId) {
		this.distantWarriorId = distantWarriorId;
	}

	public Integer getFemaleWarlordCount() {
		return femaleWarlordCount;
	}

	public void setFemaleWarlordCount(Integer femaleWarlordCount) {
		this.femaleWarlordCount = femaleWarlordCount;
	}

	public Integer getPokemonCount() {
		return pokemonCount;
	}

	public void setPokemonCount(Integer pokemonCount) {
		this.pokemonCount = pokemonCount;
	}

	public Integer getCollectionTypeId() {
		return collectionTypeId;
	}

	public void setCollectionTypeId(Integer collectionTypeId) {
		this.collectionTypeId = collectionTypeId;
	}

	public Integer getWarriorCount() {
		return warriorCount;
	}

	public void setWarriorCount(Integer warriorCount) {
		this.warriorCount = warriorCount;
	}

	@Override
	public String toString() {
		return "ConquestWarriorTransformation [transformedWarriorRankId=" + transformedWarriorRankId + ", isAutomatic="
				+ isAutomatic + ", requiredLink=" + requiredLink + ", completedEpisodeId=" + completedEpisodeId
				+ ", currentEpisodeId=" + currentEpisodeId + ", distantWarriorId=" + distantWarriorId
				+ ", femaleWarlordCount=" + femaleWarlordCount + ", pokemonCount=" + pokemonCount
				+ ", collectionTypeId=" + collectionTypeId + ", warriorCount=" + warriorCount + "]";
	}
}