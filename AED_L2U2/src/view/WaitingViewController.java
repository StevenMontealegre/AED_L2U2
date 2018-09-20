package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class WaitingViewController implements Initializable {
	
	private Main main;
	
	
	@FXML 
	private ImageView loadindImage;
	@FXML 
	private Button showBut;

	
	
	@FXML 
	private void show()
	{
		showBut.setVisible(false);
		try {
			main.showHashTableView();
		
		} catch (IOException e) {
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		loadindImage.setVisible(true);
	}

}
