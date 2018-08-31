public class FibonacciIterative implements Fibonacci {
	public int fibonacci(int n) {
		if (n <= 1) {
			return 1;
		}
		int curr = 1;
		int prev = 1;
		int temp = curr;
		for (int i = 2; i < n; i++) {
			temp = curr;
			curr += prev;
			prev = temp;
		}
		return curr;
	}
}