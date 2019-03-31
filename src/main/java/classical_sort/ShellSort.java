package classical_sort;

/**
 * @author qiaoying
 * @date 2019-03-31 21:18
 */
public class ShellSort {
    //希尔排序
    public static void shellSort(int a[]){

        for(int r = a.length/2 ; r >= 1; r/=2 ){

            for(int i = r; i < a.length ; i++){

                int temp = a[i];
                int j = i - r;

                while(j >= 0 && temp < a[j]){
                    a[j+r] = a[j];
                    j -= r;
                }

                a[j+r] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10,20,15,0,6,7,2,1,-5,55};
        shellSort(numbers);
        for (int c:numbers
        ) {
            System.out.println(c);
        }
    }
}
