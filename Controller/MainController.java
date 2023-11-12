package Controller;
   import Models.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.AmbientLight;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MainController implements Initializable {
    
             @FXML
             Button tshirt1 , tshirt2 ,tshirt3 , tshirt4
            , tshirt5,tshirt6,tshirt7,tshirt8,Btndesign;
            @FXML
         ImageView clr1,clr2,clr3,clr4
        ,clr5,clr6,clr7,clr8;

        @FXML
        private Stage stage;
    
        @FXML
        private Scene scene;
    
        @FXML
        private Label ACBla,ACBLla,ACDGla,ACDVla,ACGla,
                ACLla,ACOla,ACPla;
    
        @FXML
        static Parent root = null;
      
        FXMLLoader loader;
        static ProductStore productStore= new ProductStore();

        static AcidBlack ACB= new AcidBlack();
        static AcidBlue ACBL= new AcidBlue();
        static AcidDyeGreen ACDG=new AcidDyeGreen();
        static AcidDyeViolet ACDV=new AcidDyeViolet();
        static AcidGrey ACG=new AcidGrey();
        static AcidLavender ACL=new AcidLavender();
        static AcidOrange ACO=new AcidOrange();
        static AcidPurple ACP=new AcidPurple();
    @Override
    public void initialize(URL url, ResourceBundle rb) {

                 //ACID BLACK
        ACB.setProductName("ACB");
        ACBla.setText(ACB.getProductName());
        ACB.setProductColorTshirt("Acid Black");
        ACBla.setText((ACB.getProductColorTshirt()));
        
         ACB.setProductImage("image/Acid Black.png");
        Image AcidBlack = new Image(ACB.getProductimage());
        clr1.setImage(AcidBlack);
          System.out.println("DADA");

                // ACID BLUE
        ACBL.setProductName("ACBL");
        ACBLla.setText(ACBL.getProductName());
        ACBL.setProductColorTshirt("Acid Blue");
        ACBLla.setText((ACBL.getProductColorTshirt()));
        
        ACBL.setProductImage("image/Acid Blue.png");
        Image AcidBlue = new Image(ACBL.getProductimage());
        clr2.setImage(AcidBlue);

                // ACID DYE GREEN
        ACDG.setProductName("ACDG");
        ACDGla.setText(ACDG.getProductName());
        ACDG.setProductColorTshirt("Acid Dye Green");
        ACDGla.setText((ACDG.getProductColorTshirt()));
        
        ACDG.setProductImage("image/Acid Dye Green.png");
        Image AcidDyeGreen = new Image(ACDG.getProductimage());
        clr3.setImage(AcidDyeGreen);

                // ACID DYE VIOLET
        ACDV.setProductName("ACDV");
        ACDVla.setText(ACDV.getProductName());
        ACDV.setProductColorTshirt("Acid Dye Violet");
        ACDVla.setText((ACDV.getProductColorTshirt()));
        
         ACDV.setProductImage("image/Acid Dye Violet.png");
        Image AcidDyeViolet = new Image(ACDV.getProductimage());
        clr4.setImage(AcidDyeViolet);

                // ACID GREY
        ACG.setProductName("ACG");
        ACGla.setText(ACG.getProductName());
        ACG.setProductColorTshirt("Acid Grey");
        ACGla.setText((ACG.getProductColorTshirt()));
        
        ACG.setProductImage("image/Acid Grey.png");
        Image AcidGrey = new Image(ACG.getProductimage());
        clr5.setImage(AcidGrey);      
        
                // ACID LAVANDER
           ACL.setProductName("ACL");
        ACLla.setText(ACL.getProductName());
         ACL.setProductColorTshirt("Acid Lavander");
        ACLla.setText((ACL.getProductColorTshirt()));
        
         ACL.setProductImage("image/Acid Lavender.png");
        Image AcidLavender = new Image(ACL.getProductimage());
        clr6.setImage(AcidLavender);

                // ACID ORANGE
           ACO.setProductName("ACO");
        ACOla.setText(ACO.getProductName());
         ACO.setProductColorTshirt("Acid Orange");
        ACOla.setText((ACO.getProductColorTshirt()));
        
         ACO.setProductImage("image/Acid Orange.png");
        Image AcidOrange = new Image(ACO.getProductimage());
        clr7.setImage(AcidOrange);

                // ACID PURPLE
           ACP.setProductName("ACP");
        ACPla.setText(ACP.getProductName());
         ACP.setProductColorTshirt("Acid Purple");
        ACPla.setText((ACP.getProductColorTshirt()));
        
         ACP.setProductImage("image/Acid Purple.png");
        Image AcidPurple = new Image(ACP.getProductimage());
        clr8.setImage(AcidPurple);
            
    }

    public void select(ActionEvent event) throws IOException {
        AlertMaker.showSimpleAlert("", "Item added");
        Button sourceButton = (Button) event.getSource();
        
        if (sourceButton.equals(tshirt1)) {
            ACB.setProductStatus(true);
            ProductStore.addSelectedProduct(ACB);
             System.out.println(ACB);
        }
         if (sourceButton.equals(tshirt2)) {
            ACBL.setProductStatus(true);
            ProductStore.addSelectedProduct(ACBL); 
        }
          if (sourceButton.equals(tshirt3)) {
            ACDG.setProductStatus(true);
            ProductStore.addSelectedProduct(ACDG); 
        }
          if (sourceButton.equals(tshirt4)) {
            ACDV.setProductStatus(true);
            ProductStore.addSelectedProduct(ACDV); 
        }
          if (sourceButton.equals(tshirt5)) {
            ACG.setProductStatus(true);
            ProductStore.addSelectedProduct(ACG); 
        }
          if (sourceButton.equals(tshirt6)) {
            ACL.setProductStatus(true);
            ProductStore.addSelectedProduct(ACL); 
        }
         if (sourceButton.equals(tshirt7)) {
            ACO.setProductStatus(true);
            ProductStore.addSelectedProduct(ACO); 
        }
          if (sourceButton.equals(tshirt8)) {
            ACO.setProductStatus(true);
            ProductStore.addSelectedProduct(ACO); 
        }
        System.out.println(productStore.getSelectedProducts());
    }

    
    
  public void Gotodesigns(ActionEvent event) throws IOException {
    
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/designs.fxml"));
    Parent root = loader.load();
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    
}
}
