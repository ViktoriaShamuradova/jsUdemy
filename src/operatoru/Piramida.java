package operatoru;

public class Piramida {
    public static void main(String[] args) {
        int count = 8;
        for (int i = 0; i <= count; i++) {
            //5=2*2+1 3=3*2+1 4=4*2+1
            for (int k = 0; k < count - i; k++) {
                System.out.print("   ");
            }
            for (int g = 0; g < i * 2 + 1; g++) {
                System.out.print(" " + i + " ");
            }
            for (int k = 0; k < count - i; k++) {
                System.out.print("   ");
            }

            System.out.println();
        }
    }
}
