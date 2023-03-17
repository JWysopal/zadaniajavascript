import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        Scanner dane = new Scanner(System.in);

        System.out.print("Podaj imię i nazwisko: ");
        String nameandsurname = dane.nextLine();
        dane.nextLine();

        System.out.print("Podaj ulicę na której mieszkasz:");
        String street = dane.nextLine();
        System.out.print("numer domu:");
        int housenumber = dane.nextInt();
        System.out.print("numer mieszkania:");
        int flatnumber = dane.nextInt();
        dane.nextLine();


        System.out.print("nazwę miasta: ");
        String cityname = dane.nextLine();
        System.out.print("kod pocztowy: ");
        int postcode = dane.nextInt();
        int postcode2 = dane.nextInt();
        dane.nextLine();



        System.out.print("numer telefonu: ");
        int number = dane.nextInt();
        dane.nextLine();

        System.out.println("Twoje imię i nazwisko: " + nameandsurname + ","  + " ulica: " + street + "," +
                " Numer domu: " + housenumber + "," + " numer mieszkania: " + housenumber + "," +
                " nazwa miasta: " + cityname+ "," + " kod pocztowy: " + postcode +   "-" + postcode2 + "," + " numer telefonu: " + number  );







    }
}
