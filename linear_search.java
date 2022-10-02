public class LinearSearch{    
public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        int[] arr= {10,20,30,50,70,90};    
        int key = 50;
        int foundAt = linearSearch(arr, key);
        if(foundAt == -1){
          System.out.println("Not Found");
        }
        else{
          System.out.println(key+" is found at index: "+foundAt);    
        }
    }    
}    
