package test_PlayProgramming;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

	public static void main(String[] args)	{
		
		//int[] BSnumbers = new int[7];
		//Random randomNum = new Random();
		
		//for(int i = 0; i < BSnumbers.length; i++)	{
		//	BSnumbers[i] = randomNum.nextInt(4);
		//}
		int[] BSnumbers = {99,985,452,52,21,47,12,11,15,65,35,22,258,264,235};
		
		System.out.println(Arrays.toString(BSnumbers));
		
		SelectionSort(BSnumbers);
		
		System.out.println("sorted: " + Arrays.toString(BSnumbers));
		
		System.out.println("result: " + binary_search(BSnumbers, 15));
		System.out.println("result Real: " + Arrays.binarySearch(BSnumbers, 15));
		
	}
	
	
	private static void SelectionSort(int[] numbers) {

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


	private static int binary_search(int[] numbers, int numberToFind)	{
		int leftPos = 0;
		int rightPos = numbers.length-1;
		int middlePos = 0;
		
		boolean numbernotfound = true;
		
		while (numbernotfound)	{
			if (rightPos < leftPos )
				return -1;
			
			//if (((rightPos-leftPos) % 2) == 0)
			//{
			//	middlePos = (rightPos-leftPos) / 2;
			//	System.out.println(middlePos);
			//}
			//else
			//{
			//	middlePos = leftPos + (((rightPos-leftPos) - 1) / 2);
			//	System.out.println(middlePos);
			//}
			middlePos = (rightPos + leftPos) /2;
			//find the number
			if (numbers[middlePos] == numberToFind)	{
				numbernotfound = false;
				return middlePos;
			}
			else if (numbers[middlePos] > numberToFind)	{
				//laarger, number is at left
				rightPos = middlePos - 1 ;
			
			}
			else if (numbers[middlePos] < numberToFind)	{
				//if smaller, the number should be on the right side
				//move leftPos to middlePos
				leftPos = middlePos + 1;
			} 
			
		}
		return 0;
	}
}
	

	



