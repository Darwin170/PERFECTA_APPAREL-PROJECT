package Controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import Alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import Models.database;


public class loginController implements Initializable{
    
    @FXML
    TextField UserN, USERnameREG;

    @FXML
    PasswordField Password, passwordReg;

    @FXML
    AnchorPane SIGNUPFORM,LOGINFORM;
    @FXML
    Button createacc, BTNLog = new Button(),Btnsign;


    @FXML
    FXMLLoader loader;

    Statement statement;
    Connection connect;



    public void signup(ActionEvent event)throws IOException, SQLException{
        registerAccount();
    }


  

    //Insert username and password to database, basically signup feature
    public void registerAccount() throws SQLException{
        String insertAccount = "INSERT INTO `account` (`username`, `password`) VALUES ('"+USERnameREG.getText() +"', '"+  passwordReg.getText()+"')";
        
        connect = database.DBConnect();
        statement = connect.createStatement();

        try {
            if (USERnameREG.getText().isEmpty() || passwordReg.getText().isEmpty()) {
                AlertMaker.showErrorAlert("Error", "Account cannot be blanked!");
                
            } else {

                String checkUsername = "select username from account where username = '" + USERnameREG.getText() + "'";
                ResultSet result = statement.executeQuery(checkUsername);

                if (result.next()) {
                    AlertMaker.showErrorAlert("Notification!", "Username taken");
                } else {
                    statement.executeUpdate(insertAccount);
                    AlertMaker.showSuccessfulAlert("Successfully Added!", "Account Insert, Successful!");
                    System.out.println("Inserted Account");
                    
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            AlertMaker.showSimpleAlert("Notification!", "Error");
            
        }

    }



    //Login Feature..chinecheck muna kung yung account is existing na
    public void loginAccount(ActionEvent event) throws SQLException, IOException{
        
        String selectAccount = "SELECT username, password from `account` where username = '" + UserN.getText() + "' and password = '" + Password.getText() + "'";
        
        connect = database.DBConnect();
        statement = connect.createStatement();

        try {
            ResultSet result = statement.executeQuery(selectAccount);

            if (UserN.getText().isEmpty() ||Password.getText().isEmpty()) {
                AlertMaker.showErrorAlert("Notification!", "Cannot be blanked");
            } else {

                if (result.next()) {
                    String logUsername = result.getString(1);
                    String logPassword = result.getString(2);

                

                    if (logUsername.equals(UserN.getText()) && logPassword.equals(Password.getText())) {

                        Stage stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/MAINPAGE.FXML.fxml"));
                        Parent root = loader.load();
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    }
                } else {
                    AlertMaker.showErrorAlert("Notification!", "Wrong password or username");
                }

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    //switch pane of login and signup
    public void switchForm(ActionEvent event){
    
        if (event.getSource() == createacc) {
            SIGNUPFORM.setVisible(true);
           LOGINFORM.setVisible(false);
        } else if (event.getSource() == Btnsign) {
            SIGNUPFORM.setVisible(false);
            LOGINFORM.setVisible(true);
        }
    }

    //ready for designing
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }



}