package sis.report;
import java.util.*;

import junit.framework.*;
import sis.studentinfo.CourseSession;
import sis.studentinfo.DateUtil;
import sis.studentinfo.Student;

public class RosterReportTest extends TestCase {
	private CourseSession session;
	private Date startDate;

	@Override
	public void setUp() {
		startDate = new DateUtil().createDate(2003, 1, 6);
		session = new CourseSession("Prod", "101", startDate);
	}

	public void testRosterReport() {
		session.enroll(new Student("A"));
		session.enroll(new Student("B"));

		String rosterReport = new RosterReport(session).getReport();
		System.out.println(rosterReport);
		assertEquals(RosterReport.ROSTER_REPORT_HEADER + "A" + RosterReport.NEWLINE + "B" + RosterReport.NEWLINE
				+ RosterReport.ROSTER_REPORT_FOOTER + "2" + RosterReport.NEWLINE, rosterReport);
	}
}
