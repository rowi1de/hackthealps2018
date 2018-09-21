package it.hackthealps.codemates.staylocalpaylocal.model.enitites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
//sveti ivan pokrystitel s
@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String accountNumber;
	private String token;
	private int points;

	public String getAccountNumber() {
		return accountNumber;
	}

	public User setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		return this;
	}

	public String getName() {
		return name;
	}

	public User setName(String name) {
		this.name = name;
		return this;
	}

	public String getToken() {
		return token;
	}

	public User setToken(String token) {
		this.token = token;
		return this;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
