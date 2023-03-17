import java.util.Scanner;

public class Zadanie8 {

    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Podaj wymiary pokoi.");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Pokój pierwszy: ");



        Scanner data_download = new Scanner(System.in);

       System.out.print("długość: ");
       int lenght1 = data_download.nextInt();
       data_download.nextLine();
        System.out.print("szerokość: ");
        int width1 = data_download.nextInt();
        data_download.nextLine();

        System.out.println("Pokój drugi: ");
        System.out.print("długość: ");
        int lenght2 = data_download.nextInt();
        data_download.nextLine();
        System.out.print("szerokość: ");
        int width2 = data_download.nextInt();
        data_download.nextLine();

        System.out.println("Pokój trzeci: ");
        System.out.print("długość: ");
        int lenght3 = data_download.nextInt();
        data_download.nextLine();
        System.out.print("szerokość: ");
        int width3 = data_download.nextInt();
        data_download.nextLine();

        System.out.println("Pokój czwarty: ");
        System.out.print("długość: ");
        int lenght4 = data_download.nextInt();
        data_download.nextLine();
        System.out.print("szerokość: ");
        int width4 = data_download.nextInt();
        data_download.nextLine();
        System.out.println();

        int room1 = lenght1 * width1;
        int room2 = lenght2 * width2;
        int room3 = lenght3 * width3;
        int room4 = lenght4 * width4;

        System.out.println("Pokój pierwszy ma powierzchnię: " + room1 + "m^2");
        System.out.println("Pokój drugi ma powierzchnię: " + room2 + "m^2");
        System.out.println("Pokój trzeci ma powierzchnię: " + room3 + "m^2");
        System.out.println("Pokój czwarty ma powierzchnię " + room4 + "m^2");

        double flat = room1 + room2 + room3 + room4;

        System.out.println("Powierzchnia całego mieszkania wynosi: " + flat + "m^2");

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Podaj liczbę osób przypadających na mieszkanie: ");
        int inhabitant = data_download.nextInt();
        data_download.nextLine();

        System.out.println("Na jednego mieszkańca przypada: " + flat/inhabitant + "m^2" );

    }

}
