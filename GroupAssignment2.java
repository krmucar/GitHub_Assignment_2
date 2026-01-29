import java.util.Scanner;

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

    public static int[] createArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i<size; i++)
        {
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }
    
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

    public static void findAvrgDiff(int[] arr){

        int total = 0;
        for(int i=0; i<arr.length; i++){
            total = arr[i] + total;
        }
            
        int avrg = total/arr.length;
        int[] newArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            newArr[i] = arr[i] - avrg;
                
        }
        System.out.print("{");
        int count = 0;
        for(int i=0; i<newArr.length-1; i++){
            count++;
            System.out.print(newArr[i] + "," + " ");
        }
        System.out.print(arr[count]);
        System.out.println("}");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean quit = false;

        System.out.print("Enter an array size: ");
        int size = in.nextInt();

        int[] arr = createArray(size);


        while (!quit) {
            System.out.print("=== Array Functionality ===\n1. Max\n2. Min\n3. Average\n4. Sum of Even Indexes\n5. Sum of Odd Indexes\n6. Exit\nChoose an option: ");
            int decision = in.nextInt();

            if (decision == 1) {
                getMax(arr);
            }
            else if (decision == 2) {
                getMin(arr);
            }
            else if (decision == 3) {
                findAvrgDiff(arr);
            }
            else if (decision == 4) {
                System.out.println(sumOfEvenNumbers(arr));
            }
            else if (decision == 5) {
                System.out.println(sumOfOddNumbers(arr));;
            }
            else if (decision == 6) {
                quit = true;
            }
        }

        in.close();
    }
     
}

    

