package org.iesteis.models;

public class Links{
	private String next;
	private String previous;
	private String last;
	private String first;

	public void setNext(String next){
		this.next = next;
	}

	public String getNext(){
		return next;
	}

	public void setPrevious(String previous){
		this.previous = previous;
	}

	public String getPrevious(){
		return previous;
	}

	public void setLast(String last){
		this.last = last;
	}

	public String getLast(){
		return last;
	}

	public void setFirst(String first){
		this.first = first;
	}

	public String getFirst(){
		return first;
	}

	@Override
 	public String toString(){
		return 
			"Links{" + 
			"next = '" + next + '\'' + 
			",previous = '" + previous + '\'' + 
			",last = '" + last + '\'' + 
			",first = '" + first + '\'' + 
			"}";
		}
}
