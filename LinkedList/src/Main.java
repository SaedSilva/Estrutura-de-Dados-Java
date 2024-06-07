import datastructure.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList("1-Saed");
        list.append("2-Manoel");
        list.append("3-Sandra");
        list.prepend("0-Makel");
        list.getHead();
        list.getTail();
        list.getLength();
        list.removeFirst();
        list.print();
        System.out.println(list.get(1).data);
        list.insert(2, "elemento");
        list.remove(2);
        list.print();
    }
}
