package ucf.assignments;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListModelTest {

    @RepeatedTest(5)
    void addList()
    {
        // create a new string to store the title of the list as the actual list
        // create another string to get the expected title
        //use assertEquals to compare the expected list to the list created by the method
    }

    @RepeatedTest(5)
    void deleteList()
    {
        // use .asArrays to both lists to be able to assert them
        // create a new list of listmanagers to store all the list names
        // use that as the actual list
        // compare that to a created list with hardcoded values on the list
        // use assertEquals to compare the hardcoded list to the list from the listManager class
    }

    @RepeatedTest(5)
    void editTitle()
    {
        // create a string variable called title
        // initialize the title as the expected title of the list
        // call the editTitle() function from the ListModel class and create a new variable
        // use assertEquals to compare the expected title and the title that is edited by the user
    }
}