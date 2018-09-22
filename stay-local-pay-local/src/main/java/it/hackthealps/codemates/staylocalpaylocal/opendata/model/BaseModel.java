package it.hackthealps.codemates.staylocalpaylocal.opendata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;

import lombok.Data;

@Data
@Entity
@Inheritance
public abstract class BaseModel {

    @Id
    @GeneratedValue
    Long id;

}
