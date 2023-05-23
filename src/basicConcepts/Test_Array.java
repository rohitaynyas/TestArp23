package basicConcepts;

import java.util.Scanner;

public class Test_Array {
	
	int maxChar(String name , char ch) {
		int count=0;
		for(int index = 0; index<name.length();index++) {
			if(ch==name.charAt(index)) {
				count++;
				
			}
		}
		return count;
	}
      String maxOcurance(String[] name, char ch) {
    	  int max=0;
    	  String maxFre="";
    	  for(int index =0;index<name.length;index++) {
    		  String lowerCase = name[index].toLowerCase();
    		  int maxOccurance =maxChar(lowerCase,ch);
    		  if(max<maxOccurance) {
    			  max=max+maxOccurance;
    			  maxFre=name[index];
    			  
    			  
    		  }
    		  
    	  }
    	  return maxFre;
      }
      public static void main(String[] args) {
    	  
		Scanner scan = new Scanner(System.in);
		String name =scan.next();
		char ch =name.charAt(0);
		int value= scan.nextInt();
		String[] output = new String[value];
		for(int index=0;index<output.length;index++) {
			output[index]=scan.next();
			
		}
		
	}
}
