import org.junit.Test;
import static org.junit.Assert.*;
public class CohortTest {
    // following requirements:
    //A Cohort instance can add a Student to the List of students.
    //A Cohort instance can get the current List of students.
    //A Cohort instance can get the average, and it's being calculated correctly.
    //Go back to the StudentTest class and refactor the code to avoid any repetition in the test cases, the use of the @Before annotation will be useful to achieve this, do the same with this new CohortTest class if you find any code repetition as well.

    @Test
    //A Cohort instance can add a Student to the List of students.
    public void cohortNewStudent(){
        Cohort cohort = new Cohort();
        Student denzel = new Student(1,"denzel");
        cohort.addStudent(denzel);
        assertEquals("denzel", cohort.getStudents() );
    }

}
