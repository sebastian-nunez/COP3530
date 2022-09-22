
public class Prog16_01 {

    public static void main(String[] args) {
        Queue q = new Queue(3);

        //Insertion
        // for (int i = 0; i < 10; i++) {
        //     int x = 32 + (int) (Math.random() * 95);
        //     System.out.println(x + " --> " + (char) x);
        //     q.enqueue((char) x);
        // }
        q.enqueue('a');
        q.enqueue('h');
        q.enqueue('z');
        q.print();
        q.enqueue('r');
        q.clear();

        //Display and removal
        System.out.println(q.getSize());
        for (int i = 0; i <= q.getSize(); i++) {
            System.out.println("Item at the front: " + q.getFront());

            q.dequeue();
        }
    }
}
