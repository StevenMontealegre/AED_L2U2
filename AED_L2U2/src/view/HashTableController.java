package view;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swt.FXCanvas;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class HashTableController implements Initializable {
	
	
	@FXML 
	private TableView hashTable;
	@FXML
	private TableColumn slotsColumn;
	@FXML 
	private Button addBut;
	
	
	private int colisionNum;
	
	
	private ArrayList<String> slots;
	
	
	@FXML 
	public void addColumn()
	{
		colisionNum ++;
		TableColumn newColumn = new TableColumn<>("Colision " + colisionNum);
		hashTable.getColumns().add(newColumn);
		
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		colisionNum = 0;
		TableColumn slots = new TableColumn<>("Slots");
	
		hashTable.getColumns().add(slots);
		
		
		ObservableList<Integer> numSlots = FXCollections.observableArrayList();
		
		for(int i = 0; i<200;i++)
		{
			numSlots.add(i);
		}
		
		}
	
	
}
