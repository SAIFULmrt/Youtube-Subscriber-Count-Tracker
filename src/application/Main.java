package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
  @Override
  public void start(Stage primaryStage) {
    try {
      FlowPane root = (FlowPane) FXMLLoader.load(getClass().getResource("YoutubeSubscriberCountTracker.fxml"));
      Scene scene = new Scene(root);
      scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
      primaryStage.setScene(scene);
      primaryStage.setTitle("Youtube Subscriber Count Tracker");
      primaryStage.show();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}
