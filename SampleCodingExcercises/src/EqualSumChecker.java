public class EqualSumChecker {

    public static void main(String[] args) {
        boolean sumAnswer = hasEqualSum(1, 1,1);
        System.out.println(sumAnswer);

        sumAnswer = hasEqualSum(1, 1, 2);
        System.out.println(sumAnswer);

        sumAnswer = hasEqualSum(1, -1, 0);
        System.out.println(sumAnswer);
    }


    public static boolean hasEqualSum(int a, int b, int c){
        if((a + b) == c ){
            return true;
        } else {
            return false;
        }
    }
}
