package autoBoxing_UnBoxing;

public class AutoBoxing_UnBoxing {

	public static void main(String[] args) {
		
		int number = 40;
		
		Integer number1 = number;   // AutoBoxing hapens
		
		
		Integer number2 = 6;  // Boxing 
		System.out.println(number1 + " " + number2);
         System.out.println();
         
         Integer value = 60;
         int n = value;            // this is unboxing
         System.out.println(n);
         
         Integer num = 79;
         if(value < 90) {
        	 System.out.println(num);
         }
        
	}

}
