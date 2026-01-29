public class GroupAssignment2 {
    public static void getMin(int[] arr){
        if(arr.length > 0){
            int minVal = arr[0];
            for(int i = 1; i < arr.length ; i++){
                if(arr[i] < minVal){
                    minVal= arr[i];
                }
            }
            System.out.println("Min value is: " + minVal);
        }
    }

    public static void getMax(int[] arr){
        if(arr.length > 0){
            int maxVal = arr[0];
            for(int i = 1; i < arr.length ; i++){
                if(arr[i] > maxVal){
                    maxVal= arr[i];
                }
            }
            System.out.println("Max value is: " + maxVal);
        }
    }

    
}
