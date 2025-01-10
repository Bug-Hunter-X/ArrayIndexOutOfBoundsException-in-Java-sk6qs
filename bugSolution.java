public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[5] = 10; // This line will now throw an exception, handled below
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Array index out of bounds: " + e.getMessage());
        }
        
        //Alternative solution, check the bound before using index
        if (5 >= 0 && 5 < arr.length){
            arr[5] = 10;
            System.out.println(arr[5]);
        }else{
            System.err.println("Error: Index out of bound");
        }
    }
}