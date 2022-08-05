public class BinarySearchTreeLab {
    public static void main(String[] args) {
        BinarySearchTree tree1 = new BinarySearchTree();
        tree1.addNewNode(50);
        System.out.println(tree1.root.getInfo()); //50
        tree1.addNewNode(20);
                            //50
                //20
        System.out.println(tree1.root.left.getInfo()); //20
        tree1.addNewNode(40);
                            //50
                //20
                    //40
        System.out.println(tree1.root.left.right.getInfo()); //40
        //System.out.println(tree1.root.left.left.getInfo()); -> error no left of left from root
        tree1.addNewNode(100);
        tree1.addNewNode(150);
        tree1.addNewNode(1000000);
        tree1.addNewNode(50);
                            //50
                //20                    //100
                    //40           //50       //150
                                                    //1000000
        System.out.println(tree1.root.right.right.right.getInfo()); //1000000
        System.out.println(tree1.root.right.left.getInfo());//50


        BinarySearchTreeNode x = tree1.search(350);
        if(x!=null){
            System.out.println(x.getInfo());
        }else {
            System.out.println("Not found");
        }
    }
}
