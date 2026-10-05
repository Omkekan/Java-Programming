import java.util.Scanner;

public class CVowelConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int vowels = 0, consonants = 0;
        for(int i = 0; i<text.length(); i++){
            char ch = text.charAt(i);

            if (ch>='a'&& ch <= 'z') {
                if (ch == 'a'|| ch =='e'|| ch=='i'||ch=='o'|| ch=='u') {
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println("Vowels= "+vowels);
        System.out.println("Consonants= "+consonants);
        sc.close();
    }
}
