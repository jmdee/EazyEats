/**
 * Created by Jerry Dengu on 13/02/2017.
 */

public class ModelProducts {
    private String productName;
    private String prodDescription;
    private Double productPrice;
    private Double deliveryPrice;
    public ModelProducts(String productName,String prodDescription,Double productPrice,Double deliveryPrice)
    {
        this.productName = productName;
        this.prodDescription = prodDescription;
        this.productPrice = productPrice;
        this.deliveryPrice = deliveryPrice;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }
    public String getProdDescription(){
        return prodDescription;
    }
    public Double getDeliveryPrice(){
        return deliveryPrice;
    }
}
