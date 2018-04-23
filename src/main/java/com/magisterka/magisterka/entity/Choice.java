package com.magisterka.magisterka.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="choice")
public class Choice {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;


  @Column(name = "colar")
  private Boolean colar;

  @Column(name = "chais")
  private Boolean chais;

  @Column(name = "dispenser")
  private Boolean dispenser;

  @Column(name = "gravity")
  private Boolean gravity;

  @Column(name = "slip")
  private Boolean slip;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "client_id")
  private Client client;



  public Choice() {
  }

  public Choice(Boolean colar, Boolean chais, Boolean dispenser, Boolean gravity, Boolean slip, Client client) {
    this.colar = colar;
    this.chais = chais;
    this.dispenser = dispenser;
    this.gravity = gravity;
    this.slip = slip;
    this.client = client;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Boolean getColar() {
    return colar;
  }

  public void setColar(Boolean colar) {
    this.colar = colar;
  }

  public Boolean getChais() {
    return chais;
  }

  public void setChais(Boolean chais) {
    this.chais = chais;
  }

  public Boolean getDispenser() {
    return dispenser;
  }

  public void setDispenser(Boolean dispenser) {
    this.dispenser = dispenser;
  }

  public Boolean getGravity() {
    return gravity;
  }

  public void setGravity(Boolean gravity) {
    this.gravity = gravity;
  }

  public Boolean getSlip() {
    return slip;
  }

  public void setSlip(Boolean slip) {
    this.slip = slip;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }


  @Override
  public String toString() {
    return "Choice{" +
            "id=" + id.intValue() + "\n" +
            ", colar=" + colar.booleanValue() +
            ", chais=" + chais.booleanValue() +
            ", dispenser=" + dispenser.booleanValue() +
            ", gravity=" + gravity.booleanValue() +
            ", slip=" + slip.booleanValue() +
            ", client=" + client +
            '}';
  }
}