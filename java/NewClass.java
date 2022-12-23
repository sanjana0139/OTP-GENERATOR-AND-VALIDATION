package javaproject;
import java.util.*; 
  
public class NewClass 
{ 
     private static char[] OTP(int len) 
    { 
         
        String numbers = "0123456789"; 
        Random rndm_method = new Random(); 
          char[] otp = new char[len]; 
        for (int i = 0; i < len; i++) 
        { 
            otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length())); 
        } 
        System.out.println(otp);
        return otp; 
    } 
    public static char[] saved(){
        return OTP(6);
    }
    
}
