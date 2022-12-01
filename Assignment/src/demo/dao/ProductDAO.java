package demo.dao;
import demo.model.Product;
public class ProductDAO {
	
	// here we created an array of type Product having size 3
	Product productArr[]=new Product[3];
	
	//here we are declaring a parametric setter method having parameter of Type Product 
	public void setProduct(Product product) { // here Product= Datatype  and product=variable
		for(int i=0;i<productArr.length;i++) {
			if(productArr[i]==null) {
				productArr[i]=product;
				break;
			}
			
		}
		
	}
	
	// here we are declaring getter method of Product Array Type
	public Product[] getProducts() {
		
		return productArr;
	}

}