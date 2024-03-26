public class distribution {
    public static void main(String[] args) {
        int arr1[] ={1,2,3,4,5,6};
        int arr2[] = {1,2,3,4,5,6};
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                System.out.print("(" + arr1[i] + "," + arr2[j]  + ") " );
            }
            System.out.println();
        }
    }
}

