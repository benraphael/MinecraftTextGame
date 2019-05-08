import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Runner extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		PaneOrganizer main = new PaneOrganizer();
		Scene scene = new Scene(main.getRoot(),500,500);
		stage.setScene(scene);
		stage.show();
	}

}
