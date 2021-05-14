package orderdatabase.repository;

import orderdatabase.model.Product;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ProductDatabase {

    private List<Product> products;

    public ProductDatabase(List<Product> products){
        this.products = Collections.unmodifiableList(products);
    }

    public List<Product> listAllProducts(){
        return products;
    }

    public Optional<Product> getProductByID(String id){
        for (Product product : products) {
            if (product.getId().equals(id)){
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

}
