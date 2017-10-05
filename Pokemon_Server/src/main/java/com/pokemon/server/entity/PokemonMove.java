package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_pokemon_moves")
public class PokemonMove implements Serializable {
	private static final long serialVersionUID = 2418679418805303911L;

	@Column(name = "pokemon_id")
	private Integer pokemonId;

	@Column(name = "version_group_id")
	private Integer versionGroupId;

	@Column(name = "move_id")
	private Integer moveId;

	@Column(name = "pokemon_move_method_id")
	private Integer pokemonMoveMethodId;

	@Column(name = "level")
	private Integer level;

	@Column(name = "order_no")
	private Integer orderNo;

	public PokemonMove() {
	}

	public PokemonMove(Integer pokemonId, Integer versionGroupId, Integer moveId, Integer pokemonMoveMethodId,
			Integer level, Integer orderNo) {
		this.pokemonId = pokemonId;
		this.versionGroupId = versionGroupId;
		this.moveId = moveId;
		this.pokemonMoveMethodId = pokemonMoveMethodId;
		this.level = level;
		this.orderNo = orderNo;
	}

	public Integer getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(Integer pokemonId) {
		this.pokemonId = pokemonId;
	}

	public Integer getVersionGroupId() {
		return versionGroupId;
	}

	public void setVersionGroupId(Integer versionGroupId) {
		this.versionGroupId = versionGroupId;
	}

	public Integer getMoveId() {
		return moveId;
	}

	public void setMoveId(Integer moveId) {
		this.moveId = moveId;
	}

	public Integer getPokemonMoveMethodId() {
		return pokemonMoveMethodId;
	}

	public void setPokemonMoveMethodId(Integer pokemonMoveMethodId) {
		this.pokemonMoveMethodId = pokemonMoveMethodId;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	@Override
	public String toString() {
		return "PokemonMove [pokemonId=" + pokemonId + ", versionGroupId=" + versionGroupId + ", moveId=" + moveId
				+ ", pokemonMoveMethodId=" + pokemonMoveMethodId + ", level=" + level + ", orderNo=" + orderNo + "]";
	}
}