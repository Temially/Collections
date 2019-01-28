/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.*;
/**
 *
 * @author Alebiosu Sunday
 */
public class Collections {
   
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        //adding elements into hashmap
       hm.put(1, "Temi");
       hm.put(10, "Ola");
       hm.put(2, "Tosin");
       hm.put(12, "Tola");
       hm.put(5, "Ife");
        
       //getting the size of the content in the hashmap
       hm.size();
       System.out.println("The size of the hashmap contents are " + hm.size());
       
       //iterating through the hashmap...displaying content using iterator
       Set set=hm.entrySet();
       Iterator iterator=set.iterator();
       while(iterator.hasNext())
       {
           Map.Entry metry=(Map.Entry)iterator.next();
           System.out.print("key is: "+metry.getKey() + " & Value is:");
           System.out.println(metry.getValue());
       }
        // TODO code application logic here
    }
    
}
