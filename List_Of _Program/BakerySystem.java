/*
Q13 Design a Bakery system that has the following classes.
• BreadBaker Class
• InventoryManager Class
• SupplyOrder Class
• CustomerService Class
• BakeryCleaner Class

*/
import java.util.*;
class BreadBaker {
    void bake() {
        System.out.println("Baking bread");
    }
}

class InventoryManager {
    void manage() {
        System.out.println("Managing inventory");
    }
}

class SupplyOrder {
    void order() {
        System.out.println("Ordering supplies");
    }
}

class CustomerService {
    void serve() {
        System.out.println("Serving customers");
    }
}

class BakeryCleaner {
    void clean() {
        System.out.println("Cleaning bakery");
    }
}

public class BakerySystem {
    public static void main(String[] args) {

        BreadBaker b = new BreadBaker();
        InventoryManager i = new InventoryManager();
        SupplyOrder s = new SupplyOrder();
        CustomerService c = new CustomerService();
        BakeryCleaner cl = new BakeryCleaner();

        b.bake();
        i.manage();
        s.order();
        c.serve();
        cl.clean();
    }
}
