import java.util.*;



public class Main {
  
  public static class SiddharthPackage{
  private int total = 0;
  private List<Integer> duplicate = new ArrayList<>();
  
  SiddharthPackage(List<Object> li){
    
    int temp = 0 ;
    for (Object i : li){
      boolean yeah = false; 
     for(int j = 0; j < duplicate.size();j++){
       if( this.duplicate.get(j) == (int)i){
         yeah = true;
       }
     }
     if(yeah == true){
       continue;
     }
      this.duplicate.add((int)i);
      
      temp += (int)i;
    }
    this.total = temp;
    
  }
  
  public int getter(){
    return this.total;
  }
  
  public List<Integer> uniqueListGetter(){
    return this.duplicate;
  }
}

    public static void main(String[] args) {
     List<Object> list = new ArrayList<>();
     for(int i = 50 ; i<65;i++){
     
       list.add(i);
       
     }
     
     
     list.add(50);
    // list.set(3,80);
   
    
    SiddharthPackage s = new SiddharthPackage(list);
    List<Integer> newList = s.uniqueListGetter();
    
    for(Integer element : newList){
      System.out.println(element);
    }
    
    System.out.println("The total is "+s.getter());
     //System.out.println("Index of 52 is "+list.indexOf(52));
  }
}
