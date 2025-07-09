public class LogischeOperatoren {
    public static void main(String[] args){

    int temperatur = 23;

        // Logische operatoren

        // && (und) Operator
        if(temperatur >20 && temperatur < 30){
            System.out.println("Die Temperatur ist angenehm!");
        } else {
            System.out.println("Die Temperatur ist NICHT angenehm!");
        }

        // || (oder) Operator
        if(temperatur <20 && temperatur > 30){
            System.out.println("Die Temperatur ist NICHT angenehm!");
        } else {
            System.out.println("Die Temperatur ist  angenehm!");
        }


        // Esxcclusive OR ^
        boolean jan_gewonnen = false;
        boolean tim_gewonnen = false;

        if(jan_gewonnen ^ tim_gewonnen){
            System.out.println("Alles gut!");
        } else {
            System.out.println("hier stimmt was nicht...");
        }







    }
}
