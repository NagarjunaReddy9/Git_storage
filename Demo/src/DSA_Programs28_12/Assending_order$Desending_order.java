package DSA_Programs28_12;

import java.util.Arrays;

public class Assending_order$Desending_order {
	public static void main(String[] args) {
		 int[] array = {1,4,6,7,8,8,8,3,1,9,0,2,4,4,3,5,5,8,9,0,2,3};

	        Arrays.sort(array);
	        System.out.println("Ascending Order: " + Arrays.toString(array));

	        Arrays.sort(array);
	        int n = array.length;
	        for (int i = 0; i < array.length; i++) {
	            int temp = array[i];
	            array[i] = array[n - i - 1];
	            array[n - i - 1] = temp;
	        }
	        System.out.println("Descending Order: " + Arrays.toString(array));
	    }

	
	}


