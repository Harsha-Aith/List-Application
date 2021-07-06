package ucf.assignments;

import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.util.converter.LocalDateStringConverter;

import java.time.LocalDate;
import java.util.Date;

public class Task
{
    // create a String to store the description
    // create a date picker variable to the due date
    // create a boolean variable to store whether the task is completed or not
    // is completed or not

    public Task(String description, DatePicker dueDate)
    {
        // set the description parameter equal to the description field
        // set the dueDare parameter equal to the dueDate field
        // set the isCompleted parameter to be equal the field is Completed
    }
    public void setDescription(String description){
        // set this.description equal to the field in the class
    }
    public void setDueDate(String dueDate){
        // set the due date equal to the due date field in the class
    }
    public String getDescription(){
        // return the description field
        return null;
    }
    public DatePicker getDueDate(){
        // return the date field
        DatePicker date = new DatePicker();
        return date;
    }
    public boolean getIsCompleted(){
        // return the isCompleted field
        return false;
    }
    public void setIsCompleted(CheckBox completed)
    {
        // set the completed parameter equal to the isCompleted field
    }
    public String toString(){
        // return the description plus the due date in a string format
        return "";
    }


}
