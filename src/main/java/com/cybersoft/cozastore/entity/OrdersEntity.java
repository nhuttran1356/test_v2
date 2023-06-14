package com.cybersoft.cozastore.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Orders")
public class OrdersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "total_price", nullable = false)
    private int totalPrice;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "postcode", nullable = false)
    private String postcode;

    @ManyToOne
    @JoinColumn(name = "UserID")
    private UsersEntity user;

    @ManyToOne
    @JoinColumn(name = "CountryID")
    private CountryEntity country;

    @ManyToOne
    @JoinColumn(name = "CouponID")
    private CouponEntity coupon;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private Set<Product_OrdersEntity> productOrders;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public UsersEntity getUser() {
        return user;
    }

    public void setUser(UsersEntity user) {
        this.user = user;
    }

    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
    }

    public CouponEntity getCoupon() {
        return coupon;
    }

    public void setCoupon(CouponEntity coupon) {
        this.coupon = coupon;
    }

    public Set<Product_OrdersEntity> getProductOrders() {
        return productOrders;
    }

    public void setProductOrders(Set<Product_OrdersEntity> productOrders) {
        this.productOrders = productOrders;
    }
}
