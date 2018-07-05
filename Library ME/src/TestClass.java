import org.junit.Test;

public class TestClass {

    @Test
    public void addItemCheck(){
        ItemHandler i = new ItemHandler();
        i.addBook(new Book(1101,"fiction",true));
        assertEquals(1, i.getBook(1101).size());
    }

    @Test
    public void checkOutTest()
}
