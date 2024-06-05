package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.DatePicker;

public class YoutubeSubscriberCountTrackerController {
  @FXML
  private TextField firstNameTextField;
  @FXML
  private TextField lastNameTextField;
  @FXML
  private TextField youtubeChannelNameTextField;
  @FXML
  private DatePicker channelCreationDateField;
  @FXML
  private TextField currentSubscriberCountTextField;
  @FXML
  private Button chooseAvatarButton;
  @FXML
  private ImageView chooseAvatarView;
  @FXML
  private Button saveDataButton;
  @FXML
  private Button clearFormButton;

  private String pathToPhoto = null;
  private ArrayList<YoutubeSubscriberCount> arrayList = null;

  // Event Listener on Button[#chooseAvatarButton].onAction
  @FXML
  public void handleChooseAvatarButtonClick(ActionEvent event) {
    FileChooser fileChooser = new FileChooser();
    Stage mainWindow = (Stage) this.chooseAvatarButton.getScene().getWindow();
    File selectedAvatar = fileChooser.showOpenDialog(mainWindow);

    if (selectedAvatar != null) {
      this.pathToPhoto = "file://" + selectedAvatar.toURI().getPath();
      Image choosenAvatar = new Image(this.pathToPhoto);
      this.chooseAvatarView.setImage(choosenAvatar);

    }
  }

  // Event Listener on Button[#saveDataButton].onAction
  @FXML
  public void handleSaveDataButtonClick(ActionEvent event) {

    String firstName = this.firstNameTextField.getText();
    String lastName = this.lastNameTextField.getText();
    String channelName = this.youtubeChannelNameTextField.getText();
    LocalDate channelCreationDate = this.channelCreationDateField.getValue();
    String currentSubscriberCount = this.currentSubscriberCountTextField.getText();
    String pathToChannelAvatar = this.pathToPhoto;

    System.out.println(firstName);

    try {
      boolean dataIsValid = Validation.isValidData(firstName, lastName, channelName, channelCreationDate,
          currentSubscriberCount, pathToChannelAvatar);

      YoutubeSubscriberCount youtubeSubscriberCountObject = new YoutubeSubscriberCount(firstName, lastName, channelName,
          channelCreationDate, 0, pathToChannelAvatar);

      this.arrayList.add(youtubeSubscriberCountObject);

      System.out.println(this.arrayList);
      resetUI();
    } catch (Exception exception) {
      System.out.print(exception.getMessage());
    }

  }

  public void resetUI() {
    this.firstNameTextField.setText(null);
    this.lastNameTextField.setText(null);
    this.youtubeChannelNameTextField.setText(null);
    this.channelCreationDateField.setValue(null);
    this.currentSubscriberCountTextField.setText(null);
    this.chooseAvatarView.setImage(null);
    this.pathToPhoto = null;

  }

  // Event Listener on Button[#clearFormButton].onAction
  @FXML
  public void handleClearFormButtonClick(ActionEvent event) {
    resetUI();
  }

  @FXML
  public void initialize() {

    this.arrayList = new ArrayList<>();

  }
}
