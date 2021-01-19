package крестикиНолики.крестикиНолики;

import java.util.Arrays;

public class EnumTest {
    public enum CellValue {
        EMPTY(' '),
        HUMAN('X'),
        COMPUTER('O');
        private char value;
        private CellValue(char value) {
            this.value = value;
        }
        public char getValue() {
            return value;
        }
        public boolean isFugure() {
            return this != EMPTY;
        }


    }

    public static void main(String[] args) {
        CellValue cellValue = null;
        cellValue = CellValue.COMPUTER;
        System.out.println(cellValue.name());
        System.out.println(cellValue.ordinal());//возвращает порядок нахождения этого объекта
        System.out.println(cellValue.toString());
        System.out.println(Arrays.toString(CellValue.values()));//массив объектов
        cellValue = CellValue.valueOf("COMPUTER");//возвращает объект?
        System.out.println(cellValue.name());
        System.out.println(cellValue.ordinal());
        System.out.println(cellValue.toString());

        CellValue cellValue2 = CellValue.HUMAN;
        System.out.println(cellValue2.getValue() + "->" + cellValue.isFugure());
        System.out.println(CellValue.COMPUTER.getValue() + "->" + CellValue.COMPUTER.isFugure());
        System.out.println(CellValue.EMPTY.getValue() + "->" + CellValue.EMPTY.isFugure());
    }
}
