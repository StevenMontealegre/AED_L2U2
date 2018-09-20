package view;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class HashTableView2Controller implements Initializable{

	
	
	private Main main;
	@FXML 
	private ListView slotsView;
	
	@FXML
	private ListView nodesView;
	
	@FXML
	private Button expandBut;
	
	@FXML
	private Button selectBut;

	
	@FXML
	private void expand()
	{
		int a = slotsView.getSelectionModel().getSelectedIndex();
		ArrayList<String> scores = main.getScores(a);
		ObservableList<String> scoresview = FXCollections.observableArrayList();
		if (scores == null)
		{
			scoresview.add("THERE IS NO KEY IN THIS SLOT");
		}
		else
		{

			for(int i = 0; i<scores.size();i++)
			{
				scoresview.add(scores.get(i));
			}
			
		}
		nodesView.setItems(scoresview);
	
	
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
				
		
		ObservableList<Integer> slots = FXCollections.observableArrayList();
		
		for(int i = 0; i<200; i++)
		{
			slots.add(i);
		}
		slotsView.setItems(slots);
		slotsView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
	}
	
	
	
	
	
}
