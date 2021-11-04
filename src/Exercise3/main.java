package Exercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        File wordFile = new File("src/Exercise3/exercise 3 test file.csv");
        ArrayList<String> wordsFromFile = new ArrayList<String>();
        int numberOfWords = 0;
        try {
            Scanner sc = new Scanner(wordFile);
            while(sc.hasNextLine()) {
                String word = sc.nextLine();
                String[] wordList = word.split(" ");

                for (int i = 0; i < wordList.length; i++) {
                    wordsFromFile.add(wordList[i]);
                    numberOfWords++;
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("File could not be found");
            e.printStackTrace();
        }
        for (int i = 0; i < wordsFromFile.size(); i++) {
            System.out.println(wordsFromFile.get(i));

        }
        System.out.println();
        System.out.println("There are " + numberOfWords + " words in the file");


    }
}
