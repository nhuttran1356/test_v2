package com.cybersoft.cozastore.entity;

import com.cybersoft.cozastore.entity.ids.Product_OrderIds;

import javax.persistence.*;

@Entity(name = "Product_Orders")
public class Product_OrdersEntity {
    @EmbeddedId
    private Product_OrderIds productOrderIds;
    @ManyToOne
    @JoinColumn(name = "OrdersID", insertable = false,updatable = false)
    private OrdersEntity order;

    @ManyToOne
    @JoinColumn(name = "ProductID", insertable = false,updatable = false)
    private ProductEntity product;
    @Column(name = "quantity")
    private int quatity;

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public Product_OrderIds getProductOrderIds() {
        return productOrderIds;
    }

    public void setProductOrderIds(Product_OrderIds productOrderIds) {
        this.productOrderIds = productOrderIds;
    }

    public OrdersEntity getOrder() {
        return order;
    }

    public void setOrder(OrdersEntity order) {
        this.order = order;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }
}
