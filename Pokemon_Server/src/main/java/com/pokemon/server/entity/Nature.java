package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_natures")
public class Nature implements Serializable {
	private static final long serialVersionUID = -4957862070062763722L;

	@Id
	@Column(name = "nature_id", unique = true, nullable = false)
	private Integer natureId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	@Column(name = "decreased_stat_id")
	private Integer decreasedStatId;

	@Column(name = "increased_stat_id")
	private Integer increasedStatId;

	@Column(name = "hates_flavor_id")
	private Integer hatesFlavorId;

	@Column(name = "likes_flavor_id")
	private Integer likesFlavorId;

	@Column(name = "game_index")
	private Integer gameIndex;

	public Nature() {
	}

	public Nature(Integer natureId, String name, String nameAlias, Integer decreasedStatId, Integer increasedStatId,
			Integer hatesFlavorId, Integer likesFlavorId, Integer gameIndex) {
		this.natureId = natureId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.decreasedStatId = decreasedStatId;
		this.increasedStatId = increasedStatId;
		this.hatesFlavorId = hatesFlavorId;
		this.likesFlavorId = likesFlavorId;
		this.gameIndex = gameIndex;
	}

	public Integer getNatureId() {
		return natureId;
	}

	public void setNatureId(Integer natureId) {
		this.natureId = natureId;
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

	public Integer getDecreasedStatId() {
		return decreasedStatId;
	}

	public void setDecreasedStatId(Integer decreasedStatId) {
		this.decreasedStatId = decreasedStatId;
	}

	public Integer getIncreasedStatId() {
		return increasedStatId;
	}

	public void setIncreasedStatId(Integer increasedStatId) {
		this.increasedStatId = increasedStatId;
	}

	public Integer getHatesFlavorId() {
		return hatesFlavorId;
	}

	public void setHatesFlavorId(Integer hatesFlavorId) {
		this.hatesFlavorId = hatesFlavorId;
	}

	public Integer getLikesFlavorId() {
		return likesFlavorId;
	}

	public void setLikesFlavorId(Integer likesFlavorId) {
		this.likesFlavorId = likesFlavorId;
	}

	public Integer getGameIndex() {
		return gameIndex;
	}

	public void setGameIndex(Integer gameIndex) {
		this.gameIndex = gameIndex;
	}

	@Override
	public String toString() {
		return "Nature [natureId=" + natureId + ", name=" + name + ", nameAlias=" + nameAlias + ", decreasedStatId="
				+ decreasedStatId + ", increasedStatId=" + increasedStatId + ", hatesFlavorId=" + hatesFlavorId
				+ ", likesFlavorId=" + likesFlavorId + ", gameIndex=" + gameIndex + "]";
	}
}