package demo.Service;

import demo.model.Product;
import demo.dao.ProductDAO;

public class ProductService {
	
	// Here we declare member variable of ProductDAO type
	ProductDAO productDAO;
	
	
	public ProductService() {
		
		//here we are creating an object for ProductDAO class because we are calling the SetProduct method from class ProductDAO
		productDAO=new ProductDAO();
	}
	
	// here we declare parameterised set method of parameter as Product Type
	public void setProduct(Product product) {
		
		//here we are calling the setProduct method from ProductDAO class with help of object we created at line no. 15
		productDAO.setProduct(product);
	}
	
	// here we are declaring getter method of Product Array Type
	public Product[] getProducts() {
		
		//
	Product productArr[]=productDAO.getProducts();
	return productArr;	
	//return productDAO.getProducts();
	}

}