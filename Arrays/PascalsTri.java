import java.util.*;

public class PascalsTri {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();

        if (numRows == 0) return answer;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        answer.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                int element = answer.get(i - 1).get(j)
                        + answer.get(i - 1).get(j - 1);
                currentRow.add(element);
            }

            currentRow.add(1);
            answer.add(currentRow);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
//pascals triangle ..each row no is sum of above two directly 
//row index -> i  previos row size = i  valid indexes = 0 to i-1
//so we acces j and j-1