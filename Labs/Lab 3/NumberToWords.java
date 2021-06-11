public class NumberToWords {
	public static void main(String[] args) {
		String[] onesNames =  {"", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ", "ten ", "eleven ", "twelve ", "thirteen ", "fourteen ", "fifthteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen "};
        String[] tensNames = {"", "", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety "}; 
                
        System.out.print("Number: "); 
        int num = In.nextInt();
        
        while(num != -1) {
            int ones = num % 10;
            int hundreds = num / 100;
            int otherDigits = num % 100;  
            int tens = otherDigits / 10;
            String numNames = "";
            
            if(num == 0) {
                numNames = "zero "; 
            }
            else if(num <= 19) {
                numNames = onesNames[num];
            }
            else if(num <= 99) {
                numNames = tensNames[tens] + onesNames[ones];
            }
            else if(num <= 999) {
                if(otherDigits == 00) {   
                    numNames = onesNames[hundreds] + "hundred ";
                }
                else if(otherDigits <= 19) {
                    numNames = onesNames[hundreds] + "hundred and " + onesNames[otherDigits];
                }
                else {
                    numNames = onesNames[hundreds] + "hundred and " + tensNames[tens] + onesNames[ones];
                }
            }
            System.out.println(numNames);
            System.out.print("Number: ");
            num = In.nextInt();
        }
        System.out.println("Done");
	}
}
