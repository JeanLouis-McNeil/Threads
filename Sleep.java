/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Owner
 */
public class Sleep {
        public static void main(String args[])
        throws InterruptedException {
        String importantInfo[] = {
            "You've wait for 4 seconds",
            "You've waited for another 4 seconds",
            "Now going into 12 seconds",
            "That is a total of 16 seconds..."
        };
        // A loop that shows a sentence each 4 seconds
        for (int i = 0;
             i < importantInfo.length;
             i++) {
            //Pause for 4 seconds
            Thread.sleep(4000);
            //Print a message
            System.out.println(importantInfo[i]);
        }
    }
}
