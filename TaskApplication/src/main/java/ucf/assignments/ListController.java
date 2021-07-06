package ucf.assignments;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import org.junit.FixMethodOrder;


import javax.swing.*;
import java.io.IOException;

public class ListController
{
    @FXML
    public ComboBox listCombo;
    // create add button, delete button, edit button
    @FXML private Button addButton;
    @FXML private Button deleteButton;
    @FXML private Button editButton;
    //@FXML private String title;
    // create a list view of ListManagers
    @FXML
    ListView<String> listTitleView = new ListView<>();
    // create a new FileChooser

    //create new buttons called open and cancel to use when loading list(s)
    // create an observable list
    // create a new list manager
    //create a new list model

    @FXML
    public void addListClicked(javafx.event.ActionEvent event) throws IOException {
        //if the user clicks the + icon
        // create a new list model
        // set the list view to editable
        // set the cell factory to be a text field in order to edit it
        // navigate to the list view
        // set prompt text to "Enter Title"
        // if user presses enter on the keyboard after adding the title
        // add the list using the list model object
    }

    @FXML
    public void deleteListClicked(javafx.event.ActionEvent event)
    {
        // If the user clicks on one of the lists
            // if the user clicks delete
            // call the deleteList() function from the ListModel class
    }
    @FXML
    public void editListClicked(javafx.event.ActionEvent event)
    {
        //if the user clicks the list edit button
        // show the list view of titles
        //set the editable ability to true for user to be able to edit the title
        // use setCellFactory to provide the editable cells using forListView
        // call the edit title method using the list manager object

    }

    @FXML
    public void addItemClicked(javafx.event.ActionEvent event)
    {
        // if the user clicks the add button
            //add item using add item function from the ListManager class
    }


    @FXML
    public void deleteItemClicked(javafx.event.ActionEvent event)
    {
        // if the user clicks the delete button
            //add item using delete item function from the ListManager class
    }

    @FXML
    public void listDropdownClicked(javafx.event.ActionEvent event)
    {
        // If you clicked the dropdown button
        // create a new observable list with the options, "all items", "completed", and "incomplete"
        // create a new choice box with those options
        // get the value of the choice that is clicked by the user
        // if the value is all items, call the function displayAll()
        // else if the value is only completed items, call the function displayCompleted()
        // else call the function displayIncomplete()
    }


    @FXML
    public void importListClicked(ActionEvent event)
    {
        // initialize the file chooser to open a new window showing a new stage
        // if the file is not null
        // if(file != null)
         // call the importList function from the ManageFiles class to import the list
    }

    @FXML
    public void exportListClicked(ActionEvent actionEvent)
    {
        // if the user clicks on one of the lists
            // if the user clicks export
                // call the exportList() function from the ManageFiles class
        // else if the user clicks on the Ctrl key and selects multiple lists
            // if the user clicks export
                // call the exportMultipleLists() from the ManageFiles class
    }
    @FXML
    public void editDescription(TableColumn.CellEditEvent cellEditEvent)
    {
        // if the user clicks on a description cell
        // call the function editDescription() from the ListManager class
    }

    @FXML
    public void editDueDate(TableColumn.CellEditEvent cellEditEvent)
    {
        // if the user clicks on a cell in the due date column
        // call the function editDueDate() from the ListManager class
    }

    @FXML
    public void editCompleted(TableColumn.CellEditEvent cellEditEvent)
    {
        // if the user clicks on a description cell
        // call the function editIsCompleted() from the ListManager class
    }


}

