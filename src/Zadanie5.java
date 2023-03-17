public class Zadanie5 {
    public static void main(String[] args) {

        int size1 = 3;
        int size2 = 4;
        int size3 = 2;

        int room1and2 = size1 * size2;
                        int room3 = size3 * size1;
                                int room4 =  size3 * size3;

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Powierzchnia pokoju pierwszego o długości " + size1 + "m na " + size2 + "m " +
                "wynosi: " + room1and2 +"m^2");

        System.out.println("Powierzchnia pokoju drugiego o długości " + size1 + "m na " + size2 + "m " +
                "wynosi: " + room1and2 +"m^2");

        System.out.println("Powierzchnia pokoju trzeciego o długości " + size3 + "m na " + size1 + "m wynosi: " +
                room3 +"m^2");

        System.out.println("Powierzchnia pokoju czwartego o długości " + size3 + "m na " + size3 + "m wynosi: " +
                room4 +"m^2");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Powierzchnia całkowita mieszkania to: " + (room1and2 + room1and2 + room3 + room4) + " m^2" );
        System.out.println("-----------------------------------------------------------------------------");


    }

}
