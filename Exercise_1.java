
class ourStack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    public boolean isEmpty() {
        return (top < 0);
    }

    ourStack() {
        // constructor
        this.top = -1;
    }

    boolean push(int x) {
        // if top>MAX then there is no more space for pushing elements so max value is
        // top.
        if (top > MAX) {
            // printing
            System.out.println("Stack Overflow");
            // false if element cannot be pushed
            return false;
        } else {
            // update the top value first
            top = top + 1;
            // store x value in the stack of top index
            a[top] = x;
            System.out.println(a[top] + " added to the stack");
            // return true if the element is pushed
            return true;
        }
    }

    int pop() {
        // top==-1 shows stack is empty and cannot pop anything out
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }

        else {
            // store a[top] value as temporary to return it later.
            int temp = a[top];
            // top-- to update top value so that the stack is updated.
            top--;
            // return the value previously stored.
            return temp;
        }

    }

    int peek() {
        // peek is the top most element of the stack, a[top] is the topmost element.
        return a[top];
    }
}

// Driver code
public class Exercise_1 {
    public static void main(String args[]) {
        ourStack s = new ourStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
