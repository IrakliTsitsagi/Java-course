public class ForLoopKide {
    public static void main(String[] args) {
int count = 0;
for(int i=10; i<50; i++){
    if(isPrime(i)){
        count++;
        System.out.println("number " +i + " is a prime number");
        if(count == 3){
            System.out.println("exiting for loop");
            break;
        }
    }
}
    }
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i<= n/2; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

}
