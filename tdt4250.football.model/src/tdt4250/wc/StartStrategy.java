/**
 */
package tdt4250.wc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.wc.StartStrategy#getGoalie <em>Goalie</em>}</li>
 *   <li>{@link tdt4250.wc.StartStrategy#getDefender <em>Defender</em>}</li>
 *   <li>{@link tdt4250.wc.StartStrategy#getMidfield <em>Midfield</em>}</li>
 *   <li>{@link tdt4250.wc.StartStrategy#getForward <em>Forward</em>}</li>
 *   <li>{@link tdt4250.wc.StartStrategy#getCaptain <em>Captain</em>}</li>
 *   <li>{@link tdt4250.wc.StartStrategy#getSubstitutes <em>Substitutes</em>}</li>
 * </ul>
 *
 * @see tdt4250.wc.WcPackage#getStartStrategy()
 * @model
 * @generated
 */
public interface StartStrategy extends EObject {
	/**
	 * Returns the value of the '<em><b>Goalie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goalie</em>' reference.
	 * @see #setGoalie(Player)
	 * @see tdt4250.wc.WcPackage#getStartStrategy_Goalie()
	 * @model required="true"
	 * @generated
	 */
	Player getGoalie();

	/**
	 * Sets the value of the '{@link tdt4250.wc.StartStrategy#getGoalie <em>Goalie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goalie</em>' reference.
	 * @see #getGoalie()
	 * @generated
	 */
	void setGoalie(Player value);

	/**
	 * Returns the value of the '<em><b>Defender</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.wc.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defender</em>' reference list.
	 * @see tdt4250.wc.WcPackage#getStartStrategy_Defender()
	 * @model
	 * @generated
	 */
	EList<Player> getDefender();

	/**
	 * Returns the value of the '<em><b>Midfield</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.wc.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Midfield</em>' reference list.
	 * @see tdt4250.wc.WcPackage#getStartStrategy_Midfield()
	 * @model
	 * @generated
	 */
	EList<Player> getMidfield();

	/**
	 * Returns the value of the '<em><b>Forward</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.wc.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forward</em>' reference list.
	 * @see tdt4250.wc.WcPackage#getStartStrategy_Forward()
	 * @model
	 * @generated
	 */
	EList<Player> getForward();

	/**
	 * Returns the value of the '<em><b>Captain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Captain</em>' reference.
	 * @see #setCaptain(Player)
	 * @see tdt4250.wc.WcPackage#getStartStrategy_Captain()
	 * @model required="true"
	 * @generated
	 */
	Player getCaptain();

	/**
	 * Sets the value of the '{@link tdt4250.wc.StartStrategy#getCaptain <em>Captain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Captain</em>' reference.
	 * @see #getCaptain()
	 * @generated
	 */
	void setCaptain(Player value);

	/**
	 * Returns the value of the '<em><b>Substitutes</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.wc.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitutes</em>' reference list.
	 * @see tdt4250.wc.WcPackage#getStartStrategy_Substitutes()
	 * @model
	 * @generated
	 */
	EList<Player> getSubstitutes();

} // StartStrategy
