package org.iesteis.models;

public class Character{
	private String image;
	private Object deletedAt;
	private String race;
	private String gender;
	private String affiliation;
	private String name;
	private String description;
	private int id;
	private String ki;
	private String maxKi;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setDeletedAt(Object deletedAt){
		this.deletedAt = deletedAt;
	}

	public Object getDeletedAt(){
		return deletedAt;
	}

	public void setRace(String race){
		this.race = race;
	}

	public String getRace(){
		return race;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setAffiliation(String affiliation){
		this.affiliation = affiliation;
	}

	public String getAffiliation(){
		return affiliation;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setKi(String ki){
		this.ki = ki;
	}

	public String getKi(){
		return ki;
	}

	public void setMaxKi(String maxKi){
		this.maxKi = maxKi;
	}

	public String getMaxKi(){
		return maxKi;
	}

	@Override
 	public String toString(){
		return 
			"ItemsItem{" + 
			"image = '" + image + '\'' + 
			",deletedAt = '" + deletedAt + '\'' + 
			",race = '" + race + '\'' + 
			",gender = '" + gender + '\'' + 
			",affiliation = '" + affiliation + '\'' + 
			",name = '" + name + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			",ki = '" + ki + '\'' + 
			",maxKi = '" + maxKi + '\'' + 
			"}";
		}
}
