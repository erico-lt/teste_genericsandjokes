package entites;

public class Products implements Comparable<Products> {
    private String name;
    private Double price;
    
    public Products(String name, Double pice) {
        this.setName(name);
        this.setPrice(pice);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Products other) {
        return this.getPrice().compareTo(other.getPrice());
    }

    @Override
    public String toString() {
        return "[Name: " + this.getName() + ", Price: " + this.getPrice();
    }

}
