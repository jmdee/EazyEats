import java.util.ArrayList;

/**
 * Created by Jerry Dengu on 13/02/2017.
 */
import java.util.ArrayList;
public class ModelCart {
    private ArrayList<ModelProducts> cartProducts = new ArrayList<ModelProducts>();
    public ModelProducts getProducts(int prodPosition){
        return cartProducts.get(prodPosition);
    }
    public void setProducts(ModelProducts Products){
        cartProducts.add(Products);
    }
    public int getCartSize(){
        return cartProducts.size();
    }
    public boolean checkProductInCart(ModelProducts aProduct){
        return cartProducts.contains(aProduct);
    }
}
