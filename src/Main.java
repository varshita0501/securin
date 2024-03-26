public class Main {
    public static void main(String[] args) {
        int total_combinations = 0;
        int arr1[] ={1,2,3,4,5,6};
        int arr2[] = {1,2,3,4,5,6};
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr2.length; j++) {
                total_combinations += 1;
            }

        }
        System.out.println("The total number combinations are  "  +
                total_combinations);
    }

}
