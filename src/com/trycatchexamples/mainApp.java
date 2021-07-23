package com.trycatchexamples;
import java.util.concurrent.TimeUnit;

public class mainApp {
    public static void main(String[] args) {
       
        int lopper= 0;
        //here comes the try catch methods.
        int exceptionCode= 0;

        //
        boolean retry=false; 
        int retryCounter=0;// for testing purpose.
        boolean sleep=false;
        do {
            try {
                if(sleep){
                    int sleepTime=10;
                    System.out.println("Sleeping for : " + sleepTime + " seconds");
                    TimeUnit.SECONDS.sleep(sleepTime);
                }
                for (int i = 0; i < 10; i++) {
                    // execting the my method.
                    exceptionCode = exceptionCode+1;
                AmaPrinterhere(lopper , exceptionCode);
                }
                
                
            } catch (Exception e) {
                System.out.println(" Printing the exepction value : "+ exceptionCode);
                System.out.println(e);

                if (retryCounter<5) {
                    sleep=true;
                    retryCounter= retryCounter+1;
                    retry=true;
                }
                else{
                    retry=false;
                }
                System.out.println("RETRY EXECUTED : COUNT" + retryCounter);
                
            }
    
        } while (retry);


    }

    private static void AmaPrinterhere(int lopper , int execptionCode) {

        if (execptionCode <5) {
            System.out.println("Am printing !!! "  );
        }
        else{
            NullPointerException nullPointerException = new NullPointerException();
        throw nullPointerException;
        }
        


        
        
    }



}
