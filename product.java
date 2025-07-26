package GrossaryStoreBillingSystem;

import java.util.ArrayList;

public class product {

	private int productId;
	private String productName;
	private double pricePerUnit;
	private int availableQuantity;
	public product(int productId, String productName, double pricePerUnit, int availableQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.pricePerUnit = pricePerUnit;
		this.availableQuantity = availableQuantity;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	
	
	public static void getProductList( ArrayList<product>prodList) {	
		System.out.println("===============================\n Available Products\n===============================");		
  for(product p:prodList) {
	  System.out.println(p.getProductId() +"-->"+p.getProductName()+"-->(Rs."+p.getPricePerUnit()+"/1 Item-->)"+p.availableQuantity);
  }
		
	}
	
}
