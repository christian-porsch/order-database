package orderdatabase.repository;

import orderdatabase.model.Order;

import java.util.*;

public class OrderDatabase {

    private Map<String,Order> orders = new HashMap<>();


    public Map<String,Order> listAllOrders(){
        return orders;
    }

    public Optional<Order> findOrderByID(String id){
        return Optional.ofNullable(orders.get(id));
    }

    public void addOrder(Order newOrder){
        orders.put(newOrder.getId(), newOrder);
    }
}
