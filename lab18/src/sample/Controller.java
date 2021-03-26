package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {
    static int countMessage;
    @FXML
    private TextArea chatMessage;

    @FXML
    private TextField message;

    @FXML Button send;
    public void sendMessage(ActionEvent event) {
        countMessage++;
        String m= message.getText();
        chatMessage.appendText("Your message:"+m+"\n");
        message.setText("");
        System.out.println(countMessage);
    }
}
