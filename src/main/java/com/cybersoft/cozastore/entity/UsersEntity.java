package com.cybersoft.cozastore.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Users")
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ID;
    @Column(name = "email")
    private String email;
    @Column(name = "passwords")
    private String passwords;
    @Column(name = "username")
    private String username;
    @OneToMany(mappedBy = "users")
    private Set<BlogEntity> blog;
    @OneToMany(mappedBy = "user")
    private Set<OrdersEntity> orders;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<BlogEntity> getBlog() {
        return blog;
    }

    public void setBlog(Set<BlogEntity> blog) {
        this.blog = blog;
    }

    public Set<OrdersEntity> getOrders() {
        return orders;
    }

    public void setOrders(Set<OrdersEntity> orders) {
        this.orders = orders;
    }
}
