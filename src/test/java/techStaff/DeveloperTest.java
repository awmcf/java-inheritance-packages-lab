package techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Aaron", 7, 20000.0);
    }

    @Test
    public void canGetName() {
        assertEquals("Aaron", developer.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals(7, developer.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(20000.0, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(7);
        assertEquals(20007.0, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        developer.payBonus();
        assertEquals(200, developer.payBonus(), 0.01);
    }
}
