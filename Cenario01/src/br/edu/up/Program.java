package br.edu.up;

import br.edu.up.models.*;

public class Program {
    
    public static void main(String[] args) {
        
         
         Livro l1 = new Livro("1598FHK", "Core Java 2", new String[]{"Cay S. Horstmann", "Gary Cornell"}, "0130819336", 2005);
         Livro l2 = new Livro("9865PLO", "Java, Como programar", new String[]{"Harvey Deitel"}, "0130341517", 2015);
 
     
         System.out.println("Livro 01:");
         l1.info();
 
         System.out.println("Livro 02:");
         l2.info();
         
    }
}
