/**
 * generated by Xtext 2.13.0
 */
package mx.infotec.dads.kukulkan.kukulkan;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>blob Validators</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mx.infotec.dads.kukulkan.kukulkan.blobValidators#getRequired <em>Required</em>}</li>
 *   <li>{@link mx.infotec.dads.kukulkan.kukulkan.blobValidators#getMinBytesValue <em>Min Bytes Value</em>}</li>
 *   <li>{@link mx.infotec.dads.kukulkan.kukulkan.blobValidators#getMaxBytesValue <em>Max Bytes Value</em>}</li>
 * </ul>
 *
 * @see mx.infotec.dads.kukulkan.kukulkan.KukulkanPackage#getblobValidators()
 * @model
 * @generated
 */
public interface blobValidators extends EObject
{
  /**
   * Returns the value of the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required</em>' attribute.
   * @see #setRequired(String)
   * @see mx.infotec.dads.kukulkan.kukulkan.KukulkanPackage#getblobValidators_Required()
   * @model
   * @generated
   */
  String getRequired();

  /**
   * Sets the value of the '{@link mx.infotec.dads.kukulkan.kukulkan.blobValidators#getRequired <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required</em>' attribute.
   * @see #getRequired()
   * @generated
   */
  void setRequired(String value);

  /**
   * Returns the value of the '<em><b>Min Bytes Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Bytes Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Bytes Value</em>' attribute.
   * @see #setMinBytesValue(String)
   * @see mx.infotec.dads.kukulkan.kukulkan.KukulkanPackage#getblobValidators_MinBytesValue()
   * @model
   * @generated
   */
  String getMinBytesValue();

  /**
   * Sets the value of the '{@link mx.infotec.dads.kukulkan.kukulkan.blobValidators#getMinBytesValue <em>Min Bytes Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Bytes Value</em>' attribute.
   * @see #getMinBytesValue()
   * @generated
   */
  void setMinBytesValue(String value);

  /**
   * Returns the value of the '<em><b>Max Bytes Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Bytes Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Bytes Value</em>' attribute.
   * @see #setMaxBytesValue(String)
   * @see mx.infotec.dads.kukulkan.kukulkan.KukulkanPackage#getblobValidators_MaxBytesValue()
   * @model
   * @generated
   */
  String getMaxBytesValue();

  /**
   * Sets the value of the '{@link mx.infotec.dads.kukulkan.kukulkan.blobValidators#getMaxBytesValue <em>Max Bytes Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Bytes Value</em>' attribute.
   * @see #getMaxBytesValue()
   * @generated
   */
  void setMaxBytesValue(String value);

} // blobValidators
