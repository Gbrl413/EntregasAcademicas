import java.util.Scanner;

public class practica {
    public static void main(String args[]){
    int NumU;
    int NumM;
    final int Limite_I = 0;
    final int Limite_S = 25;
    
    System.out.println("Piensa un numero entre ["+ Limite_I + " & " + Limite_S + "]");
    NumM = piensaUnNum(Limite_I, Limite_S);
    do { NumU = IntroduceNum("Adivina el numero ("+NumM+")");
        } while (!adivino(NumU, NumM));
    }

    static int piensaUnNum(int Limite_I, int Limite_S){
        return (int)(Math.random()*(Limite_S - Limite_I +1)+ Limite_I);
    }

    static int IntroduceNum(String pregunta){
        System.out.println(pregunta);
        Scanner entrada = new Scanner(System.in); 
        entrada.close();
        return entrada.nextInt();
    }

    static boolean adivino(int NumU, int NumM){
        if (NumU==NumM) {
            return true;
        }
        pista(NumM, NumU); 
        return false;    
     
    }

    static void pista(int NumM, int NumU){
        int distancia = Math.abs(NumM-NumU);
        if (distancia<=3){
            System.out.println("caliente");
        } else if (distancia<=10){
            System.out.println("tibio");
        } else {
            System.out.println("frio");
        }
    }
}