public class Main {

    public static void main(String[] args) {

        Vehicle a = new Car(4,"red",21);
        Vehicle b = new Rocket(9000, "black", 21);
        Vehicle c = new MotorBike(2, "royal blue", 18);
        Vehicle d = new Car(5, "forest green", 47);

        Garage g = new Garage(); // create an instance of class garage called g

        g.addVehicle(a); // add vehicles to the garages
        g.addVehicle(b);
        g.addVehicle(c);
        g.addVehicle(d);

        System.out.println("contents of the garage:\n");
        g.displayVehicles();

        System.out.println("\nthe total bill for the vehicles in the garage is:\n" + g.BillForFixingVehicle());

        g.removeVehicleByType("Rocket");
        System.out.println("\nrocket removed, the new bill is:");
        System.out.println(g.BillForFixingVehicle());

        g.removeVehicleByID(21);
        System.out.println("\nthe vehicle with ID 21 was removed, the new bill is now:\n" + g.BillForFixingVehicle());

        g.emptyGarage();
        System.out.println("\nthe garage is now empty, total bill is now:\n" + g.BillForFixingVehicle());

        System.out.println(a);


        }





    }








