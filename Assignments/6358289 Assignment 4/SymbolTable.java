
/**
 * The class LinkedList implements the symbol table.
 *
 * @author Sebastian Nunez, 6358289, and U01
*/
public class SymbolTable {
    private LinkedList[] table; // hash table
    private final int tableSize = 13; // hash table size
    private final int hashConstant = 37; // hash constant used in hash function

    /**
     * Default constructor. Sets this symbol table as an empty one.
     */
    public SymbolTable() {
        table = new LinkedList[tableSize];

        for (int i = 0; i < tableSize; i++)
            table[i] = new LinkedList();
    }

    /**
     * Determines the hash value of a given string of characters.
     *
     * @param key string
     * @return hash value of key
     */
    private int hash(String key) {
        int hashVal = 0;

        for (int i = 0; i < key.length(); i++) {
            hashVal = hashConstant * hashVal + key.charAt(i);
        }

        hashVal %= tableSize;
        if (hashVal < 0) {
            hashVal += tableSize;
        }

        return hashVal;
    }

    /**
     * Adds an ElementType object to this hash table.
     *
     * @param e element to be added to this hash table
     */
    public void add(ElementType e) {
        int hashVal = hash(e.identifier);
        table[hashVal].add(e);
    }

    /**
     * Removes from this hash table the node whose key value is given.
     *
     * @param key key value of node to be removed
     */
    public void remove(String key) {
        int hashVal = hash(key);
        table[hashVal].remove(key);
    }

    /**
     * Determines if an element with the given key is in the hash table.
     *
     * @param key key value to be searched
     * @return true if search is successful, false otherwise
     */
    public boolean search(String key) {
        int hashVal = hash(key);
        return table[hashVal].search(key);
    }

    /**
     * Constructs a String description of the hash table.
     *
     * @return String containing the hash table elements.
     */
    public String toString() {
        String str = "";

        for (int i = 0; i < table.length; i++) {
            str = String.format(str + "%2d: ", i);

            LinkedList bucket = table[i];
            if (!bucket.isEmpty())
                str += bucket.toString() + "\n";
            else
                str += "->\n";
        }

        return str;
    }
}
