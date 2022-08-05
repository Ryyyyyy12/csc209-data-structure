public class Restuarant {
    public static void main(String[] args) {
        Food[] menu = new Food[100];
        Food f1 = new Food("Padthai", 70.00, 200,"Noodle");
        menu[0] = f1;
        System.out.println(("Lab1: StudentID: 64130500207 ,Kevalin Srisakulpong"));
        System.out.println(menu[0].getName()+" "+menu[0].getPrice());
        f1.addIngredient("Thin noodle", 200);
        f1.addIngredient("shrimp", 100);
        f1.addIngredient("Beansprout", 50);
        f1.addIngredient("egg", 1);
        f1.addIngredient("Tofu", 50);
        //System.out.println("The number of ingredients of "+"Padthai is "+f1.getAmountOfIngredient());
        System.out.println("The number of ingredients of "+"Padthai is "+menu[0].getAmountOfIngredient());
        menu[1] = new Food("Orange Juice", 30, 100, "Drink");
        menu[1].addIngredient("Orange", 1);
        menu[1].addIngredient("salt", 20);
        menu[1].addIngredient("sugar", 40);

        menu[2] = new Food("Corn soup", 80, 300, "Soup");
        menu[2].addIngredient("Corn", 200);
        menu[2].addIngredient("salt", 20);
        menu[2].addIngredient("Milk", 200);

        for(int i=0;i<menu.length&&menu[i]!=null;i++){
            System.out.println(menu[i].getName()+" "+menu[i].getPrice());
//            for(String ingredient: menu[i].ingredient){
//                System.out.print(ingredient+" ");
//            }
//            for(int j=0;j<menu[i].ingredient.length&&menu[i].ingredient[j]!=null;j++){
            for(int j=0;j<menu[i].getAmountOfIngredient();j++){
                System.out.print(menu[i].ingredient[j]+":"+menu[i].ingredientQuantity[j]+", ");
            }
            System.out.print("");
        }
    }
}
