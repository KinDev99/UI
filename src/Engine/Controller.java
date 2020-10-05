package Engine;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    //  UI Items
    @FXML
    private Button myButton;
    @FXML
    private TextField myUsernameInput;
    @FXML
    private PasswordField myPasswordInput;
    @FXML
    private ImageView myLoadingImage;
    @FXML
    private Label myErrorLabelUsername;
    @FXML
    private Label myErrorLabelPassword;


    //  Variablen
    private boolean connected = false;
    Image image = new Image("resource/img/loading.gif");

    @FXML
    private void initialize() {

        //  set loading image
        myLoadingImage.setImage(image);
        myLoadingImage.setCache(true);
        myLoadingImage.setVisible(false);
    }

    //  Login Function
    @FXML
    private void Login(ActionEvent event)
    {

        //  Check if Username or password is empty
        if(myUsernameInput.getLength() == 0) {
            myUsernameInput.setText("");
            myErrorLabelUsername.setText("Please Enter a Username");
        }else {
            myErrorLabelUsername.setText("");
        }
        if(myPasswordInput.getLength() == 0) {
            myUsernameInput.setText("");
            myErrorLabelPassword.setText("Please Enter a Password");
        }else {
            myErrorLabelPassword.setText("");
        }

        //Senden der Login Daten
        if(myPasswordInput.getLength() != 0 && myUsernameInput.getLength() != 0) {

        }
    }
}
