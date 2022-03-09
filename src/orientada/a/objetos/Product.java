package orientada.a.objetos;

import java.util.Objects;

public class Product {
    private Float price;
    private int theAmount;

    public Product(Float price, int size) {
        this.price = price;
        this.theAmount = size;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getTheAmount() {
        return theAmount;
    }

    public void setTheAmount(int theAmount) {
        this.theAmount = theAmount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", size=" + theAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getTheAmount() == product.getTheAmount() && Objects.equals(getPrice(), product.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getTheAmount());
    }

    // Métodos Públicos
    public String sold(){
        return "VENDIDO";
    }
}
