//abstract class. the constructor from this class can be implemented into child classes using super
public abstract class Vehicle {

    private int numberOfWheels;
    private String colour;
    private int ID;

    // constructor. this has the same name as the class
    public Vehicle(int numberOfWheels, int ID, String colour){

        this.setColour(colour);      //the same as this.Colour = Colour, used refractor to create getters and setters
        this.setID(ID);
        this.setNumberOfWheels(numberOfWheels);
    }




    //getter used so other classes can access private variables
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    //setter used in order to set the value given to a variable to a new variable
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public abstract int Bill(); // This allows you to add a bill method to each child class.
                                 // bill method returns the bill for fixing the vehicle.
}
