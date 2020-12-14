/**
 */
package tdt4250.wc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.wc.Universe#getWorldCups <em>World Cups</em>}</li>
 * </ul>
 *
 * @see tdt4250.wc.WcPackage#getUniverse()
 * @model
 * @generated
 */
public interface Universe extends EObject {
	/**
	 * Returns the value of the '<em><b>World Cups</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.wc.WorldCup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>World Cups</em>' containment reference list.
	 * @see tdt4250.wc.WcPackage#getUniverse_WorldCups()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorldCup> getWorldCups();

} // Universe
