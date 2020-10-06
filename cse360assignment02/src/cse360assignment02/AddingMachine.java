package cse360assignment02;

public class AddingMachine {
	//Define private variables
	private int total;
	private String pastTransc= "0"; 

	  
	  public AddingMachine () {
		//Initiate total
	    total = 0;  // not needed - included for clarity
	    
	    
	  }
	  
	  //Get total value
	  public int getTotal () {
	    return total;
	    
	  }
	  
	  //Add method
	  public void add (int value) {
		  //add value to the total
		  total += value;
		  
		  //add string value to pastTransc
		  pastTransc += (" + " + value)  ;
		  
	  }

	  //Subtract method
	  public void subtract (int value) {
		  //subtract value to the total
		  total -= value;
		  
		  //add subtract string value to pastTransc
		  pastTransc += (" - " + value);
		  
	  }

	  //String method
	  public String toString() {
		  //returns the pastTransc
		  return pastTransc;
	    
	  }

	  public void clear() { 	  
		 
	  }
	  
	  
	  public static void main(String args[]) {
		  //create a new object AddingMachine
			AddingMachine MyCalculator = new AddingMachine();
			
			//operations
			MyCalculator.add(4);
			MyCalculator.subtract(2);
			MyCalculator.add(5);
			
			//Print out the string value and the total
			System.out.println(MyCalculator.toString());
			System.out.println("Total: " + MyCalculator.getTotal());
			

			

			
			
			
	  }
	  
}



