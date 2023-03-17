import java.util.Scanner;

public class Zadanie10 {

    public static void main(String[] args) {

        System.out.print("Podaj swoje pierwsze imię: ");
        Scanner database = new Scanner(System.in);
        String firstName = database.nextLine();

        System.out.print("Podaj swoje drugie imię: ");
        String middleName = database.nextLine();

        System.out.print("Podaj swoje naziwkso: ");
        String lastName = database.nextLine();

        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.println("Twoje imię to: " + firstName );
        System.out.println("Twoje drugie imię to: " + middleName );
        System.out.println("Twoje nazwisko to:  " + lastName);

        System.out.println("Inicjał Twojego piewszego imienia to: " + firstInitial);
        System.out.println("Inicjał Twojego drugiego imienia to: " + middleInitial);
        System.out.println("Initial Twojego nazwiska to: " +lastInitial);






    }

}
