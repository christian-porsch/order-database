package orderdatabase.model;

import java.util.List;

public class Order {

    private String id;
    private List<Product> products;

    public Order(String id, List<Product> products){
        this.id = id;
        this.products = products;

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts(){
        return products;
    }

}
