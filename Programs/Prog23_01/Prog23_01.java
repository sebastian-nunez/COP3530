import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog23_01 {
    public static void main(String[] args) {
        new Prog23_01();
    }

    public Prog23_01() {
        ArrayList<String> keywords = new ArrayList<String>();
        final int TABLE_SIZE = 67;

        try {
            Scanner in = new Scanner(new File("keywords.txt"));
            while (in.hasNextLine()) {
                String keyword = in.nextLine().strip();
                if (keyword.length() > 0)
                    keywords.add(keyword);
            }

            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        // System.out.println(keywords);
        String[] hashTable = new String[TABLE_SIZE];
        for (int i = 0; i < keywords.size(); i++) {
            int hashVal = hash(keywords.get(i), TABLE_SIZE);
            // System.out.println(keywords.get(i) + " : " + hashVal);
            hashTable[hashVal] = keywords.get(i);
        }

        for (int i = 0; i < hashTable.length; i++) {
            System.out.println(i + " : " + hashTable[i]);
        }
        // System.out.println(keywords.size());
    }

    public int hash(String key, int tableSize) {
        int hashVal = 0;

        for (int i = 0; i < key.length(); i++) {
            hashVal = 37 * hashVal + key.charAt(i);
        }

        hashVal %= tableSize; // forced the hashVal to be within the table
        if (hashVal < 0)
            hashVal += tableSize;

        return hashVal;
    }
}
