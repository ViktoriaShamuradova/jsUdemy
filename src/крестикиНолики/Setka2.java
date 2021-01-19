package крестикиНолики;

public class Setka2 {
    public static void main(String[] args) {
        int rows=6;
        int columns =8;

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns*2-1; j++){
                if(i!=rows-1) {
                    System.out.print(j % 2 == 0 ? "_" : "|");
                }else{
                    System.out.print(j % 2 == 0 ? " " : "|");
                }
                //System.out.print(i!=rows-1 ? (j % 2 == 0 ? "_" : "|"): (j % 2 == 0 ? " " : "|"));
            }

            System.out.println();
        }
    }
}
