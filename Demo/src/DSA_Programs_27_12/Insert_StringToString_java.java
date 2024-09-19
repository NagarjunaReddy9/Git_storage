package DSA_Programs_27_12;

public class Insert_StringToString_java {
	public static void main(String[] args) {
		String originalString = "Hello";
		
		String stringToInsert = "Java ";
		
		int indexToInsert=7;

		StringBuilder ojas= new StringBuilder(originalString);

		ojas.insert(indexToInsert, stringToInsert);

		String resultString = 	ojas.toString();

		System.out.println("Original String: " + originalString);
		
		System.out.println("String to Insert: " + stringToInsert);
		
		System.out.println("Result String: " + resultString);
	}

}
