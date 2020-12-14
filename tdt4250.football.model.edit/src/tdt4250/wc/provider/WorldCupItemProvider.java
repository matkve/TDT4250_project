/**
 */
package tdt4250.wc.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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

import tdt4250.wc.WcFactory;
import tdt4250.wc.WcPackage;
import tdt4250.wc.WorldCup;

/**
 * This is the item provider adapter for a {@link tdt4250.wc.WorldCup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorldCupItemProvider 
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
	public WorldCupItemProvider(AdapterFactory adapterFactory) {
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

			addYearPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Year feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYearPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorldCup_year_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorldCup_year_feature", "_UI_WorldCup_type"),
				 WcPackage.Literals.WORLD_CUP__YEAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WcPackage.Literals.WORLD_CUP__STAGE_ONE_GROUPS);
			childrenFeatures.add(WcPackage.Literals.WORLD_CUP__ROUND_OF16);
			childrenFeatures.add(WcPackage.Literals.WORLD_CUP__QUARTER_FINALS);
			childrenFeatures.add(WcPackage.Literals.WORLD_CUP__SEMI_FINALS);
			childrenFeatures.add(WcPackage.Literals.WORLD_CUP__THIRD_PLACE_PLAYOFF);
			childrenFeatures.add(WcPackage.Literals.WORLD_CUP__FINAL);
			childrenFeatures.add(WcPackage.Literals.WORLD_CUP__TEAMS);
			childrenFeatures.add(WcPackage.Literals.WORLD_CUP__ARENAS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns WorldCup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WorldCup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WorldCup)object).getYear();
		return label == null || label.length() == 0 ?
			getString("_UI_WorldCup_type") :
			getString("_UI_WorldCup_type") + " " + label;
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

		switch (notification.getFeatureID(WorldCup.class)) {
			case WcPackage.WORLD_CUP__YEAR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WcPackage.WORLD_CUP__STAGE_ONE_GROUPS:
			case WcPackage.WORLD_CUP__ROUND_OF16:
			case WcPackage.WORLD_CUP__QUARTER_FINALS:
			case WcPackage.WORLD_CUP__SEMI_FINALS:
			case WcPackage.WORLD_CUP__THIRD_PLACE_PLAYOFF:
			case WcPackage.WORLD_CUP__FINAL:
			case WcPackage.WORLD_CUP__TEAMS:
			case WcPackage.WORLD_CUP__ARENAS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(WcPackage.Literals.WORLD_CUP__STAGE_ONE_GROUPS,
				 WcFactory.eINSTANCE.createStageOneGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WcPackage.Literals.WORLD_CUP__ROUND_OF16,
				 WcFactory.eINSTANCE.createMatch()));

		newChildDescriptors.add
			(createChildParameter
				(WcPackage.Literals.WORLD_CUP__QUARTER_FINALS,
				 WcFactory.eINSTANCE.createMatch()));

		newChildDescriptors.add
			(createChildParameter
				(WcPackage.Literals.WORLD_CUP__SEMI_FINALS,
				 WcFactory.eINSTANCE.createMatch()));

		newChildDescriptors.add
			(createChildParameter
				(WcPackage.Literals.WORLD_CUP__THIRD_PLACE_PLAYOFF,
				 WcFactory.eINSTANCE.createMatch()));

		newChildDescriptors.add
			(createChildParameter
				(WcPackage.Literals.WORLD_CUP__FINAL,
				 WcFactory.eINSTANCE.createMatch()));

		newChildDescriptors.add
			(createChildParameter
				(WcPackage.Literals.WORLD_CUP__TEAMS,
				 WcFactory.eINSTANCE.createTeam()));

		newChildDescriptors.add
			(createChildParameter
				(WcPackage.Literals.WORLD_CUP__ARENAS,
				 WcFactory.eINSTANCE.createArena()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == WcPackage.Literals.WORLD_CUP__ROUND_OF16 ||
			childFeature == WcPackage.Literals.WORLD_CUP__QUARTER_FINALS ||
			childFeature == WcPackage.Literals.WORLD_CUP__SEMI_FINALS ||
			childFeature == WcPackage.Literals.WORLD_CUP__THIRD_PLACE_PLAYOFF ||
			childFeature == WcPackage.Literals.WORLD_CUP__FINAL;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
