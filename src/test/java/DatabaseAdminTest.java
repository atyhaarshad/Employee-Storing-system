import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Paul", "NX987", 25000);
    }

    @Test
    public void hasEmployeeDetails(){
        assertEquals("Paul", databaseAdmin.getName());
        assertEquals("NX987", databaseAdmin.getNI());
        assertEquals(25000, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(25100, databaseAdmin.raiseSalary(100.00), 0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(250, databaseAdmin.payBonus(), 0);
    }
}
