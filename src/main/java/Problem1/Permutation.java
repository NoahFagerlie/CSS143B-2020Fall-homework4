package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0)
            results.add(new ArrayList<>());
        permutationHelper(0, nums, results);
        return results;
    }

    public static void permutationHelper(int startPoint, int[] nums, List<List<Integer>> results)
    {
        int endPoint = nums.length - 1;
        if(startPoint == endPoint)
        {
            ArrayList<Integer> list = new ArrayList<>();
            for(int num: nums)
            {
                list.add(num);
            }
            results.add(list);
            return;
        }

        for(int i = startPoint; i < nums.length; i++)
        {
            swapElements(nums, i , startPoint);
            permutationHelper(startPoint + 1, nums, results);
            swapElements(nums, i , startPoint);
        }
    }

    private static void swapElements(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
