import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() {
        director = new Director("Boss", "NX231", 100000, "Management", 10000);
    }

    @Test
    public void hasEmployeeDetails(){
        assertEquals("Boss", director.getName());
        assertEquals("NX231", director.getNI());
        assertEquals(100000, director.getSalary(), 0);
        assertEquals("Management", director.getDept());
    }

    @Test
    public void hasBudget(){
        assertEquals(10000, director.getBudget(), 0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(2000, director.payBonus(), 0);
    }


}
