public class Homework2 {
    public static void main(String[] args) {
        int dec = 637;
        int a1 = dec%16;
        int dec1 = dec/16;
        int a2 = dec1%16;
        int dec2 = dec1/16;

        System.out.print(dec2);
        System.out.print(a2);
        System.out.print(a1);
        int b1 = dec2 * (16 * 16);
        int b2 = a2 * 16;
        int z = 16;
        System.out.println();
        System.out.println(z);

        int x = 637;
        Integer.toHexString(x);

    }
}
