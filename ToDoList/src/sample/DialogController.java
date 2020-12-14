package sample;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.datamodel.ToDoData;
import sample.datamodel.ToDoItem;
import java.time.LocalDate;

public class DialogController {

    @FXML
    private TextField shortDescription;
    @FXML
    private TextArea details;
    @FXML
    private DatePicker deadlinePicker;

    public ToDoItem processResult(){
        String shortDescript = shortDescription.getText().trim();
        String detail = details.getText().trim();
        LocalDate deadline = deadlinePicker.getValue();
         ToDoItem newItem = new ToDoItem(shortDescript, detail, deadline);
        ToDoData.getInstance().addToDoItem(newItem);
         return newItem;
    }
}
