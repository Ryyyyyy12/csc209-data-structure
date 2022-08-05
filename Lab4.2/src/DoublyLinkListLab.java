public class DoublyLinkListLab {
    public static void main(String[] args) {
        DoublyLinkedList list1 = new DoublyLinkedList();
        list1.addToTail("Scott",100.00,10,"Pink");
        System.out.println(list1.tail.getColor());
        //Pink

        list1.addToHead("Scott",50,20,"Yellow");
        list1.printAllColor();
        System.out.println();
        //Yellow -> Pink

        list1.deleteFromHead();
        System.out.println(list1.head.getColor());
        //Pink

        list1.addToHead("Scott",50,20,"Blue");
        list1.addToHead("Scott",50,20,"Gray");
        list1.addToHead("Scott",50,20,"Orange");
        list1.printAllColor();
        System.out.println();
        //Orange -> Gray -> Blue -> Pink

        list1.deleteFromTail();
        list1.printAllColor();
        //Orange -> Gray -> Blue
        System.out.println();

        list1.insertAtIth("Scott",50,20,"Rainbow",2);
        //Orange -> Gray -> Rainbow -> Blue
        list1.insertAtIth("Scott",50,20,"White",0);
        //White -> Orange -> Gray -> Rainbow -> Blue
        list1.insertAtIth("Scott",50,20,"White",5);
        //White -> Orange -> Gray -> Rainbow -> Blue -> White
        list1.printAllColor();
        System.out.println();

        list1.deleteAtIth(3);
        list1.printAllColor();
        //White -> Orange -> Gray -> Blue -> White
        list1.deleteAtIth(-3);
        list1.printAllColor();
        //Orange -> Gray -> Blue -> White
        list1.deleteAtIth(2);
        //Orange -> Gray -> White
        list1.printAllColor();
        list1.deleteAtIth(10);
        //Orange -> Gray
        list1.printAllColor();

        list1.deleteElement("Scott","Gray");
        list1.printAllColor();
        //Orange

        list1.addToTail("Scott",50,20,"Green");
        list1.insertAtIth("Scott",50,20,"Blue",30);
        list1.insertAtIth("Scott",50,20,"White",30);
        //Orange -> Green -> Blue -> White
        list1.deleteElement("Scott","White");
        //Orange -> Green -> Blue
        list1.printAllColor();







    }

}
