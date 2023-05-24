// Design the Restful web services to add the order details into database
package com.ecommerce.onlineshopping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Poonam
 *
 */
@Entity
@Table(name="Prod_order")
public class Order {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long Prod_orderId;
	    //private long userId;
	    private String productName;
	    private int quantity;
	    private double price;
	    
		public long getProd_orderId() {
			return Prod_orderId;
		}
		public void setProd_orderId(long prod_orderId) {
			Prod_orderId = prod_orderId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
	    
		
	    


}
