package algohw1;

public class Test {
    
	static Sort obj = new Sort();
	static int n = 100000;
	static int[] arr = new int[n];
	static long startTime;
	static long endTime;
	static double duration;

	public static void mergeEqualTwoParts() {
		equalIntegers(arr);
		startTime = System.nanoTime();
		obj.mergeSort(arr,"TwoParts");
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of mergeSort for equal integers with  2 part is: " + duration + " milliseconds");
		System.out.println();

	}

	public static void  mergeEqualThreeParts() {
		equalIntegers(arr);
		startTime = System.nanoTime();
		obj.mergeSort(arr,"ThreeParts");
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of mergeSort for equal integers with 3 part is: " + duration + " milliseconds");
		System.out.println();

	}
	public static void mergeRandomTwoParts() {
		randomIntegers(arr);
		startTime = System.nanoTime();
		obj.mergeSort(arr,"TwoParts");
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of mergeSort for random integers with  2 part is: " + duration + " milliseconds");
		System.out.println();

	}
	public static void mergeRandomThreeParts() {
		randomIntegers(arr);
		startTime = System.nanoTime();
		obj.mergeSort(arr,"ThreeParts");
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of mergeSort for random integers with  3 part is: " + duration + " milliseconds");
		System.out.println();

	}

	public static void mergeIncreasingTwoparts() {
		increasingIntegers(arr);
		startTime = System.nanoTime();
		obj.mergeSort(arr,"TwoParts");
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of mergeSORT with 2 parts for increasing integers is: " + duration + " milliseconds");
		System.out.println();

	}
	public static void mergeIncreasingThreeparts() {
		increasingIntegers(arr);
		startTime = System.nanoTime();
		obj.mergeSort(arr,"ThreeParts");
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of mergeSORT with 3 parts for increasing integers is: " + duration + " milliseconds");
		System.out.println();

	}

	public static void mergeDecreasingTwoParts() {
		decreasingIntegers(arr);
		startTime = System.nanoTime();
		obj.mergeSort(arr,"TwoParts");
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of mergeSort with 2 parts for decreasing integers is: " + duration + " milliseconds");
		System.out.println();

	}
	public static void mergeDecreasingThreeParts() {
		decreasingIntegers(arr);
		startTime = System.nanoTime();
		obj.mergeSort(arr,"TwoParts");
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of mergeSort with 3 parts for decreasing integers is: " + duration + " milliseconds");
		System.out.println();

	}
	public static void quickFirstEqual() {
		equalIntegers(arr);
		startTime = System.nanoTime();
		Sort.quickSort(arr,"FirstElement");
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of quickSort for equal integers with FirstElement: " + duration + " milliseconds");
		System.out.println();

	}

	public static void  quickRandomEqual() {
		equalIntegers(arr);
		startTime = System.nanoTime();
		Sort.quickSort(arr,"RandomElement");
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of quickSort for equal integers with  RandomElement is: " + duration + " milliseconds");
		System.out.println();

	}
	public static void quickMidEqual() {
		equalIntegers(arr);
		startTime = System.nanoTime();
		Sort.quickSort(arr,"MidOfFirstMidLastElement" );
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of quickSort for equal integers with  midElement is : " + duration + " milliseconds");
		System.out.println();

	}
	public static void quickFirstRandom() {
		randomIntegers(arr);
		startTime = System.nanoTime();
		Sort.quickSort(arr,"FirstElement");
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of quickSort for random integers with  FirstElement: " + duration + " milliseconds");
		System.out.println();

	}

	public static void quickMidRandom() {
		randomIntegers(arr);
		startTime = System.nanoTime();
		Sort.quickSort(arr,"MidOfFirstMidLastElement");
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of quickSort with midElement  for random integers is: " + duration + " milliseconds");
		System.out.println();

	}
	public static void quickRandomRandom() {
		randomIntegers(arr);
		startTime = System.nanoTime();
		Sort.quickSort(arr,"RandomElement");
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of quickSORT with RandomElement for random integers is: " + duration + " milliseconds");
		System.out.println();

	}

	public static void quickFirstIncreasing() {
		increasingIntegers(arr);
		startTime = System.nanoTime();
		Sort.quickSort(arr,"FirstElement");
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of quickSort with  FirstElement for increasing integers is: " + duration + " milliseconds");
		System.out.println();

	}
	public static void  quickRandomIncreasing() {
		increasingIntegers(arr);
		startTime = System.nanoTime();
		Sort.quickSort(arr,"RandomElement");
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of quickSort with   RandomElement for increasing  integers is: " + duration + " milliseconds");
		System.out.println();

	}
	public static void  quickMıdIncreasing() {
		increasingIntegers(arr);
		startTime = System.nanoTime();
		Sort.quickSort(arr,"MidOfFirstMidLastElement");
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of quickSort with midElement for increasing integers is: " + duration + " milliseconds");
		System.out.println();

	}
	public static void quickFirstDecreasing() {
		decreasingIntegers(arr);
		startTime = System.nanoTime();
		Sort.quickSort(arr,"FirstElement");
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of quickSort with   FirstElement for decreasing integers is: " + duration + " milliseconds");
		System.out.println();

	}
	public static void  quickRandomDecreasing() {
		decreasingIntegers(arr);
		startTime = System.nanoTime();
		Sort.quickSort(arr,"RandomElement");
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of quickSort with  RandomElement decreasing integers is: " + duration + " milliseconds");
		System.out.println();

	}
	public static void  quickMıdDecreasing() {
		decreasingIntegers(arr);
		startTime = System.nanoTime();
		Sort.quickSort(arr,"MidOfFirstMidLastElement");
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of quickSort with midElement for decreasing integers is: " + duration + " milliseconds");
		System.out.println();

	}
	


	
	public static void equalIntegers(int[] arr) {
		int random = (int) (Math.random() * 10000);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random;
		}
	}

	public static void randomIntegers(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10000);// take 10000 for max value
		}
	}

	public static void increasingIntegers(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
	}

	public static void decreasingIntegers(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}

	}

	public static void printArray(int[] arr) { // The first unsorted array

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		mergeEqualTwoParts();
		mergeEqualThreeParts();
		
		mergeRandomTwoParts();
		mergeRandomThreeParts();
		
		mergeIncreasingTwoparts();
		mergeIncreasingThreeparts();
		
		mergeDecreasingTwoParts();
		mergeDecreasingThreeParts();
		
	quickFirstEqual();
		quickRandomEqual();
		quickMidEqual();
		
		quickFirstRandom();
		quickMidRandom();
quickRandomRandom();
		
		quickFirstIncreasing();
quickRandomIncreasing();
		quickMıdIncreasing();
		
		quickFirstDecreasing();
		quickRandomDecreasing();
		quickMıdDecreasing();
		
	
	}
	


}
