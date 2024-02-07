package Stack;

public class GenericStack<Item> {
    private Item[] a;
    private int N;

    public GenericStack(int capacity){
        a = (Item[]) new Object[capacity];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void push(Item item){
        a[N++] = item;
    }

    public Item pop(){
        return a[--N];
    }

    public static void main(String[] args){
        GenericStack stack = new GenericStack(5);
        stack.push(2);
        stack.push(1);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
