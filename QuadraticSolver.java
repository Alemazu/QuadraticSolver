import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * 
 * 
 * Quadratic equation solver... maybe
 *
 */
public class QuadraticSolver extends Application {
  
	
	
	/**
	 * JavaFX application start method
	 */
    public void start(Stage s)
    {
        s.setTitle("Quadratic Equation Solver");
        s.setResizable(true);
        
        GridPane grid = new GridPane();
        
        Label l1 = new Label(" x^2 + ");
        Label l2 = new Label(" x + ");
        Label l3 = new Label(" = 0 ");
            	
        TextField aField = new TextField();
        TextField bField = new TextField();
        TextField cField = new TextField();
        
        Button solveButton = new Button("Solve");
        
        aField.setPrefWidth(30);
        bField.setPrefWidth(30);
        cField.setPrefWidth(30);
        
        grid.add(aField, 1, 0);
        grid.add(l1, 2, 0);
        grid.add(bField, 3, 0);
        grid.add(l2, 4, 0);
        grid.add(cField, 5, 0);
        grid.add(l3, 6, 0);
        grid.add(solveButton, 1, 2, 3, 3);
        
        grid.setVgap(5);
        
        grid.setAlignment(Pos.CENTER);
        Scene sc = new Scene(grid, 400, 200);
        s.setScene(sc); 
        s.show();
    }
  
    /**
     * starts JavaFX application
     * @param args
     */
    public static void main(String args[])
    {    	
        launch(args);
    }
}