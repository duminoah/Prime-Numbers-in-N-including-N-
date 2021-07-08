public class Main {
  
  public static boolean IsNumberAPrime(int number){
     if(number==0 || number==1)
        return false;

     for (int index = 1 ; index < number ; index ++){
         if (index != 1 && index != number && number % index == 0 )
            return false;
     }
     return 
        true ;
  }  
  
  public static void main(String[] args) {
    
    int enteredNum = Integer.parseInt( args[0]);   
    int totDivisibleBY=0 ;
    for(int count =1 ; count <= enteredNum; count++ )
    {
        if (IsNumberAPrime(count))
            totDivisibleBY++;        
    }
    System.out.println( totDivisibleBY + " prime number(s) in " + enteredNum + ", inclusive" );
  }

}
