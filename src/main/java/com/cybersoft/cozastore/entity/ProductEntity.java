package com.cybersoft.cozastore.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "image")
    private String image;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private String quantity;

    @ManyToOne
    @JoinColumn(name = "CategoryID")
    private CategoryEntity category;

    @ManyToOne
    @JoinColumn(name = "SizeID")
    private SizesEntity size;

    @ManyToOne
    @JoinColumn(name = "ColorID")
    private ColorEntity color;

    @OneToMany(mappedBy = "product")
    private Set<Product_OrdersEntity> productOrders;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public SizesEntity getSize() {
        return size;
    }

    public void setSize(SizesEntity size) {
        this.size = size;
    }

    public ColorEntity getColor() {
        return color;
    }

    public void setColor(ColorEntity color) {
        this.color = color;
    }

    public Set<Product_OrdersEntity> getProductOrders() {
        return productOrders;
    }

    public void setProductOrders(Set<Product_OrdersEntity> productOrders) {
        this.productOrders = productOrders;
    }
}
