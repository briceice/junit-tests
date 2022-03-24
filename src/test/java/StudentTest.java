import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student student;

    @Before
    public void setUp(){
        student = new Student(1, "Bob");
        student.addGrade(100);
        student.addGrade(97);
        student.addGrade(97);
    }

    @Test
    public void testIfIdIsSet(){
        assertEquals(1, student.getId(), 0);
    }

    @Test
    public void testIfNameIsSet(){
        assertEquals("Bob", student.getName());
    }

    @Test
    public void testIfGradeIsSet(){
        assertEquals((Integer) 100, student.getGrades().get(0));
    }

    @Test
    public void testIfAverageIsSet(){
        assertEquals(98, student.getGradeAverage(),0);
    }
}
