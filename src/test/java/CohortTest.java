import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CohortTest {
    Cohort testCohort;
    Student s1;
    Student s2;
    Student s3;

    @Before
    public void setUp(){
        testCohort = new Cohort();
        s1 = new Student(1, "Bob");
        s1.addGrade(50);
        s1.addGrade(100);
        s2 = new Student(2, "Sally");
        s2.addGrade(80);
        s2.addGrade(90);
        s3 = new Student(3, "Joe");
        s3.addGrade(90);
        s3.addGrade(100);
        testCohort.addStudent(s1);
        testCohort.addStudent(s2);
    }

    @Test
    public void testGetCohortAverage(){
        assertEquals(80, testCohort.getCohortAverage(), 0);
    }

    @Test
    public void testAddStudent(){
        assertNotEquals(testCohort.getStudents().get(testCohort.getStudents().size()-1), s3);
        testCohort.addStudent(s3);
        assertEquals(testCohort.getStudents().get(testCohort.getStudents().size()-1), s3);
    }

    @Test
    public void testGetStudents(){
        assertEquals(s1, testCohort.getStudents().get(0));
        assertEquals(s2, testCohort.getStudents().get(1));
    }
}
