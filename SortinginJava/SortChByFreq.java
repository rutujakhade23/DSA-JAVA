import java.util.*;

public class SortChByFreq {
    public static String frequencySort(String s) {
        int fre[] = new int[256];
        int n = s.length();

        // Count frequency
        for(int i = 0; i < n; i++){
            char currentCharacter = s.charAt(i);
            fre[currentCharacter]++;
        }

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        // Store character and frequency
        for(int i = 0; i < 256; i++){
            if(fre[i] != 0){
                ArrayList<Integer> currentRow = new ArrayList<>();
                currentRow.add(i);
                currentRow.add(fre[i]);
                arr.add(currentRow);
            }
        }

        // Sort by frequency descending
        Collections.sort(arr, (x,y) -> Integer.compare(y.get(1), x.get(1)));

        StringBuilder str = new StringBuilder();

        for(int i = 0; i < arr.size(); i++){
            int freq = arr.get(i).get(1);
            char ch = (char)(int)(arr.get(i).get(0));

            while(freq > 0){
                str.append(ch);
                freq--;
            }
        }

        return str.toString();
    }

    public static void main(String args[]){
            System.out.println(frequencySort("tree"));
    }
}