/**
 */
package tdt4250.wc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tdt4250.wc.Player;
import tdt4250.wc.StartStrategy;
import tdt4250.wc.WcPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.wc.impl.StartStrategyImpl#getGoalie <em>Goalie</em>}</li>
 *   <li>{@link tdt4250.wc.impl.StartStrategyImpl#getDefender <em>Defender</em>}</li>
 *   <li>{@link tdt4250.wc.impl.StartStrategyImpl#getMidfield <em>Midfield</em>}</li>
 *   <li>{@link tdt4250.wc.impl.StartStrategyImpl#getForward <em>Forward</em>}</li>
 *   <li>{@link tdt4250.wc.impl.StartStrategyImpl#getCaptain <em>Captain</em>}</li>
 *   <li>{@link tdt4250.wc.impl.StartStrategyImpl#getSubstitutes <em>Substitutes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartStrategyImpl extends MinimalEObjectImpl.Container implements StartStrategy {
	/**
	 * The cached value of the '{@link #getGoalie() <em>Goalie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalie()
	 * @generated
	 * @ordered
	 */
	protected Player goalie;

	/**
	 * The cached value of the '{@link #getDefender() <em>Defender</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefender()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> defender;

	/**
	 * The cached value of the '{@link #getMidfield() <em>Midfield</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidfield()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> midfield;

	/**
	 * The cached value of the '{@link #getForward() <em>Forward</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForward()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> forward;

	/**
	 * The cached value of the '{@link #getCaptain() <em>Captain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptain()
	 * @generated
	 * @ordered
	 */
	protected Player captain;

	/**
	 * The cached value of the '{@link #getSubstitutes() <em>Substitutes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> substitutes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WcPackage.Literals.START_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getGoalie() {
		if (goalie != null && goalie.eIsProxy()) {
			InternalEObject oldGoalie = (InternalEObject)goalie;
			goalie = (Player)eResolveProxy(oldGoalie);
			if (goalie != oldGoalie) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WcPackage.START_STRATEGY__GOALIE, oldGoalie, goalie));
			}
		}
		return goalie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetGoalie() {
		return goalie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalie(Player newGoalie) {
		Player oldGoalie = goalie;
		goalie = newGoalie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.START_STRATEGY__GOALIE, oldGoalie, goalie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getDefender() {
		if (defender == null) {
			defender = new EObjectResolvingEList<Player>(Player.class, this, WcPackage.START_STRATEGY__DEFENDER);
		}
		return defender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getMidfield() {
		if (midfield == null) {
			midfield = new EObjectResolvingEList<Player>(Player.class, this, WcPackage.START_STRATEGY__MIDFIELD);
		}
		return midfield;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getForward() {
		if (forward == null) {
			forward = new EObjectResolvingEList<Player>(Player.class, this, WcPackage.START_STRATEGY__FORWARD);
		}
		return forward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getCaptain() {
		if (captain != null && captain.eIsProxy()) {
			InternalEObject oldCaptain = (InternalEObject)captain;
			captain = (Player)eResolveProxy(oldCaptain);
			if (captain != oldCaptain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WcPackage.START_STRATEGY__CAPTAIN, oldCaptain, captain));
			}
		}
		return captain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetCaptain() {
		return captain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptain(Player newCaptain) {
		Player oldCaptain = captain;
		captain = newCaptain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.START_STRATEGY__CAPTAIN, oldCaptain, captain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getSubstitutes() {
		if (substitutes == null) {
			substitutes = new EObjectResolvingEList<Player>(Player.class, this, WcPackage.START_STRATEGY__SUBSTITUTES);
		}
		return substitutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WcPackage.START_STRATEGY__GOALIE:
				if (resolve) return getGoalie();
				return basicGetGoalie();
			case WcPackage.START_STRATEGY__DEFENDER:
				return getDefender();
			case WcPackage.START_STRATEGY__MIDFIELD:
				return getMidfield();
			case WcPackage.START_STRATEGY__FORWARD:
				return getForward();
			case WcPackage.START_STRATEGY__CAPTAIN:
				if (resolve) return getCaptain();
				return basicGetCaptain();
			case WcPackage.START_STRATEGY__SUBSTITUTES:
				return getSubstitutes();
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
			case WcPackage.START_STRATEGY__GOALIE:
				setGoalie((Player)newValue);
				return;
			case WcPackage.START_STRATEGY__DEFENDER:
				getDefender().clear();
				getDefender().addAll((Collection<? extends Player>)newValue);
				return;
			case WcPackage.START_STRATEGY__MIDFIELD:
				getMidfield().clear();
				getMidfield().addAll((Collection<? extends Player>)newValue);
				return;
			case WcPackage.START_STRATEGY__FORWARD:
				getForward().clear();
				getForward().addAll((Collection<? extends Player>)newValue);
				return;
			case WcPackage.START_STRATEGY__CAPTAIN:
				setCaptain((Player)newValue);
				return;
			case WcPackage.START_STRATEGY__SUBSTITUTES:
				getSubstitutes().clear();
				getSubstitutes().addAll((Collection<? extends Player>)newValue);
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
			case WcPackage.START_STRATEGY__GOALIE:
				setGoalie((Player)null);
				return;
			case WcPackage.START_STRATEGY__DEFENDER:
				getDefender().clear();
				return;
			case WcPackage.START_STRATEGY__MIDFIELD:
				getMidfield().clear();
				return;
			case WcPackage.START_STRATEGY__FORWARD:
				getForward().clear();
				return;
			case WcPackage.START_STRATEGY__CAPTAIN:
				setCaptain((Player)null);
				return;
			case WcPackage.START_STRATEGY__SUBSTITUTES:
				getSubstitutes().clear();
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
			case WcPackage.START_STRATEGY__GOALIE:
				return goalie != null;
			case WcPackage.START_STRATEGY__DEFENDER:
				return defender != null && !defender.isEmpty();
			case WcPackage.START_STRATEGY__MIDFIELD:
				return midfield != null && !midfield.isEmpty();
			case WcPackage.START_STRATEGY__FORWARD:
				return forward != null && !forward.isEmpty();
			case WcPackage.START_STRATEGY__CAPTAIN:
				return captain != null;
			case WcPackage.START_STRATEGY__SUBSTITUTES:
				return substitutes != null && !substitutes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StartStrategyImpl
