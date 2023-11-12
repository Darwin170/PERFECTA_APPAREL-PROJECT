package Controller;

import Controller.MainController;
import Models.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.ResourceBundle;

import Alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class designController implements Initializable{

    @FXML
   private Button ds1,ds2,ds3,ds4,ds5,ds6,ds7,ds8,ds9,ds10,ds11,
            ds12,btnSel,tshirt1 , tshirt2 ,tshirt3 , tshirt4
            , tshirt5,tshirt6,tshirt7,tshirt8;
     
@FXML
 private ImageView ImgMo,ImgDe,ImgHo,ImgLe
        ,ImgIn,ImgOB,ImgPA,ImgPe,ImgRg,ImgRe,ImgRi,ImgYa,ACBMN,ACGMN;

    
       @FXML
    private Stage stage;
  
        @FXML
        private Label Mola,Dela,Hola,Lela,INla,
                OBSFla,PAGla,Pla,Rgla,RENAIla,Rila,Yala;
    @FXML 
    private Scene scene;
   
  
    
    @FXML
    static Parent root = null;

    FXMLLoader loader;
    
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;

    private Alert alert;
   ProductStore productStore = MainController.productStore;
   static Mona Mn= new Mona();
   static Death Dea= new Death();
   static Hope HP=new Hope();
   static InsideMe IM=new InsideMe();
   static Lexi LX=new Lexi();
   static OkayBearsStreetFasion OBSF=new OkayBearsStreetFasion();
   static Perfecto PE= new Perfecto();
   static PerfectaApparelGrey PAG=new PerfectaApparelGrey();
   static ReallyGreat RG=new ReallyGreat();
   static Renaissance RENAI =new Renaissance();
   static Rica RI=new Rica();
   static Yakuza YA=new Yakuza();

   static AcidBlack ACB=  MainController.ACB;
   static AcidBlue ACBL= MainController.ACBL;
   static AcidDyeGreen ACDG= MainController.ACDG;
   static AcidDyeViolet ACDV= MainController.ACDV;
   static AcidGrey ACG= MainController.ACG;
   static AcidLavender ACL= MainController.ACL;
   static AcidOrange ACO= MainController.ACO;
   static AcidPurple ACP= MainController.ACP;
@Override
public void initialize(URL location, ResourceBundle resources) {
    
    
                 //MONA LISA
    Mn.setProductName("MONA");
    Mola.setText(Mn.getProductName());
    Mn.setProductDesigns("MONA LISA");
    Mola.setText((Mn.getProductDesigns()));
                 
    Mn.setProductImage("image/Monalisa.png");
    Image Monalisa = new Image(Mn.getProductimage());
    ImgMo.setImage(Monalisa);

    

                 //DEATH
    Dea.setProductName("DEATH");
    Dela.setText(Dea.getProductName());
    Dea.setProductDesigns("DEATH");
    Dela.setText((Dea.getProductDesigns()));
                 
    Dea.setProductImage("image/Death.png");
    Image Death = new Image(Dea.getProductimage());
    ImgDe.setImage(Death);

                 //HOPE
    HP.setProductName("HOPE");
    Hola.setText(HP.getProductName());
    HP.setProductDesigns("HOPE");
    Hola.setText((HP.getProductDesigns()));
                 
    HP.setProductImage("image/Hope.png");
    Image Hope = new Image(HP.getProductimage());
    ImgHo.setImage(Hope);

                 //INSIDE ME
    IM.setProductName("INSIDE ME");
    INla.setText(IM.getProductName());
    IM.setProductDesigns("Inside me");
    INla.setText((IM.getProductDesigns()));
                 
    IM.setProductImage("image/Inside Me.png");
    Image InsideMe = new Image(IM.getProductimage());
    ImgIn.setImage(InsideMe);

                 //LEXI
    LX.setProductName("LEXI");
    Lela.setText(LX.getProductName());
    LX.setProductDesigns("LEXI");
    Lela.setText((LX.getProductDesigns()));
                 
    LX.setProductImage("image/Lexi.png");
    Image LEXI = new Image(LX.getProductimage());
    ImgLe.setImage(LEXI);

                 //OKAY BEARS STREET FASION
    OBSF.setProductName("OKAY BEARS STREET FASION");
    OBSFla.setText(OBSF.getProductName());
    OBSF.setProductDesigns("Okay Bears Street Fasion");
    OBSFla.setText((OBSF.getProductDesigns()));
                 
    OBSF.setProductImage("image/Okay Bears Street Fasion.png");
    Image OkayBearsStreetFasion = new Image(OBSF.getProductimage());
    ImgOB.setImage(OkayBearsStreetFasion);

                  //PERFECTA APPAREL GREY
    PAG.setProductName("PERFECTA APPAREL GREY");
    PAGla.setText(PAG.getProductName());
    PAG.setProductDesigns("PERFECTA APPAREL GREY");
    PAGla.setText((PAG.getProductDesigns()));
                 
    PAG.setProductImage("image/Perfecta Apparel Grey.png");
    Image PerfectaApparelGrey = new Image(PAG.getProductimage());
    ImgPA.setImage(PerfectaApparelGrey);

                 //PERFECTO
    PE.setProductName("PERFECTO");
    Pla.setText(PE.getProductName());
    PE.setProductDesigns("Perfecto");
    Pla.setText((PE.getProductDesigns()));
                 
    PE.setProductImage("image/Perfecto.png");
    Image Perfecto = new Image(PE.getProductimage());
    ImgPe.setImage(Perfecto);

                 //REALLY GREAT
    RG.setProductName("REALLY GREAT");
    Rgla.setText(RG.getProductName());
    RG.setProductDesigns("Really Great");
    Rgla.setText((RG.getProductDesigns()));
                 
    RG.setProductImage("image/Really Great.png");
    Image ReallyGreat = new Image(RG.getProductimage());
    ImgRg.setImage(ReallyGreat);

    
                 //RENAISSANCE
    RENAI.setProductName("RENAISSANCE");
    RENAIla.setText(RENAI.getProductName());
    RENAI.setProductDesigns("Renaissance");
    RENAIla.setText((RENAI.getProductDesigns()));
                 
    RENAI.setProductImage("image/Renaissance.png");
    Image Renaissance = new Image(RG.getProductimage());
    ImgRe.setImage(Renaissance);

    
                 //RICA
    RI.setProductName("RICA");
    Rila.setText(RI.getProductName());
    RI.setProductDesigns("Rica");
    Rila.setText((RI.getProductDesigns()));
                 
    RI.setProductImage("image/Rica.png");
    Image Rica = new Image(RI.getProductimage());
    ImgRi.setImage(Rica);

    
                 //YAKUZA
    YA.setProductName("YAKUZA");
    Yala.setText(YA.getProductName());
    YA.setProductDesigns("Yakuza");
    Yala.setText((YA.getProductDesigns()));
                 
    YA.setProductImage("image/Yakuza.png");
    Image Yakuza = new Image(YA.getProductimage());
    ImgYa.setImage(Yakuza);
    
    
    

}

public void design(ActionEvent event) throws IOException {
    AlertMaker.showSimpleAlert("", "Item added");
    Button sourceButton = (Button) event.getSource();

    if (sourceButton.equals(ds1)) {
        Mn.setProductStatus(true);
        ProductStore.addSelectedProduct(Mn);
    } 
     if (sourceButton.equals(ds2)) {
        Dea.setProductStatus(true);
        ProductStore.addSelectedProduct(Dea);
    }  if (sourceButton.equals(ds3)) {
        HP.setProductStatus(true);
        ProductStore.addSelectedProduct(HP);
    }
     if (sourceButton.equals(ds4)) {
        LX.setProductStatus(true);
        ProductStore.addSelectedProduct(LX);
    }
      if (sourceButton.equals(ds5)) {
        IM.setProductStatus(true);
        ProductStore.addSelectedProduct(IM);
    }
      if (sourceButton.equals(ds6)) {
        OBSF.setProductStatus(true);
        ProductStore.addSelectedProduct(OBSF);
    }
      if (sourceButton.equals(ds7)) {
        PAG.setProductStatus(true);
        ProductStore.addSelectedProduct(PAG);
    }
      if (sourceButton.equals(ds8)) {
        PE.setProductStatus(true);
        ProductStore.addSelectedProduct(PE);
    }
      if (sourceButton.equals(ds9)) {
        RG.setProductStatus(true);
        ProductStore.addSelectedProduct(RG);
    }
      if (sourceButton.equals(ds10)) {
        RENAI.setProductStatus(true);
        ProductStore.addSelectedProduct(RENAI);
    }
      if (sourceButton.equals(ds11)) {
        RI.setProductStatus(true);
        ProductStore.addSelectedProduct(RI);
    }
      if (sourceButton.equals(ds12)) {
        YA.setProductStatus(true);
        ProductStore.addSelectedProduct(YA);
    }
    System.out.println(productStore.getSelectedProducts());
    
    }
    


    public void Result(ActionEvent event) throws IOException {
     
        System.out.println("ACB.getProductStatus() = " + ACB.getProductStatus());
        System.out.println("Mn.getProductStatus() = " + Mn.getProductStatus());
        if (ACB.getProductStatus() && Mn.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACB&Mn.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
        
        }
         System.out.println("ACG.getProductStatus() = " + ACG.getProductStatus());
        System.out.println("Mn.getProductStatus() = " + Mn.getProductStatus());
            if (ACG.getProductStatus() && Mn.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACG&Mn.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
           }
            System.out.println("ACO.getProductStatus() = " + ACO.getProductStatus());
        System.out.println("Mn.getProductStatus() = " + Mn.getProductStatus());
            if (ACO.getProductStatus() && Mn.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACO&Mn.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
            System.out.println("ACBL.getProductStatus() = " + ACBL.getProductStatus());
        System.out.println("Mn.getProductStatus() = " + Mn.getProductStatus());
            if (ACBL.getProductStatus() && Mn.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACBL&Mn.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
            System.out.println("ACL.getProductStatus() = " + ACL.getProductStatus());
        System.out.println("Mn.getProductStatus() = " + Mn.getProductStatus());
            if (ACL.getProductStatus() && Mn.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACL&Mn.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
            System.out.println("ACP.getProductStatus() = " + ACP.getProductStatus());
        System.out.println("Mn.getProductStatus() = " + Mn.getProductStatus());
            if (ACP.getProductStatus() && Mn.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACP&Mn.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
            System.out.println("ACDG.getProductStatus() = " + ACDG.getProductStatus());
        System.out.println("Mn.getProductStatus() = " + Mn.getProductStatus());
            if (ACDG.getProductStatus() && Mn.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDG&Mn.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
            System.out.println("ACDV.getProductStatus() = " + ACDV.getProductStatus());
        System.out.println("Mn.getProductStatus() = " + Mn.getProductStatus());
            if (ACDV.getProductStatus() && Mn.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDV&Mn.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
                System.out.println("ACB.getProductStatus() = " + ACB.getProductStatus());
        System.out.println("Dea.getProductStatus() = " + Dea.getProductStatus());
            if (ACB.getProductStatus() && Dea.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACB&Dea.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACG.getProductStatus() = " + ACG.getProductStatus());
        System.out.println("Dea.getProductStatus() = " + Dea.getProductStatus());
            if (ACG.getProductStatus() && Dea.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACG&Dea.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACL.getProductStatus() = " + ACL.getProductStatus());
        System.out.println("Dea.getProductStatus() = " + Dea.getProductStatus());
            if (ACL.getProductStatus() && Dea.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACL&Dea.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACBL.getProductStatus() = " + ACBL.getProductStatus());
        System.out.println("Dea.getProductStatus() = " + Dea.getProductStatus());
            if (ACBL.getProductStatus() && Dea.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACBL&Dea.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACO.getProductStatus() = " + ACO.getProductStatus());
        System.out.println("Dea.getProductStatus() = " + Dea.getProductStatus());
            if (ACO.getProductStatus() && Dea.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACO&Dea.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACP.getProductStatus() = " + ACP.getProductStatus());
        System.out.println("Dea.getProductStatus() = " + Dea.getProductStatus());
            if (ACP.getProductStatus() && Dea.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACP&Dea.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACDG.getProductStatus() = " + ACDG.getProductStatus());
        System.out.println("Dea.getProductStatus() = " + Dea.getProductStatus());
            if (ACDG.getProductStatus() && Dea.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDG&Dea.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACDV.getProductStatus() = " + ACDV.getProductStatus());
        System.out.println("Dea.getProductStatus() = " + Dea.getProductStatus());
            if (ACDV.getProductStatus() && Dea.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDV&Dea.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACB.getProductStatus() = " + ACB.getProductStatus());
        System.out.println("HP.getProductStatus() = " + HP.getProductStatus());
            if (ACB.getProductStatus() && HP.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACB&HO.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
                System.out.println("ACG.getProductStatus() = " + ACG.getProductStatus());
        System.out.println("HP.getProductStatus() = " + HP.getProductStatus());
            if (ACG.getProductStatus() && HP.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACG&HO.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACL.getProductStatus() = " + ACL.getProductStatus());
        System.out.println("HP.getProductStatus() = " + HP.getProductStatus());
            if (ACL.getProductStatus() && HP.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACL&HO.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACBL.getProductStatus() = " + ACBL.getProductStatus());
        System.out.println("HP.getProductStatus() = " + HP.getProductStatus());
            if (ACBL.getProductStatus() && HP.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACBL&HO.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACO.getProductStatus() = " + ACO.getProductStatus());
        System.out.println("HP.getProductStatus() = " + HP.getProductStatus());
            if (ACO.getProductStatus() && HP.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACO&HO.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACP.getProductStatus() = " + ACP.getProductStatus());
        System.out.println("HP.getProductStatus() = " + HP.getProductStatus());
            if (ACP.getProductStatus() && HP.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACP&HO.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACDG.getProductStatus() = " + ACDG.getProductStatus());
        System.out.println("HP.getProductStatus() = " + HP.getProductStatus());
            if (ACDG.getProductStatus() && HP.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDG&HO.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACDV.getProductStatus() = " + ACDV.getProductStatus());
        System.out.println("HP.getProductStatus() = " + HP.getProductStatus());
            if (ACDV.getProductStatus() && HP.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDV&HO.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACB.getProductStatus() = " + ACB.getProductStatus());
        System.out.println("IM.getProductStatus() = " + IM.getProductStatus());
            if (ACB.getProductStatus() && HP.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACB&IM.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACG.getProductStatus() = " + ACG.getProductStatus());
        System.out.println("IM.getProductStatus() = " + IM.getProductStatus());
            if (ACG.getProductStatus() && HP.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACG&IM.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACL.getProductStatus() = " + ACL.getProductStatus());
        System.out.println("IM.getProductStatus() = " + IM.getProductStatus());
            if (ACL.getProductStatus() && HP.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACL&IM.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }  
            System.out.println("ACBL.getProductStatus() = " + ACBL.getProductStatus());
        System.out.println("IM.getProductStatus() = " + IM.getProductStatus());
            if (ACBL.getProductStatus() && HP.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACBL&IM.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            } 
             System.out.println("ACO.getProductStatus() = " + ACO.getProductStatus());
        System.out.println("IM.getProductStatus() = " + IM.getProductStatus());
            if (ACO.getProductStatus() && HP.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACO&IM.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACP.getProductStatus() = " + ACP.getProductStatus());
        System.out.println("IM.getProductStatus() = " + IM.getProductStatus());
            if (ACP.getProductStatus() && HP.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACP&IM.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACDG.getProductStatus() = " + ACDG.getProductStatus());
        System.out.println("IM.getProductStatus() = " + IM.getProductStatus());
            if (ACDG.getProductStatus() && HP.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDG&IM.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACDV.getProductStatus() = " + ACDV.getProductStatus());
        System.out.println("IM.getProductStatus() = " + IM.getProductStatus());
            if (ACDV.getProductStatus() && HP.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDV&IM.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACB.getProductStatus() = " + ACB.getProductStatus());
        System.out.println("LE.getProductStatus() = " + LX.getProductStatus());
            if (ACB.getProductStatus() && LX.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACB&LE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACB.getProductStatus() = " + ACB.getProductStatus());
        System.out.println("LE.getProductStatus() = " + LX.getProductStatus());
            if (ACB.getProductStatus() && LX.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACB&LE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACG.getProductStatus() = " + ACG.getProductStatus());
        System.out.println("LE.getProductStatus() = " + LX.getProductStatus());
            if (ACG.getProductStatus() && LX.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACG&LE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACL.getProductStatus() = " + ACL.getProductStatus());
        System.out.println("LE.getProductStatus() = " + LX.getProductStatus());
            if (ACL.getProductStatus() && LX.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACL&LE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACBL.getProductStatus() = " + ACBL.getProductStatus());
        System.out.println("LE.getProductStatus() = " + LX.getProductStatus());
            if (ACBL.getProductStatus() && LX.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACBL&LE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACO.getProductStatus() = " + ACO.getProductStatus());
        System.out.println("LE.getProductStatus() = " + LX.getProductStatus());
            if (ACO.getProductStatus() && LX.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACO&LE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACP.getProductStatus() = " + ACP.getProductStatus());
        System.out.println("LE.getProductStatus() = " + LX.getProductStatus());
            if (ACP.getProductStatus() && LX.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACP&LE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACDG.getProductStatus() = " + ACDG.getProductStatus());
        System.out.println("LE.getProductStatus() = " + LX.getProductStatus());
            if (ACDG.getProductStatus() && LX.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDG&LE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACDV.getProductStatus() = " + ACDV.getProductStatus());
        System.out.println("LE.getProductStatus() = " + LX.getProductStatus());
            if (ACDV.getProductStatus() && LX.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDV&LE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACB.getProductStatus() = " + ACB.getProductStatus());
        System.out.println("OBSF.getProductStatus() = " + OBSF.getProductStatus());
            if (ACB.getProductStatus() && OBSF.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACB&OBSF.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
                System.out.println("ACG.getProductStatus() = " + ACG.getProductStatus());
        System.out.println("OBSF.getProductStatus() = " + OBSF.getProductStatus());
            if (ACG.getProductStatus() && OBSF.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACG&OBSF.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
                System.out.println("ACL.getProductStatus() = " + ACL.getProductStatus());
        System.out.println("OBSF.getProductStatus() = " + OBSF.getProductStatus());
            if (ACL.getProductStatus() && OBSF.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACL&OBSF.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
                System.out.println("ACBL.getProductStatus() = " + ACBL.getProductStatus());
        System.out.println("OBSF.getProductStatus() = " + OBSF.getProductStatus());
            if (ACBL.getProductStatus() && OBSF.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACBL&OBSF.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
                System.out.println("ACO.getProductStatus() = " + ACO.getProductStatus());
        System.out.println("OBSF.getProductStatus() = " + OBSF.getProductStatus());
            if (ACO.getProductStatus() && OBSF.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACO&OBSF.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
                System.out.println("ACP.getProductStatus() = " + ACP.getProductStatus());
        System.out.println("OBSF.getProductStatus() = " + OBSF.getProductStatus());
            if (ACP.getProductStatus() && OBSF.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACP&OBSF.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
                System.out.println("ACDG.getProductStatus() = " + ACDG.getProductStatus());
        System.out.println("OBSF.getProductStatus() = " + OBSF.getProductStatus());
            if (ACDG.getProductStatus() && OBSF.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDG&OBSF.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
                System.out.println("ACDV.getProductStatus() = " + ACDV.getProductStatus());
        System.out.println("OBSF.getProductStatus() = " + OBSF.getProductStatus());
            if (ACDV.getProductStatus() && OBSF.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDV&OBSF.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
                System.out.println("ACB.getProductStatus() = " + ACB.getProductStatus());
        System.out.println("PE.getProductStatus() = " + PE.getProductStatus());
            if (ACB.getProductStatus() && PE.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACB&PE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
               System.out.println("ACG.getProductStatus() = " + ACG.getProductStatus());
        System.out.println("PE.getProductStatus() = " + PE.getProductStatus());
            if (ACG.getProductStatus() && PE.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACG&PE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }   System.out.println("ACL.getProductStatus() = " + ACL.getProductStatus());
        System.out.println("PE.getProductStatus() = " + PE.getProductStatus());
            if (ACL.getProductStatus() && PE.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACL&PE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
               System.out.println("ACBL.getProductStatus() = " + ACBL.getProductStatus());
        System.out.println("PE.getProductStatus() = " + PE.getProductStatus());
            if (ACBL.getProductStatus() && PE.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACBL&PE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
               System.out.println("ACO.getProductStatus() = " + ACO.getProductStatus());
        System.out.println("PE.getProductStatus() = " + PE.getProductStatus());
            if (ACO.getProductStatus() && PE.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACO&PE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
               System.out.println("ACP.getProductStatus() = " + ACP.getProductStatus());
        System.out.println("PE.getProductStatus() = " + PE.getProductStatus());
            if (ACP.getProductStatus() && PE.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACP&PE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACDG.getProductStatus() = " + ACDG.getProductStatus());
        System.out.println("PE.getProductStatus() = " + PE.getProductStatus());
            if (ACDG.getProductStatus() && PE.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDG&PE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACDV.getProductStatus() = " + ACDV.getProductStatus());
        System.out.println("PE.getProductStatus() = " + PE.getProductStatus());
            if (ACDV.getProductStatus() && PE.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDV&PE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACB.getProductStatus() = " + ACB.getProductStatus());
        System.out.println("PAG.getProductStatus() = " + PAG.getProductStatus());
            if (ACB.getProductStatus() && PAG.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACB&PAG.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
                System.out.println("ACG.getProductStatus() = " + ACG.getProductStatus());
        System.out.println("PAG.getProductStatus() = " + PAG.getProductStatus());
            if (ACG.getProductStatus() && PAG.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACG&PAG.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
                System.out.println("ACL.getProductStatus() = " + ACL.getProductStatus());
        System.out.println("PAG.getProductStatus() = " + PAG.getProductStatus());
            if (ACL.getProductStatus() && PAG.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACL&PAG.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
                System.out.println("ACBL.getProductStatus() = " + ACBL.getProductStatus());
        System.out.println("PAG.getProductStatus() = " + PAG.getProductStatus());
            if (ACBL.getProductStatus() && PAG.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACBL&PAG.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
                System.out.println("ACO.getProductStatus() = " + ACO.getProductStatus());
        System.out.println("PAG.getProductStatus() = " + PAG.getProductStatus());
            if (ACO.getProductStatus() && PAG.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACO&PAG.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
                System.out.println("ACP.getProductStatus() = " + ACP.getProductStatus());
        System.out.println("PAG.getProductStatus() = " + PAG.getProductStatus());
            if (ACP.getProductStatus() && PAG.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACP&PAG.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
                System.out.println("ACDG.getProductStatus() = " + ACDG.getProductStatus());
        System.out.println("PAG.getProductStatus() = " + PAG.getProductStatus());
            if (ACDG.getProductStatus() && PAG.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDG&PAG.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
                System.out.println("ACDV.getProductStatus() = " + ACDV.getProductStatus());
        System.out.println("PAG.getProductStatus() = " + PAG.getProductStatus());
            if (ACDV.getProductStatus() && PAG.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDV&PAG.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
                System.out.println("ACB.getProductStatus() = " + ACB.getProductStatus());
        System.out.println("RENAI.getProductStatus() = " + RENAI.getProductStatus());
            if (ACB.getProductStatus() && RENAI.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACB&RE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACG.getProductStatus() = " + ACG.getProductStatus());
        System.out.println("RENAI.getProductStatus() = " + RENAI.getProductStatus());
            if (ACG.getProductStatus() && RENAI.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACG&RE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACL.getProductStatus() = " + ACL.getProductStatus());
        System.out.println("RENAI.getProductStatus() = " + RENAI.getProductStatus());
            if (ACL.getProductStatus() && RENAI.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACL&RE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACBL.getProductStatus() = " + ACBL.getProductStatus());
        System.out.println("RENAI.getProductStatus() = " + RENAI.getProductStatus());
            if (ACBL.getProductStatus() && RENAI.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACBL&RE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACO.getProductStatus() = " + ACO.getProductStatus());
        System.out.println("RENAI.getProductStatus() = " + RENAI.getProductStatus());
            if (ACO.getProductStatus() && RENAI.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACO&RE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACP.getProductStatus() = " + ACP.getProductStatus());
        System.out.println("RENAI.getProductStatus() = " + RENAI.getProductStatus());
            if (ACP.getProductStatus() && RENAI.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACP&RE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACDG.getProductStatus() = " + ACDG.getProductStatus());
        System.out.println("RENAI.getProductStatus() = " + RENAI.getProductStatus());
            if (ACDG.getProductStatus() && RENAI.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDG&RE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACDV.getProductStatus() = " + ACDV.getProductStatus());
        System.out.println("RENAI.getProductStatus() = " + RENAI.getProductStatus());
            if (ACDV.getProductStatus() && RENAI.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDV&RE.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
             System.out.println("ACB.getProductStatus() = " + ACB.getProductStatus());
        System.out.println("RG.getProductStatus() = " + RG.getProductStatus());
            if (ACB.getProductStatus() && RG.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACB&RG.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACG.getProductStatus() = " + ACG.getProductStatus());
        System.out.println("RG.getProductStatus() = " + RG.getProductStatus());
            if (ACG.getProductStatus() && RG.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACG&RG.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACL.getProductStatus() = " + ACL.getProductStatus());
        System.out.println("RG.getProductStatus() = " + RG.getProductStatus());
            if (ACL.getProductStatus() && RG.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACL&RG.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACBL.getProductStatus() = " + ACBL.getProductStatus());
        System.out.println("RG.getProductStatus() = " + RG.getProductStatus());
            if (ACBL.getProductStatus() && RG.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACBL&RG.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACO.getProductStatus() = " + ACO.getProductStatus());
        System.out.println("RG.getProductStatus() = " + RG.getProductStatus());
            if (ACO.getProductStatus() && RG.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACO&RG.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }  
            System.out.println("ACP.getProductStatus() = " + ACP.getProductStatus());
        System.out.println("RG.getProductStatus() = " + RG.getProductStatus());
            if (ACP.getProductStatus() && RG.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACP&RG.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACDG.getProductStatus() = " + ACDG.getProductStatus());
        System.out.println("RG.getProductStatus() = " + RG.getProductStatus());
            if (ACDG.getProductStatus() && RG.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDG&RG.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACDV.getProductStatus() = " + ACDV.getProductStatus());
        System.out.println("RG.getProductStatus() = " + RG.getProductStatus());
            if (ACDV.getProductStatus() && RG.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDV&RG.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACB.getProductStatus() = " + ACB.getProductStatus());
        System.out.println("RI.getProductStatus() = " + RI.getProductStatus());
            if (ACB.getProductStatus() && RI.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACB&RI.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACG.getProductStatus() = " + ACG.getProductStatus());
        System.out.println("RG.getProductStatus() = " + RI.getProductStatus());
            if (ACG.getProductStatus() && RI.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACG&RI.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACL.getProductStatus() = " + ACL.getProductStatus());
        System.out.println("RI.getProductStatus() = " + RI.getProductStatus());
            if (ACL.getProductStatus() && RI.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACL&RI.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACBL.getProductStatus() = " + ACBL.getProductStatus());
        System.out.println("RI.getProductStatus() = " + RI.getProductStatus());
            if (ACBL.getProductStatus() && RI.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACBL&RI.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACO.getProductStatus() = " + ACO.getProductStatus());
        System.out.println("RI.getProductStatus() = " + RI.getProductStatus());
            if (ACO.getProductStatus() && RI.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACO&RI.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACP.getProductStatus() = " + ACP.getProductStatus());
        System.out.println("RI.getProductStatus() = " + RI.getProductStatus());
            if (ACP.getProductStatus() && RI.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACP&RI.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACDG.getProductStatus() = " + ACDG.getProductStatus());
        System.out.println("RI.getProductStatus() = " + RI.getProductStatus());
            if (ACDG.getProductStatus() && RI.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDG&RI.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACDV.getProductStatus() = " + ACDV.getProductStatus());
        System.out.println("RI.getProductStatus() = " + RI.getProductStatus());
            if (ACDV.getProductStatus() && RI.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDV&RI.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
              System.out.println("ACB.getProductStatus() = " + ACB.getProductStatus());
        System.out.println("YA.getProductStatus() = " + YA.getProductStatus());
            if (ACB.getProductStatus() && YA.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACB&YA.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
               System.out.println("ACG.getProductStatus() = " + ACG.getProductStatus());
        System.out.println("YA.getProductStatus() = " + YA.getProductStatus());
            if (ACG.getProductStatus() && YA.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACG&YA.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
               System.out.println("ACL.getProductStatus() = " + ACL.getProductStatus());
        System.out.println("YA.getProductStatus() = " + YA.getProductStatus());
            if (ACL.getProductStatus() && YA.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACL&YA.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
               System.out.println("ACBL.getProductStatus() = " + ACBL.getProductStatus());
        System.out.println("YA.getProductStatus() = " + YA.getProductStatus());
            if (ACBL.getProductStatus() && YA.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACBL&YA.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
               System.out.println("ACO.getProductStatus() = " + ACO.getProductStatus());
        System.out.println("YA.getProductStatus() = " + YA.getProductStatus());
            if (ACO.getProductStatus() && YA.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACO&YA.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
               System.out.println("ACP.getProductStatus() = " + ACP.getProductStatus());
        System.out.println("YA.getProductStatus() = " + YA.getProductStatus());
            if (ACP.getProductStatus() && YA.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACP&YA.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
               System.out.println("ACDG.getProductStatus() = " + ACDG.getProductStatus());
        System.out.println("YA.getProductStatus() = " + YA.getProductStatus());
            if (ACDG.getProductStatus() && YA.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDG&YA.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
               System.out.println("ACDV.getProductStatus() = " + ACDV.getProductStatus());
        System.out.println("YA.getProductStatus() = " + YA.getProductStatus());
            if (ACDV.getProductStatus() && YA.getProductStatus()) {
            // Both conditions are true, so navigate to another FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ACDV&YA.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
            }
            
            
            
            
            
    


}
}



