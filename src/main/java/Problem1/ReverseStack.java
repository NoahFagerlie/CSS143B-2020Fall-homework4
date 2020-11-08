package Problem1;

import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> stack)
    {
        if(stack.size() > 0)
        {

            int num = stack.peek();
            stack.pop();
            reverseStack(stack);
            addToBottom(num, stack);
        }
    }

    static void addToBottom(int num, Stack<Integer> stack)
    {

        if(stack.isEmpty())
            stack.push(num);

        else
        {
            int num2 = stack.peek();
            stack.pop();
            addToBottom(num, stack);
            stack.push(num2);
        }
    }

}