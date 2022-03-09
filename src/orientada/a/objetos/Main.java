package orientada.a.objetos;

public class Main {

    public static void main(String[] args) {
        Product product = new Product(100f,20);
        Product product1 = new Product(35f,10);
        Seller seller = new Seller(50f);
        Buyer buyer = new Buyer(500000f);
        Buyer buyer1 = new Buyer(200f);
        Product[] products = {product,product1};

        Sale sale = new Sale("0001","23/02/1992",products,seller,buyer);

        System.out.println("Exercicio 02 Agregação: ");

        System.out.println("Venda: " + sale);
        System.out.println("*****************************");
        sale.makesSale(products,seller,buyer);
        System.out.println("*****************************");


    }
}
