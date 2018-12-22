public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2050);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int MB = kiloBytes / 1024;
        int ZZ = kiloBytes % 1024;
        int XX = kiloBytes;
        int YY = MB;

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(XX + " KB = " + YY + " MB and " + ZZ + " KB remaining.");
        }

    }
}

