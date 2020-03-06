 

/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(int i = 0; i < array.length ; i++){
            if(array[i].equals(value))
                return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] newarr = new String[array.length];
       
        for (int i = 0, j = array.length - 1; j >= 0; i++, j--){
            newarr[i] = array[j];
        } 
        return newarr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] rev_arr = reverse(array);
        for(int i = 0; i < array.length; i++){
            if (!array[i].equals(rev_arr[i]))
                return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String joined = String.join(" ", array);
        for(int i = 0; i < alphabets.length(); i++){
            if(joined.toLowerCase().indexOf(alphabets.charAt(i)) == -1)
                    return false;
        }
        
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurences = 0;
        for(int i = 0; i < array.length ; i++){
            if(array[i].equals(value))
                occurences += 1;
        }
        return occurences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] new_arr = new String[array.length - getNumberOfOccurrences(array, valueToRemove)];
        int j = 0;
        for(int i = 0; i < array.length ; i++){
            if(array[i].equals(valueToRemove))
                continue;
            new_arr[j] = array[i];
            j++;
        }
        return new_arr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int i = 0;
        int count = 0;
        while (i < array.length - 1){
            if (array[i] == array[i + 1]){
                array[i] = null;
                count++;
                
            }
            i++;
      
        }
        
        String[] new_arr = new String[array.length - count];
        int j = 0;
        for(i = 0; i < array.length ; i++){
            if(array[i] == null)
                continue;
            new_arr[j] = array[i];
            j++;
        }
        return new_arr;
        
    
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int i = 0;
        int count = 0;
        while (i < array.length - 1){
            if (array[i] == array[i + 1]){
                array[i] = null;
                count++;
                
            }
            i++;
      
        }
        
        String[] new_arr = new String[array.length - count];
        int j = 0;
        i = 0;
        while (i < array.length){
            
            int curr_count = 1;
            while(array[i] == null){
                curr_count++;
                i++;
            }
           
            new_arr[j] = "";
            for(int x = 0; x < curr_count; x++){
                new_arr[j] += array[i];
            }
            i++;
            j++;
        }
        return new_arr;
    }


}
