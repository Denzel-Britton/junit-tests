package students;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {


Student denzel= new Student(10,"denzel");

    @Test
    public void testIfidNameinput(){
        Student denzel = new Student(1, "denzel");
        assertEquals(1, denzel.getId());
        assertEquals("denzel", denzel.getName());


    }


@Test
public void testAddGrade(){
         denzel = new Student(10, "denzel");
//        assertEquals(0, denzel.getGrades().size());
         denzel.addGrade(50);
        assertEquals(1, denzel.getGrades().size());
        denzel.addGrade(11);
        assertEquals(2, denzel.getGrades().size());
    }

    @Test
    public void testAverg(){
        Student denzel = new Student(10, "denzel");
        denzel.addGrade(50);
        denzel.addGrade(80);
        assertEquals(65, denzel.getGradeAverage(), .1);

    }





}
