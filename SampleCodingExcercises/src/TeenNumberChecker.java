public class TeenNumberChecker {

    public static void main(String[] args) {
        boolean groupHasTeen = hasTeen(9, 99, 19);
        System.out.println(groupHasTeen);

        groupHasTeen = hasTeen(23, 15, 42);
        System.out.println(groupHasTeen);

        groupHasTeen = hasTeen(22, 23, 34);
        System.out.println(groupHasTeen);
    }

    public static boolean hasTeen(int x, int y, int z) {
        if((x >= 13 && x <= 19) || (y >= 13 && y <= 19) || (z >= 13 && z <= 19)) {
            return true;
        } else {
            return false;
        }
    }
}
