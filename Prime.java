public class Prime{


    public static int countFactors(int n){
        int f = 0;
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                f++;
            }
        }
        return f;
    }



public static boolean isPrime(int n){
    boolean v = true;
    if(countFactors(n) > 2){
        v = false;
    }
    return v;
}





public static void countPrimes(int n){
    for(int i = 2; i <= n; i++){
        if(isPrime(i) == true){
            System.out.println(i);
        }
    }
}
    public static void main(String[] args){
        int number = 100;
        countPrimes(number);
    }
    
}