package sis.studentinfo;
import junit.framework.TestCase;

public class StudentTest extends TestCase {
	public void testCreate() {
		final String studentName1 = "Se Jeong";
		Student student1 = new Student(studentName1);
		assertEquals(studentName1, student1.getName());

		final String studentName2 = "Yoo Jeong";
		Student student2 = new Student(studentName2);
		assertEquals(studentName2, student2.getName());
	}
}
