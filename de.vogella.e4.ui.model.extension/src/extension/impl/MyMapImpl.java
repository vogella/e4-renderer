/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package extension.impl;

import extension.ExtensionPackage;
import extension.MyMap;

import java.util.Collection;
import java.util.List;

import java.util.Map;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplicationElement;

import org.eclipse.e4.ui.model.application.MContribution;
import org.eclipse.e4.ui.model.application.commands.MBindingContext;
import org.eclipse.e4.ui.model.application.commands.MBindings;
import org.eclipse.e4.ui.model.application.commands.MHandler;
import org.eclipse.e4.ui.model.application.commands.MHandlerContainer;
import org.eclipse.e4.ui.model.application.commands.impl.CommandsPackageImpl;
import org.eclipse.e4.ui.model.application.impl.ApplicationPackageImpl;

import org.eclipse.e4.ui.model.application.impl.StringToObjectMapImpl;
import org.eclipse.e4.ui.model.application.impl.StringToStringMapImpl;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MExpression;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;

import org.eclipse.e4.ui.model.application.ui.advanced.MPlaceholder;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainerElement;

import org.eclipse.e4.ui.model.application.ui.basic.MStackElement;
import org.eclipse.e4.ui.model.application.ui.basic.MWindowElement;
import org.eclipse.e4.ui.model.application.ui.basic.impl.BasicPackageImpl;
import org.eclipse.e4.ui.model.application.ui.impl.UiPackageImpl;

import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link extension.impl.MyMapImpl#getContext <em>Context</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getIconURI <em>Icon URI</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getElementId <em>Element Id</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getPersistedState <em>Persisted State</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getContributorURI <em>Contributor URI</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getTransientData <em>Transient Data</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getWidget <em>Widget</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getRenderer <em>Renderer</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#isToBeRendered <em>To Be Rendered</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#isOnTop <em>On Top</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getContainerData <em>Container Data</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getCurSharedRef <em>Cur Shared Ref</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getVisibleWhen <em>Visible When</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getAccessibilityPhrase <em>Accessibility Phrase</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getContributionURI <em>Contribution URI</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getObject <em>Object</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#isDirty <em>Dirty</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getBindingContexts <em>Binding Contexts</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getMenus <em>Menus</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getToolbar <em>Toolbar</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#isCloseable <em>Closeable</em>}</li>
 *   <li>{@link extension.impl.MyMapImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MyMapImpl extends EObjectImpl implements MyMap {
	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final IEclipseContext CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected IEclipseContext context = CONTEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<String> variables;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> properties;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIconURI() <em>Icon URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconURI()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIconURI() <em>Icon URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconURI()
	 * @generated
	 * @ordered
	 */
	protected String iconURI = ICON_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltip()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOLTIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltip()
	 * @generated
	 * @ordered
	 */
	protected String tooltip = TOOLTIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementId() <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementId()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementId() <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementId()
	 * @generated
	 * @ordered
	 */
	protected String elementId = ELEMENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersistedState() <em>Persisted State</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistedState()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> persistedState;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tags;

	/**
	 * The default value of the '{@link #getContributorURI() <em>Contributor URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributorURI()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRIBUTOR_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContributorURI() <em>Contributor URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributorURI()
	 * @generated
	 * @ordered
	 */
	protected String contributorURI = CONTRIBUTOR_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransientData() <em>Transient Data</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientData()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Object> transientData;

	/**
	 * The default value of the '{@link #getWidget() <em>Widget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidget()
	 * @generated
	 * @ordered
	 */
	protected static final Object WIDGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidget() <em>Widget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidget()
	 * @generated
	 * @ordered
	 */
	protected Object widget = WIDGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getRenderer() <em>Renderer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderer()
	 * @generated
	 * @ordered
	 */
	protected static final Object RENDERER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRenderer() <em>Renderer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderer()
	 * @generated
	 * @ordered
	 */
	protected Object renderer = RENDERER_EDEFAULT;

	/**
	 * The default value of the '{@link #isToBeRendered() <em>To Be Rendered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToBeRendered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TO_BE_RENDERED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isToBeRendered() <em>To Be Rendered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToBeRendered()
	 * @generated
	 * @ordered
	 */
	protected boolean toBeRendered = TO_BE_RENDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isOnTop() <em>On Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnTop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ON_TOP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnTop() <em>On Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnTop()
	 * @generated
	 * @ordered
	 */
	protected boolean onTop = ON_TOP_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainerData() <em>Container Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerData()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerData() <em>Container Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerData()
	 * @generated
	 * @ordered
	 */
	protected String containerData = CONTAINER_DATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurSharedRef() <em>Cur Shared Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurSharedRef()
	 * @generated
	 * @ordered
	 */
	protected MPlaceholder curSharedRef;

	/**
	 * The cached value of the '{@link #getVisibleWhen() <em>Visible When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleWhen()
	 * @generated
	 * @ordered
	 */
	protected MExpression visibleWhen;

	/**
	 * The default value of the '{@link #getAccessibilityPhrase() <em>Accessibility Phrase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessibilityPhrase()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESSIBILITY_PHRASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessibilityPhrase() <em>Accessibility Phrase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessibilityPhrase()
	 * @generated
	 * @ordered
	 */
	protected String accessibilityPhrase = ACCESSIBILITY_PHRASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContributionURI() <em>Contribution URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributionURI()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRIBUTION_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContributionURI() <em>Contribution URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributionURI()
	 * @generated
	 * @ordered
	 */
	protected String contributionURI = CONTRIBUTION_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected static final Object OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected Object object = OBJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<MHandler> handlers;

	/**
	 * The default value of the '{@link #isDirty() <em>Dirty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIRTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDirty() <em>Dirty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirty()
	 * @generated
	 * @ordered
	 */
	protected boolean dirty = DIRTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBindingContexts() <em>Binding Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<MBindingContext> bindingContexts;

	/**
	 * The cached value of the '{@link #getMenus() <em>Menus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<MMenu> menus;

	/**
	 * The cached value of the '{@link #getToolbar() <em>Toolbar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolbar()
	 * @generated
	 * @ordered
	 */
	protected MToolBar toolbar;

	/**
	 * The default value of the '{@link #isCloseable() <em>Closeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCloseable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLOSEABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCloseable() <em>Closeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCloseable()
	 * @generated
	 * @ordered
	 */
	protected boolean closeable = CLOSEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionPackage.Literals.MY_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEclipseContext getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(IEclipseContext newContext) {
		IEclipseContext oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getVariables() {
		if (variables == null) {
			variables = new EDataTypeUniqueEList<String>(String.class, this, ExtensionPackage.MY_MAP__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getProperties() {
		if (properties == null) {
			properties = new EcoreEMap<String,String>(ApplicationPackageImpl.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, ExtensionPackage.MY_MAP__PROPERTIES);
		}
		return properties.map();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIconURI() {
		return iconURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconURI(String newIconURI) {
		String oldIconURI = iconURI;
		iconURI = newIconURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__ICON_URI, oldIconURI, iconURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTooltip() {
		return tooltip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTooltip(String newTooltip) {
		String oldTooltip = tooltip;
		tooltip = newTooltip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__TOOLTIP, oldTooltip, tooltip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementId() {
		return elementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementId(String newElementId) {
		String oldElementId = elementId;
		elementId = newElementId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__ELEMENT_ID, oldElementId, elementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getPersistedState() {
		if (persistedState == null) {
			persistedState = new EcoreEMap<String,String>(ApplicationPackageImpl.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, ExtensionPackage.MY_MAP__PERSISTED_STATE);
		}
		return persistedState.map();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, ExtensionPackage.MY_MAP__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContributorURI() {
		return contributorURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContributorURI(String newContributorURI) {
		String oldContributorURI = contributorURI;
		contributorURI = newContributorURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__CONTRIBUTOR_URI, oldContributorURI, contributorURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, Object> getTransientData() {
		if (transientData == null) {
			transientData = new EcoreEMap<String,Object>(ApplicationPackageImpl.Literals.STRING_TO_OBJECT_MAP, StringToObjectMapImpl.class, this, ExtensionPackage.MY_MAP__TRANSIENT_DATA);
		}
		return transientData.map();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getWidget() {
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidget(Object newWidget) {
		Object oldWidget = widget;
		widget = newWidget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__WIDGET, oldWidget, widget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRenderer() {
		return renderer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenderer(Object newRenderer) {
		Object oldRenderer = renderer;
		renderer = newRenderer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__RENDERER, oldRenderer, renderer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isToBeRendered() {
		return toBeRendered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToBeRendered(boolean newToBeRendered) {
		boolean oldToBeRendered = toBeRendered;
		toBeRendered = newToBeRendered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__TO_BE_RENDERED, oldToBeRendered, toBeRendered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOnTop() {
		return onTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnTop(boolean newOnTop) {
		boolean oldOnTop = onTop;
		onTop = newOnTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__ON_TOP, oldOnTop, onTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public MElementContainer<MUIElement> getParent() {
		if (eContainerFeatureID() != ExtensionPackage.MY_MAP__PARENT) return null;
		return (MElementContainer<MUIElement>)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(MElementContainer<MUIElement> newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ExtensionPackage.MY_MAP__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(MElementContainer<MUIElement> newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ExtensionPackage.MY_MAP__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, UiPackageImpl.ELEMENT_CONTAINER__CHILDREN, MElementContainer.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainerData() {
		return containerData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerData(String newContainerData) {
		String oldContainerData = containerData;
		containerData = newContainerData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__CONTAINER_DATA, oldContainerData, containerData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPlaceholder getCurSharedRef() {
		if (curSharedRef != null && ((EObject)curSharedRef).eIsProxy()) {
			InternalEObject oldCurSharedRef = (InternalEObject)curSharedRef;
			curSharedRef = (MPlaceholder)eResolveProxy(oldCurSharedRef);
			if (curSharedRef != oldCurSharedRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionPackage.MY_MAP__CUR_SHARED_REF, oldCurSharedRef, curSharedRef));
			}
		}
		return curSharedRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPlaceholder basicGetCurSharedRef() {
		return curSharedRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurSharedRef(MPlaceholder newCurSharedRef) {
		MPlaceholder oldCurSharedRef = curSharedRef;
		curSharedRef = newCurSharedRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__CUR_SHARED_REF, oldCurSharedRef, curSharedRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MExpression getVisibleWhen() {
		return visibleWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisibleWhen(MExpression newVisibleWhen, NotificationChain msgs) {
		MExpression oldVisibleWhen = visibleWhen;
		visibleWhen = newVisibleWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__VISIBLE_WHEN, oldVisibleWhen, newVisibleWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleWhen(MExpression newVisibleWhen) {
		if (newVisibleWhen != visibleWhen) {
			NotificationChain msgs = null;
			if (visibleWhen != null)
				msgs = ((InternalEObject)visibleWhen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtensionPackage.MY_MAP__VISIBLE_WHEN, null, msgs);
			if (newVisibleWhen != null)
				msgs = ((InternalEObject)newVisibleWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtensionPackage.MY_MAP__VISIBLE_WHEN, null, msgs);
			msgs = basicSetVisibleWhen(newVisibleWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__VISIBLE_WHEN, newVisibleWhen, newVisibleWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessibilityPhrase() {
		return accessibilityPhrase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessibilityPhrase(String newAccessibilityPhrase) {
		String oldAccessibilityPhrase = accessibilityPhrase;
		accessibilityPhrase = newAccessibilityPhrase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__ACCESSIBILITY_PHRASE, oldAccessibilityPhrase, accessibilityPhrase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContributionURI() {
		return contributionURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContributionURI(String newContributionURI) {
		String oldContributionURI = contributionURI;
		contributionURI = newContributionURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__CONTRIBUTION_URI, oldContributionURI, contributionURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(Object newObject) {
		Object oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__OBJECT, oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<MHandler> getHandlers() {
		if (handlers == null) {
			handlers = new EObjectContainmentEList<MHandler>(MHandler.class, this, ExtensionPackage.MY_MAP__HANDLERS);
		}
		return handlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDirty() {
		return dirty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirty(boolean newDirty) {
		boolean oldDirty = dirty;
		dirty = newDirty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__DIRTY, oldDirty, dirty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<MBindingContext> getBindingContexts() {
		if (bindingContexts == null) {
			bindingContexts = new EObjectResolvingEList<MBindingContext>(MBindingContext.class, this, ExtensionPackage.MY_MAP__BINDING_CONTEXTS);
		}
		return bindingContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<MMenu> getMenus() {
		if (menus == null) {
			menus = new EObjectContainmentEList<MMenu>(MMenu.class, this, ExtensionPackage.MY_MAP__MENUS);
		}
		return menus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MToolBar getToolbar() {
		return toolbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToolbar(MToolBar newToolbar, NotificationChain msgs) {
		MToolBar oldToolbar = toolbar;
		toolbar = newToolbar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__TOOLBAR, oldToolbar, newToolbar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolbar(MToolBar newToolbar) {
		if (newToolbar != toolbar) {
			NotificationChain msgs = null;
			if (toolbar != null)
				msgs = ((InternalEObject)toolbar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtensionPackage.MY_MAP__TOOLBAR, null, msgs);
			if (newToolbar != null)
				msgs = ((InternalEObject)newToolbar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtensionPackage.MY_MAP__TOOLBAR, null, msgs);
			msgs = basicSetToolbar(newToolbar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__TOOLBAR, newToolbar, newToolbar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCloseable() {
		return closeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloseable(boolean newCloseable) {
		boolean oldCloseable = closeable;
		closeable = newCloseable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__CLOSEABLE, oldCloseable, closeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MY_MAP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalizedDescription() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalizedAccessibilityPhrase() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalizedLabel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalizedTooltip() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionPackage.MY_MAP__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((MElementContainer<MUIElement>)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionPackage.MY_MAP__PROPERTIES:
				return ((InternalEList<?>)((EMap.InternalMapView<String, String>)getProperties()).eMap()).basicRemove(otherEnd, msgs);
			case ExtensionPackage.MY_MAP__PERSISTED_STATE:
				return ((InternalEList<?>)((EMap.InternalMapView<String, String>)getPersistedState()).eMap()).basicRemove(otherEnd, msgs);
			case ExtensionPackage.MY_MAP__TRANSIENT_DATA:
				return ((InternalEList<?>)((EMap.InternalMapView<String, Object>)getTransientData()).eMap()).basicRemove(otherEnd, msgs);
			case ExtensionPackage.MY_MAP__PARENT:
				return basicSetParent(null, msgs);
			case ExtensionPackage.MY_MAP__VISIBLE_WHEN:
				return basicSetVisibleWhen(null, msgs);
			case ExtensionPackage.MY_MAP__HANDLERS:
				return ((InternalEList<?>)getHandlers()).basicRemove(otherEnd, msgs);
			case ExtensionPackage.MY_MAP__MENUS:
				return ((InternalEList<?>)getMenus()).basicRemove(otherEnd, msgs);
			case ExtensionPackage.MY_MAP__TOOLBAR:
				return basicSetToolbar(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ExtensionPackage.MY_MAP__PARENT:
				return eInternalContainer().eInverseRemove(this, UiPackageImpl.ELEMENT_CONTAINER__CHILDREN, MElementContainer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionPackage.MY_MAP__CONTEXT:
				return getContext();
			case ExtensionPackage.MY_MAP__VARIABLES:
				return getVariables();
			case ExtensionPackage.MY_MAP__PROPERTIES:
				if (coreType) return ((EMap.InternalMapView<String, String>)getProperties()).eMap();
				else return getProperties();
			case ExtensionPackage.MY_MAP__LABEL:
				return getLabel();
			case ExtensionPackage.MY_MAP__ICON_URI:
				return getIconURI();
			case ExtensionPackage.MY_MAP__TOOLTIP:
				return getTooltip();
			case ExtensionPackage.MY_MAP__ELEMENT_ID:
				return getElementId();
			case ExtensionPackage.MY_MAP__PERSISTED_STATE:
				if (coreType) return ((EMap.InternalMapView<String, String>)getPersistedState()).eMap();
				else return getPersistedState();
			case ExtensionPackage.MY_MAP__TAGS:
				return getTags();
			case ExtensionPackage.MY_MAP__CONTRIBUTOR_URI:
				return getContributorURI();
			case ExtensionPackage.MY_MAP__TRANSIENT_DATA:
				if (coreType) return ((EMap.InternalMapView<String, Object>)getTransientData()).eMap();
				else return getTransientData();
			case ExtensionPackage.MY_MAP__WIDGET:
				return getWidget();
			case ExtensionPackage.MY_MAP__RENDERER:
				return getRenderer();
			case ExtensionPackage.MY_MAP__TO_BE_RENDERED:
				return isToBeRendered();
			case ExtensionPackage.MY_MAP__ON_TOP:
				return isOnTop();
			case ExtensionPackage.MY_MAP__VISIBLE:
				return isVisible();
			case ExtensionPackage.MY_MAP__PARENT:
				return getParent();
			case ExtensionPackage.MY_MAP__CONTAINER_DATA:
				return getContainerData();
			case ExtensionPackage.MY_MAP__CUR_SHARED_REF:
				if (resolve) return getCurSharedRef();
				return basicGetCurSharedRef();
			case ExtensionPackage.MY_MAP__VISIBLE_WHEN:
				return getVisibleWhen();
			case ExtensionPackage.MY_MAP__ACCESSIBILITY_PHRASE:
				return getAccessibilityPhrase();
			case ExtensionPackage.MY_MAP__CONTRIBUTION_URI:
				return getContributionURI();
			case ExtensionPackage.MY_MAP__OBJECT:
				return getObject();
			case ExtensionPackage.MY_MAP__HANDLERS:
				return getHandlers();
			case ExtensionPackage.MY_MAP__DIRTY:
				return isDirty();
			case ExtensionPackage.MY_MAP__BINDING_CONTEXTS:
				return getBindingContexts();
			case ExtensionPackage.MY_MAP__MENUS:
				return getMenus();
			case ExtensionPackage.MY_MAP__TOOLBAR:
				return getToolbar();
			case ExtensionPackage.MY_MAP__CLOSEABLE:
				return isCloseable();
			case ExtensionPackage.MY_MAP__DESCRIPTION:
				return getDescription();
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
			case ExtensionPackage.MY_MAP__CONTEXT:
				setContext((IEclipseContext)newValue);
				return;
			case ExtensionPackage.MY_MAP__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends String>)newValue);
				return;
			case ExtensionPackage.MY_MAP__PROPERTIES:
				((EStructuralFeature.Setting)((EMap.InternalMapView<String, String>)getProperties()).eMap()).set(newValue);
				return;
			case ExtensionPackage.MY_MAP__LABEL:
				setLabel((String)newValue);
				return;
			case ExtensionPackage.MY_MAP__ICON_URI:
				setIconURI((String)newValue);
				return;
			case ExtensionPackage.MY_MAP__TOOLTIP:
				setTooltip((String)newValue);
				return;
			case ExtensionPackage.MY_MAP__ELEMENT_ID:
				setElementId((String)newValue);
				return;
			case ExtensionPackage.MY_MAP__PERSISTED_STATE:
				((EStructuralFeature.Setting)((EMap.InternalMapView<String, String>)getPersistedState()).eMap()).set(newValue);
				return;
			case ExtensionPackage.MY_MAP__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case ExtensionPackage.MY_MAP__CONTRIBUTOR_URI:
				setContributorURI((String)newValue);
				return;
			case ExtensionPackage.MY_MAP__TRANSIENT_DATA:
				((EStructuralFeature.Setting)((EMap.InternalMapView<String, Object>)getTransientData()).eMap()).set(newValue);
				return;
			case ExtensionPackage.MY_MAP__WIDGET:
				setWidget(newValue);
				return;
			case ExtensionPackage.MY_MAP__RENDERER:
				setRenderer(newValue);
				return;
			case ExtensionPackage.MY_MAP__TO_BE_RENDERED:
				setToBeRendered((Boolean)newValue);
				return;
			case ExtensionPackage.MY_MAP__ON_TOP:
				setOnTop((Boolean)newValue);
				return;
			case ExtensionPackage.MY_MAP__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case ExtensionPackage.MY_MAP__PARENT:
				setParent((MElementContainer<MUIElement>)newValue);
				return;
			case ExtensionPackage.MY_MAP__CONTAINER_DATA:
				setContainerData((String)newValue);
				return;
			case ExtensionPackage.MY_MAP__CUR_SHARED_REF:
				setCurSharedRef((MPlaceholder)newValue);
				return;
			case ExtensionPackage.MY_MAP__VISIBLE_WHEN:
				setVisibleWhen((MExpression)newValue);
				return;
			case ExtensionPackage.MY_MAP__ACCESSIBILITY_PHRASE:
				setAccessibilityPhrase((String)newValue);
				return;
			case ExtensionPackage.MY_MAP__CONTRIBUTION_URI:
				setContributionURI((String)newValue);
				return;
			case ExtensionPackage.MY_MAP__OBJECT:
				setObject(newValue);
				return;
			case ExtensionPackage.MY_MAP__HANDLERS:
				getHandlers().clear();
				getHandlers().addAll((Collection<? extends MHandler>)newValue);
				return;
			case ExtensionPackage.MY_MAP__DIRTY:
				setDirty((Boolean)newValue);
				return;
			case ExtensionPackage.MY_MAP__BINDING_CONTEXTS:
				getBindingContexts().clear();
				getBindingContexts().addAll((Collection<? extends MBindingContext>)newValue);
				return;
			case ExtensionPackage.MY_MAP__MENUS:
				getMenus().clear();
				getMenus().addAll((Collection<? extends MMenu>)newValue);
				return;
			case ExtensionPackage.MY_MAP__TOOLBAR:
				setToolbar((MToolBar)newValue);
				return;
			case ExtensionPackage.MY_MAP__CLOSEABLE:
				setCloseable((Boolean)newValue);
				return;
			case ExtensionPackage.MY_MAP__DESCRIPTION:
				setDescription((String)newValue);
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
			case ExtensionPackage.MY_MAP__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case ExtensionPackage.MY_MAP__VARIABLES:
				getVariables().clear();
				return;
			case ExtensionPackage.MY_MAP__PROPERTIES:
				getProperties().clear();
				return;
			case ExtensionPackage.MY_MAP__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ExtensionPackage.MY_MAP__ICON_URI:
				setIconURI(ICON_URI_EDEFAULT);
				return;
			case ExtensionPackage.MY_MAP__TOOLTIP:
				setTooltip(TOOLTIP_EDEFAULT);
				return;
			case ExtensionPackage.MY_MAP__ELEMENT_ID:
				setElementId(ELEMENT_ID_EDEFAULT);
				return;
			case ExtensionPackage.MY_MAP__PERSISTED_STATE:
				getPersistedState().clear();
				return;
			case ExtensionPackage.MY_MAP__TAGS:
				getTags().clear();
				return;
			case ExtensionPackage.MY_MAP__CONTRIBUTOR_URI:
				setContributorURI(CONTRIBUTOR_URI_EDEFAULT);
				return;
			case ExtensionPackage.MY_MAP__TRANSIENT_DATA:
				getTransientData().clear();
				return;
			case ExtensionPackage.MY_MAP__WIDGET:
				setWidget(WIDGET_EDEFAULT);
				return;
			case ExtensionPackage.MY_MAP__RENDERER:
				setRenderer(RENDERER_EDEFAULT);
				return;
			case ExtensionPackage.MY_MAP__TO_BE_RENDERED:
				setToBeRendered(TO_BE_RENDERED_EDEFAULT);
				return;
			case ExtensionPackage.MY_MAP__ON_TOP:
				setOnTop(ON_TOP_EDEFAULT);
				return;
			case ExtensionPackage.MY_MAP__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case ExtensionPackage.MY_MAP__PARENT:
				setParent((MElementContainer<MUIElement>)null);
				return;
			case ExtensionPackage.MY_MAP__CONTAINER_DATA:
				setContainerData(CONTAINER_DATA_EDEFAULT);
				return;
			case ExtensionPackage.MY_MAP__CUR_SHARED_REF:
				setCurSharedRef((MPlaceholder)null);
				return;
			case ExtensionPackage.MY_MAP__VISIBLE_WHEN:
				setVisibleWhen((MExpression)null);
				return;
			case ExtensionPackage.MY_MAP__ACCESSIBILITY_PHRASE:
				setAccessibilityPhrase(ACCESSIBILITY_PHRASE_EDEFAULT);
				return;
			case ExtensionPackage.MY_MAP__CONTRIBUTION_URI:
				setContributionURI(CONTRIBUTION_URI_EDEFAULT);
				return;
			case ExtensionPackage.MY_MAP__OBJECT:
				setObject(OBJECT_EDEFAULT);
				return;
			case ExtensionPackage.MY_MAP__HANDLERS:
				getHandlers().clear();
				return;
			case ExtensionPackage.MY_MAP__DIRTY:
				setDirty(DIRTY_EDEFAULT);
				return;
			case ExtensionPackage.MY_MAP__BINDING_CONTEXTS:
				getBindingContexts().clear();
				return;
			case ExtensionPackage.MY_MAP__MENUS:
				getMenus().clear();
				return;
			case ExtensionPackage.MY_MAP__TOOLBAR:
				setToolbar((MToolBar)null);
				return;
			case ExtensionPackage.MY_MAP__CLOSEABLE:
				setCloseable(CLOSEABLE_EDEFAULT);
				return;
			case ExtensionPackage.MY_MAP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case ExtensionPackage.MY_MAP__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case ExtensionPackage.MY_MAP__VARIABLES:
				return variables != null && !variables.isEmpty();
			case ExtensionPackage.MY_MAP__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ExtensionPackage.MY_MAP__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ExtensionPackage.MY_MAP__ICON_URI:
				return ICON_URI_EDEFAULT == null ? iconURI != null : !ICON_URI_EDEFAULT.equals(iconURI);
			case ExtensionPackage.MY_MAP__TOOLTIP:
				return TOOLTIP_EDEFAULT == null ? tooltip != null : !TOOLTIP_EDEFAULT.equals(tooltip);
			case ExtensionPackage.MY_MAP__ELEMENT_ID:
				return ELEMENT_ID_EDEFAULT == null ? elementId != null : !ELEMENT_ID_EDEFAULT.equals(elementId);
			case ExtensionPackage.MY_MAP__PERSISTED_STATE:
				return persistedState != null && !persistedState.isEmpty();
			case ExtensionPackage.MY_MAP__TAGS:
				return tags != null && !tags.isEmpty();
			case ExtensionPackage.MY_MAP__CONTRIBUTOR_URI:
				return CONTRIBUTOR_URI_EDEFAULT == null ? contributorURI != null : !CONTRIBUTOR_URI_EDEFAULT.equals(contributorURI);
			case ExtensionPackage.MY_MAP__TRANSIENT_DATA:
				return transientData != null && !transientData.isEmpty();
			case ExtensionPackage.MY_MAP__WIDGET:
				return WIDGET_EDEFAULT == null ? widget != null : !WIDGET_EDEFAULT.equals(widget);
			case ExtensionPackage.MY_MAP__RENDERER:
				return RENDERER_EDEFAULT == null ? renderer != null : !RENDERER_EDEFAULT.equals(renderer);
			case ExtensionPackage.MY_MAP__TO_BE_RENDERED:
				return toBeRendered != TO_BE_RENDERED_EDEFAULT;
			case ExtensionPackage.MY_MAP__ON_TOP:
				return onTop != ON_TOP_EDEFAULT;
			case ExtensionPackage.MY_MAP__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case ExtensionPackage.MY_MAP__PARENT:
				return getParent() != null;
			case ExtensionPackage.MY_MAP__CONTAINER_DATA:
				return CONTAINER_DATA_EDEFAULT == null ? containerData != null : !CONTAINER_DATA_EDEFAULT.equals(containerData);
			case ExtensionPackage.MY_MAP__CUR_SHARED_REF:
				return curSharedRef != null;
			case ExtensionPackage.MY_MAP__VISIBLE_WHEN:
				return visibleWhen != null;
			case ExtensionPackage.MY_MAP__ACCESSIBILITY_PHRASE:
				return ACCESSIBILITY_PHRASE_EDEFAULT == null ? accessibilityPhrase != null : !ACCESSIBILITY_PHRASE_EDEFAULT.equals(accessibilityPhrase);
			case ExtensionPackage.MY_MAP__CONTRIBUTION_URI:
				return CONTRIBUTION_URI_EDEFAULT == null ? contributionURI != null : !CONTRIBUTION_URI_EDEFAULT.equals(contributionURI);
			case ExtensionPackage.MY_MAP__OBJECT:
				return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
			case ExtensionPackage.MY_MAP__HANDLERS:
				return handlers != null && !handlers.isEmpty();
			case ExtensionPackage.MY_MAP__DIRTY:
				return dirty != DIRTY_EDEFAULT;
			case ExtensionPackage.MY_MAP__BINDING_CONTEXTS:
				return bindingContexts != null && !bindingContexts.isEmpty();
			case ExtensionPackage.MY_MAP__MENUS:
				return menus != null && !menus.isEmpty();
			case ExtensionPackage.MY_MAP__TOOLBAR:
				return toolbar != null;
			case ExtensionPackage.MY_MAP__CLOSEABLE:
				return closeable != CLOSEABLE_EDEFAULT;
			case ExtensionPackage.MY_MAP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MUILabel.class) {
			switch (derivedFeatureID) {
				case ExtensionPackage.MY_MAP__LABEL: return UiPackageImpl.UI_LABEL__LABEL;
				case ExtensionPackage.MY_MAP__ICON_URI: return UiPackageImpl.UI_LABEL__ICON_URI;
				case ExtensionPackage.MY_MAP__TOOLTIP: return UiPackageImpl.UI_LABEL__TOOLTIP;
				default: return -1;
			}
		}
		if (baseClass == MApplicationElement.class) {
			switch (derivedFeatureID) {
				case ExtensionPackage.MY_MAP__ELEMENT_ID: return ApplicationPackageImpl.APPLICATION_ELEMENT__ELEMENT_ID;
				case ExtensionPackage.MY_MAP__PERSISTED_STATE: return ApplicationPackageImpl.APPLICATION_ELEMENT__PERSISTED_STATE;
				case ExtensionPackage.MY_MAP__TAGS: return ApplicationPackageImpl.APPLICATION_ELEMENT__TAGS;
				case ExtensionPackage.MY_MAP__CONTRIBUTOR_URI: return ApplicationPackageImpl.APPLICATION_ELEMENT__CONTRIBUTOR_URI;
				case ExtensionPackage.MY_MAP__TRANSIENT_DATA: return ApplicationPackageImpl.APPLICATION_ELEMENT__TRANSIENT_DATA;
				default: return -1;
			}
		}
		if (baseClass == MUIElement.class) {
			switch (derivedFeatureID) {
				case ExtensionPackage.MY_MAP__WIDGET: return UiPackageImpl.UI_ELEMENT__WIDGET;
				case ExtensionPackage.MY_MAP__RENDERER: return UiPackageImpl.UI_ELEMENT__RENDERER;
				case ExtensionPackage.MY_MAP__TO_BE_RENDERED: return UiPackageImpl.UI_ELEMENT__TO_BE_RENDERED;
				case ExtensionPackage.MY_MAP__ON_TOP: return UiPackageImpl.UI_ELEMENT__ON_TOP;
				case ExtensionPackage.MY_MAP__VISIBLE: return UiPackageImpl.UI_ELEMENT__VISIBLE;
				case ExtensionPackage.MY_MAP__PARENT: return UiPackageImpl.UI_ELEMENT__PARENT;
				case ExtensionPackage.MY_MAP__CONTAINER_DATA: return UiPackageImpl.UI_ELEMENT__CONTAINER_DATA;
				case ExtensionPackage.MY_MAP__CUR_SHARED_REF: return UiPackageImpl.UI_ELEMENT__CUR_SHARED_REF;
				case ExtensionPackage.MY_MAP__VISIBLE_WHEN: return UiPackageImpl.UI_ELEMENT__VISIBLE_WHEN;
				case ExtensionPackage.MY_MAP__ACCESSIBILITY_PHRASE: return UiPackageImpl.UI_ELEMENT__ACCESSIBILITY_PHRASE;
				default: return -1;
			}
		}
		if (baseClass == MPartSashContainerElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MStackElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MContribution.class) {
			switch (derivedFeatureID) {
				case ExtensionPackage.MY_MAP__CONTRIBUTION_URI: return ApplicationPackageImpl.CONTRIBUTION__CONTRIBUTION_URI;
				case ExtensionPackage.MY_MAP__OBJECT: return ApplicationPackageImpl.CONTRIBUTION__OBJECT;
				default: return -1;
			}
		}
		if (baseClass == MHandlerContainer.class) {
			switch (derivedFeatureID) {
				case ExtensionPackage.MY_MAP__HANDLERS: return CommandsPackageImpl.HANDLER_CONTAINER__HANDLERS;
				default: return -1;
			}
		}
		if (baseClass == MDirtyable.class) {
			switch (derivedFeatureID) {
				case ExtensionPackage.MY_MAP__DIRTY: return UiPackageImpl.DIRTYABLE__DIRTY;
				default: return -1;
			}
		}
		if (baseClass == MBindings.class) {
			switch (derivedFeatureID) {
				case ExtensionPackage.MY_MAP__BINDING_CONTEXTS: return CommandsPackageImpl.BINDINGS__BINDING_CONTEXTS;
				default: return -1;
			}
		}
		if (baseClass == MWindowElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MPart.class) {
			switch (derivedFeatureID) {
				case ExtensionPackage.MY_MAP__MENUS: return BasicPackageImpl.PART__MENUS;
				case ExtensionPackage.MY_MAP__TOOLBAR: return BasicPackageImpl.PART__TOOLBAR;
				case ExtensionPackage.MY_MAP__CLOSEABLE: return BasicPackageImpl.PART__CLOSEABLE;
				case ExtensionPackage.MY_MAP__DESCRIPTION: return BasicPackageImpl.PART__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MUILabel.class) {
			switch (baseFeatureID) {
				case UiPackageImpl.UI_LABEL__LABEL: return ExtensionPackage.MY_MAP__LABEL;
				case UiPackageImpl.UI_LABEL__ICON_URI: return ExtensionPackage.MY_MAP__ICON_URI;
				case UiPackageImpl.UI_LABEL__TOOLTIP: return ExtensionPackage.MY_MAP__TOOLTIP;
				default: return -1;
			}
		}
		if (baseClass == MApplicationElement.class) {
			switch (baseFeatureID) {
				case ApplicationPackageImpl.APPLICATION_ELEMENT__ELEMENT_ID: return ExtensionPackage.MY_MAP__ELEMENT_ID;
				case ApplicationPackageImpl.APPLICATION_ELEMENT__PERSISTED_STATE: return ExtensionPackage.MY_MAP__PERSISTED_STATE;
				case ApplicationPackageImpl.APPLICATION_ELEMENT__TAGS: return ExtensionPackage.MY_MAP__TAGS;
				case ApplicationPackageImpl.APPLICATION_ELEMENT__CONTRIBUTOR_URI: return ExtensionPackage.MY_MAP__CONTRIBUTOR_URI;
				case ApplicationPackageImpl.APPLICATION_ELEMENT__TRANSIENT_DATA: return ExtensionPackage.MY_MAP__TRANSIENT_DATA;
				default: return -1;
			}
		}
		if (baseClass == MUIElement.class) {
			switch (baseFeatureID) {
				case UiPackageImpl.UI_ELEMENT__WIDGET: return ExtensionPackage.MY_MAP__WIDGET;
				case UiPackageImpl.UI_ELEMENT__RENDERER: return ExtensionPackage.MY_MAP__RENDERER;
				case UiPackageImpl.UI_ELEMENT__TO_BE_RENDERED: return ExtensionPackage.MY_MAP__TO_BE_RENDERED;
				case UiPackageImpl.UI_ELEMENT__ON_TOP: return ExtensionPackage.MY_MAP__ON_TOP;
				case UiPackageImpl.UI_ELEMENT__VISIBLE: return ExtensionPackage.MY_MAP__VISIBLE;
				case UiPackageImpl.UI_ELEMENT__PARENT: return ExtensionPackage.MY_MAP__PARENT;
				case UiPackageImpl.UI_ELEMENT__CONTAINER_DATA: return ExtensionPackage.MY_MAP__CONTAINER_DATA;
				case UiPackageImpl.UI_ELEMENT__CUR_SHARED_REF: return ExtensionPackage.MY_MAP__CUR_SHARED_REF;
				case UiPackageImpl.UI_ELEMENT__VISIBLE_WHEN: return ExtensionPackage.MY_MAP__VISIBLE_WHEN;
				case UiPackageImpl.UI_ELEMENT__ACCESSIBILITY_PHRASE: return ExtensionPackage.MY_MAP__ACCESSIBILITY_PHRASE;
				default: return -1;
			}
		}
		if (baseClass == MPartSashContainerElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MStackElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MContribution.class) {
			switch (baseFeatureID) {
				case ApplicationPackageImpl.CONTRIBUTION__CONTRIBUTION_URI: return ExtensionPackage.MY_MAP__CONTRIBUTION_URI;
				case ApplicationPackageImpl.CONTRIBUTION__OBJECT: return ExtensionPackage.MY_MAP__OBJECT;
				default: return -1;
			}
		}
		if (baseClass == MHandlerContainer.class) {
			switch (baseFeatureID) {
				case CommandsPackageImpl.HANDLER_CONTAINER__HANDLERS: return ExtensionPackage.MY_MAP__HANDLERS;
				default: return -1;
			}
		}
		if (baseClass == MDirtyable.class) {
			switch (baseFeatureID) {
				case UiPackageImpl.DIRTYABLE__DIRTY: return ExtensionPackage.MY_MAP__DIRTY;
				default: return -1;
			}
		}
		if (baseClass == MBindings.class) {
			switch (baseFeatureID) {
				case CommandsPackageImpl.BINDINGS__BINDING_CONTEXTS: return ExtensionPackage.MY_MAP__BINDING_CONTEXTS;
				default: return -1;
			}
		}
		if (baseClass == MWindowElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MPart.class) {
			switch (baseFeatureID) {
				case BasicPackageImpl.PART__MENUS: return ExtensionPackage.MY_MAP__MENUS;
				case BasicPackageImpl.PART__TOOLBAR: return ExtensionPackage.MY_MAP__TOOLBAR;
				case BasicPackageImpl.PART__CLOSEABLE: return ExtensionPackage.MY_MAP__CLOSEABLE;
				case BasicPackageImpl.PART__DESCRIPTION: return ExtensionPackage.MY_MAP__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (context: ");
		result.append(context);
		result.append(", variables: ");
		result.append(variables);
		result.append(", label: ");
		result.append(label);
		result.append(", iconURI: ");
		result.append(iconURI);
		result.append(", tooltip: ");
		result.append(tooltip);
		result.append(", elementId: ");
		result.append(elementId);
		result.append(", tags: ");
		result.append(tags);
		result.append(", contributorURI: ");
		result.append(contributorURI);
		result.append(", widget: ");
		result.append(widget);
		result.append(", renderer: ");
		result.append(renderer);
		result.append(", toBeRendered: ");
		result.append(toBeRendered);
		result.append(", onTop: ");
		result.append(onTop);
		result.append(", visible: ");
		result.append(visible);
		result.append(", containerData: ");
		result.append(containerData);
		result.append(", accessibilityPhrase: ");
		result.append(accessibilityPhrase);
		result.append(", contributionURI: ");
		result.append(contributionURI);
		result.append(", object: ");
		result.append(object);
		result.append(", dirty: ");
		result.append(dirty);
		result.append(", closeable: ");
		result.append(closeable);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //MyMapImpl
