public class Prog13_01 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("Is the list empty ? " + list.isEmpty());

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.remove(2);
        System.out.print("List aftermoving x=2: " + list + "\n");

        list.clear();
        System.out.println("List after clearing: " + list);

        System.out.println("Is the list empty ? " + list.isEmpty());

        System.out.println("List: " + list);
        System.out.println("Is the number 1 in the list? " + list.search(1));

        list.add(new int[] { 13, 15, 25, 6 });
        System.out.println("List after inputting array: " + list);
        list.add(4);
        list.add(3);
        list.add(4);

        System.out.println("List before removing 4: " + list);
        list.remove(4);
        // list.remove(4);
        // list.remove(4);

        System.out.println("list after removing 4: " + list);
        System.out.println("Length: " + list.length());

        System.out.println("inserting '99' at index 2...");
        list.insert(99, 0);
        System.out.println("List: " + list);

    }
}
