package com.stradtkt.mvccrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="store")
public class Store {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="storeId")
	private int id;
	@Column(name="store_name")
	private String storeName;
	@Column(name="store_city")
	private String storeCity;
	@Column(name="store_zip")
	private String storeZip;
	
	public Store() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreCity() {
		return storeCity;
	}

	public void setStoreCity(String storeCity) {
		this.storeCity = storeCity;
	}

	public String getStoreZip() {
		return storeZip;
	}

	public void setStoreZip(String storeZip) {
		this.storeZip = storeZip;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", storeName=" + storeName + ", storeCity=" + storeCity + ", storeZip=" + storeZip
				+ "]";
	}
}
