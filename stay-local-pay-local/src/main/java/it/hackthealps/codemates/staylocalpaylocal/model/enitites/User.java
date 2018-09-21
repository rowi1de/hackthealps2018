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
	private String tokenIdentification;
	//temporal
	private String transactionKey;
	private int points;

	public String getTokenIdentification() {
		return tokenIdentification;
	}

	public User setTokenIdentification(String accountNumber) {
		this.tokenIdentification = accountNumber;
		return this;
	}

	public String getName() {
		return name;
	}

	public User setName(String name) {
		this.name = name;
		return this;
	}

	public String getTransactionKey() {
		return transactionKey;
	}

	public User setTransactionKey(String token) {
		this.transactionKey = token;
		return this;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", tokenIdentification=" + tokenIdentification
				+ ", transactionKey=" + transactionKey + ", points=" + points + "]";
	}
}
