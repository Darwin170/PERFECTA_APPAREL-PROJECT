/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author umeng
 */
public abstract class Product {

    private String productID;
    private String productName;
    private String productColorTshirt;
    private String productDesigns;
   
    private boolean isSelected = false;
    private String productimage;
   
   

    public String getProductID() {
        return this.productID;
    }

    public void setProductID(String id) {
        this.productID = id;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public String getProductColorTshirt() {
        return this.productColorTshirt;
    }

    public void setProductColorTshirt(String colortshirt) {
        this.productColorTshirt = colortshirt;
    }

    public String getProductDesigns() {
        return this.productDesigns;
    }

    public void setProductDesigns(String designs) {
        this.productDesigns = designs;
    }

    public String getProductimage() {
        return this.productimage;
    }

    public void setProductImage(String path) {
        this.productimage = path;
    }

    public boolean getProductStatus() {
        return this.isSelected;
    }

    public void setProductStatus(boolean status) {
        this.isSelected = status;
    }

 
}