package model;

public class Product {

    private int id;
    private String name;
    private int price;
    private int amount;
    private String color;
    private String description;
    private int idCategory;

    public Product(int id, String name, int price, int amount, String color, String description, int idCategory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.color = color;
        this.description = description;
        this.idCategory = idCategory;
    }

    public Product(String name, int price, int amount, String color, String description, int idCategory) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.color = color;
        this.description = description;
        this.idCategory = idCategory;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
