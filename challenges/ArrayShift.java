import java.util.*;

class ArrayShift {
  
  public static void main(String[] args) {
    int arr[]={4,8,15,23,42};  
    int IntValue;
    if(arr.length%2 == 0){
       IntValue = arr.length/2;
    }else{
       IntValue = arr.length/2 +1;
    }
    System.out.println(IntValue);
    insertShiftArray(arr,IntValue,16);
  }

  static void insertShiftArray(int arr[],int IntValue ,int newValue){
    int[] intArray = new int[arr.length+1];
    int count = 0;
    for(int i=0; i < intArray.length; i++){
      if(i == IntValue){
        intArray[i] = newValue;
      }else{ intArray[i] = arr[count];
        count++;}
     }
     System.out.println(Arrays.toString(arr));
     System.out.println(Arrays.toString(intArray));

  }
}