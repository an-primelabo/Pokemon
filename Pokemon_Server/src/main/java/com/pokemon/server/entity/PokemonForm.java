package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokemon_forms")
public class PokemonForm implements Serializable {
	private static final long serialVersionUID = -7224422718554070577L;

	@Id
	@Column(name = "pokemon_form_id", unique = true, nullable = false)
	private Integer pokemonFormId;

	@Column(name = "pokemon_name", length = 32)
	private String pokemonName;

	@Column(name = "pokemon_name_alias", length = 32)
	private String pokemon_NameAlias;

	@Column(name = "form_name", length = 32)
	private String formName;

	@Column(name = "form_name_alias", length = 32)
	private String formNameAlias;

	@Column(name = "pokemon_id")
	private Integer pokemonId;

	@Column(name = "introduced_in_version_group_id")
	private Integer introducedInVersionGroupId;

	@Column(name = "is_default")
	private Boolean isDefault;

	@Column(name = "is_battle_only")
	private Boolean isBattleOnly;

	@Column(name = "is_mega")
	private Boolean isMega;

	@Column(name = "form_order")
	private Integer formOrder;

	@Column(name = "order_no")
	private Integer orderNo;

	public PokemonForm() {
	}

	public PokemonForm(Integer pokemonFormId, String pokemonName, String pokemon_NameAlias, String formName,
			String formNameAlias, Integer pokemonId, Integer introducedInVersionGroupId, Boolean isDefault,
			Boolean isBattleOnly, Boolean isMega, Integer formOrder, Integer orderNo) {
		this.pokemonFormId = pokemonFormId;
		this.pokemonName = pokemonName;
		this.pokemon_NameAlias = pokemon_NameAlias;
		this.formName = formName;
		this.formNameAlias = formNameAlias;
		this.pokemonId = pokemonId;
		this.introducedInVersionGroupId = introducedInVersionGroupId;
		this.isDefault = (isDefault != null) ? isDefault : Boolean.TRUE;
		this.isBattleOnly = (isBattleOnly != null) ? isBattleOnly : Boolean.FALSE;
		this.isMega = (isMega != null) ? isMega : Boolean.FALSE;
		this.formOrder = formOrder;
		this.orderNo = orderNo;
	}

	public PokemonForm(Integer pokemonFormId, String pokemonName, String pokemon_NameAlias, String formName,
			String formNameAlias, Integer pokemonId, Integer introducedInVersionGroupId, Integer formOrder,
			Integer orderNo) {
		this.pokemonFormId = pokemonFormId;
		this.pokemonName = pokemonName;
		this.pokemon_NameAlias = pokemon_NameAlias;
		this.formName = formName;
		this.formNameAlias = formNameAlias;
		this.pokemonId = pokemonId;
		this.introducedInVersionGroupId = introducedInVersionGroupId;
		this.isDefault = Boolean.TRUE;
		this.isBattleOnly = Boolean.FALSE;
		this.isMega = Boolean.FALSE;
		this.formOrder = formOrder;
		this.orderNo = orderNo;
	}

	public Integer getPokemonFormId() {
		return pokemonFormId;
	}

	public void setPokemonFormId(Integer pokemonFormId) {
		this.pokemonFormId = pokemonFormId;
	}

	public String getPokemonName() {
		return pokemonName;
	}

	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}

	public String getPokemon_NameAlias() {
		return pokemon_NameAlias;
	}

	public void setPokemon_NameAlias(String pokemon_NameAlias) {
		this.pokemon_NameAlias = pokemon_NameAlias;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public String getFormNameAlias() {
		return formNameAlias;
	}

	public void setFormNameAlias(String formNameAlias) {
		this.formNameAlias = formNameAlias;
	}

	public Integer getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(Integer pokemonId) {
		this.pokemonId = pokemonId;
	}

	public Integer getIntroducedInVersionGroupId() {
		return introducedInVersionGroupId;
	}

	public void setIntroducedInVersionGroupId(Integer introducedInVersionGroupId) {
		this.introducedInVersionGroupId = introducedInVersionGroupId;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public Boolean getIsBattleOnly() {
		return isBattleOnly;
	}

	public void setIsBattleOnly(Boolean isBattleOnly) {
		this.isBattleOnly = isBattleOnly;
	}

	public Boolean getIsMega() {
		return isMega;
	}

	public void setIsMega(Boolean isMega) {
		this.isMega = isMega;
	}

	public Integer getFormOrder() {
		return formOrder;
	}

	public void setFormOrder(Integer formOrder) {
		this.formOrder = formOrder;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	@Override
	public String toString() {
		return "PokemonForm [pokemonFormId=" + pokemonFormId + ", pokemonName=" + pokemonName + ", pokemon_NameAlias="
				+ pokemon_NameAlias + ", formName=" + formName + ", formNameAlias=" + formNameAlias + ", pokemonId="
				+ pokemonId + ", introducedInVersionGroupId=" + introducedInVersionGroupId + ", isDefault=" + isDefault
				+ ", isBattleOnly=" + isBattleOnly + ", isMega=" + isMega + ", formOrder=" + formOrder + ", orderNo="
				+ orderNo + "]";
	}
}