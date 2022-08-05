public class LargeNumberAdditionUsingStack {
    /*public static void main(String[] args) {
        //------Stack-------
        OurStack st1 = new OurStack(4);
        st1.push(50);
        st1.push(93);
        System.out.println(st1.topElement()); //93
        st1.push(34);
        System.out.println(st1.isEmpty() + " "+st1.isFull()); //false false
        st1.push(55);
        System.out.println(st1.isEmpty() + " "+st1.isFull()); //false true
        st1.push(97); //error (full) cannot push anymore
        System.out.println(st1.pop()); //55
        System.out.println(st1.topElement()); //34

        //----addBignumber-----

        String a ="33333333333333333333333333333333333333333333333333333333333333333" +
                "33333333333333333333333333333333333333333333333333333333333333333" +
                "33333333333333333333333333333333333333333333333333333333333333333" +
                "33333333333333333333333333333333333333333333333333333333333333333" +
                "33333333333333333333333333333333333333333333333333333333333333333" +
                "33333333333333333333333333333333333333333333333333333333333333333" ;
        BigNumber n1 = new BigNumber(a);
        BigNumber n2 = n1.add(new BigNumber(a));
        System.out.println(n2.toString());
        BigNumber n3 = n2.add(new BigNumber(n2.toString()));
        System.out.println(n3.toString());

        String b = "7".repeat(400);
        String c = "8".repeat(500);
        BigNumber n6 = new BigNumber(b);
        BigNumber n7 = n6.add(new BigNumber(c));
        System.out.println(n7.toString());
        BigNumber n8 = new BigNumber("999");
        BigNumber n9 = n8.add(new BigNumber("1"));
        System.out.println(n9.toString());

        //------Queue--------
        Queue q1 = new Queue(4);
        q1.enqueue(1); //1
        q1.enqueue(2); //1 2
        q1.enqueue(3); //1 2 3
        System.out.println(q1.dequeue()); //1     //_ 2 3 _
        q1.enqueue(4); // _ 2 3 4
        System.out.println(q1.dequeue()); //2      //_ _ 3 4
        q1.enqueue(5); // 5 _ 3 4
        System.out.println(q1.dequeue()); //3       //5 _ _ 4
        System.out.println(q1.dequeue()); //4       //5 _ _ _
        System.out.println(q1.dequeue()); //5       //_ _ _ _
        System.out.println(q1.dequeue()); //-1

    }*/
}
