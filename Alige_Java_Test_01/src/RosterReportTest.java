import java.util.*;
import junit.framework.*;

public class RosterReportTest extends TestCase {
	private CourseSession session;
	private Date startDate;

	public void setUp() {
		startDate = new DateUtil().createDate(2003, 1, 6);
		session = new CourseSession("Prod", "101", startDate);
	}

	public void testRosterReport() {
		session.enroll(new Student("A"));
		session.enroll(new Student("B"));

		String rosterReport = new RosterReport(session).getReport();
		assertEquals(RosterReport.ROSTER_REPORT_HEADER + "A" + RosterReport.NEWLINE + "B" + RosterReport.NEWLINE
				+ RosterReport.ROSTER_REPORT_FOOTER + "2" + RosterReport.NEWLINE, rosterReport);
	}
}
