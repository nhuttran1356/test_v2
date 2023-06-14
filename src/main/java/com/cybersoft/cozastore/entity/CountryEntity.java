package com.cybersoft.cozastore.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Country")
public class CountryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "country")
    private Set<OrdersEntity> order;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<OrdersEntity> getOrder() {
        return order;
    }

    public void setOrder(Set<OrdersEntity> order) {
        this.order = order;
    }
}
