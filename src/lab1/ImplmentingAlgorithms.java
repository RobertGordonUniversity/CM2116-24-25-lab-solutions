package lab1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ImplmentingAlgorithms {
    public static void main(String[] args) throws Exception {
    }

    /**
     * Algorithm 1
     * 
     * @param n
     * @return
     */
    static int algorithm1(int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        return total;
    }

    /**
     * Algorithm 2
     * @param s
     * @return
     */
    static Map<Character, Integer> algorithm2(String s) {
        Map<Character, Integer> result = new HashMap<>();
        for(char c : s.toCharArray()){
            if(result.get(c)==null){
                result.put(c, 1);
            }else{
                result.put(c, result.get(c) + 1);
            }
        }
        return result;
    }

    /**
     * Algorithm 3
     * @param limit
     * @return
     */
    static int[] algorithm3(int limit){
        int[] result = new int[limit];
        if(limit == 0){
            return result;
        }

        result[0] = 1;

        if(limit == 1){
            return result;
        }

        result[1] = 1;

        for(int i=2;i<limit;i++){
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }

    

}
