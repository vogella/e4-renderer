/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package extension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see extension.ExtensionPackage
 * @generated
 */
public interface ExtensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionFactory eINSTANCE = extension.impl.ExtensionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>My Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Map</em>'.
	 * @generated
	 */
	MyMap createMyMap();

	/**
	 * Returns a new object of class '<em>My Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Part</em>'.
	 * @generated
	 */
	MyPart createMyPart();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExtensionPackage getExtensionPackage();

} //ExtensionFactory
