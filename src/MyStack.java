/**
 * Created by magnus on 2018-03-26.
 */
public class MyStack {
    int [] stack = new int[100];
    int size = 0;

    public void push(int i) throws Exception {
        if (size < stack.length) {
            stack[size] = i;
            size++;
        } else {
            System.err.println("Stack overflow!");
            throw new Exception("Stack overflow");
        }
    }

    public int pop() throws Exception {
        if (!isEmpty()) {
            size--;
            return stack[size];
        } else {
            throw new Exception("Stack empty");
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
}