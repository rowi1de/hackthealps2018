package it.hackthealps.codemates.staylocalpaylocal.payment.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue
	private Long id;
	private String lastName;
	private String firstName;
	private String tokenIdentification;
	// temporal
	private String transactionKey;
	private int points;
	private int total;
	private boolean greenTravel;

	public String getTokenIdentification() {
		return tokenIdentification;
	}

	public User setTokenIdentification(String accountNumber) {
		this.tokenIdentification = accountNumber;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public User setLastName(String name) {
		this.lastName = name;
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

	public int getTotal() {
		return total;
	}

	public User setTotal(int total) {
		this.total = total;
		return this;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", tokenIdentification="
				+ tokenIdentification + ", transactionKey=" + transactionKey + ", points=" + points + ", total=" + total
				+ "]";
	}

	public boolean isGreenTravel() {
		return greenTravel;
	}

	public User setGreenTravel(boolean greenTravel) {
		this.greenTravel = greenTravel;
		return this;
	}

}
