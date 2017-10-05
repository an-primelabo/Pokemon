package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_stats")
public class Stat implements Serializable {
	private static final long serialVersionUID = -1089531779800396622L;

	@Id
	@Column(name = "stat_id", unique = true, nullable = false)
	private Integer statId;

	@Column(name = "move_damage_class_id")
	private Integer moveDamageClassId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	@Column(name = "is_battle_only")
	private Boolean isBattleOnly;

	@Column(name = "game_index")
	private Integer gameIndex;

	public Stat() {
	}

	public Stat(Integer statId, Integer moveDamageClassId, String name, String nameAlias, Boolean isBattleOnly,
			Integer gameIndex) {
		this.statId = statId;
		this.moveDamageClassId = moveDamageClassId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.isBattleOnly = (isBattleOnly != null) ? isBattleOnly : Boolean.FALSE;
		this.gameIndex = gameIndex;
	}

	public Stat(Integer statId, Integer moveDamageClassId, String name, String nameAlias, Integer gameIndex) {
		this.statId = statId;
		this.moveDamageClassId = moveDamageClassId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.isBattleOnly = Boolean.FALSE;
		this.gameIndex = gameIndex;
	}

	public Integer getStatId() {
		return statId;
	}

	public void setStatId(Integer statId) {
		this.statId = statId;
	}

	public Integer getMoveDamageClassId() {
		return moveDamageClassId;
	}

	public void setMoveDamageClassId(Integer moveDamageClassId) {
		this.moveDamageClassId = moveDamageClassId;
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

	public Boolean getIsBattleOnly() {
		return isBattleOnly;
	}

	public void setIsBattleOnly(Boolean isBattleOnly) {
		this.isBattleOnly = isBattleOnly;
	}

	public Integer getGameIndex() {
		return gameIndex;
	}

	public void setGameIndex(Integer gameIndex) {
		this.gameIndex = gameIndex;
	}

	@Override
	public String toString() {
		return "Stat [statId=" + statId + ", moveDamageClassId=" + moveDamageClassId + ", name=" + name + ", nameAlias="
				+ nameAlias + ", isBattleOnly=" + isBattleOnly + ", gameIndex=" + gameIndex + "]";
	}
}