/**
 */
package tdt4250.wc.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import tdt4250.wc.TeamMatchStatistics;
import tdt4250.wc.WcPackage;

/**
 * This is the item provider adapter for a {@link tdt4250.wc.TeamMatchStatistics} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TeamMatchStatisticsItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamMatchStatisticsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addGoalsPropertyDescriptor(object);
			addPenaltiesPropertyDescriptor(object);
			addAttemptsOnGoalPropertyDescriptor(object);
			addOnTargetPropertyDescriptor(object);
			addOffTargetPropertyDescriptor(object);
			addBlockedPropertyDescriptor(object);
			addWoodworkPropertyDescriptor(object);
			addCornersPropertyDescriptor(object);
			addOffsidesPropertyDescriptor(object);
			addBallPossessionPropertyDescriptor(object);
			addPassAccuracyPropertyDescriptor(object);
			addNumPassesPropertyDescriptor(object);
			addPassesCompletedPropertyDescriptor(object);
			addDistanceCoveredPropertyDescriptor(object);
			addBallsRecoveredPropertyDescriptor(object);
			addTacklesPropertyDescriptor(object);
			addClearancesPropertyDescriptor(object);
			addYellowCardsPropertyDescriptor(object);
			addRedCardsPropertyDescriptor(object);
			addFoulsCommittedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Goals feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoalsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamMatchStatistics_goals_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamMatchStatistics_goals_feature", "_UI_TeamMatchStatistics_type"),
				 WcPackage.Literals.TEAM_MATCH_STATISTICS__GOALS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Penalties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPenaltiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamMatchStatistics_penalties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamMatchStatistics_penalties_feature", "_UI_TeamMatchStatistics_type"),
				 WcPackage.Literals.TEAM_MATCH_STATISTICS__PENALTIES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attempts On Goal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttemptsOnGoalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamMatchStatistics_attemptsOnGoal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamMatchStatistics_attemptsOnGoal_feature", "_UI_TeamMatchStatistics_type"),
				 WcPackage.Literals.TEAM_MATCH_STATISTICS__ATTEMPTS_ON_GOAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamMatchStatistics_onTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamMatchStatistics_onTarget_feature", "_UI_TeamMatchStatistics_type"),
				 WcPackage.Literals.TEAM_MATCH_STATISTICS__ON_TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Off Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOffTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamMatchStatistics_offTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamMatchStatistics_offTarget_feature", "_UI_TeamMatchStatistics_type"),
				 WcPackage.Literals.TEAM_MATCH_STATISTICS__OFF_TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Blocked feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamMatchStatistics_blocked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamMatchStatistics_blocked_feature", "_UI_TeamMatchStatistics_type"),
				 WcPackage.Literals.TEAM_MATCH_STATISTICS__BLOCKED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Woodwork feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWoodworkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamMatchStatistics_woodwork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamMatchStatistics_woodwork_feature", "_UI_TeamMatchStatistics_type"),
				 WcPackage.Literals.TEAM_MATCH_STATISTICS__WOODWORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Corners feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCornersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamMatchStatistics_corners_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamMatchStatistics_corners_feature", "_UI_TeamMatchStatistics_type"),
				 WcPackage.Literals.TEAM_MATCH_STATISTICS__CORNERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Offsides feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOffsidesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamMatchStatistics_offsides_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamMatchStatistics_offsides_feature", "_UI_TeamMatchStatistics_type"),
				 WcPackage.Literals.TEAM_MATCH_STATISTICS__OFFSIDES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ball Possession feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBallPossessionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamMatchStatistics_ballPossession_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamMatchStatistics_ballPossession_feature", "_UI_TeamMatchStatistics_type"),
				 WcPackage.Literals.TEAM_MATCH_STATISTICS__BALL_POSSESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pass Accuracy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassAccuracyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamMatchStatistics_passAccuracy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamMatchStatistics_passAccuracy_feature", "_UI_TeamMatchStatistics_type"),
				 WcPackage.Literals.TEAM_MATCH_STATISTICS__PASS_ACCURACY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Num Passes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumPassesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamMatchStatistics_numPasses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamMatchStatistics_numPasses_feature", "_UI_TeamMatchStatistics_type"),
				 WcPackage.Literals.TEAM_MATCH_STATISTICS__NUM_PASSES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passes Completed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassesCompletedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamMatchStatistics_passesCompleted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamMatchStatistics_passesCompleted_feature", "_UI_TeamMatchStatistics_type"),
				 WcPackage.Literals.TEAM_MATCH_STATISTICS__PASSES_COMPLETED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distance Covered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistanceCoveredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamMatchStatistics_distanceCovered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamMatchStatistics_distanceCovered_feature", "_UI_TeamMatchStatistics_type"),
				 WcPackage.Literals.TEAM_MATCH_STATISTICS__DISTANCE_COVERED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Balls Recovered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBallsRecoveredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamMatchStatistics_ballsRecovered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamMatchStatistics_ballsRecovered_feature", "_UI_TeamMatchStatistics_type"),
				 WcPackage.Literals.TEAM_MATCH_STATISTICS__BALLS_RECOVERED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tackles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTacklesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamMatchStatistics_tackles_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamMatchStatistics_tackles_feature", "_UI_TeamMatchStatistics_type"),
				 WcPackage.Literals.TEAM_MATCH_STATISTICS__TACKLES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Clearances feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClearancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamMatchStatistics_clearances_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamMatchStatistics_clearances_feature", "_UI_TeamMatchStatistics_type"),
				 WcPackage.Literals.TEAM_MATCH_STATISTICS__CLEARANCES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Yellow Cards feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYellowCardsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamMatchStatistics_yellowCards_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamMatchStatistics_yellowCards_feature", "_UI_TeamMatchStatistics_type"),
				 WcPackage.Literals.TEAM_MATCH_STATISTICS__YELLOW_CARDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Red Cards feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedCardsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamMatchStatistics_redCards_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamMatchStatistics_redCards_feature", "_UI_TeamMatchStatistics_type"),
				 WcPackage.Literals.TEAM_MATCH_STATISTICS__RED_CARDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fouls Committed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFoulsCommittedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamMatchStatistics_foulsCommitted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamMatchStatistics_foulsCommitted_feature", "_UI_TeamMatchStatistics_type"),
				 WcPackage.Literals.TEAM_MATCH_STATISTICS__FOULS_COMMITTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TeamMatchStatistics.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TeamMatchStatistics"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TeamMatchStatistics teamMatchStatistics = (TeamMatchStatistics)object;
		return getString("_UI_TeamMatchStatistics_type") + " " + teamMatchStatistics.getGoals();
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TeamMatchStatistics.class)) {
			case WcPackage.TEAM_MATCH_STATISTICS__GOALS:
			case WcPackage.TEAM_MATCH_STATISTICS__PENALTIES:
			case WcPackage.TEAM_MATCH_STATISTICS__ATTEMPTS_ON_GOAL:
			case WcPackage.TEAM_MATCH_STATISTICS__ON_TARGET:
			case WcPackage.TEAM_MATCH_STATISTICS__OFF_TARGET:
			case WcPackage.TEAM_MATCH_STATISTICS__BLOCKED:
			case WcPackage.TEAM_MATCH_STATISTICS__WOODWORK:
			case WcPackage.TEAM_MATCH_STATISTICS__CORNERS:
			case WcPackage.TEAM_MATCH_STATISTICS__OFFSIDES:
			case WcPackage.TEAM_MATCH_STATISTICS__BALL_POSSESSION:
			case WcPackage.TEAM_MATCH_STATISTICS__PASS_ACCURACY:
			case WcPackage.TEAM_MATCH_STATISTICS__NUM_PASSES:
			case WcPackage.TEAM_MATCH_STATISTICS__PASSES_COMPLETED:
			case WcPackage.TEAM_MATCH_STATISTICS__DISTANCE_COVERED:
			case WcPackage.TEAM_MATCH_STATISTICS__BALLS_RECOVERED:
			case WcPackage.TEAM_MATCH_STATISTICS__TACKLES:
			case WcPackage.TEAM_MATCH_STATISTICS__CLEARANCES:
			case WcPackage.TEAM_MATCH_STATISTICS__YELLOW_CARDS:
			case WcPackage.TEAM_MATCH_STATISTICS__RED_CARDS:
			case WcPackage.TEAM_MATCH_STATISTICS__FOULS_COMMITTED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FootballWorldCupsEditPlugin.INSTANCE;
	}

}
