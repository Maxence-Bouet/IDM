/**
 *
 * $Id$
 */
package eMProject.validation;

import eMProject.Enclos;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link eMProject.Animal}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AnimalValidator {
	boolean validate();

	boolean validateEnclos(Enclos value);

	boolean validateId(int value);

	boolean validateId(EList<Integer> value);

	boolean validateName(String value);
}
