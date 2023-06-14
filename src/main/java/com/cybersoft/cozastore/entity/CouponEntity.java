package com.cybersoft.cozastore.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Coupon")
public class CouponEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "code")
    private String code;

    @Column(name = "type")
    private String type;

    @Column(name = "promotion")
    private String promotion;

    @OneToMany(mappedBy = "coupon")
    private Set<OrdersEntity> order;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public Set<OrdersEntity> getOrder() {
        return order;
    }

    public void setOrder(Set<OrdersEntity> order) {
        this.order = order;
    }
}
