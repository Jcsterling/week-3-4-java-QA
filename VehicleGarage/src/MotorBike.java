public class MotorBike extends Vehicle{

    private int seatCapacity;

    @Override
    public String toString() { //this method creates a means of displaying the seat capacity next to the specific motorbike
        return "MotorBike{seatCapacity=" + seatCapacity +"}";
    }

    public MotorBike(int seatCapacity, String colour, int ID) {
        super(2, ID, colour);


        //this.seatCapacity =  seatCapacity; when refractored to get getters and setters turns into the line below
        this.setSeatCapacity(seatCapacity);

    }


    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    @Override
    public int Bill() {
        return 150;
    }
}
