public class sinTaylor {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		x = x % (2 * Math.PI);
		double n = 1.0;
		double sum = 0.0;

		for (int i = 0; n != 0; i = i + 1) {
			n = n * (x / i);
			if (i % 4 == 1) {
				sum = sum + n;
			}
			if (i % 4 == 3) {
				sum = sum - n;
			}
		}
		System.out.println(sum);
	}
}