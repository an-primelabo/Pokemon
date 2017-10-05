package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_characteristics")
public class Characteristic implements Serializable {
	private static final long serialVersionUID = 7329781266005985120L;

	@Id
	@Column(name = "characteristic_id", unique = true, nullable = false)
	private Integer characteristicId;

	@Column(name = "stat_id")
	private Integer statId;

	@Column(name = "gene_mod_5")
	private Integer geneMod5;

	@Column(name = "message", length = 256)
	private String message;

	public Characteristic() {
	}

	public Characteristic(Integer characteristicId, Integer statId, Integer geneMod5, String message) {
		this.characteristicId = characteristicId;
		this.statId = statId;
		this.geneMod5 = geneMod5;
		this.message = message;
	}

	public Integer getCharacteristicId() {
		return characteristicId;
	}

	public void setCharacteristicId(Integer characteristicId) {
		this.characteristicId = characteristicId;
	}

	public Integer getStatId() {
		return statId;
	}

	public void setStatId(Integer statId) {
		this.statId = statId;
	}

	public Integer getGeneMod5() {
		return geneMod5;
	}

	public void setGeneMod5(Integer geneMod5) {
		this.geneMod5 = geneMod5;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Characteristic [characteristicId=" + characteristicId + ", statId=" + statId + ", geneMod5=" + geneMod5
				+ ", message=" + message + "]";
	}
}