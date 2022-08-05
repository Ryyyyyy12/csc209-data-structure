public class SinglyLinkedListLab {
    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.addToHead("Scott",100.00,10,"Pink");
        list1.addToHead("Scott",300,37,"Blue");
        //"Scott Pink"
        //"Scott Blue" -> "Scott Pink"
        System.out.println(list1.head.getColor());
        System.out.println(list1.tail.getColor());
        list1.addToHead("Gucci",50000,3,"Gold");
        //"Gucci gold" -> "Scott Blue" -> "Scott Pink"
        System.out.println(list1.head.getColor()+" "+list1.tail.getColor()); //get head and tail
        System.out.println(list1.head.next.getColor()); //print blue (next to head)
        list1.addToHead("Festa",200,12,"Orange");
        list1.addToHead("Festa",210,15,"Red");
        //"Red" -> "Orange" -> "Gucci gold" -> "Scott Blue" -> "Scott Pink"
        System.out.println(list1.head.getColor()+" "+list1.tail.getColor()); //get head and tail

        //Blue
        System.out.println(list1.head.next.next.next.getColor());

        list1.addToTail("Supreme",1000,5,"Silver");
        //"Red" -> "Orange" -> "Gucci gold" -> "Scott Blue" -> "Scott Pink" -> "Silver"
        System.out.println(list1.tail.getColor());

        list1.deleteFromHead();
        System.out.println(list1.head.getColor());
        //"Orange" -> "Gucci gold" -> "Scott Blue" -> "Scott Pink" -> "Silver"

        list1.deleteFromTail();
        System.out.println(list1.tail.getColor());
        //"Orange" -> "Gucci gold" -> "Scott Blue" -> "Scott Pink"

        list1.printAllToiletPaperColors();
        //"Orange" -> "Gucci gold" -> "Scott Blue" -> "Scott Pink"
        System.out.println();

        list1.addToHead("Gucci",10000,20,"Blue");
        //"Gucci blue" -> "Orange" -> "Gucci gold" -> "Scott Blue" -> "Scott Pink"
        System.out.println(list1.findToiletPaperByColor("Blue"));

        list1.insertAtIth("Scott",100,20,"Pink",2);
        //"Gucci blue" -> "Orange" -> "Scott Pink" -> "Gucci gold" -> "Scott Blue" -> "Scott Pink"
        list1.printAllToiletPaperColors();

        System.out.println();
        list1.deleteAtIth(2);
        list1.printAllToiletPaperColors();
        System.out.println();
        //"Gucci blue" -> "Orange" -> "Gucci gold" -> "Scott Blue" -> "Scott Pink"

        list1.swapInfo(0,4);
        list1.printAllToiletPaperColors();
    }

}
