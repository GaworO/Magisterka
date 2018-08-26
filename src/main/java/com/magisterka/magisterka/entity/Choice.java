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
  private String colar;

  @Column(name = "chais")
  private String chais;

  @Column(name = "dispenser")
  private String dispenser;

  @Column(name = "gravity")
  private String gravity;

  @Column(name = "slip")
  private String slip;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "client_id")
  private Client client;

  public Choice() {
  }

  public Choice(String colar, String chais, String dispenser, String gravity, String slip, Client client) {
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

  public String getColar() {
    return colar;
  }

  public void setColar(String colar) {
    this.colar = colar;
  }

  public String getChais() {
    return chais;
  }

  public void setChais(String chais) {
    this.chais = chais;
  }

  public String getDispenser() {
    return dispenser;
  }

  public void setDispenser(String dispenser) {
    this.dispenser = dispenser;
  }

  public String getGravity() {
    return gravity;
  }

  public void setGravity(String gravity) {
    this.gravity = gravity;
  }

  public String getSlip() {
    return slip;
  }

  public void setSlip(String slip) {
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
            "id=" + id +
            ", colar='" + colar + '\'' +
            ", chais='" + chais + '\'' +
            ", dispenser='" + dispenser + '\'' +
            ", gravity='" + gravity + '\'' +
            ", slip='" + slip + '\'' +
            ", client=" + client +
            '}';
  }
}