package orientada.a.objetos;

import java.util.Objects;

public class Seller {
    private Float commission;

    public Seller(Float commission) {
        this.commission = commission;
    }

    public Float getCommission() {
        return commission;
    }

    public void setCommission(Float commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "commission=" + commission +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seller)) return false;
        Seller seller = (Seller) o;
        return Objects.equals(getCommission(), seller.getCommission());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCommission());
    }

    // Métodos Públicos
    public void sell(){
        System.out.println("Vende?");
    }
}
