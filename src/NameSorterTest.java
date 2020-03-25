import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class NameSorterTest{

    NameSorter nameSorter;

    @Before
    public void init(){
        nameSorter = new NameSorter();
    }
 
    @Test
    public void testInputFile() {
        assertEquals("unsorted-names-list.txt", nameSorter.getFileName());
    }
 
    @Test
    public void isEmpty() {
        assertEquals(0, nameSorter.getSizeFile());
    }

}