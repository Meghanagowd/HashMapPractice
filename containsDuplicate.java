import java.util.*;

public class containsDuplicate{

    public static boolean containsDuplicate(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++) {
            
            int num = arr[i];
            map.put(num , map.getOrDefault(num,0)+1);
            
            // WRITE YOUR LOGIC HERE
        }
         for(int key: map. keySet()){
          if(map.get(key)>1){
            return true;
          }
         }   
            
            
        
        
        return false;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(containsDuplicate(arr));
    }
}
