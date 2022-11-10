import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prog23_01 {
    public static void main(String[] args) {
        new Prog23_01();
    }

    public Prog23_01() {
        HashTable table = new HashTable(67);

        try {
            Scanner in = new Scanner(new File("keywords.txt"));
            while (in.hasNextLine()) {
                String keyword = in.nextLine().strip();
                if (keyword.length() > 0)
                    table.add(keyword);
            }

            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }

        System.out.println(table);
        table.remove("if");
        System.out.println(table);
        table.remove("if");
        System.out.println("Is 'if' found? " + table.search("if"));
        System.out.println("Is 'try' found? " + table.search("try"));

        System.out.println("Is 'while' found? " + table.search("while"));

    }

}
