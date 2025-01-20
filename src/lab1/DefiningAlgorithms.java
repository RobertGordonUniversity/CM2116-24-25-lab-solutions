package lab1;
public class DefiningAlgorithms {
    
    public static void main(String[] args) {
        String input = "Learning data structures and algorithms is fun";

        for(String s : input.split(" ")){
            System.out.print(problem4(s) + " ");
        }
    }

    /**
     * Problem 1 - finding the smallest number in an array
     * @param input
     * @return
     */
    static int problem1(int[] input){
        int smallest = input[0];
        for(int i=0;i<input.length;i++){
            if(input[i] < smallest){
                smallest = input[i];
            }
        }
        return smallest;
    }

    /**
     * Problem 2 - counting even numbers in an array
     * @param input
     * @return
     */
    static int problem2(int[] input){
        int result = 0;
        for(int i=0;i<input.length;i++){
            if(input[i] % 2 == 0){
                result++;
            }
        }
        return result;
    }

    /**
     * Problem 3a - find the class average grade
     * @param grades
     * @return
     */
    static int problem3a(int[] grades){
        int total = 0;
        for(int i=0;i<grades.length;i++){
            total += grades[i];
        }
        return total / grades.length;
    }

    /**
     * Problem 3b - find the class grade distribution
     * @param grades
     * @return
     */
    static int[] problem3b(int[] grades){
        /* First we need to find the max grade */
        int max = grades[0];
        for(int i=0;i<grades.length;i++){
            if(grades[i] > max){
                max = grades[i];
            }
        }
        /* Create an array of size max + 1
         *  - the indices of this array represent the grades */
        int[] distribution = new int[max + 1];

        /* Populate this array with initial zeros */
        for(int i=0;i<distribution.length;i++){
            distribution[i] = 0;
        }

        /* Now loop through the grades and increment the index in distribution */
        for(int i=0;i<grades.length;i++){
            distribution[grades[i]]++;
        }

        return distribution;
    }

    static String problem4(String word){
        String append = "";
        char[] vowels = {'a', 'e', 'i','o','u'};

        String s = word; //copy of word that we can modify

        char[] chars = word.toCharArray();

        for(int i=0;i<chars.length;i++){
            
            /* Using a helper method to search the vowels array - but you could put the search here */
            if(contains(vowels, chars[i])){
                append += "ay";
                break;
            }else{
                s = s.substring(1); // removes c from s - c will always be the first character
                append = append + chars[i];
            }
        }
        s = s + append;
        return s;
    }

    static boolean contains(char[] array, char c){
        for(char x : array){
            if(x == c){
                return true;
            }
        }
        return false;
    }
}
