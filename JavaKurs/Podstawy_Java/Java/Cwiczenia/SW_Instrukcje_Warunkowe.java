package Java.Cwiczenia;

public class SW_Instrukcje_Warunkowe {
    public static void main(String[] args){
        /*Zadanie
        Stwórz program, który sprawdzi, czy osoba w wieku 'wiek' może się uczyć, pracować, czy też może przejść na emeryturę.
        Oczekiwane wejście:
        Liczba całkowita reprezentująca wiek osoby. Utwórz zmienną o nazwie 'wiek' i ustaw ją na np. 25
        Oczekiwany wynik w konsoli:
        Napis, "Musisz się uczyć.", jeśli wiek jest mniejszy niż 15
        Napis, "Możesz pracować.", jeśli wiek jest większy lub równy 18 i mniejszy niż 65
        Napis, "Możesz iść na emeryturę.", jeśli wiek jest większy lub równy 65 */
        int wiek = 25;
        if (wiek < 15) System.out.println("Musisz się uczyć");
        else if (wiek >= 18 && wiek < 65) System.out.println("Musisz pracować");
        else if (wiek >= 65) System.out.println("Możesz iść na emerutyrę.");
        else System.out.println("Nie możesz iść na emeryturę.");
    }
}
