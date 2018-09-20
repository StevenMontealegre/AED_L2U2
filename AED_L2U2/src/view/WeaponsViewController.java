package view;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Weapon;

public class WeaponsViewController implements Initializable   {

	
	private Main main;
	private int a = 0;
	
	
	@FXML 
	private TextField capacityTxt;

	@FXML 
	private TextField colorTxt;
	@FXML 
	private TextField leftTxt;
	@FXML 
	private Button useBut;
	@FXML 
	private Button catchBut;
	@FXML
	private Button nextBut;
	@FXML
	private ImageView weaponImage;
	@FXML 
	private ImageView image;
	@FXML 
	private Button mainBut;
	@FXML 	
	private ListView<Image> listV;
	@FXML 
	private Label availTxt;
	
	
	@FXML
	private void getNextWeapon()
	{	
		
		if ( a == 0)
		{
			nextBut.setText("Get Next Weapon");
		}
		a++;
		String urlImage = main.getNextWeapon(1);
		Image i = new Image(urlImage);
		image.setImage(i);

	}

	@FXML
	private void useWeapon()
	{
		@SuppressWarnings("static-access")
		String data[] = main.useWeapon();
		Image newWeapon = new Image(data[0]);
		weaponImage.setImage(newWeapon);
		colorTxt.setText(data[1]);
		leftTxt.setText(data[2]);
		addElement();
	}
	
	@FXML
	public void catchWeapon()
	{
		Image wimage = new Image(main.catchWeapon());
		weaponImage.setImage(wimage);
		addElement();
		showNextWeapon();
	}
	
	public void showNextWeapon()
	{
		String urlImage = main.getNextWeapon(1);
		Image i = new Image(urlImage);
		image.setImage(i);
	}
	
	//AGREGA NOMBRES A LA VIEWLIST
	@FXML
	private void addElement()
	{

	 	ObservableList names = FXCollections.observableArrayList();
		String[] n = main.showWeaponsNames();
		
		for (int i = 0; i<n.length;i++)
		{
			names.add(n[i]);
		}
		listV.setItems(names);
	}

	@FXML
	private void goBack() throws IOException
	{
		main.showMainMenu();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
			}
}


	

	
	
	
	
	
	
	
	

