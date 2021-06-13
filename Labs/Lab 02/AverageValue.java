public class AverageValue {
	public static void main(String[] args) {
		// write your solution here
		
		int sum = 0;
		int count = 0;
		
		//read
		System.out.print("Value: ");
		int val = In.nextInt();
		//end of read
		
		//read loop
		while (val != -1) {
		    count = ++count; //count
		    sum += val;
		    System.out.print("Value: ");
		    val = In.nextInt();
		}
		//end of read loop
		
		//avarage (sum / count)
		double avg = (double)sum / (double)count;
		
		//count
		if(count >= 1) {
		    //output
		    System.out.println("Average = "  + avg);
		}
		//end of count
	}
}
