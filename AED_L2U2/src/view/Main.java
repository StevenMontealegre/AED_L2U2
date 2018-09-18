-package view;

import java.io.IOException;
import model.Fornite;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	private static Stage primaryStage;
	private static BorderPane mainLayout;
	
	private static Fornite fortnite;
	
	
	
	public Fornite getFornite()
	{
		return fortnite;
	}
	
	public static String[] showWeaponsNames()
	{
		System.out.println("Show Weapons Name");
		String[] names = fortnite.showWeaponsNames();
		
		for(int i= 0; i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		return names;
	}
	
	@Override
	public void start(Stage primaryStage) throws IOException, InterruptedException {
		
		fortnite = new Fornite();
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Fornite Improvements");
		showMainView();
	    showChargingView();
		
	}
	
	
	public static void showMainView() throws IOException
	{
		
		System.out.println("main menu");
		FXMLLoader loader = new  FXMLLoader();
		loader.setLocation(Main.class.getResource("Main.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}
	
	
	
	
	

	public static void showMainMenu() throws IOException
	{
		
		System.out.println("main menu");

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("MainMenu.fxml"));
		AnchorPane menu = loader.load();
		mainLayout.setCenter(menu);
	}
	
	public static void showMain2() throws IOException
	{
		
		System.out.println("Main 2");
		FXMLLoader loader = new  FXMLLoader();
		loader.setLocation(Main.class.getResource("Main2.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void showWeaponsView() throws IOException
	{
		
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("WeaponsView.fxml"));
		AnchorPane weaponsView = loader.load();
		mainLayout.setCenter(weaponsView);
		fortnite.createWeaponStack();
	}
	
	public void showChargingView() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("ChargingView.fxml"));
		BorderPane chargingView = loader.load();
		mainLayout.setCenter(chargingView);
	}
	

	public static void main(String[] args) {
		launch(args);
		Main m = new Main();
	}
}

