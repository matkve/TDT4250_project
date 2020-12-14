/**
 */
package tdt4250.wc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage One Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.wc.StageOneGroup#getMatch <em>Match</em>}</li>
 *   <li>{@link tdt4250.wc.StageOneGroup#getGroupLetter <em>Group Letter</em>}</li>
 * </ul>
 *
 * @see tdt4250.wc.WcPackage#getStageOneGroup()
 * @model
 * @generated
 */
public interface StageOneGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Match</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.wc.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' containment reference list.
	 * @see tdt4250.wc.WcPackage#getStageOneGroup_Match()
	 * @model containment="true"
	 * @generated
	 */
	EList<Match> getMatch();

	/**
	 * Returns the value of the '<em><b>Group Letter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Letter</em>' attribute.
	 * @see #setGroupLetter(char)
	 * @see tdt4250.wc.WcPackage#getStageOneGroup_GroupLetter()
	 * @model
	 * @generated
	 */
	char getGroupLetter();

	/**
	 * Sets the value of the '{@link tdt4250.wc.StageOneGroup#getGroupLetter <em>Group Letter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Letter</em>' attribute.
	 * @see #getGroupLetter()
	 * @generated
	 */
	void setGroupLetter(char value);

} // StageOneGroup
