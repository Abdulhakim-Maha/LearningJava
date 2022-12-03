import java.util.Scanner;

class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");	
		String[] input = sc.next().split(",");
		System.out.println(input[0] + "," + input[1]);
		int sum = 0;
		for (int i = Integer.parseInt(input[0]); i <= Integer.parseInt(input[1]) ; i++) {
			if(isPrime(i)){
				sum += i;
			}
		}
		System.out.println("Sum of prime num: " + sum);

	
	}
	public static boolean isPrime(int n) {
		// Check if number is <= 1
		if (n <= 1) return false;

		// Check for factors
		for (int i = 2; i <= n / 2; i++) {
		if (n % i == 0) return false;
		}
		return true;
	}
}