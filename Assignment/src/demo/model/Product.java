package demo.model;




public class Product {
	//Here we declare member variables
	int productId;
	String productName;
	double productPrice;
	
	// here we declared a parameterised constructor
	public Product(int prodId,String prodName,double prodPrice){
//		System.out.println("Parameterized");
		productId=prodId;
		productName=prodName;
		productPrice=prodPrice;
	}
	
	
	// here we declared a non-parameterised constructor
	public Product(){
//		System.out.println("Non-Parameterized");
	}
	
	
	// In Set Method we setting the information of employees
		// here we are declaring parameterised method without return type for Product ID
	public void setProductId(int prodId) {
		
		productId=prodId;
		System.out.println("Id of Product is : "+productId);
	}
	
	// In Set Method we setting the information of employees
		// here we are declaring parameterised method without return type for Product Name
	public void setProductName(String prodName) {
		
		productName=prodName;
		System.out.println("Name of Product is : "+productName);
	}
	
	
	// In Set Method we setting the information of employees
		// here we are declaring parameterised method without return type for Product Price
	public void setProductPrice(double prodPrice) {
		
		productPrice=prodPrice;
		System.out.println("Price of Product is : "+productPrice);
	}
	
	
	// With Help of getter method we access the information of Product set by the setter method
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getProductPrice() {
		return productPrice;
	}





	}
