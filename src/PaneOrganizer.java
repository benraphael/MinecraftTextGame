
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class PaneOrganizer {
	
	private BorderPane root;
	private GridPane firstOption;
	
	public PaneOrganizer() {
		root = new BorderPane();
		start();
	}
	
	public void start() {
		firstOption = new GridPane();
		
		
	}
	
	public Pane getRoot() {
		return root;
	}
	
}
