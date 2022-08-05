public class SinglyLinkedList {
    ToiletPaper head,tail;

    public SinglyLinkedList(){
        head = tail = null; //no node at first
    }
    public void addToHead(String b,double p,int l,String c){ //brand , price , length , color
        if(head==null){
            head = tail = new ToiletPaper(b,p,l,c,null);
        }else {
            head = new ToiletPaper(b, p, l, c, head); //next of new node is the current head
        }
    }

    public void addToTail(String b,double p,int l,String c){
        if(head==null){
            head = tail = new ToiletPaper(b,p,l,c,null);
        }else {
            tail.next = new ToiletPaper(b,p,l,c,null);
            tail = tail.next;
            //another way : loop to search for the former tail (but don't do)
            /* tail = new ToiletPaper(b,p,l,c,null);
                for(t = head ; t.next != null ; t = t.next){}
                t.next = tail;
            */
        }
    }
    public ToiletPaper deleteFromHead(){
        ToiletPaper deletedNode = head;
        if(head==tail){ //no node / 1 node
            head = tail = null;
        }else {
            head = head.next;
        }
        return deletedNode;
    }

    public String deleteFromTail(){
        String deletedNode;
        if(head==tail){ //no node or 1 node
            head = tail = null;
            deletedNode = "";
        }else {
            deletedNode = tail.toString();
            //search for the node in front of last node
            ToiletPaper temp;
            for(temp = head; temp.next != tail;temp = temp.next){
                //empty loop -> just keep moving for the searching
            }
            tail = temp;
            tail.next = null;
        }
        return deletedNode;
    }
    public void printAllToiletPaperColors(){
        for (ToiletPaper temp = head ; temp != null ; temp = temp.next){
            System.out.print(temp.getColor()+" ");
        }
    }
    public String findToiletPaperByColor(String color){
        //print all brand of toilet paper that uses the given color
        String ans="";
        for(ToiletPaper temp = head ; temp != null ; temp = temp.next){
            if(temp.getColor().equalsIgnoreCase(color)){
                ans+=temp.getBrand() +" ";
            }
        }
        return ans;
    }
    public void insertAtIth(String b,double p,int l,String c,int positionIth){
        //The first item is at 0th.
        if(positionIth<=0){
            addToHead(b, p, l, c);
        }else {
            ToiletPaper temp = head;
            for(int i=0;temp != null && i<positionIth-1;i++){ //temp stop before position i
                temp = temp.next;
            }
            if(temp != null){
                temp.next = new ToiletPaper(b,p,l,c,temp.next);
            }else {
                addToTail(b,p,l,c); //if position more than current position
            }
        }
    }
    public ToiletPaper deleteAtIth(int position){
        ToiletPaper deletedNode;
        if(head == tail){
            head = tail = null;
            deletedNode = null;
        }else{
            if(position<=0){
                deleteFromHead();
                deletedNode = head;
            }else {
                ToiletPaper temp = head;
                for(int i=0 ; temp!=null && i< position-1 ;i++){
                    temp = temp.next;
                }
                deletedNode = temp.next;
                if(temp==null){
                    deleteFromTail();
                }else {
                    temp.next = temp.next.next;
                }
            }
        }
        return deletedNode;
    }
    public void swapInfo(int i,int j){
        ToiletPaper temp1 = head;
        ToiletPaper temp2 = head;
        for(int x=0;temp1!=null&&x<i;x++){
            temp1 = temp1.next;
        }
        for (int y=0;temp2!=null&&y<j;y++){
            temp2 = temp2.next;
        }
        if(temp1!=null && temp2!=null){
            String temp3 = temp1.getColor();
            temp1.setColor(temp2.getColor());
            temp2.setColor(temp3);
        }
    }
}
