public class HashTable {
    String[] table;
    byte[] locationStatus;
    int capacity = 5;
    int size;

    public HashTable() {
        this.table = new String[capacity];
        this.locationStatus = new byte[capacity];
        this.size = 0;

        for (int i = 0; i < capacity; i++) {
            table[i] = "";
            locationStatus[i] = 0;
        }
    }

    public HashTable(int capacity) {
        this.capacity = capacity;
        this.table = new String[capacity];
        this.locationStatus = new byte[capacity];
        this.size = 0;

        for (int i = 0; i < capacity; i++) {
            table[i] = "";
            locationStatus[i] = 0;
        }
    }

    public void add(String str) {
        if (size == capacity) {
            System.out.println("Table is full!");
            return;
        }

        int hashValue = hash(str);
        while (locationStatus[hashValue] == 1) { // keep moving the hashValue until you find a spot thats not 1
            hashValue = (hashValue + 1) % capacity; // circular probing
        }

        table[hashValue] = str;
        locationStatus[hashValue] = 1;
        size++;
    }

    public void remove(String str) {
        int hashValue = hash(str);

        int count = 0;
        while (count != size) {
            int status = locationStatus[hashValue];

            if (table[hashValue].equals(str) && (status == 0 || status == 1)) {
                locationStatus[hashValue] = -1;
                size--;
                return;
            }
            hashValue = (hashValue + 1) % capacity;
            count++;
        }

        System.out.println("Can't remove '" + str + "'. Element not found!");
    }

    public boolean search(String str) {
        int hashValue = hash(str);

        int count = 0;
        while (count != size) {
            int status = locationStatus[hashValue];

            if (table[hashValue].equals(str) && (status == 0 || status == 1)) {
                return true;
            }

            hashValue = (hashValue + 1) % capacity;
            count++;
        }

        return false;
    }

    public int hash(String key) {
        int hashVal = 0;

        for (int i = 0; i < key.length(); i++) {
            hashVal = 37 * hashVal + key.charAt(i);
        }

        hashVal %= capacity; // forced the hashVal to be within the table
        if (hashVal < 0)
            hashVal += capacity;

        return hashVal;
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < capacity; i++) {
            if (!table[i].equals(""))
                output += hash(table[i]) + ": " + table[i] + " [" + locationStatus[i]
                        + "]\n";
        }

        return output;
    }
}
