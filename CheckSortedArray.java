public static boolean isSorted(int[] a) 
{
    int i,count=0;
    for(i = 0; i < a.length-1; i++);{
        if (a[i] < a[i+1]) {
            count=count+1;
        }  
        }
    if(count==a.length-1)
        return true;
    else
        return false;
}
public static void main(String[] args)
{
    int ar[] = {3,5,6,7};
    System.out.println(isSorted(ar));   
}

