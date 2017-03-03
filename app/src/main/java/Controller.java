/**
 * Created by Jerry Dengu on 13/02/2017.
 */
import java.util.ArrayList;
public class Controller {

    private ArrayList<ModelProducts> myProducts = new ArrayList<ModelProducts>();
    private ModelCart prodCart = new ModelCart();
    public ModelProducts getProducts(int prodPosition){
        return myProducts.get(prodPosition);
    }
    public void setProducts (ModelProducts Products){
        myProducts.add(Products);
    }
  public ModelCart getCart(){
      return prodCart;
  }
    public int getProductsArraylistSize()
    {
        return myProducts.size();
    }
}
