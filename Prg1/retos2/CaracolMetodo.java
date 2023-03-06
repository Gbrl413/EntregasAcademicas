public class CaracolMetodo{
    public static void main(String args[]){

        dibujaPozo();
    }

    public static void dibujaPozo(){
        final String Coche = "[__]    O-=-O     [__]";
        final String Borde = "[__]              [__]";
        final String CaracolBorde = "[__]    _@)_/’    [__]";
        final String Pared = "  []:. :. :. :. :.[]";
        final String Caracol = "  []    _@)_/’    []";
        final String Agua = "  []~~~~~~~~~~~~~~[]";
        final String Fondo = "  [][][][][][][][][]";

        System.out.println(Coche+Borde+CaracolBorde+Pared+Caracol+Agua+Fondo);
    }
}
