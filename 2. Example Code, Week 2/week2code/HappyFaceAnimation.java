package week2code;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * A more complex animation, using a separate method to draw faces. Original
 * Happy Face code from Walter Savitch (2018) <i>Java: An Introduction to
 * Problem Solving and Programming, Eighth Edition</i>. Pearson.
 *
 * @author Sam Scott
 */
public class HappyFaceAnimation extends Application {

    /**
     * Sets up the stage and starts the main thread.
     *
     * @param stage The first stage
     */
    @Override
    public void start(Stage stage) {
        stage.setTitle("Section 1.4 Animated!"); // window here
        Canvas canvas = new Canvas(400, 400); // canvas size here
        Group root = new Group();
        Scene scene = new Scene(root);
        root.getChildren().add(canvas);
        stage.setScene(scene);
        stage.show();
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Thread t = new Thread(() -> animate(gc));
        t.start();
    }

    /**
     * Animation thread. Moves 4 faces across the screen.
     *
     * @param gc The drawing surface
     */
    public void animate(GraphicsContext gc) {
        System.out.println("Starting");
        for (int x = -210; x <= 410; x++) {
            gc.clearRect(0, 0, 400, 400);
            gc.setFont(Font.font("System", 30));
            gc.setLineWidth(1);
            gc.setStroke(Color.rgb(128, 0, 0));
            gc.strokeText("Happy Happy Happy Happy!", 10, 100);
            drawFace(gc, x, 50, Color.rgb(200, 100, 10));
            drawFace(gc, 190 - x, 150, Color.RED);
            drawFace(gc, 50, x, Color.GREEN);
            drawFace(gc, 150, 190 - x, Color.YELLOW);
            pause(10);
        }
        pause(1000);
        System.out.println("Done");
        System.exit(0);
    }

    public static void pause(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException ex) {
        }
    }

    /**
     * Draws a face (based on Listing 1.2 on page 31 of the textbook)
     *
     * @param gc The drawing surfaceI
     * @param x Left
     * @param y Top
     * @param color Face fill color
     */
    public void drawFace(GraphicsContext gc, double x, double y, Color color) {
        gc.setFill(color);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(5);
        gc.fillOval(x, y, 200, 200);
        gc.strokeOval(x, y, 200, 200);
        gc.setFill(Color.WHITE);
        gc.fillOval(x + 55, y + 50, 10, 20);
        gc.fillOval(x + 130, y + 50, 10, 20);
        gc.setStroke(Color.WHITE);
        gc.setLineWidth(3.5);
        gc.strokeArc(x + 50, y + 110, 100, 50, 180, 180, ArcType.OPEN);
    }

    /**
     * Exits the app completely when the window is closed.
     */
    @Override
    public void stop() {
        System.exit(0);
    }

    /**
     * Launches the app
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
