package javaproject;
import java.util.*; 
  
public class Main 
{ 
    public static void main(String[] args) {
        NewClass checker = new NewClass();
        char[] var = checker.saved();
        String val = String.copyValueOf(var);
        System.out.println(val);

  
   /*Scanner s = new Scanner(System.in);
   char[] a = s.next().toCharArray();
   int flag=0;
    for(int i=0;i<6;i++){
        if (var[i] != a[i]){
            flag=1;
        }
    }
    
   if (flag==0){
       System.out.println("OTP is correct");
   }
   else{
       System.out.println("OTP is not correct");
   }*/
  
    
    }
   
}