import java.util.Random;

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
        grid.add(outputField, 0, 9, 10, 1);
        outputField.setPrefWidth(300);
        
        
        grid.add(solveButton, 0, 2, 2, 1);
        
        
        grid.setVgap(5);
        
        
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
            	
                double a = Double.parseDouble(aField.getText());
                double b = Double.parseDouble(bField.getText());
                double c = Double.parseDouble(cField.getText());

                outputField.setText(solveAndFormat(a, b, c));
                
                //System.out.println(solveAndFormat(a, b, c));
            	
            }
        };
  
        solveButton.setOnAction(event);
        
        grid.setAlignment(Pos.CENTER);
        Scene sc = new Scene(grid, 400, 200);
        s.setScene(sc); 
        s.show();
    }
    
    public static String solveAndFormat(double a, double b, double c) {
    	
    	double x1 = ((0-b) + Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
    	double x2 = ((0-b) - Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
    	
    	if ((b*b - 4*a*c) < 0) {
    		return "No Solutions";
    	}
    	
    	/*
    	if (x1 != Math.floor(x1)) {
    	    String x1IfBad = "(-" + (int) b + " + sqrt(" + (int) (b*b - 4*a*c) + ")) / " + (int) 2*a;
    	}
    	
    	if (x2 != Math.floor(x2)) {
    	    String x2IfBad = "(-" + (int) b + " - sqrt(" + (int) (b*b - 4*a*c) + ")) / " + (int) 2*a;
    	}
    	*/
    	
    	Random rand = new Random((long) Math.floor(a*1+b*10+c*100));
    	int error1 = rand.nextInt(10) - 5;
    	int error2 = rand.nextInt(10) - 5;
    	
    	if (rand.nextDouble() < 0.5) {
    		x1 += error1;
    		x2 += error2;
    	}
    	
    	return "x = " + x1 + ", x = " + x2;
    	
    	
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