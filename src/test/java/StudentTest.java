import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void makeStudent(){
        Student james = new Student(1L,"james");
        Student gemes = null;
        assertNull(gemes);
        assertNotNull(james);

    }

    @Test
    public void checkStudentInfo(){
        Student james = new Student(50L,"james");
        assertSame(50L, james.getId());
        assertSame("kirk", james.getName());
        assertSame(0,james.getGrades().get());
    }

//    @Test
//    public void

}
