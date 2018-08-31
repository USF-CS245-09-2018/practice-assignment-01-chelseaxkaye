public class FactorialIterative implements Factorial {
	public int factorial(int n) {
		int total = 1;
		int x = 1;
		while (x <= n) {
			total *= x;
			x++;
		}
		return total;
	}
}