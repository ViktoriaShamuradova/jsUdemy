package крестикиНолики;

import java.util.Scanner;

public class Setka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество столбцов");
        int column = scanner.nextInt();
        System.out.println("Введите количество строк");
        int row=scanner.nextInt();

        System.out.println(column);
        System.out.println(row);

        for(int i=0; i<row; i++){
          for(int j=0; j<column; j++){
              System.out.print(" ");
              if(j!=column-1){
                  System.out.print("|");
              }
          }
            System.out.println();
          for(int j=0; j<column; j++){
              if(i!=row-1)
              System.out.print("_ ");
          }
            System.out.println();
        }
    }
}
