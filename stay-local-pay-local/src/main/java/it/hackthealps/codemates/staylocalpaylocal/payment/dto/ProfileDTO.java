package it.hackthealps.codemates.staylocalpaylocal.payment.dto;

public class ProfileDTO {
	private String firstName;
	private String lastName;
	private String tokenIdent;
	private int total;
	private int rewards;
	private String text;

	public String getFirstName() {
		return firstName;
	}

	public ProfileDTO setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public ProfileDTO setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public int getTotal() {
		return total;
	}

	public ProfileDTO setTotal(int total) {
		this.total = total;
		return this;
	}

	public int getRewards() {
		return rewards;
	}

	public ProfileDTO setRewards(int rewards) {
		this.rewards = rewards;
		return this;
	}

	public String getTokenIdent() {
		return tokenIdent;
	}

	public ProfileDTO setTokenIdent(String string) {
		this.tokenIdent = string;
		return this;
	}

	public String getText() {
		return text;
	}

	public ProfileDTO setText(String text) {
		this.text = text;
		return this;
	}
}
