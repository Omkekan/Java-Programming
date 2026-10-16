import java.util.HashMap;
import java.util.Scanner;
//collection
public class HashMapCouVowels {
    public static void main(String[] args) {
        HashMap<Character, Integer> vowels = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        vowels.put('a', 0);
        vowels.put('e', 0);
        vowels.put('i', 0);
        vowels.put('o', 0);
        vowels.put('u', 0);
        
        System.out.println("Enter a line: ");
        String line = sc.nextLine();

        for(int i = 0; i<=line.length(); i++){
            //System.out.println(line.charAt(i));
            if (vowels.containsKey(line.charAt(i))) {
                int count = vowels.get(line.charAt(i));
                count++;
                vowels.put(line.charAt(i), count);
            }
        
        }
         for(Character c:vowels.keySet())
            System.out.println(c+":"+vowels.get(c));

        sc.close();
    }
}
