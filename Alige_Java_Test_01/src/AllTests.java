import junit.framework.TestSuite;

public class AllTests extends TestSuite {
	public static TestSuite suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(StudentTest.class);
		suite.addTestSuite(CourseSessionTest.class);
		suite.addTestSuite(RosterReportTest.class);
		suite.addTestSuite(DateUtilTest.class);
		return suite;
	}
}
