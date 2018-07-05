import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
public class GridTest {

    private Grid g;

    @Before
    public void initialize(){
         g = new Grid(3,3); //3 by 3 grid
    }


    @Test
    public void addShipNorthTest() {


        // test to show if a ship has bee added to the array (if the values entered return true, then it will be added.if false then it will not be added.

        assertEquals(true, g.addShip(new Ship("battle", 2, 1, 1, Direction.NORTH)));
        assertEquals(false, g.addShip(new Ship("battle", 2, 1, 3, Direction.NORTH)));

        //in the first test, the ship will added in the north direction from the coordinates 1,1 with a size of 2 into a 3 by 3 grid.
    }

    @Test
    public void addShipWestTest() {

        assertEquals(true, g.addShip(new Ship("battle", 2, 3, 1, Direction.WEST)));
        assertEquals(false, g.addShip(new Ship("battle", 2, 1, 1, Direction.WEST)));
    }

    @Test
    public void addShipEastTest() {

        assertEquals(true, g.addShip(new Ship("battle", 2, 1, 1, Direction.EAST)));
        assertEquals(false, g.addShip(new Ship("battle", 2, 3, 1, Direction.EAST)));
    }
    @Test
    public void addShipSouthTest(){

        assertEquals(true,g.addShip(new Ship("battle", 2, 1,3, Direction.SOUTH)));
        assertEquals(false,g.addShip(new Ship("battle", 2,1,1, Direction.SOUTH)));
    }



}
