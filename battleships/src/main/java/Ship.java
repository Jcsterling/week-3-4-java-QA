public class Ship {

    private String shipType;
    private int shipSize;
    private Direction direction;
    private int x;
    private int y;

    public Ship (String shipType, int shipSize, int x,int y, Direction direction){

        this.setShipSize(shipSize);
        this.setShipType(shipType);
        this.direction = direction;
        this.x = x;
        this.y = y;


    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public int getShipSize() {
        return shipSize;
    }

    public void setShipSize(int shipSize) {
        this.shipSize = shipSize;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
