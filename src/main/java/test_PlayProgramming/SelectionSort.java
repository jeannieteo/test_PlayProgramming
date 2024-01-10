package test_PlayProgramming;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
	public static void main(String[] args) {
	
		int[] numbers = new int[10000];
		Random random = new Random();
		
		for (int i = 0; i < numbers.length ; i++)	{
			numbers[i] = random.nextInt(100000);
		}
		
		System.out.println(Arrays.toString(numbers));
		long startTime = System.currentTimeMillis();
		SelectionSort(numbers);
		long endTime = System.currentTimeMillis();
		System.out.println("It took "+ (endTime - startTime) + "ms to sort.");
		System.out.println(Arrays.toString(numbers));
	}

	private static void SelectionSort(int[] numbers) {
		// TODO Auto-generated method stub
		int small = 100000;
		for(int j = 0; j < numbers.length-1 ; j++) {
			for(int i = 0; i < numbers.length-1 ; i++) {
				small = numbers[i];
				if (small > numbers[i+1])	{
				
				numbers[i] = numbers[i+1];
				numbers[i+1] = small;
				small = numbers[i];
			}
					
		}
		}
	}
}
