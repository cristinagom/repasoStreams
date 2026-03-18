package org.iesteis.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutritions{

	@JsonProperty("carbohydrates")
	private int carbohydrates;

	@JsonProperty("protein")
	private int protein;

	@JsonProperty("fat")
	private int fat;

	@JsonProperty("calories")
	private int calories;

	@JsonProperty("sugar")
	private int sugar;

	public void setCarbohydrates(int carbohydrates){
		this.carbohydrates = carbohydrates;
	}

	public int getCarbohydrates(){
		return carbohydrates;
	}

	public void setProtein(int protein){
		this.protein = protein;
	}

	public int getProtein(){
		return protein;
	}

	public void setFat(int fat){
		this.fat = fat;
	}

	public int getFat(){
		return fat;
	}

	public void setCalories(int calories){
		this.calories = calories;
	}

	public int getCalories(){
		return calories;
	}

	public void setSugar(int sugar){
		this.sugar = sugar;
	}

	public int getSugar(){
		return sugar;
	}

	@Override
 	public String toString(){
		return 
			"Nutritions{" + 
			"carbohydrates = '" + carbohydrates + '\'' + 
			",protein = '" + protein + '\'' + 
			",fat = '" + fat + '\'' + 
			",calories = '" + calories + '\'' + 
			",sugar = '" + sugar + '\'' + 
			"}";
		}
}