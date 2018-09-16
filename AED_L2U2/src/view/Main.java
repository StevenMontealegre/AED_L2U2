package view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	private Stage primaryStage;
	private BorderPane mainLayout;
	
	
	@Override
	public void start(Stage primaryStage) throws IOException, InterruptedException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Fornite Improvements");
		showMainView();
		showChargingView();
		
	}
	
	
	public void showMainView() throws IOException
	{
		FXMLLoader loader = new  FXMLLoader();
		loader.setLocation(Main.class.getResource("/MainView.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}
	
	
	public void showWeaponsView() throws IOException
	{
		
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("/WeaponsView.fxml"));
		BorderPane weaponsView = loader.load();
		mainLayout.setCenter(weaponsView);
	}
	
	public void showChargingView() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("/ChargingView.fxml"));
		BorderPane chargingView = loader.load();
		mainLayout.setCenter(chargingView);
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}
