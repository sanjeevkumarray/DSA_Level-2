package CompanyTest;
import java.io.*;
import java.util.*;
public class Implement_Stack_Using_Queues {
    class MyStack {
        Queue<Integer> qu = new LinkedList<>();
        public MyStack() {

        }

        public void push(int x) {
            qu.add(x);
            for (int i=1; i<qu.size(); i++)
                qu.add(qu.remove());
        }

        public int pop() {
            return qu.remove();
        }

        public int top() {
            return qu.peek();
        }

        public boolean empty() {
            return qu.isEmpty();
        }
    }
}
