package StackActivity;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(6);
        stack.push(4);
        stack.pop();
        stack.push(3);
        stack.push(1);
        stack.pop();
        System.out.print("Question 1:  A queue would be more appropriate to use rather than a stack when the elements need to be used in a specific order.\n An example would be a ticket line where the first ticket gets to go first.");
        System.out.print("Question 2: A queue follows a FIFO structure where the first item added would be the first item processed.\n A stack on the otherhand follows a LIFO structure where the last element added will be the first element to be processed.");



    }
}
