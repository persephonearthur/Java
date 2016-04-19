package sis.studentinfo;
import java.util.*;

import junit.framework.*;

public class CourseSessionTest extends TestCase {
	private CourseSession session;
	private Date startDate;

	@Override
	public void setUp() {
		startDate = new DateUtil().createDate(2003, 1, 6);
		session = new CourseSession("Prod", "101", startDate);
	}

	public void testCreate() {
		assertEquals("Prod", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0, session.getNumberOfStudents());
		assertEquals(startDate, session.getStartDate());
	}

	public void testErollStudents() {
		final String studentName1 = "Se Jeong";
		final Student student1 = new Student(studentName1);
		session.enroll(student1);
		assertEquals(1, session.getNumberOfStudents());
		assertEquals(student1, session.get(0));

		final String studentName2 = "Yoo Jeong";
		final Student student2 = new Student(studentName2);
		session.enroll(student2);
		assertEquals(2, session.getNumberOfStudents());
		assertEquals(student1, session.get(0));
		assertEquals(student2, session.get(1));
	}

	public void testCourseDates() {
		Date sixteenWeeksOut = new DateUtil().createDate(2003, 4, 25);
		assertEquals(sixteenWeeksOut, session.getEndDate());
	}
}
