package pac;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

//import com.tdd.shoppingcart.Book;
//import com.tdd.shoppingcart.Cart;

public class MyTestCases {

	@Test
	public void tc1() {
		
		Cart cart = new Cart();
		
		Assert.assertEquals( 0, cart.getCount() );
	}
	@Test
	public void tc2() {
		Cart cart = new Cart();
		Book b1 = new Book("JAVA BOOK", 1, 127);
		cart.addBook(b1);
		Assert.assertEquals(1, cart.getCount());
		Assert.assertEquals(127, cart.getTotalCostt(),0);
		
	}
	 
	 @Test
	 
	public void tc3(){
		Cart cart = new Cart();
		Book gatsByCream = new Book("JAVA BOOK", 1, 127);
		Book bvlgiriSoap = new Book("Web design Book", 1, 100);
		cart.addBook(gatsByCream);
		cart.addBook(bvlgiriSoap);
		Assert.assertEquals(2, cart.getCount());
		Assert.assertEquals(227, cart.getTotalCostt(),0);
	}

}
