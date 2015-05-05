/* Citation: 
 * ABSTRACT WINDOW TOOLKIT
 * www3.ntu.edu.sg/home/ehchua/programming/java/J4a_GUI.html
 */
import java.awt.*;
import java.awt.event.*;

public class CountDown extends Frame {
    private Label labelCountDown;                   // declare component Label
    private TextField textFieldForCountDownLabel;   // declare component TextField
    private Button hoursButton;                     // declare component Button
    private Button daysButton;
    private int days;
    private int hours;
    
    
    // Constructor to setup GUI components //
    public CountDown() {
        setLayout(new FlowLayout());
        
        labelCountDown = new Label("DEAD WEEK IN"); // constructs a label
        add(labelCountDown);                       // "super" Frame adds Label
        
        textFieldForCountDownLabel = new TextField("0", 10); //construct TextField
        textFieldForCountDownLabel.setEditable(false);       //set to read only
        add(textFieldForCountDownLabel);
        
        hoursButton = new Button("CONVERT TO HOURS");       // constructs hours button
        add(hoursButton);                                   // "super" Frame adds Button
        
        hoursButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                hours = 288;
                textFieldForCountDownLabel.setText(hours + "");
            }
        });
            // Clicking Button source fires ActionEvent
            // hoursButton registers this instance as ActionEvent listener
        
        daysButton = new Button("CONVERT TO DAYS");
        add(daysButton);
        
        daysButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                days = 12;
                textFieldForCountDownLabel.setText(days + "");
            }
        });
        
        setTitle("DAYS/HOURS LEFT UNTIL DEAD WEEK!");
        setSize(250, 100);
        
        setVisible(true);
        
    }
    
    
    public static void main(String[] args) {
        // Invoke the constructor (to set up the GUI) by allocating an instance //
        CountDown count = new CountDown();
    }
}