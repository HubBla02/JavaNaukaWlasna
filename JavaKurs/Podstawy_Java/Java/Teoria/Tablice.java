package Java.Teoria;

public class Tablice {
    public static void main(String[] args) {
        int[] tab = new int [3];
        tab[0] = 1;
        tab[2] = 20;
        System.out.println(tab[0]);
        int[] tab2 = {1, 2, 1, 3, 7};
        System.out.println(tab2.length);
        System.out.println(tab2[tab2.length-1]);
        int[][] tab3 = new int [3][3];
        // najpierw wiersze, potem kolumny
        tab3[0][2] = 21;
        System.out.println(tab3[0][2]);
        int[][] tab4 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        System.out.println(tab4[3][2]);
    }
}
