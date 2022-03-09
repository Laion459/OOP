package orientada.a.objetos;

import java.util.Objects;

public class Buyer {
    private Float budget;

    public Buyer(Float budget) {
        this.budget = budget;
    }

    public Float getBudget() {
        return budget;
    }

    public void setBudget(Float budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "budget=" + budget +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Buyer)) return false;
        Buyer buyer = (Buyer) o;
        return Objects.equals(getBudget(), buyer.getBudget());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBudget());
    }

    // Métodos Públicos
    public void purchase(){
        System.out.println("COMPRA!");
    }
}
