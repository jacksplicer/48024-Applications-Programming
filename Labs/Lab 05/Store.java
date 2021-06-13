/**
 * The store has and sells one product: Sticky tape.
 *
 * You can sell and restock a product, view stock and view cash.
 */
public class Store {
    // insert main method here
    // insert 2 fields here
    // insert 1 constructor here
    private Product p;
    private CashRegister cr;
    
    public Store() {
       p = new Product("Sticky tape", 200, 2.99);
       cr = new CashRegister();
    }
    
    public static void main(String[] args) {
        new Store().use();
    }
    
    public void use() {
        char c;
        while ((c = menu()) != 'x') {
            switch (c) {
            case 's': sell(); break;
            case 'r': restock(); break;
            case 'v': viewStock(); break;
            case 'c': viewCash(); break;
            default: help(); break;
            }
        }
    }
    
    private char menu() {
        System.out.print("Choice (s/r/v/c/x): ");
        return In.nextChar();
    }
    
    private void sell() {
        System.out.print("Number: ");
        int sellProduct = In.nextInt();
        if(p.has(sellProduct)) {
            cr.addAmount(p.sell(sellProduct));
        }
        else {
            System.out.println("Not enough stock");
        }
    }

    private void restock() {
        System.out.print("Number: ");
        int restockProduct = In.nextInt();
        p.restock(restockProduct);
    }

    private void viewStock() {
        System.out.println(p.toString());
    }

    private void viewCash() {
        System.out.println(cr.toString());
    }

    private void help() {
        System.out.println("Menu options");
        System.out.println("s = sell");
        System.out.println("r = restock");
        System.out.println("v = view stock");
        System.out.println("c = view cash");
        System.out.println("x = exit");
    }
}
