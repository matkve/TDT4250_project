/**
 */
package tdt4250.wc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import tdt4250.wc.Universe;
import tdt4250.wc.WcPackage;
import tdt4250.wc.WorldCup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Universe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.wc.impl.UniverseImpl#getWorldCups <em>World Cups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniverseImpl extends MinimalEObjectImpl.Container implements Universe {
	/**
	 * The cached value of the '{@link #getWorldCups() <em>World Cups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldCups()
	 * @generated
	 * @ordered
	 */
	protected EList<WorldCup> worldCups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniverseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WcPackage.Literals.UNIVERSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorldCup> getWorldCups() {
		if (worldCups == null) {
			worldCups = new EObjectContainmentEList<WorldCup>(WorldCup.class, this, WcPackage.UNIVERSE__WORLD_CUPS);
		}
		return worldCups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WcPackage.UNIVERSE__WORLD_CUPS:
				return ((InternalEList<?>)getWorldCups()).basicRemove(otherEnd, msgs);
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
			case WcPackage.UNIVERSE__WORLD_CUPS:
				return getWorldCups();
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
			case WcPackage.UNIVERSE__WORLD_CUPS:
				getWorldCups().clear();
				getWorldCups().addAll((Collection<? extends WorldCup>)newValue);
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
			case WcPackage.UNIVERSE__WORLD_CUPS:
				getWorldCups().clear();
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
			case WcPackage.UNIVERSE__WORLD_CUPS:
				return worldCups != null && !worldCups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UniverseImpl
