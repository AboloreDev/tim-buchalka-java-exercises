public class exercise4 {
    public static void main(String[] args) {
       int kilobytes = -2500;

       printMegaBytesAndKiloBytes(kilobytes);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int calculateMb = kiloBytes / 1024;
       int remainingMb = kiloBytes % 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            
       System.out.println(kiloBytes + " KB = " + calculateMb + " MB and " + remainingMb + " KB");
        }
    }
}
