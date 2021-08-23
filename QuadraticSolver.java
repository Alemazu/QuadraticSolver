import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
        Label l4 = new Label("Output: ");
            	
        TextField aField = new TextField();
        TextField bField = new TextField();
        TextField cField = new TextField();
        
        TextField outputField = new TextField();
        outputField.setEditable(false);
        
        Button solveButton = new Button("Solve");
        
        aField.setPrefWidth(30);
        bField.setPrefWidth(30);
        cField.setPrefWidth(30);
        
        
        grid.add(aField, 0, 0);
        grid.add(l1, 1, 0);
        grid.add(bField, 2, 0);
        grid.add(l2, 3, 0);
        grid.add(cField, 4, 0);
        grid.add(l3, 5, 0);
        
        grid.add(l4, 0, 7, 2, 1);
        grid.add(outputField, 2, 7, 5, 1);
        
        
        grid.add(solveButton, 0, 2, 2, 1);
        
        
        grid.setVgap(5);
        
        
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
            	
                double a = Double.parseDouble(aField.getText());
                double b = Double.parseDouble(bField.getText());
                double c = Double.parseDouble(cField.getText());
                
                double x1;
                double x2;
                
                System.out.println("");
            	
            }
        };
  
        solveButton.setOnAction(event);
        
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