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

    }
}
