public class exercise8 {
    
    public static void main(String[] args) {

        int heightInInches = 8;
        int heightInFoot = 5;
        
        double data = convertToCentimeter(68);
        double data2 = convertToCentimeter(heightInFoot, heightInInches);

        System.out.println(data);
        System.out.println(data2);
    }

    public static double convertToCentimeter(int heightInInches) {
        double inCM = heightInInches * 2.54;

        return inCM;
    }
    
    public static double convertToCentimeter(int heightInFoot, int heightInInches) {
       
        int conversion = (heightInFoot * 12) + heightInInches;

        double inCm = convertToCentimeter(conversion);

        return inCm;
    }
}
