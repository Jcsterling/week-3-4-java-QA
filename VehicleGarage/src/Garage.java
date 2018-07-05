import java.util.ArrayList;

public class Garage {

    ArrayList<Vehicle> vehicleArrayList; // initialisation of an object (which is an array)
                                        // the same way you would do "int x; "


    // CONSTRUCTOR for garage class
    public Garage(){
        vehicleArrayList = new ArrayList<>();

    }

    public void addVehicle(Vehicle v){ //v is any vehicle in an object with type "Vehicle"

        this.vehicleArrayList.add(v); //method of adding values to an array list
    }

    public void emptyGarage(){
        vehicleArrayList.clear();
    }

    //this method is used to remove a vehicle by its ID
    public void removeVehicleByID(int ID){
        for (int i = 0; i <= vehicleArrayList.size()-1; i++) {
            Vehicle v = vehicleArrayList.get(i);
            if (v.getID() == ID){
                vehicleArrayList.remove(v);
            }

        }
    }

    public void removeVehicleByType(String type){
        for (int i = 0; i <= vehicleArrayList.size()-1; i++) {
            Vehicle v = vehicleArrayList.get(i);

            switch (type) {
                case "car":
                    if (v instanceof Car) {
                        vehicleArrayList.remove(v); //remove cars in the case "car" is entered.
                        i--;   //decrement so that when anything is removed, the loop does not skip over any values when iterating again
                    }
                    break;
                case "MotorBike":
                    if (v instanceof MotorBike) {
                        vehicleArrayList.remove(v);
                        i--;
                    }
                    break;

                case "Rocket":
                    if (v instanceof Rocket){
                        vehicleArrayList.remove(v);
                        i--;
                    }
                    break;
            }
        }
    }

    MotorBike M = new MotorBike(5,"V",7);




    //this method will calculate the accumulative bill of the vehicles entered into the garage
    public int BillForFixingVehicle(){

        int totalBill = 0;

        for (Vehicle v : vehicleArrayList) { // v is an instance of an object (vehicle) within the list of vehicles (vehicleArrayList).

            totalBill += v.Bill();

        }return totalBill ;
    }
// this method will be called from the main in order to display a list of all the vehicles added to the garage
    public void displayVehicles() {

        for (Vehicle v : vehicleArrayList) {
            System.out.println(v.toString()); //when printing out an object, the toString method is always called implicitly. this will result in printing the memory address
        }



    }


}
