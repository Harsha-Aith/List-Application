package ucf.assignments;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;

import java.awt.*;

public class ListManager
{
    // MANAGES ONE LIST OF TASKS
    // create an observable list of tasks
    // create a list view to view the list items

    //create a textfield field for the title of the list

    //Create a TableView


    public ListManager(String listName)
    {
        // set this title equal to the parameter title
    }

   public String getListName()
   {
       return "name";
   }

   public void setListName(String listName)
   {
       // set the parameter name to be equal to the field name
   }

    public String addItem()
    {
        // create text field for description
        // create date picker due date
        // create check box for iscompleted

        // Prompt text for the 3 fields

        // get values for the description, due date, and isCompleted based on user input
        // Add them to the list
        // return the description of the item

        return "";
    }
    public String deleteItem()
    {
        //get values for the description, due date, and isCompleted based on user input
        // remove them from the list
        // return the description of the deleted item
        return "";
    }
    public String editDescription()
    {
        // create a new string that gets the selected value by the user
        // use the function setDescription() from the Task class to set it to the new value
        // using getNewValue() from the table column
        return "";
    }
    public DatePicker editDueDate()
    {
        // create a new DatePicker that gets the selected value by the user
        // use the function setDueDate() from the Task class to set it to the new value
        // using getNewValue() from the table column
        return new DatePicker();
    }

    public boolean editIsCompleted()
    {
        // create a new CheckBox that gets the selected value by the user
        // use the function setIsCompleted from the Task class to set it to the new value
        // using getNewValue() from the table column
        return true;
    }

    public String displayAll()
    {
        // create a for each loop of Task objects
        // add all of the tasks in the list to the tableview
        return "";
    }
    public int displayCompleted()
    {
        // use the checked property to check if the item in the list is checked or not
        // for(List list: O
        // if the item is checked by the user
        //add the task in the list to the table view
        return 0;
    }
    public int displayIncomplete()
    {
        // use the checked property to check if the item in the list is checked or not
        // create a for each loop that goes through the entire list
        // if the item is not checked by the user
        //add the task in the list to the table view
        return 0;
    }


}
