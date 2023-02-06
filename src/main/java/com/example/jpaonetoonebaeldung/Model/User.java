package com.example.jpaonetoonebaeldung.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private long id;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn( name = "adsress_id", referencedColumnName = "id")
  private Address address;

  public long getId() {
    return id;
  }

  public Address getAddress() {
    return address;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setAddress(Address adress) {
    this.address = adress;
  }
}
