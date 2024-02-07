package Stack;

public class StackOfStrings {
    private String[] a; //stack entries
    private int N; //size

    public StackOfStrings(int capacity){
        a = new String[capacity];
    }

    public boolean isEmpty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    public void push(String item){
        a[N++] = item;
    }

    public String pop(){
        return a[--N];
    }

    public static void main(String[] args){
        StackOfStrings stack = new StackOfStrings(5);
        stack.push("Tarun");
        stack.push("Hello");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
