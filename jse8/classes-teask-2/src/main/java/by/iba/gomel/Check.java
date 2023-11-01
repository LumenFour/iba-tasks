package by.iba.gomel;

/**
 * Check class
 */
public class Check {

	public static final int NUMBERONE = 1;
	public static final int NUMBERTWO = 2;
	public static final int NUMBERTHREE = 3;

	/**
	 * Check sequence is a method which check whether the sequence of int values is
	 * arithmetic progression
	 *
	 * @param s the s
	 * @return true, if successful
	 */
	public boolean checkSequence(final int[] s) {
		boolean b = true;
		if (s.length < Check.NUMBERTHREE) {
			b = false;
		}
		for (int i = 0; i < (s.length - Check.NUMBERTWO); i++) {
			if ((s[i + Check.NUMBERONE] - s[i]) != (s[i + Check.NUMBERTWO] - s[i + Check.NUMBERONE])) {
				b = false;
				break;
			}
		}
		return b;
	}
}
