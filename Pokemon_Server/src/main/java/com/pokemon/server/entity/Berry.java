package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_berries")
public class Berry implements Serializable {
	private static final long serialVersionUID = -5985337153820238795L;

	@Id
	@Column(name = "berry_id", unique = true, nullable = false)
	private Integer berryId;

	@Column(name = "item_id")
	private Integer itemId;

	@Column(name = "berry_firmness_id")
	private Integer berryFirmnessId;

	@Column(name = "natural_gift_power")
	private Integer naturalGiftPower;

	@Column(name = "natural_gift_type_id")
	private Integer naturalGiftTypeId;

	@Column(name = "size")
	private Integer size;

	@Column(name = "max_harvest")
	private Integer maxHarvest;

	@Column(name = "growth_time")
	private Integer growthTime;

	@Column(name = "soil_dryness")
	private Integer soilDryness;

	@Column(name = "smoothness")
	private Integer smoothness;

	public Berry() {
	}

	public Berry(Integer berryId, Integer itemId, Integer berryFirmnessId, Integer naturalGiftPower,
			Integer naturalGiftTypeId, Integer size, Integer maxHarvest, Integer growthTime, Integer soilDryness,
			Integer smoothness) {
		this.berryId = berryId;
		this.itemId = itemId;
		this.berryFirmnessId = berryFirmnessId;
		this.naturalGiftPower = naturalGiftPower;
		this.naturalGiftTypeId = naturalGiftTypeId;
		this.size = size;
		this.maxHarvest = maxHarvest;
		this.growthTime = growthTime;
		this.soilDryness = soilDryness;
		this.smoothness = smoothness;
	}

	public Integer getBerryId() {
		return berryId;
	}

	public void setBerryId(Integer berryId) {
		this.berryId = berryId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getBerryFirmnessId() {
		return berryFirmnessId;
	}

	public void setBerryFirmnessId(Integer berryFirmnessId) {
		this.berryFirmnessId = berryFirmnessId;
	}

	public Integer getNaturalGiftPower() {
		return naturalGiftPower;
	}

	public void setNaturalGiftPower(Integer naturalGiftPower) {
		this.naturalGiftPower = naturalGiftPower;
	}

	public Integer getNaturalGiftTypeId() {
		return naturalGiftTypeId;
	}

	public void setNaturalGiftTypeId(Integer naturalGiftTypeId) {
		this.naturalGiftTypeId = naturalGiftTypeId;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getMaxHarvest() {
		return maxHarvest;
	}

	public void setMaxHarvest(Integer maxHarvest) {
		this.maxHarvest = maxHarvest;
	}

	public Integer getGrowthTime() {
		return growthTime;
	}

	public void setGrowthTime(Integer growthTime) {
		this.growthTime = growthTime;
	}

	public Integer getSoilDryness() {
		return soilDryness;
	}

	public void setSoilDryness(Integer soilDryness) {
		this.soilDryness = soilDryness;
	}

	public Integer getSmoothness() {
		return smoothness;
	}

	public void setSmoothness(Integer smoothness) {
		this.smoothness = smoothness;
	}

	@Override
	public String toString() {
		return "Berry [berryId=" + berryId + ", itemId=" + itemId + ", berryFirmnessId=" + berryFirmnessId
				+ ", naturalGiftPower=" + naturalGiftPower + ", naturalGiftTypeId=" + naturalGiftTypeId + ", size="
				+ size + ", maxHarvest=" + maxHarvest + ", growthTime=" + growthTime + ", soilDryness=" + soilDryness
				+ ", smoothness=" + smoothness + "]";
	}
}