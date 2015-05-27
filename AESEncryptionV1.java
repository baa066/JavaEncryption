import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import java.util.Scanner;

public class Encryption {

    private void Encryptor(String text) {
      try {
         //String text = "This is a secret message";
         String key = "abcdefgh12345678"; // 128 bit key

         // Create key and cipher
         Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
         Cipher cipher = Cipher.getInstance("AES");

         // encrypt the text
         cipher.init(Cipher.ENCRYPT_MODE, aesKey);
         byte[] encrypted = cipher.doFinal(text.getBytes());
         System.err.println(new String(encrypted));
      	}
         catch(Exception e) {
             e.printStackTrace();
        }
}

     private void Decryptor(String text) {
       try {
    	  //String text = "This is a secret message";
          String key = "abcdefgh12345678"; // 128 bit key

          // Create key and cipher
          Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
          Cipher cipher = Cipher.getInstance("AES");
          
          byte[] encrypted = DatatypeConverter.parseHexBinary(text);
          
          // decrypt the text
          cipher.init(Cipher.DECRYPT_MODE, aesKey);
          String decrypted = new String(cipher.doFinal(encrypted));
          System.err.println(decrypted);
       	}
      catch(Exception e) {
         e.printStackTrace();
      }
}

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int choice;
       
       System.out.println("Would you like to: 1. Encrypt or 2. Decrypt?");
       choice = sc.nextInt();
      
       if (choice==1)
       {
    	   System.out.println("Please input text you wish to encrypt: ");
    	   String text = sc.next();
    		   Encryption app = new Encryption();
    		   app.Encryptor(text);
    	   
       }
       else
       {
    	   System.out.println("Please input encrypted text you wish to decrypt: ");
           String text = sc.next();
           Encryption app = new Encryption();
           app.Decryptor(text);
       }
    }
}
