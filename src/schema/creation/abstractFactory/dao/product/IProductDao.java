package schema.creation.abstractFactory.dao.product;

import schema.creation.abstractFactory.bean.Product;

/**
 * Created by forgot on 2017/6/18.
 */
public interface IProductDao {
    void addProduct(Product product);

    void removeProduct(Product product);

    Product getProduct(String productName);
}
