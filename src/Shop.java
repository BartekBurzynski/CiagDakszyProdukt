public class Shop {

    public static void main(String[] args) {

        Address address1 = new Address("Wysokie Mazowieckie", "Ludowa","18-200", "122");


        Producer producer1 = new Producer("Mlekowita", address1);


        Product product1 = new Product("mleko", 3.2, producer1 );

     //   product1.name = "mleko";
     //   product1.price = 3.2;
    //    product1.producer = new Producer("Mlekowita", new Address());
  //      product1.producer.name = "Mlekowita";
      //  product1.producer.address = new Address("Wysokie Mazowieckie", "Ludowa","18-200", "122");
      //  product1.producer.address.city = "Wysokie Mazowieckie";
       // product1.producer.address.street = "Ludowa";
      //  product1.producer.address.homeNo = "122";
       // product1.producer.address.postalCode = "18-200";


        Product product2 = new Product("woda",2.4, producer1);


        System.out.printf("Produkt: %s, cena: %.2f\n", product1.name, product1.price);
        System.out.println("Producent: " + product1.producer.name);
        System.out.printf("Siedziba: %s, %s, %s, %s", product1.producer.address.postalCode,
                product1.producer.address.city,
                product1.producer.address.street,
                product1.producer.address.homeNo);
        System.out.println(" ");


        System.out.printf("Produkt: %s, cena: %.2f\n", product2.name, product2.price);
        System.out.println("Producent: " + product2.producer.name);
        System.out.printf("Siedziba: %s, %s, %s, %s", product2.producer.address.postalCode,
                product2.producer.address.city,
                product2.producer.address.street,
                product2.producer.address.homeNo);

    }
}
