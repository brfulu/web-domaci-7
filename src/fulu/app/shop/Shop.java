package fulu.app.shop;

public class Shop {
    private long id;
    private String name;

    public Shop(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
