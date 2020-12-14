/**
 */
package tdt4250.wc.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tdt4250.wc.StartStrategy;
import tdt4250.wc.WcFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Start Strategy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StartStrategyTest extends TestCase {

	/**
	 * The fixture for this Start Strategy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartStrategy fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StartStrategyTest.class);
	}

	/**
	 * Constructs a new Start Strategy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartStrategyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Start Strategy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StartStrategy fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Start Strategy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartStrategy getFixture() {
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
		setFixture(WcFactory.eINSTANCE.createStartStrategy());
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

} //StartStrategyTest
