package orderdatabase.model;

public class Order {

    private String id;
    private String name;

    public Order(String id, String name){
        this.id = id;
        this.name = name;

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
