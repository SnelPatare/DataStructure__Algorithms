package Stack;

public class Implement_stack {
    
        private int maxSize;
        private int[] stackArray;
        private int top;
        public Implement_stack(int size){
            maxSize = size;
            stackArray = new int[maxSize];
            top = -1;
        }

        public void push(int value){
            if (top == maxSize-1){
                System.out.println("Stack overflow");
                return;
            }
            stackArray[++top] = value;
            System.out.println(value+ " added in stack");

        }

        public int pop(){
            if (top == -1){
                System.out.println("stack is empty");
                return -1;
            }
            int poppedElement = stackArray[top];
            top--;
            return poppedElement;
        }

        public int top(){
            if (top == -1){
                System.out.println("stack is empty");
                return -1;
            }
            return stackArray[top];
        }
        public boolean isEmpty(){
            if(top == -1){
                return true;
            }
            return false;
        }
        public boolean isFull(){
            if (top == maxSize-1){
                return true;

            }
            return false;

        }

        public static void main(String[] args){
            int size =5;
            Implement_stack stack = new Implement_stack(size);
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            System.out.println("Top element of the stack: " + stack.top());
            stack.pop();
            stack.pop();
            System.out.println("Top element of the stack: " + stack.top());

            System.out.println("Is stack empty? " + stack.isEmpty());
            stack.pop();
            stack.pop();
            System.out.println("Is stack empty? " + stack.isEmpty());




        }
    }

