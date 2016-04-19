
public class RosterReport {
	public static final String NEWLINE = System.getProperty("line.separator");
	public static final String ROSTER_REPORT_HEADER = "Student" + NEWLINE + "-" + NEWLINE;
	public static final String ROSTER_REPORT_FOOTER = NEWLINE + "# students = ";

	private CourseSession session;

	RosterReport(CourseSession session) {
		this.session = session;
	}

	public String getReport() {
		StringBuilder buffer = new StringBuilder();
		buffer.append(ROSTER_REPORT_HEADER);

		for (Student student : session.getAllStudents()) {
			buffer.append(student.getName());
			buffer.append(NEWLINE);
		}

		buffer.append(ROSTER_REPORT_FOOTER);
		buffer.append(session.getAllStudents().size());
		buffer.append(NEWLINE);

		return buffer.toString();
	}
}
