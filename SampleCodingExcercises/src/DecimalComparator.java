public class DecimalComparator {

    public static void main(String[] args) {

        boolean numberCheck = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(numberCheck);

        numberCheck = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(numberCheck);

        numberCheck = areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(numberCheck);
    }


    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        firstNumber = firstNumber * 1000;
        secondNumber = secondNumber * 1000;

        if((int) (firstNumber) == (int) (secondNumber)){
            return true;
        } else {
            return false;
        }
    }
}
