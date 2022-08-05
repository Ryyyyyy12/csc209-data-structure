import javax.management.StandardEmitterMBean;

public class DoublyLinkedList {
    ToiletPaper head ,tail;
    public DoublyLinkedList(){
        head = tail = null;
    }
    public void addToTail(String b,double p,int l,String c){
        if(head == null){
            head=tail=new ToiletPaper( b, p, l, c,null,null);
        }else {
            tail.next   = new ToiletPaper(b,p,l,c,null,tail);
            tail=tail.next;
        }
    }
    public void addToHead(String b,double p,int l,String c){
        if(head==null){
            head = tail = new ToiletPaper(b,p,l,c,null,null);
        }else {
            head = new ToiletPaper(b,p,l,c,head,null);
            head.next.prev = head;
        }
    }
    public void printAllColor(){
        ToiletPaper temp;
        for(temp = head;temp!=null;temp = temp.next){
            System.out.print(temp.getColor()+" ");
        }
        System.out.println();
    }
    public ToiletPaper deleteFromHead(){
        ToiletPaper deletedNode = head;
        if(head == tail){
            head = tail = null;
        }else{
            head.next.prev = null;
            head = head.next;
        }
        return deletedNode;
    }
    public ToiletPaper deleteFromTail(){
        ToiletPaper deleteNode = tail;
        if(head == tail){
            head = tail = null;
        }else {
            tail = tail.prev;
            tail.next = null;
        }
        return deleteNode;
    }
    public void insertAtIth(String b,double p,int l,String c,int position){
        if(position <=0){
            addToHead(b, p, l, c);
        }else{
            ToiletPaper temp = head;
            for(int i=0;temp!=null && i<position-1;i++){
                temp = temp.next;
            }
            if(temp!=null){
                temp.next = new ToiletPaper(b,p,l,c,temp.next,temp);
            }else {
                addToTail(b,p,l,c);
            }
        }
    }
    public ToiletPaper deleteAtIth(int position){
        ToiletPaper deletedNode;
        if(position<=0){
            deletedNode = head;
            deleteFromHead();
        }else {
            ToiletPaper temp = head;
            for(int i=0;temp!=null&&i<position-1;i++){
                temp = temp.next;
            }
            //System.out.println(temp.getColor());
            //System.out.println(temp.next.getColor());
            if(temp==null){
                deletedNode = tail;
                deleteFromTail();
            }else {
                ToiletPaper temp2 = temp.next.next;
                deletedNode = temp.next;
                temp.next = temp2;
                temp2.prev = temp;
            }
        }
        return deletedNode;
    }
    public ToiletPaper deleteElement(String brand,String color){
        ToiletPaper deletedNode;
        if(!(head==null)){
            if(head==tail && (head.getBrand().equalsIgnoreCase(brand)&&head.getColor().equalsIgnoreCase(color))){
                deletedNode = head;
                deleteFromHead(); //have 1 node => delete
            }else if(head.getBrand().equalsIgnoreCase(brand)&&head.getColor().equalsIgnoreCase(color)){
                deletedNode = head;
                deleteFromHead(); //delete at head
            }else if(tail.getBrand().equalsIgnoreCase(brand)&&tail.getColor().equalsIgnoreCase(color)){
                deletedNode = tail;
                deleteFromTail();
            }else {
                ToiletPaper temp;
                for(temp=head;temp!=null && temp.next.getColor().equalsIgnoreCase(color)
                        && temp.next.getBrand().equalsIgnoreCase(brand);temp=temp.next){
                }
                deletedNode = temp;
                temp = temp.prev;
                ToiletPaper temp2 = temp.next.next;
                temp.next = temp2;
                temp2.prev = temp;
            }
        }else {
            deletedNode = null;
        }
        return deletedNode;
    }
}
