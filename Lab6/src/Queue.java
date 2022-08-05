public class Queue {
    int first , back;
    int[] info;

    public Queue(int capacity){
        info = new int[capacity];
        first = back = -1;
    }
    public boolean isFull(){
        return (first==0 && back==info.length-1) //case: first หน้าสุด last หลังสุด (length-1 bc. index start 0 )
                ||(back+1==first); //case: back วนมาอยู่หน้า first
    }
    public boolean isEmpty(){
        return first == -1;
    }
    public void enqueue(int newInfo){
        if(!isFull()){
            if(back>=info.length-1){
                back = 0;
            }else {
                if(first==-1){
                    first=0;
                }
                back++;
            }
        }
        info[back] = newInfo;
    }
    public int dequeue(){
        int deletedInfo;
        if(!isEmpty()){
            deletedInfo = info[first];
            if(first==back){ //have only 1 item
                first = back = -1;
            }else if(first>=info.length-1){
                first = 0;
            }else {
                first++;
            }
        }else {
            deletedInfo=-1;
        }
        return deletedInfo;
    }
}
