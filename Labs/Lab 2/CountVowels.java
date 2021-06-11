public class CountVowels {
	public static void main(String[] args) {
		// write your solution here

		int count = 0;
		
		//read
		System.out.print("Character: ");
		char c = In.nextChar();
		//end of read
		
		//read loop
		while(c !='.') { 
		    System.out.print("Character: ");
		    c = In.nextChar();
		    
		    //count
		    if(c == 'a' || c =='e' || c == 'i' || c == 'o' || c == 'u') {
		        count = ++count;
		    }
		    //end of count
		}
		//end of read loop
		
		//output
		System.out.println("Vowel count = "  + count);
	}
}
