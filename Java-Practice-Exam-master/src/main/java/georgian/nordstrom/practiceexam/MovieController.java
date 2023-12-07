package georgian.nordstrom.practiceexam;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MovieController implements Initializable {

    @FXML
    private Label errorLabel;

    @FXML
    private ImageView imageView;

    @FXML
    private Label nameLabel;

    @FXML
    private Label resultsLabel;

    @FXML
    private TextField searchTextField;

    @FXML
    private TableView<Movie> tableView;

    @FXML
    private TableColumn<Movie, String> idColumn;

    @FXML
    private TableColumn<Movie, String> titleColumn;

    @FXML
    private TableColumn<Movie, String> typeColumn;

    @FXML
    private TableColumn<Movie, String> yearColumn;

    @FXML
    private Label yearLabel;

    @FXML
    void onSearch(ActionEvent event) {
        //the search function when you click
    String query = searchTextField.getText();
    loadMovies(query);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        idColumn.setCellValueFactory(new PropertyValueFactory<>("imdbID"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        yearColumn.setCellValueFactory(new PropertyValueFactory<>("year"));

        errorLabel.setVisible(false);
        yearLabel.setVisible(false);
        nameLabel.setVisible(false);
        imageView.setVisible(false);


    }
    public void loadMovies(String query) {
        try {
            Movie[] Movie = ApiUtility.getMovies(query);

            tableView.getItems().clear();
            tableView.getItems().addAll(Movie);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}



