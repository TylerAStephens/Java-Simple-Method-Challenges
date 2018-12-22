public class BarkingDog {

    public static void main(String[] args) {
        boolean dog = bark(false, -5);
        System.out.println(dog);
    } // Test

    public static boolean bark(boolean barking, int hourOfDay) {

        if(barking == false){
            return false;
        } else if(hourOfDay > 23 || hourOfDay < 0){
            return false;
        } else if(hourOfDay > 22 || hourOfDay < 8){
            return true;
        } else {
            return false;
        }
    }

}
