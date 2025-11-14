// Parent class
class Transport {
    void move() {
        System.out.println("Transport can move from one place to another.");
    }
}

// Child class 1
class Bus extends Transport {
    void carryPassengers() {
        System.out.println("Bus carries passengers.");
    }
}

// Child class 2
class Truck extends Transport {
    void carryGoods() {
        System.out.println("Truck carries goods.");
    }
}

// Main class
public class TransportDemo {
    public static void main(String[] args) {
        // Creating Bus object
        Bus bus = new Bus();
        System.out.println("=== Bus Object ===");
        bus.move();              // inherited from Transport
        bus.carryPassengers();   // specific to Bus

        // Creating Truck object
        Truck truck = new Truck();
        System.out.println("\n=== Truck Object ===");
        truck.move();            // inherited from Transport
        truck.carryGoods();      // specific to Truck
    }
}
