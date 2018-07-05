import java.util.ArrayList;
import java.util.List;

public class Grid {

    private int x;
    private int y;
    private List<Ship> ships;
    private boolean grid[][]; //2d array that will be the grid for the battle ships ([y][x])


        //constructor
    public Grid(int x, int y){
        this.x =x;
        this.y = y;
        ships = new ArrayList<Ship>();
        grid = new boolean[y][x];
    }

    // this method was created in order to set the grid (2d array) to have all of its spaces set to false
    public void intitalGrid(){
        for(int i =0; i < x; i++){
            for(int j =0 ; j<y; j++){
                grid[j][i]= false;
            }
        }
    }

    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }

    // this method links with the next method, will add a ship if the ship entry is valid and the space is not occupied
    public boolean addShip(Ship ship){
        boolean added = false;
        if(validShipEntry(ship) && !isSpaceOccupied(ship)){

            added = true;

            int shipX = ship.getX()-1;
            int shipY = ship.getY()-1;

            for (int i = 0; i < ship.getShipSize(); i++) {
                switch (ship.getDirection()) {
                    case NORTH:
                        grid[shipY +i][shipX] = true; // 2d arrays work with the y coordinate first e.g (0,1) relates to (y-0, x-1)
                        break;
                    case WEST:
                        grid[shipY][shipX- i] = true;
                        break;
                    case SOUTH:
                        grid[shipY -i][shipX] = true;
                        break;
                    case EAST:
                        grid[shipY + i][shipX] = true;
                        break;
                }
            }
            ships.add(ship);

            }
            return added;

        }

    public boolean validShipEntry(Ship ship){
        boolean validity = false;
        switch(ship.getDirection()){

            case NORTH:
                if(ship.getY()+
                        ship.getShipSize()-1<=y) { //this means, if the position of the entered y coordinate of the ship along with its size is less than the max y cordinate of the grid, return that it is a valid entry
                    validity = true;
                }
                break;
            case EAST:
                if (ship.getX()+ship.getShipSize()-1<=x) {
                    validity = true;
                }
                break;
            case SOUTH:
                if (ship.getY()-ship.getShipSize()+1>0) {
                    validity = true;
                }
                break;
            case WEST:
                if (ship.getX()-ship.getShipSize()+1>0) {
                    validity = true;
                }
                break;

        } return validity;



    }
    public boolean isSpaceOccupied(Ship ship){

        boolean occupied = false;
        int shipX = ship.getX()-1;
        int shipY = ship.getY()-1;
        for (int i = 0; i < ship.getShipSize(); i++){

            switch (ship.getDirection()) {
                case NORTH:
                    if (grid[shipY +i][shipX ] == true) {
                        occupied = true;
                    }
                    break;
                case WEST:
                    if (grid[shipY][shipX-i]== true) {
                        occupied = true;
                    }
                    break;
                case SOUTH:
                    if (grid[shipY - i][shipX] == true) {
                        occupied = true;
                    }
                    break;
                case EAST:
                    if (grid[shipY][shipX +i] == true) {
                        occupied = true;
                    }
                    break;
            }

        }
        return occupied;





    }

}
