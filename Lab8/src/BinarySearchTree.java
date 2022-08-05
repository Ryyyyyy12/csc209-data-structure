public class BinarySearchTree {
    BinarySearchTreeNode root;

    public BinarySearchTree(){
        root = null;
    }
    public void addNewNode(int newInfo){
        BinarySearchTreeNode temp = root;
        if(root == null){
            root = new BinarySearchTreeNode(newInfo,null,null);
        }else {
            while(true){
                if(newInfo < temp.getInfo() && temp.left != null ){
                    temp = temp.left;
                }else if(newInfo >= temp.getInfo() && temp.right != null){
                    temp = temp.right;
                }else if(newInfo < temp.getInfo()){ //temp.left is null
                    temp.left = new BinarySearchTreeNode(newInfo,null,null);
                    break;
                }else { //new Info >= temp.info && temp.right is null
                    temp.right = new BinarySearchTreeNode(newInfo,null,null);
                    break;
                }
            }
        }

    }
    public BinarySearchTreeNode search(int key){
        /*BinarySearchTreeNode temp = root;
        while(true){
            if(temp.getInfo() == key) return true;
            BinarySearchTreeNode temp2 = key < temp.getInfo() ? temp.left : temp.right;
            if(temp2 != null) temp = temp2;
            else return false;
        }*/
        BinarySearchTreeNode temp = root;
        while (temp != null && temp.getInfo() != key){
            if(key< temp.getInfo()){
                temp =temp.left;
            }else {
                temp = temp.right;
            }
        }
        return temp;
    }
}
