package it.hackthealps.codemates.staylocalpaylocal.payment.model.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "shop")
public class Shop {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String tokenIdentification;
	private String transactionKey;
	private int rewards;
	// optional another table with productIDs to
	@OneToMany(mappedBy = "shopID")
	private List<Product> productIDs;

	public int getRewards() {
		return rewards;
	}

	public void setRewards(int rewards) {
		this.rewards = rewards;
	}

	public List<Product> getProductIDs() {
		return productIDs;
	}

	public void setProductIDs(List<Product> productIDs) {
		this.productIDs = productIDs;
	}

	public String getTokenIdentification() {
		return tokenIdentification;
	}

	public void setTokenIdentification(String tokenIdentification) {
		this.tokenIdentification = tokenIdentification;
	}

	public String getTransactionKey() {
		return transactionKey;
	}

	public void setTransactionKey(String transactionKey) {
		this.transactionKey = transactionKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", tokenIdentification=" + tokenIdentification
				+ ", transactionKey=" + transactionKey + ", rewards=" + rewards;
	}

}
