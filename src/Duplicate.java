import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] {1,3,5,4,2,1}));
        System.out.println(containsDuplicate(new int[] {1,2,3,4,5,6}));
        System.out.println(containsDuplicate(new int[] {5,3,1,1,3,5}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (Integer i : nums) {
            if (uniqueNums.contains(i)) return true;
            uniqueNums.add(i);
        }
        return false;
    }
}
