/**
 */
package tdt4250.wc.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tdt4250.wc.WcFactory;
import tdt4250.wc.Weather;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Weather</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WeatherTest extends TestCase {

	/**
	 * The fixture for this Weather test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Weather fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WeatherTest.class);
	}

	/**
	 * Constructs a new Weather test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Weather test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Weather fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Weather test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Weather getFixture() {
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
		setFixture(WcFactory.eINSTANCE.createWeather());
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

} //WeatherTest
