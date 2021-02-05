package fr.diginamic.parseur.entities;

import java.util.regex.Pattern;

public class Parser {

	public static Expression parse(String chaine) {
		Expression expression = new Expression();
		char signe = verifierSigneOperateur(chaine);
		if (signe != ' ') {
			String membreGauche = chaine.substring(0, chaine.indexOf(signe));
			String membreDroite = chaine.substring(chaine.indexOf(signe) + 1);
			final String regexDouble = recupererRegexDouble();
			if (Pattern.matches("[a-z]", membreGauche) && Pattern.matches(regexDouble, membreDroite)) {
				expression = new Expression(membreGauche, signe, membreDroite);
			} else if (Pattern.matches("[a-z]", membreDroite) && Pattern.matches(regexDouble, membreGauche)) {
				expression = new Expression(membreGauche, signe, membreDroite);
			} else {
				System.out.println(
						"La chaîne ne contient pas de caractère correspondant à une variable ou de constante.");
				expression = null;
			}
		} else {
			System.out.println("La chaîne ne contient pas de signe opérateur.");
			expression = null;
		}
		return expression;
	}

	private static String recupererRegexDouble() {
		final String Digits = "(\\p{Digit}+)";
		final String HexDigits = "(\\p{XDigit}+)";
		// an exponent is 'e' or 'E' followed by an optionally
		// signed decimal integer.
		final String Exp = "[eE][+-]?" + Digits;
		final String fpRegex = ("[\\x00-\\x20]*" + // Optional leading "whitespace"
				"[+-]?(" + // Optional sign character
				"NaN|" + // "NaN" string
				"Infinity|" + // "Infinity" string

				// A decimal floating-point string representing a finite positive
				// number without a leading sign has at most five basic pieces:
				// Digits . Digits ExponentPart FloatTypeSuffix
				//
				// Since this method allows integer-only strings as input
				// in addition to strings of floating-point literals, the
				// two sub-patterns below are simplifications of the grammar
				// productions from the Java Language Specification, 2nd
				// edition, section 3.10.2.

				// Digits ._opt Digits_opt ExponentPart_opt FloatTypeSuffix_opt
				"(((" + Digits + "(\\.)?(" + Digits + "?)(" + Exp + ")?)|" +

				// . Digits ExponentPart_opt FloatTypeSuffix_opt
				"(\\.(" + Digits + ")(" + Exp + ")?)|" +

				// Hexadecimal strings
				"((" +
				// 0[xX] HexDigits ._opt BinaryExponent FloatTypeSuffix_opt
				"(0[xX]" + HexDigits + "(\\.)?)|" +

				// 0[xX] HexDigits_opt . HexDigits BinaryExponent FloatTypeSuffix_opt
				"(0[xX]" + HexDigits + "?(\\.)" + HexDigits + ")" +

				")[pP][+-]?" + Digits + "))" + "[fFdD]?))" + "[\\x00-\\x20]*");// Optional trailing "whitespace"
		return fpRegex;
	}

	private static char verifierSigneOperateur(String chaine) {
		char[] tabSignes = { '+', '-', '/', '*' };
		char signe = ' ';
		for (char c : tabSignes) {
			if (chaine.indexOf(c) >= 0) {
				signe = c;
				break;
			}
		}
		return signe;
	}

}
