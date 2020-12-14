/**
 */
package tdt4250.wc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.wc.Match;
import tdt4250.wc.StageOneGroup;
import tdt4250.wc.WcPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stage One Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.wc.impl.StageOneGroupImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link tdt4250.wc.impl.StageOneGroupImpl#getGroupLetter <em>Group Letter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StageOneGroupImpl extends MinimalEObjectImpl.Container implements StageOneGroup {
	/**
	 * The cached value of the '{@link #getMatch() <em>Match</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> match;

	/**
	 * The default value of the '{@link #getGroupLetter() <em>Group Letter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupLetter()
	 * @generated
	 * @ordered
	 */
	protected static final char GROUP_LETTER_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getGroupLetter() <em>Group Letter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupLetter()
	 * @generated
	 * @ordered
	 */
	protected char groupLetter = GROUP_LETTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StageOneGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WcPackage.Literals.STAGE_ONE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getMatch() {
		if (match == null) {
			match = new EObjectContainmentEList<Match>(Match.class, this, WcPackage.STAGE_ONE_GROUP__MATCH);
		}
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getGroupLetter() {
		return groupLetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupLetter(char newGroupLetter) {
		char oldGroupLetter = groupLetter;
		groupLetter = newGroupLetter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.STAGE_ONE_GROUP__GROUP_LETTER, oldGroupLetter, groupLetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WcPackage.STAGE_ONE_GROUP__MATCH:
				return ((InternalEList<?>)getMatch()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WcPackage.STAGE_ONE_GROUP__MATCH:
				return getMatch();
			case WcPackage.STAGE_ONE_GROUP__GROUP_LETTER:
				return getGroupLetter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WcPackage.STAGE_ONE_GROUP__MATCH:
				getMatch().clear();
				getMatch().addAll((Collection<? extends Match>)newValue);
				return;
			case WcPackage.STAGE_ONE_GROUP__GROUP_LETTER:
				setGroupLetter((Character)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WcPackage.STAGE_ONE_GROUP__MATCH:
				getMatch().clear();
				return;
			case WcPackage.STAGE_ONE_GROUP__GROUP_LETTER:
				setGroupLetter(GROUP_LETTER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WcPackage.STAGE_ONE_GROUP__MATCH:
				return match != null && !match.isEmpty();
			case WcPackage.STAGE_ONE_GROUP__GROUP_LETTER:
				return groupLetter != GROUP_LETTER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (groupLetter: ");
		result.append(groupLetter);
		result.append(')');
		return result.toString();
	}

} //StageOneGroupImpl
