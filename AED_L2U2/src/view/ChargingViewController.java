package view;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.image.Image;

public class ChargingViewController {
	
	private Main main;
	@FXML
	private Image chargingImage;
	
	@FXML
	private void continueNext() throws IOException
	{
		main.showWeaponsView();
	}

}
