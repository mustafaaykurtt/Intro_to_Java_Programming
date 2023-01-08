package chapter_06.exercise_26;

public class DisplayPalindromeAndPrimeNumbers {
	
	public static void main(String[] args) {

		System.out.println("First 100 Palindrome Numbers number:\n");
		printPrimeAndPalindromeNumbers(100);
	}
	
	private static void printPrimeAndPalindromeNumbers(int numberOfPrice) {
		int count = 2;
		int countPrime = 0;
		while (countPrime < numberOfPrice) {

			if (isPrime(count) && isPalindrome(count) == true) {
				System.out.printf("%8d", count);
				countPrime++;
				if (countPrime % 10 == 0) {
					System.out.println();
				}
			}
			count++;
		}
	}

	public static boolean isPrime(int number) {

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	private static boolean isPalindrome(int number) {
		
		String str1 = Integer.toString(number);
		String str2 = "";
		int length = str1.length() - 1;
		
		for(int i = length ; i > -1; i-- ) {
			char ch = str1.charAt(i);
			str2 += ch;
		}
		
		if(str1.equals(str2)) {
			return true;
		}else
		
		return false;
	}

}
