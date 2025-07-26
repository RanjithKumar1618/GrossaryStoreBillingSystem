package GrossaryStoreBillingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class GrossarryBillingApp {
	public static void main(String[] args) {
		  ArrayList<product> prod=new ArrayList<product>();
		prod.add(new product(101, "BananaChips", 20, 250));
		prod.add(new product(102, "VenilaIceCream", 15, 300));
		prod.add(new product(103, "DairyMilk", 40, 100));
		product.getProductList(prod);		
		Scanner scan = new Scanner(System.in);		
		System.out.print("\nEnter Product ID to Cart:");
		int id=scan.nextInt();	
		product found=null;
		for(int i =0;i<prod.size();i++) {
			product p =prod.get(i);
			if( p.getProductId()==id) {
				found=p;
				break;
			}
		}
		if(found !=null) {
			System.out.println("Product Found: "+found.getProductName());
			scan.nextLine();
			System.out.print("Enter Quantity:");
			int quant=scan.nextInt();		
			cartItem cart =new cartItem(found, quant);
			cart.getprintCartSummary();
		}else {
			System.out.println("Invalid product");
		}
		
		
		
		scan.close();
	}

}
