package Assignment;
public class MaximumAndTotalSum {
    public static void main (String[] args) {
        System.out.print ("The element number of arrays are: ");
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int arrayNumber = 0;
            int totalSum = 0;
        for (int i = 0; i < array.length; i++) {
            totalSum+=array[i];
        }
            int maximumNumber= array[0];
        for (int i = 0; i < array.length; i++) if(array[i] > maximumNumber){
            maximumNumber = array[i];
        }
            int minimumNumber = array[0];
        for (int i = 0; i < array.length; i++) if(array[i] < minimumNumber){
            minimumNumber= array[i];
        }
            int average = totalSum / array.length;
        for (int i = 0; i < array.length; i++) {
            arrayNumber = array[i];
            System.out.print (arrayNumber + " ");
            }
        System.out.println ();
        System.out.println ("The Sum is: " + totalSum);
        System.out.println ("The Maximum number is: " + maximumNumber);
        System.out.println ("The Minimum number is: " + minimumNumber);
        System.out.println ("The Average of array number is : " + average);
    }
}
