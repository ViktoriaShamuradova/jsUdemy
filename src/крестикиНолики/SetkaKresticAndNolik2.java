package крестикиНолики;

public class SetkaKresticAndNolik2 {
    public static void main(String[] args) {
        int size = 3;
        for (int i = 0; i < 3; i++) {
            char c = ' ';
            if (i > 0) {
                c = i == 1 ? '0' : 'x';
            }
            for(int j=0; j<size;j++){
                for(int k=0; k<size; k++){
                    System.out.print(" "+c);
                    if(k!=size-1){
                        System.out.print(" |");
                    }
                }
                System.out.println();
                if(j!=size-1){
                    for(int k=0; k<size; k++){
                        System.out.print("---");
                        if(k!=size-1){
                            System.out.print("-");
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
