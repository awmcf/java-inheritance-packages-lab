package management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Aaron", 7, 20000.0, "Software Development");
    }

    @Test
    public void canGetName() {
        assertEquals("Aaron", manager.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals(7, manager.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(20000.0, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Software Development", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(7);
        assertEquals(20007.0, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        manager.payBonus();
        assertEquals(200, manager.payBonus(), 0.01);
    }
}
