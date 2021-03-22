package schema.creation.abstractFactory.dao.product;

import schema.creation.abstractFactory.bean.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by forgot on 2017/6/18.
 */
public class SQLiteProductDao implements IProductDao {
    Map<String, Product> map = new HashMap<>();

    @Override
    public void addProduct(Product product) {
        map.put(product.getProductName(), product);
    }

    @Override
    public void removeProduct(Product product) {
        map.remove(product.getProductName());
    }

    @Override
    public Product getProduct(String productName) {
        return map.get(productName);
    }

    @Override
    public String toString() {
        return "SQLiteProductDao{" +
                "map=" + map +
                '}';
    }
}
