package pac;


import java.util.List;

import java.util.ArrayList;


public class Cart {
	public List<Book> BList = new ArrayList<>();
	public double cost;
	public int getCount() {
		
		return BList.size();
	}

	public void addBook(Book b1) {
		// TODO Auto-generated method stub
		BList.add(b1);
	 
	}

	public double getTotalCostt() {
		// TODO Auto-generated method stub
		if (BList.size()>0){
			
			for (Book b:BList){
				cost+=b.getTotalCost();
			}
		}
		
	
		return cost;
	}
}
