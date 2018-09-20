package view;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class ChargingViewController {

	
	private Main main;
	
	@FXML 
	private Button continueBut;
	
	
	@FXML
	private void continueMain() throws IOException
	{
		System.out.println("Drag");
		main.showMainMenu();
	}
}
