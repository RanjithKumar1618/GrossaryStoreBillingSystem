package GrossaryStoreBillingSystem;

public class cartItem {
	
	private product prod;
	private int quantityPurchased;
	public cartItem(product prod, int quantityPurchased) {
		super();
		this.prod = prod;
		this.quantityPurchased = quantityPurchased;
	}
	public product getProd() {
		return prod;
	}
	public int getQuantityPurchased() {
		return quantityPurchased;
	}
	public void setProd(product prod) {
		this.prod = prod;
	}
	public void setQuantityPurchased(int quantityPurchased) {
		this.quantityPurchased = quantityPurchased;
	}
	
	public void getprintCartSummary() {
		int remainingQuantity=prod.getAvailableQuantity()-quantityPurchased;
		if(remainingQuantity>0) {
			System.out.println("Your CartList is Ready..@\nRemainingQuantity:"+remainingQuantity);
System.out.println("============================\nFinal Bill\n============================");
System.out.println("ProductName:"+prod.getProductName()+"\nProductPrice:"+prod.getPricePerUnit()+"\nTotalBill:"+(prod.getPricePerUnit()*quantityPurchased));

			
	}else {
		System.out.println("Items are Not Available.");
	}
		
		
		
		
	}
}
