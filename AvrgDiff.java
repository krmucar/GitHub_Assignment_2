public class AvrgDiff {

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
            System.out.print("}");
        }
}
