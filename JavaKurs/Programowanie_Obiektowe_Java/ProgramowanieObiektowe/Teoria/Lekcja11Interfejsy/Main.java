package Teoria.Lekcja11Interfejsy;

import java.util.Arrays;
import java.util.Collections;


// interfejs narzuca klasie zachowania a także definiuje stałe wartości
public class Main {
    
    public static void main(String[] args) 
    {

        System.out.println(nazwaInterfejsu.PI);
        
        int[] tab = new int[3];
        
        tab[0] = 3;
        tab[1] = -5;
        tab[2] = 13;
                
        Arrays.sort(tab);
        
        Pracownik[] pracownik = new Pracownik[3];
        pracownik[0] = new Pracownik(10000);
        pracownik[1] = new Pracownik(1000);
        pracownik[2] = new Pracownik(5000);
       
        System.out.println("Przed sortowaniu: ");
        for (Pracownik p: pracownik)
        {
            System.out.println(p.getWynagrodzenie());
        }
     
       
        
        System.out.println(pracownik[0].compareTo(pracownik[1]));
        
        
        Arrays.sort(pracownik, Collections.reverseOrder());
        
        System.out.println("Po sortowaniu: ");
        for (Pracownik p: pracownik)
        {
            System.out.println(p.getWynagrodzenie());
        }        
           
        
    }
}



interface nazwaInterfejsu
{
    double PI = 3.14; //public static final
    
    void cos(); //public abstract
}
interface cosik
{
    
}

class Pracownik implements nazwaInterfejsu, cosik, Comparable
{

    @Override
    public void cos() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Pracownik(double wynagrodzenie)
    {
        this.wynagrodzenie = wynagrodzenie;
    }
    public double getWynagrodzenie()
    {   
        return this.wynagrodzenie;
    }
        
    private double wynagrodzenie;

    @Override
    public int compareTo(Object t) 
    {
       Pracownik przyslany = (Pracownik)t;
        
       if (this.wynagrodzenie < przyslany.wynagrodzenie)
        return -1;
       
       
       if (this.wynagrodzenie > przyslany.wynagrodzenie)  
        return 1;
       
       return 0;
    }

    
}
