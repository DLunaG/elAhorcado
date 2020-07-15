import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Generación del juego
        String[] palabras = {"hola", "adios", "patata", "mundo", "ordenador"};
        Random random = new Random();
        int select = random.nextInt(palabras.length);
        char[] palabraElegida = palabras[select].toCharArray();
        char[] espacios = new char[palabraElegida.length];

        System.out.println("La palabra que tienes que adivinar tiene " + espacios.length + " letras y es: ");
        for (int i = 0; i < espacios.length; i++) {
            espacios[i] = '_';
            System.out.print(espacios[i]);
        }
        System.out.println();

        char letra;
        int lifes = 10;
        Scanner sc = new Scanner(System.in);
        boolean marcador;
        byte comprobacion = 0;

        //Juego en sí
        while(lifes > 0){
            marcador = false;
            comprobacion = 0;
            System.out.println("Elige una letra: ");
            letra = sc.nextLine().charAt(0);
            for (int i = 0; i < palabraElegida.length ; i++) {
                if(palabraElegida[i] == letra){
                    espacios[i] = palabraElegida[i];
                    marcador = true;
                }
            }
            if(!marcador){
                lifes--;
            }
            for (int i = 0; i < espacios.length ; i++) {
                System.out.print(espacios[i]);
            }
            System.out.print("   vidas: " + lifes);
            System.out.println();
            for(int i = 0; i < espacios.length; i++){
                if(espacios[i] == '_'){
                    comprobacion++;
                }
            }
            if(comprobacion == 0){
                break;
            }
        }
        if(comprobacion == 0){
            System.out.println("Puto amo!");
        }else{
            System.out.println("Has perdido pringado");
        }
    }
}
