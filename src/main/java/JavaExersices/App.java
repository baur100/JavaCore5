package JavaExersices;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String str1 = "Th1ing";
        String str2 = "Night1";

        boolean check = isAnagram(str1,str2);
        System.out.println(check);
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length()!=str2.length()){
            return false;
        }
        String normal1 = str1.toLowerCase();
        String normal2 = str2.toLowerCase();

        char[]word1 = normal1.toCharArray();
        char[]word2 = normal2.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        for (int i=0;i<word1.length;i++){
            if(word1[i]!=word2[i]){
                return false;
            }
        }
        return true;
    }
}
