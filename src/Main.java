import SearchBinary.Day2;
import SearchBinary.SearchBinaryDay1;
import SortTop10.Bubble;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        SearchBinaryDay1 searchBinaryDay1 = new SearchBinaryDay1();
//        List<Integer> result = searchBinaryDay1.targetIndices(new int[] {1,2,5,2,3}, 5);
//        int result = searchBinaryDay1.search(new int[] {-1,0,3,5,9,12}, -1, false);
        Day2 day2 = new Day2();
//        int[] result = day2.answerQueries(new int[] {2, 3, 4, 5}, new int[] {1});
//        int result = day2.peekIndexInMountainArrayBySearch(new int[] {24,69,100,99,79,78,67,36,26,19});
//        int[][] data = {{1,0}, {0,0}, {1,0}};
//        int[] result = day2.kWeakestRows(data, 2);
        Bubble bubble = new Bubble();
//        int[] result = bubble.sortBetter(new int[] {3, 5, 4, 9, 2, 7, 1, 6, 8});
        bubble.moveZeros(new int[] {4,2,4,0,0,3,0,5,1,0});
//        displayIntArray(result);
    }

    public static void displayIntArray(int[] array) {
        Arrays.stream(array).forEach(e -> System.out.print(e + ", "));
    }
}