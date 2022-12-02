public class Ejercicio2 {
    public static void main(String[] args) throws Exception {

        String tiempo;
        int temperatura;

        tiempo = "noche";
        temperatura = 25;

        if (tiempo == "noche") {

            if (temperatura >= 26) {
                System.out.println("Es un dia caluroso");


            } else if (temperatura >= 22 && temperatura <= 25) {
                System.out.println("Es un dia calido");


            } else if (temperatura >= 17 && temperatura <= 21) {
                System.out.println("Es un dia frio");


            } else {
                System.out.println("La temperatura no coincide");
            }

        } else {
            System.out.println("Es de dia");

        }
    }
}