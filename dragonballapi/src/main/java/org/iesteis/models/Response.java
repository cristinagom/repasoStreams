package org.iesteis.models;

import java.util.List;

public class Response{
	private Meta meta;
	private Links links;
	private List<Character> items;

	public void setMeta(Meta meta){
		this.meta = meta;
	}

	public Meta getMeta(){
		return meta;
	}

	public void setLinks(Links links){
		this.links = links;
	}

	public Links getLinks(){
		return links;
	}

	public void setItems(List<Character> items){
		this.items = items;
	}

	public List<Character> getItems(){
		return items;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"meta = '" + meta + '\'' + 
			",links = '" + links + '\'' + 
			",items = '" + items + '\'' + 
			"}";
		}
}
