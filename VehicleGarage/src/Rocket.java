public class Rocket extends Vehicle {

    private int blastRadius;

    public Rocket(int blastRadius, String colour, int ID ){
        super(1, ID, colour);

        this.setBlastRadius(blastRadius);
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "blastRadius=" + blastRadius +
                '}';
    }

    @Override
    public int Bill() {
        return 22000;
    }


    public int getBlastRadius() {
        return blastRadius;
    }

    public void setBlastRadius(int blastRadius) {
        this.blastRadius = blastRadius;
    }
}
