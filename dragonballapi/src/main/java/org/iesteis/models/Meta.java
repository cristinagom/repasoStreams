package org.iesteis.models;

public class Meta{
	private int totalItems;
	private int itemsPerPage;
	private int totalPages;
	private int currentPage;
	private int itemCount;

	public void setTotalItems(int totalItems){
		this.totalItems = totalItems;
	}

	public int getTotalItems(){
		return totalItems;
	}

	public void setItemsPerPage(int itemsPerPage){
		this.itemsPerPage = itemsPerPage;
	}

	public int getItemsPerPage(){
		return itemsPerPage;
	}

	public void setTotalPages(int totalPages){
		this.totalPages = totalPages;
	}

	public int getTotalPages(){
		return totalPages;
	}

	public void setCurrentPage(int currentPage){
		this.currentPage = currentPage;
	}

	public int getCurrentPage(){
		return currentPage;
	}

	public void setItemCount(int itemCount){
		this.itemCount = itemCount;
	}

	public int getItemCount(){
		return itemCount;
	}

	@Override
 	public String toString(){
		return 
			"Meta{" + 
			"totalItems = '" + totalItems + '\'' + 
			",itemsPerPage = '" + itemsPerPage + '\'' + 
			",totalPages = '" + totalPages + '\'' + 
			",currentPage = '" + currentPage + '\'' + 
			",itemCount = '" + itemCount + '\'' + 
			"}";
		}
}
