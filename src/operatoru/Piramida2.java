package operatoru;

public class Piramida2 {
    public static void main(String[] args) {
        int rows=20;
        for(int i=0; i<rows; i++){
            for(int j=0; j<rows-i-1; j++){
                System.out.print("   ");
            }
            for(int j=0; j<i*2+1; j++){
                System.out.print(" "+ i+" ");
            }
            System.out.println();
        }
    }
}
