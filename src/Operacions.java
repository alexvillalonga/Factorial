public class Operacions {
    public static double factorial_iterativo(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else {
            int aux = 1;
            for(int i = 1; i <= n; i++){
                aux *= i;
            }
            return aux;
        }
    }
}

