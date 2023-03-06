import java.util.Scanner;

public class EstructurasControl {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
       
       int numeroa;
       numeroa = (int)(Math.random()*10)+1; 

       int intento = 0;
       int ntento = 0;
       int mtento = 4;

       boolean adivinado = false;
       boolean quedanintentos = true;

       while(!adivinado && quedanintentos) {
        ntento = (ntento + 1);
        System.out.println("Adivina [" + numeroa + "] intento: " + ntento);
        intento = entrada.nextInt();
        if (intento == numeroa) {
            System.out.println("has adivinado!");
            adivinado = true;
        }
        if (ntento > mtento){
        quedanintentos = false;
        }

       }
     entrada.close(); 
    }

}
