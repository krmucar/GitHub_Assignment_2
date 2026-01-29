public class GroupAssignment2 {

    
    public static int sumOfEvenNumbers(int[] arr1)
    {

        int sum = 0;

        if((arr1.length - 1) % 2 == 0)
        {
            for(int i = 0; i <= arr1.length - 1; i = i + 2)
            {
                sum += arr1[i];
            }
        }
        else
        {
            for(int k = 0; k <= arr1.length - 2; k = k + 2)
            {
                sum += arr1[k];
            }
        }

        return sum;
    }
    public static int sumOfOddNumbers(int[] arr1)
    {

        int sum = 0;

        for(int m = 0; m < arr1.length; m++)
        {
            sum += arr1[m];
        }
        
        return sum - sumOfEvenNumbers(arr1);
    }
    

    
}