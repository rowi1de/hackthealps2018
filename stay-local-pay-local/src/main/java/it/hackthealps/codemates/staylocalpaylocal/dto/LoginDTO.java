package it.hackthealps.codemates.staylocalpaylocal.dto;

import javax.validation.constraints.NotBlank;

public class LoginDTO {
	@NotBlank
	private String username;
	@NotBlank
	private String password;

	public String getUsername() {
		return username;
	}

	public LoginDTO setUsername(String username) {
		this.username = username;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public LoginDTO setPassword(String password) {
		this.password = password;
		return this;
	}
}
