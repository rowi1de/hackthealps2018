package it.hackthealps.codemates.staylocalpaylocal.opendata.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class AccessTokenModel {
    @Id
    public String access_token;
}
