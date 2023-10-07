package com.java.class35;

import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;

public class ToStringMethod {

    //The toString() method of java.security.Provider class is used to return a string with the name and the version number of this provider.
    //
    //Syntax:
    //
    //public String toString()
    //Return Value: This method returns the string with the name and the version number for this provider.
    //
    //Below are the examples to illustrate the toString() method:

    public static void main(String[] argv) throws Exception
    {

        try {
            // creating the object of  KeyPairGenerator
            KeyPairGenerator sr = KeyPairGenerator.getInstance("DSA", "SUN");

            // getting the Provider of the KeyPairGenerator sr
            // by using method getProvider()
            Provider provider = sr.getProvider();

            // getting the name and version of the provider
            // using toString() method
            String nv = provider.toString();

            // printing the string info
            System.out.println("Provider : " + nv);
        }

        catch (NoSuchAlgorithmException e) {

            System.out.println("Exception thrown : " + e);
        }
        //Example 2
        //             try {
        //            // creating the object of  SecureRandom
        //            SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
        //
        //            // getting the Provider of the SecureRandom sr
        //            // by using method getProvider()
        //            Provider provider = sr.getProvider();
        //
        //            // getting the name and version of the provider
        //            // using toString() method
        //            String nv = provider.toString();
        //
        //            // printing the string info
        //            System.out.println("Provider : " + nv);
        //        }
        //
        //        catch (NoSuchAlgorithmException e) {
        //
        //            System.out.println("Exception thrown : " + e);
        //        }
        //    }
    }
}
//Output:
//Provider : SUN version 1.8


