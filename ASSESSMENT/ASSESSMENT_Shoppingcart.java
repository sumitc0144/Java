package ASSESSMENT;

import java.util.List;
import java.util.ArrayList;


class Product{
	int prodId;
	String brand;
	String productName;
	String color;
	double weight;
	int qty; 
	double price; 
	
	public Product(int prodId, String brand, String productName, String color,
            double weight, int qty, double price) {
			 this.prodId = prodId;
			 this.brand = brand;
			 this.productName = productName;
			 this.color = color;
			 this.weight = weight;
			 this.qty = qty;
			 this.price = price;
		}
	
	public String toString() {
		return "ID: " + prodId + ", Brand: " + brand + ", Name: " + productName +
	               ", Color: " + color + ", Weight: " + weight + "kg, Qty: " + qty +
	               ", Price: ₹" + price;
	}
}

public class ASSESSMENT_Shoppingcart {
	public static void main(String[] args) {
		List<Product> cart = new ArrayList<>(); 
		
		cart.add(new Product(103, "Nike", "Running Shoes", "Black", 0.8, 2, 4500));
		cart.add(new Product(101, "Adidas", "Sports Shoes", "White", 1.0, 1, 5500));
		cart.add(new Product(105, "Puma", "T-Shirt", "Blue", 0.3, 3, 1800));
		cart.add(new Product(102, "Nike", "T-Shirt", "Black", 0.4, 2, 2200));
		cart.add(new Product(104, "Levis", "Jeans", "Blue", 1.2, 1, 3200));
		cart.add(new Product(106, "Adidas", "Jacket", "Red", 1.5, 1, 6500)); cart.add(new Product(107, "Puma", "Running Shoes", "Grey", 0.9, 2, 4000)); 
	
	System.out.println("Product before sorting");
	for(Product p:cart) {
		System.out.println(p);
	}
	
	
	
	
	
	}
}
