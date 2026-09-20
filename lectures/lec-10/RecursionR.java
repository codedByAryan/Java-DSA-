


public class RecursionR {
    public static void print(int i){
        // Base case
        if(i<=0){
            return;
        }
        System.out.println("Hello world"); // kaam
        print(i-1); // recursion -> function ne call kia khud
    }

    public static void print_Decreasing_Number(int n){
        if(n<=0){
            return;
        }
        System.out.print(n + " ");
        print_Decreasing_Number(n-1);
    }

    public static void print_Increasing_number(int n){
        if(n<=0){
            return;
        }
        print_Increasing_number(n-1);
        System.out.print(n+" ");
    }

    public static int print_fact(int n){
        // base case
        if(n==0 || n==1){
            return 1;
        }
        int ans = n*print_fact(n-1);

        return ans;
    }

    public static int sum_n_natural_number(int n){
        if(n==1){
            return 1;
        }

        int sum = n + sum_n_natural_number(n-1);
        return sum;
    }

    public static int nth_fibonacci(int n){
        // base case
        if(n==0 || n==1){
            return n;
        }
        int num = nth_fibonacci(n-1) + nth_fibonacci(n-2);

        return num;
    }

    public static boolean Sorted_Array(int arr[],int i){
        // base case
        if(i==arr.length-1){
            return true;
        }
        // kaam
        if(arr[i]>arr[i+1]){
            return false;
        }

        return Sorted_Array(arr,i+1);
    }

    public static int First_Ocurrence(int arr[], int key, int i){
        // base case
       if(i == arr.length-1){
        return -1;
       }

       if(arr[i]==key){
        return i;
       }

       return First_Ocurrence(arr, key, i+1);
    }

    public static int last_occurence(int arr[], int key, int i){
        // base case
        if(i == 0){
            return -1;
        }
       // kaam

       if(arr[i] == key){
        return i;
       }
        return last_occurence(arr, key, i-1);
    }

    public static int power(int x, int n){
        // base case
        if(n == 1){
            return x;
        }
        // kaam
        int pow = x * power(x,n-1);

        return pow;
    }
    public static void main(String[] args) {
       // print(4);

       //print_Decreasing_Number(4);

       //print_Increasing_number(5);

      // System.out.println("Factoreial is: " + print_fact(5));

    // System.out.println("Sum of first n natrural number is: " + sum_n_natural_number(4));

       // System.out.print("nth fibonacci number is: " + nth_fibonacci(8));

    //    int arr[] = {1,2,3,4,5};
    //    if(Sorted_Array(arr, 0)==true){
    //     System.out.println("Array is Sorted");
    //    }
    //    else{
    //     System.out.println("not sortted");
    //    }


    //     int arr[] = {1,2,3,4,5,6};
    //     int key = 3;
    //     int n = First_Ocurrence(arr, key, 0);
    //   if(n<0){
    //     System.out.println("key not persent");
    //   }
    //     else{
    //         System.out.println("key persent at index: " + n);
    //     }


    //     int arr[] = {1,2,3,4,3,5,7,8,9,3,6};
    //     int key = 3;
    //    int result =  last_occurence(arr, key, arr.length-1);
    //     if(result<0){
    //         System.out.println("key is not persent");
    //     }
    //     else{
    //         System.out.println("key is persent at index: " + result);
    //     }

     //   System.out.println("power is: " + power(2, 2));

        
      }
    
}
