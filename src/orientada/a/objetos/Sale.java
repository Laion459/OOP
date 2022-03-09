package orientada.a.objetos;

import java.util.Arrays;
import java.util.Objects;

public class Sale {
    private String code;
    private String date;
    private Product[] product;
    private Seller seller;
    private Buyer buyer;

    public Sale(String code, String date, Product[] product, Seller seller, Buyer buyer) {
        this.code = code;
        this.date = date;
        this.product = product;
        this.seller = seller;
        this.buyer = buyer;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "code='" + code + '\'' +
                ", date='" + date + '\'' +
                ", product=" + Arrays.toString(product) +
                ", seller=" + seller +
                ", buyer=" + buyer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sale)) return false;
        Sale sale = (Sale) o;
        return Objects.equals(getCode(), sale.getCode()) && Objects.equals(getDate(), sale.getDate()) && Arrays.equals(getProduct(), sale.getProduct()) && Objects.equals(getSeller(), sale.getSeller()) && Objects.equals(getBuyer(), sale.getBuyer());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getCode(), getDate(), getSeller(), getBuyer());
        result = 31 * result + Arrays.hashCode(getProduct());
        return result;
    }

    // Métodos Públicos

    // Concretiza venda
    public void makesSale(Product[] products, Seller seller, Buyer buyer){
        System.out.println("Concretiza venda");
        System.out.println("seller " + seller);
        System.out.println("buyer " + buyer);
        for (int i = 0; i < product.length; i++){
            System.out.println("Produto N° " + (i +1) + " " + products[i]);
        }
        System.out.println("Antes da alteração: ");
        System.out.println("Comissão: " + seller.getCommission());
        System.out.println("Verba: " + getBuyer());
        System.out.println("Produto: " + products[1]);

        System.out.println("Modificado: ");
        seller.setCommission(15000000f);
        buyer.setBudget(150000000f);
        products[0].setPrice(0001f);
        System.out.println("Comissão: " + seller.getCommission());
        System.out.println("Verba: " + getBuyer());
        System.out.println("Produto: " + products[1]);

    }

    // Cancela venda
    public void cancelSale(){
        System.out.println("Cancela a venda");
    }
}
