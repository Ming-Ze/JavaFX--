package application;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

@SuppressWarnings("unused")
public class GameController  implements Initializable {
	
	@FXML
	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML
	public Button gameRules;
	public Button giveUp;
	public Button enter;
	public Button reset;
	public Button one;
	public Button two;
	public Button three;
	public Button four;
	public Button five;
	public Button six;
	public Button seven;
	public Button eight;
	public Button nine;
	public Button zero;
	public Button backSpace;
	public TextArea pastGuess;
	public TextField answer;

	public RadioButton digit3;
	public RadioButton digit4;
	public RadioButton digit5;
	
	int[] gs = new int[5];
	int[] ans = new int[5];
	boolean timing = false;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	
	public void rules(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Rules.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void ruleBack(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Game.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void start_click(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("GameScene.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void back_click(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Game.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void one_click() {
		String oldString = answer.getText();
		String oldRecord = pastGuess.getText();
		String in = "1";
		answer.setText(oldString + in);
		enter.requestFocus();
	}
	
	public void two_click() {
		String oldString = answer.getText();
		String oldRecord = pastGuess.getText();
		String in = "2";
		answer.setText(oldString + in);
		enter.requestFocus();
	}
	
	public void three_click() {
		String oldString = answer.getText();
		String oldRecord = pastGuess.getText();
		String in = "3";
		answer.setText(oldString + in);
		enter.requestFocus();
	}
	
	public void four_click() {
		String oldString = answer.getText();
		String oldRecord = pastGuess.getText();
		String in = "4";
		answer.setText(oldString + in);
		enter.requestFocus();
	}
	
	public void five_click() {
		String oldString = answer.getText();
		String oldRecord = pastGuess.getText();
		String in = "5";
		answer.setText(oldString + in);
		enter.requestFocus();
	}
	
	public void six_click() {
		String oldString = answer.getText();
		String oldRecord = pastGuess.getText();
		String in = "6";
		answer.setText(oldString + in);
		enter.requestFocus();
	}
	
	public void seven_click() {
		String oldString = answer.getText();
		String oldRecord = pastGuess.getText();
		String in = "7";
		answer.setText(oldString + in);
		enter.requestFocus();
	}
	
	public void eight_click() {
		String oldString = answer.getText();
		String oldRecord = pastGuess.getText();
		String in = "8";
		answer.setText(oldString + in);
		enter.requestFocus();
	}
	
	public void nine_click() {
		String oldString = answer.getText();
		String oldRecord = pastGuess.getText();
		String in = "9";
		answer.setText(oldString + in);
		enter.requestFocus();
	}
	
	public void zero_click() {
		String oldString = answer.getText();
		String oldRecord = pastGuess.getText();
		String in = "0";
		answer.setText(oldString + in);
		enter.requestFocus();
	}
	
	public void enter_click() {
		GameSetting check = new GameSetting();
		
		String oldString = answer.getText();
		String oldRecord = pastGuess.getText();
		answer.setText("");
		
		if(digit3.isSelected()) {
			for(int i=0; i<3; i++) {
				gs[i] = Integer.parseInt(String.valueOf(oldString.charAt(i)));
			}
			String output = check.judgeThreeNumbers(oldString, gs, ans);
			pastGuess.setText(oldRecord + "        " + output);
			
		}else if(digit4.isSelected()) {
			for(int i=0; i<4; i++) {
				gs[i] = Integer.parseInt(String.valueOf(oldString.charAt(i)));
			}
			String output = check.judgeFourNumbers(oldString, gs, ans);
			pastGuess.setText(oldRecord + "        " + output);
		
		}else if(digit5.isSelected()) {
			for(int i=0; i<5; i++) {
				gs[i] = Integer.parseInt(String.valueOf(oldString.charAt(i)));
			}
			String output = check.judgeFiveNumbers(oldString, gs, ans);
			pastGuess.setText(oldRecord + "        " + output);
		}
	}
	
	public void reset_click() {
		timing = true;
		answer.setText("");
		pastGuess.setText("");
		
		GameSetting answer = new GameSetting();
		
		if(digit3.isSelected()) {
			ans = answer.createThreeNumbers();
		}else if(digit4.isSelected()) {
			ans = answer.createFourNumbers();
		}else if(digit5.isSelected()) {
			ans = answer.createFiveNumbers();
		}else {
			pastGuess.setText("  Choose a level first!\n");
		}
	}
	
	public void backSpace_click() {
		String temp = answer.getText();
		answer.setText("");
		for(int i=0; i<temp.length()-1; i++) {
			answer.setText(answer.getText() + temp.charAt(i));
		}
		enter.requestFocus();
	}
	
	public void giveUp_click() {
		timing = false;
		
		String oldRecord = pastGuess.getText();
		pastGuess.setText(oldRecord + "      挑戰失敗......\n      正確答案為");
		answer.setText("");
		
		if(digit3.isSelected()) {
			for(int i=0; i<3; i++) {
				pastGuess.setText(pastGuess.getText() + ans[i]);
			}
			pastGuess.setText(pastGuess.getText() + "\n");
		}else if(digit4.isSelected()) {
			for(int i=0; i<4; i++) {
				pastGuess.setText(pastGuess.getText() + ans[i]);
			}
			pastGuess.setText(pastGuess.getText() + "\n");
		}else if(digit5.isSelected()) {
			for(int i=0; i<5; i++) {
				pastGuess.setText(pastGuess.getText() + ans[i]);
			}
			pastGuess.setText(pastGuess.getText() + "\n");
		}else {
			pastGuess.setText("      No answer now!\n        Please RESET!");
		}
	}
}