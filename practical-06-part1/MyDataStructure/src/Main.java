public class Main {
    public static void main(String[] args) {
        System.out.println(bracketsMatching("({})"));
        System.out.println(bracketsMatching("({)"));
        System.out.println(bracketsMatching("(1+2) * {(2+3)*(3+4)}"));
        System.out.println(bracketsMatching("(1+2) * {{2+3)*(3+4}}"));
        System.out.println();

        //Input:  1 4 7 9 2
        MyQueue queue1 = new MyQueue();
        queue1.enqueue("1");
        queue1.enqueue("4");
        queue1.enqueue("7");
        queue1.enqueue("9");
        queue1.enqueue("2");
        reverseQueue(queue1).displayQueue();
        System.out.println();

        //Input:  3 3 4 1 2
        MyQueue queue2 = new MyQueue();
        queue2.enqueue("3");
        queue2.enqueue("3");
        queue2.enqueue("4");
        queue2.enqueue("1");
        queue2.enqueue("2");
        reverseQueue(queue2).displayQueue();
    }

    public static MyQueue reverseQueue(MyQueue queue) {
        //create a stack to receive element temperately
        MyStack stack = new MyStack();

        //store Nodes in stack temperately
        while (!queue.isEmpty()) {
            stack.push(queue.dequeue());
        }

        //add Nodes to queue
        while (!stack.isEmpty()){
            queue.enqueue(stack.pop());

        }
        return queue;
    }

    public static boolean bracketsMatching(String input) {
        //determine whether to break while loop
        int index = 0;
        String key = "";
        MyStack bracketStack = new MyStack();
        if (input == null || input.length() == 0) {
            System.out.println("String cannot be null or empty! Program exit!");
            System.exit(1);
        } else {
            while (index < input.length()) {
                key = input.substring(index, index + 1);
                if (bracketStack.isEmpty()) {
                    if (isBracket(key)) {
                        //add first Node
                        bracketStack.push(key);
                    }
                } else {
                    //Stack not empty
                    if (pairBracketsMatching(bracketStack.peekEle(), key)) {
                        bracketStack.pop();
                    } else {
                        if (isBracket(key)) {
                            bracketStack.push(key);
                        }
                    }
                }
                index++;
            }
        }
        return bracketStack.isEmpty();
    }

    /**
     * judge whether a string is bracket
     *
     * @param string
     * @return a string is bracket or not
     */
    public static boolean isBracket(String string) {
        return "(".equals(string) || ")".equals(string) || "{".equals(string) || "}".equals(string);
    }

    public static boolean pairBracketsMatching(String s1, String s2) {
        //priority: ! > && > ||
        return "(".equals(s1) && ")".equals(s2) || "{".equals(s1) && "}".equals(s2);
    }
}
