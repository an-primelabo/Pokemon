package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokemon")
public class Pokemon implements Serializable {
	private static final long serialVersionUID = 844680426027251501L;

	@Id
	@Column(name = "pokemon_id", unique = true, nullable = false)
	private Integer pokemonId;

	@Column(name = "name_alias", length = 32)
	private String nameAlias;

	@Column(name = "pokemon_species_id")
	private Integer pokemonSpeciesId;

	@Column(name = "height")
	private Integer height;

	@Column(name = "weight")
	private Integer weight;

	@Column(name = "base_experience")
	private Integer baseExperience;

	@Column(name = "order_no")
	private Integer orderNo;

	@Column(name = "is_default")
	private Boolean isDefault;

	public Pokemon() {
	}

	public Pokemon(Integer pokemonId, String nameAlias, Integer pokemonSpeciesId, Integer height, Integer weight,
			Integer baseExperience, Integer orderNo, Boolean isDefault) {
		this.pokemonId = pokemonId;
		this.nameAlias = nameAlias;
		this.pokemonSpeciesId = pokemonSpeciesId;
		this.height = height;
		this.weight = weight;
		this.baseExperience = baseExperience;
		this.orderNo = orderNo;
		this.isDefault = (isDefault != null) ? isDefault : Boolean.TRUE;
	}

	public Pokemon(Integer pokemonId, String nameAlias, Integer pokemonSpeciesId, Integer height, Integer weight,
			Integer baseExperience, Integer orderNo) {
		this.pokemonId = pokemonId;
		this.nameAlias = nameAlias;
		this.pokemonSpeciesId = pokemonSpeciesId;
		this.height = height;
		this.weight = weight;
		this.baseExperience = baseExperience;
		this.orderNo = orderNo;
		this.isDefault = Boolean.TRUE;
	}

	public Integer getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(Integer pokemonId) {
		this.pokemonId = pokemonId;
	}

	public String getNameAlias() {
		return nameAlias;
	}

	public void setNameAlias(String nameAlias) {
		this.nameAlias = nameAlias;
	}

	public Integer getPokemonSpeciesId() {
		return pokemonSpeciesId;
	}

	public void setPokemonSpeciesId(Integer pokemonSpeciesId) {
		this.pokemonSpeciesId = pokemonSpeciesId;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getBaseExperience() {
		return baseExperience;
	}

	public void setBaseExperience(Integer baseExperience) {
		this.baseExperience = baseExperience;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	@Override
	public String toString() {
		return "Pokemon [pokemonId=" + pokemonId + ", nameAlias=" + nameAlias + ", pokemonSpeciesId=" + pokemonSpeciesId
				+ ", height=" + height + ", weight=" + weight + ", baseExperience=" + baseExperience + ", orderNo="
				+ orderNo + ", isDefault=" + isDefault + "]";
	}
}