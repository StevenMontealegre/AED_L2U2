package view;


import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class MainMenuController {

	
	private Main main;
	
	@FXML 
	private Button req1;	
	@FXML 
	private Button req2;	
	@FXML 
	private Button req3;	
	@FXML 
	private Button req4;
	
	@FXML
	private void req1() throws IOException
	{
		System.out.println("req1");
	}
	@FXML
	private void req2() throws IOException
	{
		System.out.println("req2");
		//main.showMainView();
	}@FXML
	private void req3() throws IOException
	{
		System.out.println("req3");
		main.showWeaponsView();
	}@FXML
	private void req4() throws IOException
	{
		System.out.println("req4");
		//main.showMainView();
	}
}
