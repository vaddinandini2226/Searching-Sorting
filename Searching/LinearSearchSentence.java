/*
 * Program: Linear Search in an Array of Sentences
 *
 * Description:
 * This program performs a Linear Search to find the first sentence
 * that contains a specified word. It stores multiple sentences in an
 * array and checks each sentence one by one using the contains() method.
 * If a sentence containing the given word is found, it is displayed.
 * Otherwise, the program displays "Not Found".
 */
package search;
import java.util.Scanner;

public class LinearSearchSentence {

    // Method to perform linear search
    public static String searchSentence(String[] sentences, String word) {

        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence;
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        String[] sentences = new String[n];

        System.out.println("Enter the sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }

        System.out.print("Enter the word to search: ");
        String word = sc.nextLine();

        String result = searchSentence(sentences, word);

        System.out.println("Result: " + result);

        sc.close();
    }
}
