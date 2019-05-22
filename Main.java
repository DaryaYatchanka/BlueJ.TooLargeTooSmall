import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class Main here.
 *
 * @author (Darya Yatchanka)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    
    private int count = 0;
    private int previousNum = 0;
    
    
    

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
     
     Random rand = new Random();
     int n = rand.nextInt(10);
     n+=1;
     
     Scanner sc = new Scanner(System.in);
     int i = 0;
     do {
      
      i = sc.nextInt();

       //System.out.println(i);
       if(i<n){
           System.out.println("too small");
           if (previousNum!=i){
           count += 1;
           }
        }
        else if(i>n){
            System.out.println("too big");
            if (previousNum!=i){
            count +=1;
            }
        }
        else {
            System.out.println("correct guess");
            
            count +=1;
            
        }
       
       previousNum = i;
    }while (i!=n);
     System.out.println("it took you "+count+" guesses!");
   
    }
}
   