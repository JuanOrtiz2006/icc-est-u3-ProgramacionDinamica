import java.util.HashMap;
import java.util.Map;

public class EjerciciosPD {

    public int getFibonacci(int n){
        if(n<=1){
            return n;
        }
        return getFibonacci(n-1) + getFibonacci(n-2);
    }
    

    public int getFibonacciPD(int n){
        Map<Integer,Integer> caching = new HashMap<>();
        return getFibonacciPDHelper(n, caching);

    }

    public int getFibonacciPDHelper(int n, Map<Integer,Integer> cache){
        if (n<=1){
            return n;
        }
        if(cache.containsKey(n)){
            return cache.get(n);
        }
        int resultado = getFibonacci(n-1) + getFibonacci(n-2);
        cache.put(n, resultado);
        return resultado;
    }
}
