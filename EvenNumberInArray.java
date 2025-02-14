mport java.util. *;
public class Main
{
	public static void main(String[] args) {
	
	
	int[] array = new int[100];
	int number = 201;
	for (int index = 0; index < 100; index++){
	    number = number-1;
	    array[index] = number;
	}
	
		for(int numbers : array){
		    if (numbers %2 != 0){
		        System.out.println(numbers);
		        
		    }
		    
		} 
		
		for(int number1 = 0 ; number1 < 100 ; number1++){
		   // System.out.print(array[number1]+",");
		}
	
	
	}
}
