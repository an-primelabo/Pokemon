package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_move_battle_styles")
public class MoveBattleStyle implements Serializable {
	private static final long serialVersionUID = -7814384085564032110L;

	@Id
	@Column(name = "move_battle_style_id", unique = true, nullable = false)
	private Integer moveBattleStyleId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	public MoveBattleStyle() {
	}

	public MoveBattleStyle(Integer moveBattleStyleId, String name, String nameAlias) {
		this.moveBattleStyleId = moveBattleStyleId;
		this.name = name;
		this.nameAlias = nameAlias;
	}

	public Integer getMoveBattleStyleId() {
		return moveBattleStyleId;
	}

	public void setMoveBattleStyleId(Integer moveBattleStyleId) {
		this.moveBattleStyleId = moveBattleStyleId;
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

	@Override
	public String toString() {
		return "MoveBattleStyle [moveBattleStyleId=" + moveBattleStyleId + ", name=" + name + ", nameAlias=" + nameAlias
				+ "]";
	}
}