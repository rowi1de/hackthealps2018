package it.hackthealps.codemates.staylocalpaylocal.payment.dto;


public class PaymentDTO {
	// @NotBlank
	private String customerTokenIdentification;
	private String customerTransactionKey;
	private int amount;
	private String shopTokenIdentification;
	private String shopTransactionKey;
	private Long modelID;

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

	public Long getModelID() {
		return modelID;
	}

	public PaymentDTO setModelID(Long modelID) {
		this.modelID = modelID;
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
