public class LeapYear {

    public static void main(String[] args) {
        boolean year = isLeapYear(-1600);
        System.out.println(year);

        year = isLeapYear(1600);
        System.out.println(year);

        year = isLeapYear(2017);
        System.out.println(year);

        year = isLeapYear(2000);
        System.out.println(year);
    }


    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999){
            return false;
        } else if(year >= 1 && year <= 9999 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 )) {
            return true;
        }
        return false;
    }
}
