package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_growth_rates")
public class GrowthRate implements Serializable {
	private static final long serialVersionUID = 2997801755733977158L;

	@Id
	@Column(name = "growth_rate_id", unique = true, nullable = false)
	private Integer growthRateId;

	@Column(name = "name", length = 32)
	private String name;

	@Column(name = "name_alias", length = 32)
	private String nameAlias;

	@Column(name = "formula")
	private String formula;

	public GrowthRate() {
	}

	public GrowthRate(Integer growthRateId, String name, String nameAlias, String formula) {
		this.growthRateId = growthRateId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.formula = formula;
	}

	public Integer getGrowthRateId() {
		return growthRateId;
	}

	public void setGrowthRateId(Integer growthRateId) {
		this.growthRateId = growthRateId;
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

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	@Override
	public String toString() {
		return "GrowthRate [growthRateId=" + growthRateId + ", name=" + name + ", nameAlias=" + nameAlias + ", formula="
				+ formula + "]";
	}
}