package demo.model;




public class Product {
	int productId;
	String productName;
	double productPrice;
	
	public Product(int prodId,String prodName,double prodPrice){
//		System.out.println("Parameterized");
		productId=prodId;
		productName=prodName;
		productPrice=prodPrice;
	}
	public Product(){
//		System.out.println("Non-Parameterized");
	}
	
	public void setProductId(int prodId) {
		
		productId=prodId;
		System.out.println("Id of Product is : "+productId);
	}
	public void setProductName(String prodName) {
		
		productName=prodName;
		System.out.println("Name of Product is : "+productName);
	}
	public void setProductPrice(double prodPrice) {
		
		productPrice=prodPrice;
		System.out.println("Price of Product is : "+productPrice);
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getProductPrice() {
		return productPrice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product sc=new Product();
		sc.setProductId(1);
		sc.setProductName("biscuit");
		sc.setProductPrice(20);



	}

}
