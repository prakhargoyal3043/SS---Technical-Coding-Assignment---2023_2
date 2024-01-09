import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.SelectionMode;

public class MainController {

    @FXML
    private ListView<String> availableFields;

    @FXML
    private ListView<String> displayFields;

    @FXML
    private Button importButton;

    private ObservableList<String> availableFieldsList = FXCollections.observableArrayList();
    private ObservableList<String> displayFieldsList = FXCollections.observableArrayList();

    public void initialize() {
        availableFields.setItems(availableFieldsList);
        displayFields.setItems(displayFieldsList);

        availableFields.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        displayFields.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        importButton.setOnAction(event -> importJson());
    }

    @FXML
    private void importJson() {
        // Implement the logic to import JSON and populate the availableFieldsList
        // For simplicity, we'll add sample fields here.
        availableFieldsList.clear();
        availableFieldsList.addAll("Subcategory", "Title", "Price", "Popularity");
    }

    @FXML
    private void addSelectedFields() {
        displayFieldsList.addAll(availableFields.getSelectionModel().getSelectedItems());
        availableFieldsList.removeAll(availableFields.getSelectionModel().getSelectedItems());
    }

    @FXML
    private void removeSelectedFields() {
        availableFieldsList.addAll(displayFields.getSelectionModel().getSelectedItems());
        displayFieldsList.removeAll(displayFields.getSelectionModel().getSelectedItems());
    }
}