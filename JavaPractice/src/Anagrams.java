
import java.util.*;
class Anagrams
{
    int c = 0;
     
    void input()throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String s = sc.next();
        System.out.println("The Anagrams are : ");
        display("",s);
        System.out.println("Total Number of Anagrams = "+c);
    }
   
    void display(String s1, String s2)
    {
        if(s2.length()<=1)
        {  
        	System.out.println(" ");
        	System.out.println("-> "+c);
            c++;
            System.out.println(s1+s2);
        }
        else
        {
            for(int i=0; i<s2.length(); i++)
            {
                String x = s2.substring(i, i+1);
                System.out.print(" Value of X: "+ x);
                String y = s2.substring(0, i);
                System.out.print(" Value of Y: "+ y);
                String z = s2.substring(i+1);
               System.out.print(" Value of Z: "+ z);
                display(s1+x, y+z);
                System.out.println("----");
            }
        }
    }
     
    public static void main(String args[])throws Exception
    {
        Anagrams ob=new Anagrams();
        ob.input();
    }
}