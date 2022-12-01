package demo.view;

import java.util.Scanner;

import demo.model.Product;
import demo.Service.ProductService;

public class ProductView {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		// here we are creating an object for Product Service Class
		ProductService productService=new ProductService();
		
		
		for(int i=0;i<3;i++) {
			System.out.println("Enter product id");
			int pid=scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.println("Enter product name");
			String pname=scanner.nextLine();
			
			System.out.println("Enter product price");
			double price=scanner.nextDouble();
			
			// here we are creating object for Product class 
			Product product=new Product(pid,pname,price);// here we are having product as parametrised constructor thus the constructor is getting invoked with help of object creation
			productService.setProduct(product); // here we are calling set Product method from Product Service Class
			
		}
		// here we are declaring array of Type Product and simultaneously we are calling getProduct Method of Product Service Class With help of Object productservice
		Product productAr[]=productService.getProducts();
		
		for(Product product:productAr) {
			System.out.println(product.getProductId()+" "+product.getProductName()+" "+product.getProductPrice());
		}

	}

}