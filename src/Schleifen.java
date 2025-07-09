import java.util.Scanner;

public class Schleifen {
    public static void main(String[] args){

        int number = 5;
        int hausnummer = 36;
        int schuhgroesse = 45;
        int Koerpergroesse = 180;
        int alter;
        int temperatur = 23;


        if (number == 5){
            System.out.println("Number ist gleich 5");
        } else {
            System.out.println("Number ist nicht gleich 5");
        }

        if(hausnummer < 35){
            System.out.println("hausnummer ist kleiner als 35");
        } else {
            System.out.println("Hausnummer ist nicht kleiner als 35");
        }

        Scanner myObj = new Scanner(System.in);
        System.out.println("Gib dein Alter ein: ");

        alter = myObj.nextInt();

        if(alter < 18){
            System.out.println("Du bist nicht volljährig");
        } else {
            System.out.println("Du bist volljährig");
        }







    }
}
