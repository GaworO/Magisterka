package com.magisterka.magisterka.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Client")
public class Client {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id ;

  @Column(name = "email")
  @NotBlank
  @Email
  private String email ;

  @Column(name = "name")
  @NotBlank
  private String name ;


  @OneToOne(mappedBy = "client" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
  @JoinColumn(name = "choice")
  private Choice choice ;

  public Client() {
  }

  public Client(String email, String name, Choice choice) {
    this.email = email;
    this.name = name;
    this.choice = choice;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Choice getChoice() {
    return choice;
  }

  public void setChoice(Choice choice) {
    this.choice = choice;
  }
}
