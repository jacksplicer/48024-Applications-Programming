import java.util.*;

public class Store {
    private CashRegister cashRegister;
    private LinkedList<Product> products = new LinkedList<Product>();
    
    public static void main(String[] args) {
        new Store().menu();
    }
    
    public Store() {
        // Insert 6 lines of code to initialise the fields.
        cashRegister = new CashRegister(0.00);
        products.add(new Product("Whiteboard Marker", 85, 1.50));
        products.add(new Product("Whiteboard Eraser", 45, 5.00));
        products.add(new Product("Black Pen", 100, 1.50));
        products.add(new Product("Red Pen", 100, 1.50));
        products.add(new Product("Blue Pen", 100, 1.50)); 
    }
    
    public void menu() {
        char c;
        while((c = readChoice()) != 'x') {
            switch(c) {
                case 's': sell(); break;
                case 'r': restock(); break;
                case 'v': viewStock(); break;
                case 'c': viewCash(); break;
                case 'p': pruneProducts(); break;
                default: help(); break;
            }
        }
        System.out.println("Done");
    }
    
    private char readChoice() {
        System.out.print("Choice (s/r/v/c/p/x): ");
        return In.nextChar();
    }
    
    private void sell() {
        String productName = readName();
        Product product = product(productName.toLowerCase());
        if(product != null) {
            System.out.println("Selling " + product.getName());
            int stockQTY = readNumber();
            if(product.has(stockQTY)) {
                cashRegister.add(product.sell(stockQTY));
            }
            else {
                System.out.println("Not enough stock");
            }
        }
        else if(products(productName).size() > 1) {
            System.out.println("Multiple products match:");
            for(Product prod: products(productName)) {
                System.out.println(prod.toString());
            }
        }
        else {
            System.out.println("No such product");
        }
    }
    
    private Product product(String name) {
        for(Product product: products) {
            if(product.getName().toLowerCase().equals(name)) {
                return product;
            }
        }
        return null;
    }
    
    private LinkedList<Product> products(String partName) {
        LinkedList<Product> match = new LinkedList<Product>();
        for(Product product: products) {
            if(product.getName().toLowerCase().contains(partName.toLowerCase())) {
                match.add(product);
            }
        }
        return match;
    }
    
    private void restock() {
        String productName = readName();
        int stockQTY;
        Product restock = product(productName.toLowerCase());
        if(restock != null) {
            System.out.println("Restocking " + restock.getName());
            stockQTY = readNumber();
            restock.restock(stockQTY);
        }
        else if(products(productName).size() > 1) {
            for(Product product: products(productName)) {
                System.out.println("Restocking " + product.getName());
                stockQTY = readNumber();
                product.restock(stockQTY);
            }
        }
        else {
            System.out.println("Adding new product");
            int productNumber = readNumber();
            double productPrice = readPrice();
            products.add(new Product(productName, productNumber, productPrice));
        }
    }
    
    private void viewStock() {
        for(Product product: products) {
            System.out.println(product.toString());
        }
    }
    
    private void viewCash() {
        System.out.println(cashRegister.toString());
    }
    
    private void pruneProducts() {
        LinkedList<Product> pruneProducts = pruneProducts(products);
        products.removeAll(pruneProducts);
    }
    
    private LinkedList<Product> pruneProducts(LinkedList<Product> products) {
        LinkedList<Product> matches = new LinkedList<Product>();
        for(Product product: products) {
            if(product.isEmpty()) {
                matches.add(product);
            }
        }
        return matches;
    }
    
    private String readName() {
        System.out.print("Name: ");
        return In.nextLine();
    }

    private double readPrice() {
        System.out.print("Price: $");
        return In.nextDouble();
    }

    private int readNumber() {
        System.out.print("Number: ");
        return In.nextInt();
    }

    private void help() {
        System.out.println("Menu options");
        System.out.println("s = sell");
        System.out.println("r = restock");
        System.out.println("v = view stock");
        System.out.println("c = view cash");
        System.out.println("p = prune products");
        System.out.println("x = exit");
    }
}
