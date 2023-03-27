import java.util.*;


public class Main {


    /* PROJECT 
 * 0. pick method to use " 1- Register, 2- delete, 3- change, 4- inventory size , 5- display all product , 6- remove product, 7- clear inventory"
 * 1. Register an item inside to our Array List.
 * 2. add features.
 * 3. remove features
 * 4. Determining the size of invetory
 * 5. Clearing feature 
 * 6. displaying all items of our inventory
 * 7. CHANGING THE NAME/PRICE/DISCRIP/ID
 */


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int MenuChoice;



       

        //ArrayList declared
        ArrayList<Items> Itemlist = new ArrayList<Items>();

        
        //LOOPING FUNCTION
        do{
            MenuChoice = displayUserChoice(sc);

            
            switch(MenuChoice){
                case 1: // Register an Item
                        System.out.println("Registering an Item");
                        System.out.println("");
                        System.out.print("How many Item would you like to register? : ");
                        int RegNum = sc.nextInt();
                        sc.nextLine();


                            int Stop = 0;
                            while(Stop != RegNum){
                                        // ASKING PRODUCT FEATURE
                                            print("Product Name : ");
                                            String ProdName = sc.nextLine();
                                            print("Product Discription : ");
                                            String ProdDiscription = sc.nextLine();

                                            print("Product Price : ");
                                            int ProdPrice = sc.nextInt();
                                            sc.nextLine();

                                            print("Product ID : ");
                                            int ProdID = sc.nextInt();
                                            sc.nextLine();
                                            // ASKING PRODUCT FEATURE

                                            //ADDING/REGISTERING PRODUCT FEATURES   
                                            Itemlist.add(new Items(ProdName,ProdDiscription,ProdPrice,ProdID));
                                    

                                    
                                    Stop++;
                                }

                        break;
                case 2:
                        System.out.println("UPDATE PRODUCT: ");
                        System.out.println("");
                        System.out.println("What index would you like to update? : ");
                        int IndexChange = sc.nextInt();
                        sc.nextLine();
                            
                            System.out.println("New Prodname : ");
                            String newProdName = sc.nextLine();

                            System.out.println("New ProdDiscription : ");
                            String newProdDiscription = sc.nextLine();

                            System.out.println("New ProdPrice : ");
                            int newProdPrice = sc.nextInt();
                            sc.nextLine();

                            System.out.println("New ProdID : ");
                            int newProdID = sc.nextInt();
                            sc.nextLine();

                            //CHANGING FEATURES
                            Itemlist.set(IndexChange, new Items(newProdName, newProdDiscription, newProdPrice, newProdID));

                        
                            //STATUS COMPLETE:
                        break;
                case 3:
                        System.out.println("REMOVING PRODUCT :  ");
                        System.out.println(" ");
                        System.out.println("What index do you want to remove? : ");
                        int RemoveProduct = sc.nextInt();
                        sc.nextLine();

                            Itemlist.remove(RemoveProduct);
                        break;

                            //STATUS YET TO CHECK: 
                case 4:
                        System.out.println("NUMBER OF REGISTERED ITEM ON INVENTORY : ");
                        System.out.println(Itemlist.size());
                        break;

                        //STATUS YET TO CHECK: 


                case 5:
                        System.out.println("DISPLAYING ALL ITEM REGISTERED ON INVERTORY: ");

                        for(Items e: Itemlist){
                            System.out.println("---------------------------------------");
                            System.out.println("");
                            e.displayProduct();
                            System.out.println("");
                            System.out.println("---------------------------------------");

                        }
                        break;
                case 6:
                        System.out.println("DELETING ALL ITEM IN OUT INVENTORY ");
                        System.out.println("");
                        System.out.println("Are you sure you want to delete all ITEMS? : ");
                        String DelConfirmation = sc.nextLine();

                            if(DelConfirmation == "Yes"){
                                Itemlist.clear();
                                break;
                            }else if (DelConfirmation == "No"){
                                break;
                            }else{
                                System.out.println("Out of the choices!");
                            }
                        break;

                case 7:
                            System.out.println("EXIT ");
                            break;
                default:
                    System.out.println("Out of the choices");
                break;

        }}while(MenuChoice != 7);

    }

    static void print(String word){
        System.out.print(word);
    }
    
    public static int displayUserChoice(Scanner sc){
        System.out.print("Menu : 1 - Register, 2 - Change product, 3- Remove Product, 4- Inventory size, 5- Display all ITEMS,  6- Clear inventory, 7- Exit : ");


        return sc.nextInt();
    }
}
