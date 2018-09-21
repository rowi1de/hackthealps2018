package it.hackthealps.codemates.staylocalpaylocal.dto;

import javax.validation.constraints.NotBlank;

public class PaymentDTO {
	@NotBlank
	private String token;
	@NotBlank
	private int amount;
	@NotBlank
	private String productID;

	public String getToken() {
		return token;
	}

	public PaymentDTO setToken(String token) {
		this.token = token;
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

}
