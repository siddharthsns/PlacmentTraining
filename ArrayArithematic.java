public class Main
{
    static int[] a = {30,9,3,4,5,6,7,8,9,30};
    
    public static int[] calculate(){
        int addition = a[0], multiplication = a[0];
        for(int i = 1 ; i< 10;i++){
            addition += a[i];
            multiplication *= a[i];
        }
        int[] values = {addition,multiplication};
        return values;
    }
	public static void main(String[] args) {
	   
	   int[] total = calculate();
	   
	   System.out.println(total[0]);
	   
	System.out.println(total[1]);
     
	}
}
