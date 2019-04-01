package techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Aaron", 7, 20000.0);
    }

    @Test
    public void canGetName() {
        assertEquals("Aaron", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals(7, databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(20000.0, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(7);
        assertEquals(20007.0, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        databaseAdmin.payBonus();
        assertEquals(200, databaseAdmin.payBonus(), 0.01);
    }
}
