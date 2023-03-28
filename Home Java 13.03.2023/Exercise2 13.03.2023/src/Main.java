public class Main {
    public static void main(String[] args) {
        byte byte1 = 2;
        int int1 = 6;
        double double1 = 36.6;
        float float1 = 27.8F;

        int1 = byte1;
        System.out.println(int1);


        byte byte2 = 0;
        int int2 = 9600;
        byte2 = (byte) int2;
        System.out.println(byte2);


    }
}
