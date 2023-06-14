package com.cybersoft.cozastore.entity.ids;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Product_OrderIds implements Serializable {
    @Column(name = "OrdersID")
    private int odersId;
    @Column(name = "ProductID")
    private int productId;

    public Product_OrderIds(){}
    public Product_OrderIds(int odersId, int productId) {
        this.odersId = odersId;
        this.productId = productId;
    }

    public int getOdersId() {
        return odersId;
    }

    public void setOdersId(int odersId) {
        this.odersId = odersId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
