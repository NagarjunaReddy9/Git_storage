package PageObjects;



public class RetrieveAttributeValue {

	public static void main(String[] args) {
	  String s= "i am nagrjuna" ;
	  int cons=0;
	  int vowels=0;
	  for(int i=0;i<s.length();i++) {
		
		 char ch= s.charAt(i);
		  if(Character.isLetter(ch)) {
			  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				cons++;
				  
			  }else {
				  vowels++;
				  
			  }
			  
		  }
	  }
	  
	System.out.println(cons+"  "+vowels);
	
	
	}
}