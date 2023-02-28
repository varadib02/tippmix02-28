/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package feb;

import java.nio.charset.Charset;
import java.time.temporal.TemporalAdjusters;
import java.util.Random;
import java.util.Scanner;

public class sportfogadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        int hossz=10;
        String szavak = "ABCDEFGHIJKLMNOPKRSTVZXY";
        Integer sorSzam=1244;
        String [][] merkozesAdatbazis = new String[hossz][3];
        Random r = new Random();
        for (int i = 0; i < merkozesAdatbazis.length; i++) {
                sorSzam++; 
                merkozesAdatbazis[i][0]=Integer.toString(sorSzam);
               
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < 5; j++) {
                int index = r.nextInt(szavak.length());
                char randomSzo=szavak.charAt(index);
                sb.append(randomSzo);
                }
                
                merkozesAdatbazis[i][1]=sb.toString();
                sb.delete(0, 10);
                int index = r.nextInt(szavak.length());
                char randomSzo=szavak.charAt(index);
                sb.append(randomSzo);
                merkozesAdatbazis[i][2]=sb.toString();
                System.out.println(merkozesAdatbazis[i][0]+". "+merkozesAdatbazis[i][1]+", "+merkozesAdatbazis[i][2]);
           
        }
        
        
    }
    
}
