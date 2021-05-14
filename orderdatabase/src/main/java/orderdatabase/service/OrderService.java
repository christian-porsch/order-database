package orderdatabase.service;

import orderdatabase.model.Order;
import orderdatabase.repository.OrderDatabase;
import orderdatabase.repository.ProductDatabase;

import java.util.Map;

public class OrderService {

    private ProductDatabase productDatabase;
    private OrderDatabase orderDatabase;

    public OrderService(ProductDatabase productDatabase, OrderDatabase orderDatabase) {
        this.productDatabase = productDatabase;
        this.orderDatabase = orderDatabase;
    }

    public void addOrder(){

    }

    /*public Map<String, Order> listOrders(){
    }*/

}
