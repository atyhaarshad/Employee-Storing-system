import management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Bob", "NX321", 50000, "IT");
    }

    @Test
    public void hasEmployeeDetails(){
        assertEquals("Bob", manager.getName());
        assertEquals("NX321", manager.getNI());
        assertEquals(50000, manager.getSalary(), 0);
    }

    @Test
    public void hasDept(){
        assertEquals("IT", manager.getDept());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(250);
        assertEquals(50250, manager.getSalary(), 0);
    }

    @Test
    public void cannotRaiseSalary(){
        manager.raiseSalary(0);
        assertEquals(50000, manager.getSalary(), 0);
    }

    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(500, manager.payBonus(), 0);
    }

    @Test
    public void canSetName(){
        manager.setName("Bobby");
        assertEquals("Bobby", manager.getName());
    }

    @Test
    public void cantSetNameIfNameNull(){
        manager.setName(null);
        assertEquals("Bob", manager.getName());
    }






}
