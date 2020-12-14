/**
 */
package tdt4250.wc.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tdt4250.wc.StageOneGroup;
import tdt4250.wc.WcFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stage One Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StageOneGroupTest extends TestCase {

	/**
	 * The fixture for this Stage One Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StageOneGroup fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StageOneGroupTest.class);
	}

	/**
	 * Constructs a new Stage One Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StageOneGroupTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Stage One Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StageOneGroup fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Stage One Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StageOneGroup getFixture() {
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
		setFixture(WcFactory.eINSTANCE.createStageOneGroup());
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

} //StageOneGroupTest
