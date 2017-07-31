package schema.creation.abstractFactory.dao.product;

import schema.creation.abstractFactory.bean.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by forgot on 2017/6/18.
 */
public class MySQLProductDao implements IProductDao {
    Map<String,Product> map =new HashMap<>();
    @Override
    public void addProduct(Product product) {
        map.put(product.getPriductName(),product);
    }

    @Override
    public void removeProduct(Product product) {
map.remove(product.getPriductName());
    }

    @Override
    public Product getProduct(String productName) {
        return map.get(productName);
    }
}
