package Problem1;

public class BinarySearch {
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target)
    {
        return helper(data, target, 0, data.length - 1);
    }

    private static int helper(int[] data, int target, int low, int high)
    {
        int middle = (low + high) / 2;

        if(data.length == 0)
            return -1;

        if(low > high)
            return -1;

        if(data[middle] < target)
            return helper(data, target, middle + 1, high);

        else if(data[middle] > target)
            return helper(data, target, low, middle - 1);

        else if(data[middle] == target)
            return middle;

        return -1;

    }
}
