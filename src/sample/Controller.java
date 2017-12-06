package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.math.BigDecimal;

public class Controller {


    public TextField vA;
    public TextField vB;
    public TextField vScale;
    public Text vResult;

    public void init() {
//        parent.setStyle("-fx-background: #00FF00;");

        char[] alphabet = new char['z' - 'a' + 1];
        for (char i = 'a'; i <= 'z'; i++) {
            alphabet[i - 'a'] = i;
        }

//        changingText.setText(alphabet[('z' - 'a' + 2) % alphabet.length]+"");
    }


    public void onDivideClick(MouseEvent mouseEvent) {
        final BigDecimal a = BigDecimal.valueOf(Double.valueOf(vA.getText()));
        final BigDecimal b = BigDecimal.valueOf(Double.valueOf(vB.getText()));

        final Integer scale = Integer.valueOf(vScale.getText());

        vResult.setText(a.divide(b, scale, BigDecimal.ROUND_UP).toString());

    }
}
