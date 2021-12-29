import java.util.Arrays;
 
class Main
{
    public static int LDS(int[] nums)
    {
        if (nums == null || nums.length == 0) 
        {
            return 0;
        }
        
        int[] L = new int[nums.length];
        
        L[0] = 1;
        
        for (int i = 1; i < nums.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (nums[j] > nums[i] && L[j] > L[i]) 
                {
                    L[i] = L[j];
                }
            }
            L[i]++;
        }
        return Arrays.stream(L).max().getAsInt();
    }
 
    public static void main(String[] args)
    {
        int[] nums = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
        System.out.println(LDS(nums));
    }
}
