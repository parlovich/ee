package com.test.ejb;

import com.test.ejb.model.Product;

import javax.ejb.Remote;

/**
 * Created by Pavel_Arlovich on 5/29/2017.
 */
@Remote
public interface ProductServiceRemote {
    long addProduct(Product product);
}
