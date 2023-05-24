package com.ecommerce.onlineshopping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Prouduct {
	
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int productid;
        private int userid;
        private String productName;
        private String  prodCode;
        private  String prodDisc;
        private  int quantity;
        private double price;
		public int getProductid() {
			return productid;
		}
		public void setProductid(int productid) {
			this.productid = productid;
		}
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getProdCode() {
			return prodCode;
		}
		public void setProdCode(String prodCode) {
			this.prodCode = prodCode;
		}
		public String getProdDisc() {
			return prodDisc;
		}
		public void setProdDisc(String prodDisc) {
			this.prodDisc = prodDisc;
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



