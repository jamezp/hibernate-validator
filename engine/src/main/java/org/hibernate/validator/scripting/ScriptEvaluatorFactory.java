/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.validator.scripting;

import org.hibernate.validator.constraints.ParameterScriptAssert;
import org.hibernate.validator.constraints.ScriptAssert;

/**
 * Factory used to initialize the {@link ScriptEvaluator}s required to evaluate script expressions defined in
 * {@link ScriptAssert} and {@link ParameterScriptAssert} constraints.
 *
 * @author Marko Bekhta
 * @since 6.1
 */
public interface ScriptEvaluatorFactory {

	/**
	 * Retrieves a script evaluator {@link ScriptEvaluator} for the given language.
	 *
	 * @param languageName The name of a scripting language.
	 *
	 * @return A script executor for the given language. Never null.
	 *
	 * @throws ScriptEvaluatorNotFoundException in case when no {@link ScriptEvaluator} was
	 * found for a given {@code languageName}.
	 */
	ScriptEvaluator getScriptEvaluatorByLanguageName(String languageName);
}