import java.util.Arrays;

class reverseArray  {
    public static long[] reversearray (long[] arr) {
    long[]  revarsedArr = new long[arr.length];
    for(int i = 0 ; i < arr.length ; i++){
      revarsedArr[i] = (arr[arr.length - 1 - i]);
    }
    return revarsedArr;
  };


public static void main(String[] args) {
  long[] even = {3, 5,6, 7,11,13,14,16 ,17,18,19,20};
  System.out.println(Arrays.toString(reversearray(even)));

  long[] odd = {3, 5,6, 7,11,13,14,16 ,17,18,19};
  System.out.println(Arrays.toString(reversearray(odd)));
 
}
}