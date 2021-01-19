package methods;

public class FindPairCount {
    public static void main(String[] args) {
        int[] array = new int[]{2, 2, 3, 3, 4, 5, 6, 4, 3, 3};
        int arrayHaveLength = 0;
        boolean isHave = false;

        int[] arrayHave = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            boolean processed = false;
            for (int j = 0; j < arrayHaveLength; j++) {
                if (arrayHave[j] == value) {
                    processed = true;
                    break;
                }
            }
            if (!processed) {
                arrayHave[arrayHaveLength] = value;
                arrayHaveLength++;
            }
        }
        int[] pairs = new int[arrayHaveLength];
        for (int i = 0; i < arrayHaveLength; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (arrayHave[i] == array[j]) {
                    count++;
                }
            }
            pairs[i] = count / 2;
        }

        for (int i = 0; i < pairs.length; i++) {
            System.out.println(arrayHave[i] + "= " + pairs[i]);
        }

        int sumPairs = 0;
        for (int i = 0; i < pairs.length; i++) {
            sumPairs = sumPairs + pairs[i];
        }
        System.out.println(sumPairs);
    }
}