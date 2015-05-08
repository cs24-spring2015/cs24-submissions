/*Double every other number in each array and reverse the array*/
public class doubleArray {
	public static void double_every_other_reverse([] p) {
		for (int i == 0; i < p.length; i + 2)
			p[i] = p[i] * 2;
		int c = 0;
		int a = p.length / 2
		while (c < a) {
			p[c] = p[p.length];
			p[p.length] = p[c];
			c = c + 1;
			p.length = p.length - 1;
		return p;
		}
	}
}