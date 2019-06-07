import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Tom", "NX457", 30000);
    }

    @Test
    public void hasEmployeeDetails(){
        assertEquals("Tom", developer.getName());
        assertEquals("NX457", developer.getNI());
        assertEquals(30000, developer.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(30100, developer.raiseSalary(100), 0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(300, developer.payBonus(), 0);
    }



}
