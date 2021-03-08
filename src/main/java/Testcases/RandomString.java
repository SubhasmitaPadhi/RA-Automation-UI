package Testcases;
import java.util.*; 
import java.nio.charset.*; 
  
class RandomString { 
  
    static String getAlphaNumericString() 
    { 
    	int n=6;
        // length is bounded by 256 Character 
        byte[] array = new byte[256]; 
        new Random().nextBytes(array); 
  
        String randomString 
            = new String(array, Charset.forName("UTF-8")); 
  
        // Create a StringBuffer to store the result 
        StringBuffer random_value = new StringBuffer(); 
  
        // Append first 20 alphanumeric characters 
        // from the generated random String into the result 
        for (int k = 0; k < randomString.length(); k++) { 
  
            char ch = randomString.charAt(k); 
  
            if (((ch >= 'a' && ch <= 'z') 
                 || (ch >= 'A' && ch <= 'Z') 
                 || (ch >= '0' && ch <= '9')) 
                && (n > 0)) { 
  
            	random_value.append(ch); 
                n--; 
            } 
        } 
  
        // return the resultant string 
        return random_value.toString(); 
    } 
  
    public static void main(String[] args) 
    { 
        // size of random alphanumeric string 
        //int n = 6; 
  
        // Get and display the alphanumeric string 
        System.out.println(getAlphaNumericString()); 
    } 
} 
