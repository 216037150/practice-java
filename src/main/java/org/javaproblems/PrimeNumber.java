package org.javaproblems;

public class PrimeNumber {
    public static void main(String[] args) {
     boolean result = isPrime(3);

     System.out.println(result);
    }

    public static boolean isPrime(int num){
        for(int i = 2; i<=num/2; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
