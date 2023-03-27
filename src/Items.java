public class Items {
    //Our variable is a case sensitive, double check the CASE TRANSFORMATION
    String ProdName, ProdDiscription;
    int ProdPrice,ProdID;

    Items(String ProdName, String ProdDiscription, int prodPrice2, int prodID2){
        //Is string variabble
        this.ProdName = ProdName;
        this.ProdDiscription = ProdDiscription;

        //int variable
        this.ProdPrice = prodPrice2;
        this.ProdID = prodID2;
    }

    //implicit method 
    void displayProduct(){
        //Item display on console
        print("Product Name : " + ProdName);
        print("ProdDiscription : " + ProdDiscription);
        print("ProdPrice  : " + ProdPrice);
        print("ProdID : " + ProdID);

    }

    

    void print(String word){
        System.out.println(word);
    }
    
}
