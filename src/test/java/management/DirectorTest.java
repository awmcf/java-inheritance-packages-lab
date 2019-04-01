package management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Aaron", 7, 20000.0, "Software Development", 500);
    }

    @Test
    public void canGetName() {
        assertEquals("Aaron", director.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals(7, director.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(20000.0, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Software Development", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(7);
        assertEquals(20007.0, director.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        director.payBonus();
        assertEquals(400, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget() {
        director.getBudget();
        assertEquals(500, director.getBudget(), 0.01);
    }
}
