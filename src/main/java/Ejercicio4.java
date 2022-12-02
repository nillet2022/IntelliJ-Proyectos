public class Ejercicio4 {
    public static void main(String[] args) {
        int inicio;
        boolean x;

        inicio=0;
        x=true;
        while (!x){
            inicio++;
            if (inicio==100){
                x=true;
            }
            else{
                x=false;
            }
        }
        System.out.println("El valor actual con WHILE es: "+inicio);
        //////////////////////////////////////
        inicio=0;
        x=true;
        do {
            inicio++;
            if (inicio==100){
                x=true;
            }else{
                x=false;
            }
        } while (!x);
        System.out.println("El valor actual con DO WHILE es: "+inicio);
    }
}
