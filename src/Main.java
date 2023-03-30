public class Main {
    public static void main(String[] args)
    {
        int operador1=3;
        int operador2=5;

        if (sumaNumeros(operador1, operador2)){
            System.out.println("El resultado es mayor que 0");
        }else{
            System.out.println("El resultado es menor que 0");
        }
    }

    public static boolean sumaNumeros (int _operador1, int _operador2){
        int resultado=_operador1+_operador2;
        if (resultado>=0){
            return true;
        }else{
            return false;
        }
    }
}