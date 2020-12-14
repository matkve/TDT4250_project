/**
 */
package tdt4250.wc.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tdt4250.wc.TeamMatchStatistics;
import tdt4250.wc.WcFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Team Match Statistics</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TeamMatchStatisticsTest extends TestCase {

	/**
	 * The fixture for this Team Match Statistics test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamMatchStatistics fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TeamMatchStatisticsTest.class);
	}

	/**
	 * Constructs a new Team Match Statistics test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamMatchStatisticsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Team Match Statistics test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TeamMatchStatistics fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Team Match Statistics test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamMatchStatistics getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WcFactory.eINSTANCE.createTeamMatchStatistics());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TeamMatchStatisticsTest
