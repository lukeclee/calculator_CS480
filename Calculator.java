package calculator;
import javax.swing.*; //importing the java swing api
import java.awt.*; //importing the awt api
import java.awt.event.*; //importing event api from awt

/**
 *
 * @author Luke Lee
 */
public class Calculator {

    //private method to create the GUI for the calculator
    private static void createGUI(){
        //creating the initiale frame and creating the default close operation
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //initializing a text field that will be the display for the calculator
        JTextField display = new JTextField(20);
        
        //creating all of the buttons for the calculator
        JButton percentButton = new JButton("%");
        JButton squareRootButton = new JButton("sqrt");
        JButton squaredButton = new JButton("x^2");
        JButton invertButton = new JButton("1/x");
        JButton clearEButton = new JButton("CE");
        JButton clearButton = new JButton("C");
        JButton backspaceButton = new JButton("<--");
        JButton divButton = new JButton("/");
        JButton sevenButton = new JButton("7");
        JButton eightButton = new JButton("8");
        JButton nineButton = new JButton("9");
        JButton mulButton = new JButton("X");
        JButton fourButton = new JButton("4");
        JButton fiveButton = new JButton("5");
        JButton sixButton = new JButton("6");
        JButton subButton = new JButton("-");
        JButton oneButton = new JButton("1");
        JButton twoButton = new JButton("2");
        JButton threeButton = new JButton("3");
        JButton addButton = new JButton("+");
        JButton posNegButton = new JButton("+/-");
        JButton zeroButton = new JButton("0");
        JButton decimalButton = new JButton(".");
        JButton calculateButton = new JButton("=");
        
        //creating the main panel for the gui as well as the button panel
        //setting the layout of the button panel
        JPanel mainPanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 4));
        
        //adding all of the buttons to the button panel
        buttonPanel.add(percentButton);
        buttonPanel.add(squareRootButton);
        buttonPanel.add(squaredButton);
        buttonPanel.add(invertButton);
        buttonPanel.add(clearEButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(backspaceButton);
        buttonPanel.add(divButton);
        buttonPanel.add(sevenButton);
        buttonPanel.add(eightButton);
        buttonPanel.add(nineButton);
        buttonPanel.add(mulButton);
        buttonPanel.add(fourButton);
        buttonPanel.add(fiveButton);
        buttonPanel.add(sixButton);
        buttonPanel.add(subButton);
        buttonPanel.add(oneButton);
        buttonPanel.add(twoButton);
        buttonPanel.add(threeButton);
        buttonPanel.add(addButton);
        buttonPanel.add(posNegButton);
        buttonPanel.add(zeroButton);
        buttonPanel.add(decimalButton);
        buttonPanel.add(calculateButton);
        
        //adding the display and buttonPanel to the main panel
        mainPanel.add(display, BorderLayout.PAGE_START);
        mainPanel.add(buttonPanel);
        
        //adding the mainPanel to the frame and setting it to visible
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a run method for the GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }
    
}
