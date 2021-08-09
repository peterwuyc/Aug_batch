package CreatingClass;

import static java.lang.Math.sqrt;

public class PrimeNumSum {

    static boolean isPrimeNum( int x){
        boolean b=true;
        if(x==1){
            b=false;
        }
        for(int i=2; i <=sqrt(x); i++){
            if (x%i == 0 ) {
                b=false;
            }
        }
        return b;
    }

    public static void main(String []args){
        int sum=0;
        for(int i=1; i<101; i++){
            if (isPrimeNum(i)) {
                sum = sum+i;
                //System.out.println(i);
            }
        }
        System.out.print(sum);
    }

}



