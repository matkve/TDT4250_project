/**
 */
package tdt4250.wc.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tdt4250.wc.TeamMatchDetails;
import tdt4250.wc.WcFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Team Match Details</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TeamMatchDetailsTest extends TestCase {

	/**
	 * The fixture for this Team Match Details test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamMatchDetails fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TeamMatchDetailsTest.class);
	}

	/**
	 * Constructs a new Team Match Details test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamMatchDetailsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Team Match Details test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TeamMatchDetails fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Team Match Details test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamMatchDetails getFixture() {
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
		setFixture(WcFactory.eINSTANCE.createTeamMatchDetails());
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

} //TeamMatchDetailsTest
