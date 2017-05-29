package com.test.ejb;

import com.test.ejb.DAO.ProductDAO;
import com.test.ejb.DAO.ProductEntity;
import com.test.ejb.model.Product;

import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * Created by Pavel_Arlovich on 5/29/2017.
 */
@Stateless
public class ProductServiceImpl implements ProductServiceRemote {

    @EJB
    private ProductDAO productDAO;

    @POST
    @Path("product")
    public long addProduct(Product product) {
        ProductEntity entity = new ProductEntity();
        entity.setName(product.getName());
        entity.setVendor(product.getVendor());
        return productDAO.create(entity);
    }
}
