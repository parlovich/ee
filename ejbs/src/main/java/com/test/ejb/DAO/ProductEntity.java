package com.test.ejb.DAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.SEQUENCE;

/**
 * Created by Pavel_Arlovich on 5/29/2017.
 */
@Entity
@Table(name="TEST_PRODUCT")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy=SEQUENCE, generator="PRODUCT_ID_SEQ")
    private long id;

    @Column(name="NAME")
    private String name;

    @Column(name="VENDOR")
    private String vendor;

    @Column(name="USER")
    private String user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
