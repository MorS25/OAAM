/**
 */
package de.oaam.model.oaam.library.util;

import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.library.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.library.LibraryPackage
 * @generated
 */
public class LibraryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LibraryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LibraryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibrarySwitch<Adapter> modelSwitch =
		new LibrarySwitch<Adapter>() {
			@Override
			public Adapter caseResourceConsumerA(ResourceConsumerA object) {
				return createResourceConsumerAAdapter();
			}
			@Override
			public Adapter caseResourceProviderA(ResourceProviderA object) {
				return createResourceProviderAAdapter();
			}
			@Override
			public Adapter caseResourceProviderInstanceA(ResourceProviderInstanceA object) {
				return createResourceProviderInstanceAAdapter();
			}
			@Override
			public Adapter caseLibraryContainerA(LibraryContainerA object) {
				return createLibraryContainerAAdapter();
			}
			@Override
			public Adapter caseResourceType(ResourceType object) {
				return createResourceTypeAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseResourceAlternatives(ResourceAlternatives object) {
				return createResourceAlternativesAdapter();
			}
			@Override
			public Adapter caseResourceBundles(ResourceBundles object) {
				return createResourceBundlesAdapter();
			}
			@Override
			public Adapter caseTaskType(TaskType object) {
				return createTaskTypeAdapter();
			}
			@Override
			public Adapter caseSignalType(SignalType object) {
				return createSignalTypeAdapter();
			}
			@Override
			public Adapter caseDeviceType(DeviceType object) {
				return createDeviceTypeAdapter();
			}
			@Override
			public Adapter caseConnectionType(ConnectionType object) {
				return createConnectionTypeAdapter();
			}
			@Override
			public Adapter caseLocationType(LocationType object) {
				return createLocationTypeAdapter();
			}
			@Override
			public Adapter caseDuctType(DuctType object) {
				return createDuctTypeAdapter();
			}
			@Override
			public Adapter caseWireType(WireType object) {
				return createWireTypeAdapter();
			}
			@Override
			public Adapter caseInputDeclaration(InputDeclaration object) {
				return createInputDeclarationAdapter();
			}
			@Override
			public Adapter caseOutputDeclaration(OutputDeclaration object) {
				return createOutputDeclarationAdapter();
			}
			@Override
			public Adapter caseIoDeclaration(IoDeclaration object) {
				return createIoDeclarationAdapter();
			}
			@Override
			public Adapter caseDuctOpeningDeclaration(DuctOpeningDeclaration object) {
				return createDuctOpeningDeclarationAdapter();
			}
			@Override
			public Adapter caseResourceGroup(ResourceGroup object) {
				return createResourceGroupAdapter();
			}
			@Override
			public Adapter caseDeviceTypeSymmetry(DeviceTypeSymmetry object) {
				return createDeviceTypeSymmetryAdapter();
			}
			@Override
			public Adapter caseIoGroup(IoGroup object) {
				return createIoGroupAdapter();
			}
			@Override
			public Adapter caseAttributeDefinition(AttributeDefinition object) {
				return createAttributeDefinitionAdapter();
			}
			@Override
			public Adapter caseFaultPropagation(FaultPropagation object) {
				return createFaultPropagationAdapter();
			}
			@Override
			public Adapter caseFunctionInputState(FunctionInputState object) {
				return createFunctionInputStateAdapter();
			}
			@Override
			public Adapter casePowerSource(PowerSource object) {
				return createPowerSourceAdapter();
			}
			@Override
			public Adapter caseResourceLink(ResourceLink object) {
				return createResourceLinkAdapter();
			}
			@Override
			public Adapter caseResourceModifier(ResourceModifier object) {
				return createResourceModifierAdapter();
			}
			@Override
			public Adapter caseModifierLevel(ModifierLevel object) {
				return createModifierLevelAdapter();
			}
			@Override
			public Adapter caseModifierDefinition(ModifierDefinition object) {
				return createModifierDefinitionAdapter();
			}
			@Override
			public Adapter caseTaskTypeDissimilarity(TaskTypeDissimilarity object) {
				return createTaskTypeDissimilarityAdapter();
			}
			@Override
			public Adapter caseDeviceTypeDissimilarity(DeviceTypeDissimilarity object) {
				return createDeviceTypeDissimilarityAdapter();
			}
			@Override
			public Adapter caseResourceTypeDissimilarity(ResourceTypeDissimilarity object) {
				return createResourceTypeDissimilarityAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter caseSublibrary(Sublibrary object) {
				return createSublibraryAdapter();
			}
			@Override
			public Adapter caseOutputTrigger(OutputTrigger object) {
				return createOutputTriggerAdapter();
			}
			@Override
			public Adapter caseFunctionInputTrigger(FunctionInputTrigger object) {
				return createFunctionInputTriggerAdapter();
			}
			@Override
			public Adapter caseInternalStateDefinition(InternalStateDefinition object) {
				return createInternalStateDefinitionAdapter();
			}
			@Override
			public Adapter caseParameterDefinition(ParameterDefinition object) {
				return createParameterDefinitionAdapter();
			}
			@Override
			public Adapter case_ElementA(_ElementA object) {
				return create_ElementAAdapter();
			}
			@Override
			public Adapter caseBoolA(BoolA object) {
				return createBoolAAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.ResourceConsumerA <em>Resource Consumer A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.ResourceConsumerA
	 * @generated
	 */
	public Adapter createResourceConsumerAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.ResourceProviderA <em>Resource Provider A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.ResourceProviderA
	 * @generated
	 */
	public Adapter createResourceProviderAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.ResourceProviderInstanceA <em>Resource Provider Instance A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.ResourceProviderInstanceA
	 * @generated
	 */
	public Adapter createResourceProviderInstanceAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.LibraryContainerA <em>Container A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.LibraryContainerA
	 * @generated
	 */
	public Adapter createLibraryContainerAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.ResourceType
	 * @generated
	 */
	public Adapter createResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.ResourceAlternatives <em>Resource Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.ResourceAlternatives
	 * @generated
	 */
	public Adapter createResourceAlternativesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.ResourceBundles <em>Resource Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.ResourceBundles
	 * @generated
	 */
	public Adapter createResourceBundlesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.TaskType
	 * @generated
	 */
	public Adapter createTaskTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.SignalType <em>Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.SignalType
	 * @generated
	 */
	public Adapter createSignalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.DeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.DeviceType
	 * @generated
	 */
	public Adapter createDeviceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.ConnectionType
	 * @generated
	 */
	public Adapter createConnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.LocationType
	 * @generated
	 */
	public Adapter createLocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.DuctType <em>Duct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.DuctType
	 * @generated
	 */
	public Adapter createDuctTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.WireType <em>Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.WireType
	 * @generated
	 */
	public Adapter createWireTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.InputDeclaration <em>Input Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.InputDeclaration
	 * @generated
	 */
	public Adapter createInputDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.OutputDeclaration <em>Output Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.OutputDeclaration
	 * @generated
	 */
	public Adapter createOutputDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.IoDeclaration <em>Io Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.IoDeclaration
	 * @generated
	 */
	public Adapter createIoDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.DuctOpeningDeclaration <em>Duct Opening Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.DuctOpeningDeclaration
	 * @generated
	 */
	public Adapter createDuctOpeningDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.ResourceGroup <em>Resource Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.ResourceGroup
	 * @generated
	 */
	public Adapter createResourceGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.DeviceTypeSymmetry <em>Device Type Symmetry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.DeviceTypeSymmetry
	 * @generated
	 */
	public Adapter createDeviceTypeSymmetryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.IoGroup <em>Io Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.IoGroup
	 * @generated
	 */
	public Adapter createIoGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.AttributeDefinition <em>Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.AttributeDefinition
	 * @generated
	 */
	public Adapter createAttributeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.FaultPropagation <em>Fault Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.FaultPropagation
	 * @generated
	 */
	public Adapter createFaultPropagationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.FunctionInputState <em>Function Input State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.FunctionInputState
	 * @generated
	 */
	public Adapter createFunctionInputStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.PowerSource <em>Power Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.PowerSource
	 * @generated
	 */
	public Adapter createPowerSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.ResourceLink <em>Resource Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.ResourceLink
	 * @generated
	 */
	public Adapter createResourceLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.ResourceModifier <em>Resource Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.ResourceModifier
	 * @generated
	 */
	public Adapter createResourceModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.ModifierLevel <em>Modifier Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.ModifierLevel
	 * @generated
	 */
	public Adapter createModifierLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.ModifierDefinition <em>Modifier Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.ModifierDefinition
	 * @generated
	 */
	public Adapter createModifierDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.TaskTypeDissimilarity <em>Task Type Dissimilarity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.TaskTypeDissimilarity
	 * @generated
	 */
	public Adapter createTaskTypeDissimilarityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.DeviceTypeDissimilarity <em>Device Type Dissimilarity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.DeviceTypeDissimilarity
	 * @generated
	 */
	public Adapter createDeviceTypeDissimilarityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.ResourceTypeDissimilarity <em>Resource Type Dissimilarity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.ResourceTypeDissimilarity
	 * @generated
	 */
	public Adapter createResourceTypeDissimilarityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.Sublibrary <em>Sublibrary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.Sublibrary
	 * @generated
	 */
	public Adapter createSublibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.OutputTrigger <em>Output Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.OutputTrigger
	 * @generated
	 */
	public Adapter createOutputTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.FunctionInputTrigger <em>Function Input Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.FunctionInputTrigger
	 * @generated
	 */
	public Adapter createFunctionInputTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.InternalStateDefinition <em>Internal State Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.InternalStateDefinition
	 * @generated
	 */
	public Adapter createInternalStateDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.library.ParameterDefinition <em>Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.library.ParameterDefinition
	 * @generated
	 */
	public Adapter createParameterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.common._ElementA <em>Element A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.common._ElementA
	 * @generated
	 */
	public Adapter create_ElementAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.common.BoolA <em>Bool A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.common.BoolA
	 * @generated
	 */
	public Adapter createBoolAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LibraryAdapterFactory