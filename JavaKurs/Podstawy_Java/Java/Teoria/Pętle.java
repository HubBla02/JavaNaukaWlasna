package Java.Teoria;

import com.sun.security.jgss.GSSUtil;

public class Pętle {
    public static void main(String[] args) {
        int i = 0;
        while (i < 7) {
            System.out.println(i);
            i++;
        }
        i = 0;
        do {
            System.out.println("sigma");
            i++;
        } while (i < 3);
        for(int a = 0; a < 3; a++){
            System.out.println("alfa");
        }
        String[] slowa = {"Alfabet", "Łaciński", "Morse'a"};
        for(String x : slowa){
            System.out.println(x);
        }
    }

}

