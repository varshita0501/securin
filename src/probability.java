public class probability {
    public static void main(String[] args) {
        for (int i = 2; i <= 12; i++) {
            int count =count_probability(i);
            float probability = (float)count/36;
            System.out.println("P(sum = " + i + ") = " + probability)  ;
        }
        }
        static int count_probability(int x){
            int count = 0;
            int arr1[] ={1,2,3,4,5,6};
            int arr2[] = {1,2,3,4,5,6};
            for (int i = 0; i < arr1.length ; i++) {
                for (int j = 0; j <arr2.length ; j++) {
                    if(arr1[i]+arr2[j] == x){
                        count += 1;
                    }
                }
            }
            return  count;

        }
    
    }
