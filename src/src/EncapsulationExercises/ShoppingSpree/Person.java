package src.EncapsulationExercises.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public void buyProduct(Product product) {
        if (this.money < product.getCost()) {
            throw new IllegalStateException(this.name+" can't afford "+ product.getName());
        }
        this.products.add(product);
        this.money -= product.getCost();

    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void setName(String name) {
        Validator.validateName(name);
        this.name = name;
    }

    public void setMoney(double money) {
        Validator.validateMoney(money);
        this.money = money;
    }

   @Override
   public String toString() {
       String postfix=this.products.size()>0
               ? this.products.stream()
                   .map(Product::getName)
                   .collect(Collectors.joining(", "))
               :"Nothing bought";
       return this.name+ " - "+ postfix;

   }
}
