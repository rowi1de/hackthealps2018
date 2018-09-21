package it.hackthealps.codemates.staylocalpaylocal.dto;


public class PaymentDTO {
	// @NotBlank
	private String customerTokenIdentification;
	private String customerTransactionKey;
	private int amount;
	private String shopTokenIdentification;
	private String shopTransactionKey;
	private String productID;

	public String getCustomerTokenIdentification() {
		return customerTokenIdentification;
	}

	public PaymentDTO setCustomerTokenIdentification(String token) {
		this.customerTokenIdentification = token;
		return this;
	}

	public int getAmount() {
		return amount;
	}

	public PaymentDTO setAmount(int amount) {
		this.amount = amount;
		return this;
	}

	public String getProductID() {
		return productID;
	}

	public PaymentDTO setProductID(String productID) {
		this.productID = productID;
		return this;
	}

	public String getShopTokenIdentification() {
		return shopTokenIdentification;
	}

	public void setShopTokenIdentification(String shopTokenIdentification) {
		this.shopTokenIdentification = shopTokenIdentification;
	}

	public String getCustomerTransactionKey() {
		return customerTransactionKey;
	}

	public void setCustomerTransactionKey(String customerTransactionKey) {
		this.customerTransactionKey = customerTransactionKey;
	}

	public String getShopTransactionKey() {
		return shopTransactionKey;
	}

	public void setShopTransactionKey(String shopTransactionKey) {
		this.shopTransactionKey = shopTransactionKey;
	}

}
