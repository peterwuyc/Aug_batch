public class PrimeSum {
    public static void main(String[] args) {
        int n = 100, sum = 0;
        int[] candidate = new int[n];

        for(int i = 2; i < n; i++){
            if(candidate[i] == 0){
                sum += i;
                if(i * i < n){
                    for(int j = i; i+j < n; j+=i){
                        candidate[i+j] = 1;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
