package ucf.assignments;

import javafx.stage.FileChooser;

import java.util.ArrayList;
import java.util.List;

public class ManageFiles
{
    // initialize todo list
    // Create a new file chooser

    public String importList()
    {
        // create a new file with the path of a csv file
        // create a writer that is a bufferedwriter of a filewriter
        // create a for each loop that goes through the list and create a string to add all of the data
        // write the text in the writer
        //catch
        // if the path is not found, throw an exception
        // use the method printStackTrace() to print an error message
        // close the writer
        return "hi";
    }

    public String importMultipleLists()
    {
        // initialize a string for the existing csv file
        // create a try catch to read the data in the file
        // try
        //go through each list
        // create a new buffered reader
        // while the line reader is not null
        // read the data in the file based on a split
        // load it in the to do list
        return "multiple hi's";
    }

    public String exportList()
    {
        // create a new file with the path of a csv file
        // create a string variable that holds the name of the file
        // create a writer that is a bufferedwriter of a filewriter
        // create a for each loop that goes through the list and create a string to add all of the data
        // write the text in the writer
        //catch
        // if the path is not found,
            // throw a file not found exception
        //close the writer
        // return the String variable
        return "filename";
    }

    public String exportMultipleLists()
    {
        //create a new Controller
        // create a new file with the path of a csv file
        // create a string variable that holds the name of the file
        // create a writer that is a bufferedwriter of a filewriter
        // while the user does not stop selecting lists to export
        // create a for each loop that goes through the list and create a string to add all of the data
        // write the text in the writer
        //catch
        // if the path is not found,
        // throw a file not found exception
        //close the writer
        // return the String variable
        return "filename";
    }

}
