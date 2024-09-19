package DSA_Programs28_12;

import java.util.Arrays;

public class Arrays_Equals {
	public static void main(String[] args) {
		
		
	
	int[] array1 = {1, 2, 3, 4};
	int[] array2 = {1,  3, 4};

	boolean isEqual = Arrays.equals(array1, array2);

	if (isEqual) {
	    System.out.println("Arrays are equal");
	} else {
	    System.out.println("Arrays are not equal");
	}
  
	
  }

}