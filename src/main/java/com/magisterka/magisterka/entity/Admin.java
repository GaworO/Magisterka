package com.magisterka.magisterka.entity;


import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

@Entity
@Table(name="admin")

public class Admin {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id ;

  @Column(name="login")
  @NotBlank
  private String login ;
  @Column(name="haslo")
  @NotBlank
  private String haslo ;

  public Admin(String login, String haslo) {
    this.login = login;
    this.haslo = haslo;
  }

  public Admin() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getHaslo() {
    return haslo;
  }

  public void setHaslo(String haslo) {
    this.haslo = haslo;
  }
}
