package org.iesteis.modelo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("next")
	private Object next;

	@JsonProperty("previous")
	private Object previous;

	@JsonProperty("count")
	private int count;

	@JsonProperty("results")
	private List<Pokemon> results;

	public void setNext(Object next){
		this.next = next;
	}

	public Object getNext(){
		return next;
	}

	public void setPrevious(Object previous){
		this.previous = previous;
	}

	public Object getPrevious(){
		return previous;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setResults(List<Pokemon> results){
		this.results = results;
	}

	public List<Pokemon> getResults(){
		return results;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"next = '" + next + '\'' + 
			",previous = '" + previous + '\'' + 
			",count = '" + count + '\'' + 
			",results = '" + results + '\'' + 
			"}";
		}
}