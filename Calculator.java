package calculator;
import javax.swing.*; //importing the java swing api
import java.awt.*; //importing the awt api
import java.awt.event.*; //importing event api from awt

/**
 *
 * @author Luke Lee
 */
public class Calculator extends JFrame implements ActionListener{
    
    JTextField display = new JTextField();
    //constructor that builds the Calculator gui
    public Calculator(){
        //creating the initiale frame and creating the default close operation
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //initializing a text field that will be the display for the calculator
        //JTextField display = new JTextField(20);
        
        //creating all of the buttons for the calculator
        //as well as 
        JButton percentButton = new JButton("%");
        percentButton.setActionCommand("percentButton");
        percentButton.addActionListener(this);
        JButton leftParButton = new JButton("(");
        leftParButton.setActionCommand("leftParButton");
        leftParButton.addActionListener(this);
        JButton rightParButton = new JButton(")");
        rightParButton.setActionCommand("rightParButton");
        rightParButton.addActionListener(this);
        JButton squaredButton = new JButton("x^2");
        squaredButton.setActionCommand("squaredButton");
        squaredButton.addActionListener(this);
        JButton clearEButton = new JButton("CE");
        clearEButton.setActionCommand("clearEButton");
        clearEButton.addActionListener(this);
        JButton clearButton = new JButton("C");
        clearButton.setActionCommand("clearButton");
        clearButton.addActionListener(this);
        JButton backspaceButton = new JButton("<--");
        backspaceButton.setActionCommand("backspaceButton");
        backspaceButton.addActionListener(this);
        JButton divButton = new JButton("/");
        divButton.setActionCommand("divButton");
        divButton.addActionListener(this);
        JButton sevenButton = new JButton("7");
        sevenButton.setActionCommand("sevenButton");
        sevenButton.addActionListener(this);
        JButton eightButton = new JButton("8");
        eightButton.setActionCommand("eightButton");
        eightButton.addActionListener(this);
        JButton nineButton = new JButton("9");
        nineButton.setActionCommand("nineButton");
        nineButton.addActionListener(this);
        JButton mulButton = new JButton("X");
        mulButton.setActionCommand("mulButton");
        mulButton.addActionListener(this);
        JButton fourButton = new JButton("4");
        fourButton.setActionCommand("fourButton");
        leftParButton.addActionListener(this);
        JButton fiveButton = new JButton("5");
        fiveButton.setActionCommand("fiveButton");
        fiveButton.addActionListener(this);
        JButton sixButton = new JButton("6");
        sixButton.setActionCommand("sixButton");
        sixButton.addActionListener(this);
        JButton subButton = new JButton("-");
        subButton.setActionCommand("subButton");
        subButton.addActionListener(this);
        JButton oneButton = new JButton("1");
        oneButton.setActionCommand("oneButton");
        oneButton.addActionListener(this);
        JButton twoButton = new JButton("2");
        twoButton.setActionCommand("twoButton");
        twoButton.addActionListener(this);
        JButton threeButton = new JButton("3");
        threeButton.setActionCommand("threeButton");
        threeButton.addActionListener(this);
        JButton addButton = new JButton("+");
        addButton.setActionCommand("addButton");
        addButton.addActionListener(this);
        JButton posNegButton = new JButton("+/-");
        posNegButton.setActionCommand("posNegButton");
        posNegButton.addActionListener(this);
        JButton zeroButton = new JButton("0");
        zeroButton.setActionCommand("zeroButton");
        zeroButton.addActionListener(this);
        JButton decimalButton = new JButton(".");
        decimalButton.setActionCommand("decimalButton");
        decimalButton.addActionListener(this);
        JButton calculateButton = new JButton("=");
        calculateButton.setActionCommand("calculateButton");
        calculateButton.addActionListener(this);
        
        //creating the main panel for the gui as well as the button panel
        //setting the layout of the button panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 1));
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 4));
        
        //adding all of the buttons to the button panel
        buttonPanel.add(percentButton);
        buttonPanel.add(leftParButton);
        buttonPanel.add(squaredButton);
        buttonPanel.add(rightParButton);
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
    
    public void actionPerformed(ActionEvent e){
        switch (e.getActionCommand()) {
            case "nineButton":
                display.setText(display.getText() + "9");
                break;
            case "eightButton":
                display.setText(display.getText() + "8");
                break;
            case "sevenButton":
                display.setText(display.getText() + "7");
                break;
            case "sixButton":
                display.setText(display.getText() + "6");
                break;
            case "fiveButton":
                display.setText(display.getText() + "5");
                break;
            case "fourButton":
                display.setText(display.getText() + "4");
                break;
            case "threeButton":
                display.setText(display.getText() + "3");
                break;
            case "twoButton":
                display.setText(display.getText() + "2");
                break;
            case "oneButton":
                display.setText(display.getText() + "1");
                break;
            case "zeroButton":
                display.setText(display.getText() + "0");
                break;
            case "leftParButton":
                display.setText(display.getText() + "(");
                break;
            case "rightParButton":
                display.setText(display.getText() + ")");
                break;
            case "decimalButton":
                display.setText(display.getText() + ".");
                break;
            case "clearEButton":
                display.setText("");
                break;
            default:
                break;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a run method for the GUI
        Calculator calculator = new Calculator();
    }
    
}
