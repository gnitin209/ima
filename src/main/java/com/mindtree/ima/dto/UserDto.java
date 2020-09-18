package com.mindtree.ima.dto;

public class UserDto {
private int productId;
	private String userEmail;
	private String productName;
	private String productVendor;
	private long productPrice;
	private int productQuantity;
	private long batchNumber;
	private String batchDate;
	private boolean status;
	public UserDto(int productId, String userEmail, String productName, String productVendor, long productPrice,
			int productQuantity, long batchNumber, String batchDate, boolean status) {
		super();
		this.productId = productId;
		this.userEmail = userEmail;
		this.productName = productName;
		this.productVendor = productVendor;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.batchNumber = batchNumber;
		this.batchDate = batchDate;
		this.status = status;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductVendor() {
		return productVendor;
	}
	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}
	public long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public long getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(long batchNumber) {
		this.batchNumber = batchNumber;
	}
	public String getBatchDate() {
		return batchDate;
	}
	public void setBatchDate(String batchDate) {
		this.batchDate = batchDate;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
