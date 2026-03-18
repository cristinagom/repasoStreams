package org.iesteis.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fruit {

	@JsonProperty("genus")
	private String genus;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("family")
	private String family;

	@JsonProperty("order")
	private String order;

	@JsonProperty("nutritions")
	private Nutritions nutritions;

	public void setGenus(String genus){
		this.genus = genus;
	}

	public String getGenus(){
		return genus;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setFamily(String family){
		this.family = family;
	}

	public String getFamily(){
		return family;
	}

	public void setOrder(String order){
		this.order = order;
	}

	public String getOrder(){
		return order;
	}

	public void setNutritions(Nutritions nutritions){
		this.nutritions = nutritions;
	}

	public Nutritions getNutritions(){
		return nutritions;
	}

	@Override
 	public String toString(){
		return 
			"Fruit{" +
			"genus = '" + genus + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",family = '" + family + '\'' + 
			",order = '" + order + '\'' + 
			",nutritions = '" + nutritions + '\'' + 
			"}";
		}
}