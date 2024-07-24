package datastructurevector;

import java.util.Stack;

public class StackVector {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        stack.push('e');
        stack.push('f');
        stack.push('g');
        stack.forEach(System.out::println);

        stack.pop();
        stack.forEach(System.out::println);

        stack.push('g');
        stack.push('h');
        stack.push('i');
        stack.push('j');
        stack.push('k');
        stack.forEach(System.out::println);

        stack.push('k');
        stack.push('l');
        stack.push('l');
        stack.push('l');
        stack.push('m');
        stack.forEach(System.out::println);

        stack.pop();
        stack.forEach(System.out::println);

        stack.pop();
        stack.forEach(System.out::println);

//        F B K D
//        F B K D E F G
//        F B K D E F
//        F B K D E F G H I J K
//        F B K D E F G H I J K K L L L M
//        F B K D E F G H I J K K L L L
//        F B K D E F G H I J K K L L

    }
}
