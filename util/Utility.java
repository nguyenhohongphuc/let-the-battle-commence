
public class Utility {

	/**
	 * Test whether a specific number is a prime number.
	 * 
	 * @param num
	 *            the number
	 * @return <code>true</code> if <code>num</code> is a prime number.
	 */
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0){
				return false;
			}
		}
		return true;
	}

	/**
	 * Test whether a specific number is a square number.
	 * 
	 * @param num
	 *            the number
	 * @return <code>true</code> if <code>num</code> is a square number.
	 */
	public static boolean isSquare(int num) {
		int x = (int) Math.sqrt(num);
		return x*x == num;
	}

	public static int findFib(int num){
		int num1 = 1;
		int num2 = 1;
		int result = 1;
		if(num == 1 || num == 2) return 1;
		for(int i = 2; i< num; i++){
			result = num1 + num2;
			num1 = num2;
			num2 = result;
		}
		return result;
	}
	public static boolean isFib(int num){
		return isSquare(5*num*num + 4) ||isSquare(5 * num * num -4);
	}
	public static int Fibth(int num){
		for(int i = 1; ; i++){  
			int fib = findFib(i);
			if (num == fib) return i;  
			if (fib > num) return -1; 
		}
	}

}
