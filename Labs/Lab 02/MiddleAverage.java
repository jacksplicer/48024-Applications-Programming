public class MiddleAverage {
	public static void main(String[] args) {
		// write your solution here

		int val = 0;
		int count = 0;
		int sum = 0;
		int total = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		
		//read loop
		while (val != -1) {
		    
		    //read 
		    System.out.print("Value: ");
		    val = In.nextInt();
		    //end of read
		    
		    if (val != -1) {
		        ++count;
		        sum = sum + val;
		        
		        //max
		        if(val > max) {
		            max = val;
		        }
		        //end of max
		        
		        //min
		        if(val < min) {
		            min = val;
		        }
		        //end of min
		    }
		}
		//end of read loop
		
		//count
		if(count >= 3) {
		    //output
		    System.out.println("Middle average = "  + (double) (sum - (min + max)) / (count - 2));
		}
		//end of count
	}
}
