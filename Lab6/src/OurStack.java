public class OurStack {
        int[] info;
        int top;

        public OurStack(int capacity){
            info = new int[capacity];
            top = 0;
        }
        public boolean isFull(){
            return top >= info.length;
        }
        public void push(int newInfo){
            if(!isFull()){
                info[top] = newInfo;
                top++;
            }else {
                System.out.println("Stack is full. You cannot push a new member.");
            }
        }
        public int pop(){
            int x;
            if(!isEmpty()){
                top--;
                x = info[top];
            }else {
                x = -999;
                System.out.println("Stack is empty.There is nothing to pop.");
            }
            return x;
        }
        public int topElement(){
            if(top==0){
                return -1;
            }
            return info[top-1];
        }
        public void clear(){
            top = 0;
        }
        public boolean isEmpty(){
            return  top==0;
        }
}
