public class Variables {
    public static void main(String[] args){
        //Variables are container for Values, Variables do have different types

        int number = 3;
        int number2 = 14;
        int sum = number + number2;

        System.out.println(sum);

        String text = "Das ist ein Text: ";

        System.out.println(text);

        System.out.println(text + number2);

        double Kommazahl = 14.0433;

        System.out.println(Kommazahl);

        boolean bool = false;

        if(Kommazahl < 15.00){
            bool = true;
        }

        System.out.println(bool);
    }
}
