package java_lab.Assessment3;

import java.util.Scanner;

public class Strings_Assessment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int flag = 0;
        int count = 0;
        System.out.print("Enter the original String : ");
        String original_string = sc.next();
        original_string.trim();
        int length_of_original = original_string.length();

        System.out.print("Enter the no. of words : ");
        int n = sc.nextInt();

        String[] words = new String[n];
        for (int i = 0; i<n; i++){
            words[i] = sc.next();
        }

        char original[] = new char[length_of_original];

        for (int i = 0; i<length_of_original; i++){
            original[i] = original_string.charAt(i);
        }

        //checking if the word can be generated :
        for (int i = 0; i<n; i++){
            String word = words[i];
            int length_of_word = word.length();
            for (int j = 0; j<length_of_word; j++){
                char ch = word.charAt(j);
                for (int k = 0; k<length_of_original; k++){

                    if (ch == original[k]){
                        flag = 1;
                    }
                }
                if(flag == 1){
                    count++;
                }
                flag = 0;
            }
            if(count == length_of_word)
                System.out.println(word + " can be genetrated ");
            else
                System.out.println(word + " cannot be genetrated");
            count = 0;

        }


    }
}
