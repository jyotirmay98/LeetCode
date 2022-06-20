import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Solution
{
    /*We are creating a map containing the digits as keys and corresponding letters as values*/
    private static final Map<String , List<String>> digitLetterMap = Map.of("2" , List.of("a" , "b" , "c"),
                                                                            "3" , List.of("d" , "e" , "f"),
                                                                            "4" , List.of("g", "h" , "i"),
                                                                            "5" , List.of("j" , "k" , "l"),
                                                                            "6" , List.of("m" , "n" , "o"),
                                                                            "7" , List.of("p" , "q" , "r" , "s"),
                                                                            "8" , List.of("t" , "u" , "v"),
                                                                            "9" , List.of("w" , "x" , "y" , "z"));
    public List<String> letterCombinations(String digits)
    {
        /* If digits is empty , we return an empty list */
        if(digits.isEmpty()) return new ArrayList<>();
        /* If the length of digits is 1 , we return the corresponding value for the digit at index 0 from the map we have created above */
        if(digits.length() == 1) return digitLetterMap.get(""+digits.charAt(0));
        List<String> result = new ArrayList<>();
        /* If the length of digits is more than 1 , then we take the values mapped to digit at index 0 from the map above and then prepend
        * each letter to each letter in the result from the recursion.
        */
        for (String str1:
             digitLetterMap.get(""+digits.charAt(0))) {
            for (String str2:
                 letterCombinations(digits.substring(1))) {
                result.add(str1+str2);
            }
        }
        return result;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations("23"));
    }
}