package fr.diginamic.jdr;

public class JdrUtil {
	
	/**
	 * 
	 * @param minValue
	 * @param maxValue
	 * @return
	 */
	public static int getRandomInt(int minValue, int maxValue) {
		int random = minValue + (int) (Math.random() * ((maxValue - minValue) + 1));
		return random;
	}
}
