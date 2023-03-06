
public class SimulacionParcial {
    public static void main(String args[]){
        int tiempoTotal = 1 * 60;
        int cola = 0;
        int caja1 = 1;
        for (int min =1; min <= tiempoTotal; min= min + 1) {
            System.out.println("min " + min );
            caja1 = caja1 -1;
            double probabilidadLlegada = Math.random();
            if (probabilidadLlegada<=0.4) {
                System.out.println("> pues ha llegao alguien");
                cola = cola + 1;
                if (caja1<=0 && cola>0){
                    cola= cola - 1;
                    caja1 = (int)(Math.random()*11)+5;
                    System.out.println("> Pasa una persona a caja 1 con "+ caja1 + " items");
                } 
            System.out.println("> hay " + cola + " personas en cola");
            System.out.println("hay "+ caja1 +" items en la caja 1");
            }
           
           
        }
        

    }
}

