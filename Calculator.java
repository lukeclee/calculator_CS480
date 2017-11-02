package calculator;

import javax.swing.*; //importing the java swing api
import java.awt.*; //importing the awt api
import java.awt.event.*; //importing event api from awt
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author Luke Lee
 */
public class Calculator extends JFrame implements ActionListener {

    JTextField display = new JTextField();

    //constructor that builds the Calculator gui
    public Calculator() {
        //creating the initiale frame and creating the default close operation
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.setEditable(false);
        //initializing a text field that will be the display for the calculator
        //JTextField display = new JTextField(20);

        //creating all of the buttons for the calculator
        //as well as 
        JButton percentButton = new JButton("");
        percentButton.setActionCommand("percentButton");
        percentButton.addActionListener(this);
        JButton leftParButton = new JButton("(");
        leftParButton.setActionCommand("leftParButton");
        leftParButton.addActionListener(this);
        JButton rightParButton = new JButton(")");
        rightParButton.setActionCommand("rightParButton");
        rightParButton.addActionListener(this);
        JButton powerButton = new JButton("x^x");
        powerButton.setActionCommand("powerButton");
        powerButton.addActionListener(this);
        JButton clearButton = new JButton("C");
        clearButton.setActionCommand("clearButton");
        clearButton.addActionListener(this);
        JButton recipButton = new JButton("1/x");
        recipButton.setActionCommand("recipButton");
        recipButton.addActionListener(this);
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
        fourButton.addActionListener(this);
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
        buttonPanel.add(rightParButton);
        buttonPanel.add(powerButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(recipButton);
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
        frame.setSize(350, 450);
    }

    //actionPerformed class that takes the event from a button click
    public void actionPerformed(ActionEvent e) {
        //this switch statement gets the actioncommand name from the click
        //event and then uses a switch statement and depending on what the name
        //is does the specified action
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
            case "clearButton":
                display.setText("");
                break;
            case "mulButton":
                display.setText(display.getText() + "*");
                break;
            case "addButton":
                display.setText(display.getText() + "+");
                break;
            case "subButton":
                display.setText(display.getText() + "-");
                break;
            case "divButton":
                display.setText(display.getText() + "/");
                break;
            case "powerButton":
                display.setText(display.getText() + "^");
                break;
            case "backspaceButton":
                String displayString = display.getText();
                if (!displayString.isEmpty()) {
                    display.setText(displayString.substring(0, displayString.length() - 1));
                }
                break;
            case "recipButton":
                display.setText("1/" + display.getText());
                break;
            case "calculateButton":
                calculateButton();
                break;
            default:
                break;
        }
    }

    //calculateButton that gets called whenever the "=" button is pressed which
    //handles all of the errors and syntax and then calculates the expression
    public void calculateButton() {
        String expression = display.getText();
        char input[] = expression.toCharArray();
        int parentheses = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == '(') {
                parentheses++;
            } else if (input[i] == ')') {
                parentheses--;
            }
        }
        int doubles = 0;
        String doubleOps[] = new String[]{"**", "//", "^^", "--", "++", "..", "*/", "/*"};
        for (int i = 0; i < doubleOps.length; i++) {
            if (expression.contains(doubleOps[i])) {
                doubles = 1;
            }
        }
        String dividZero = "/0";
        String power = "^";
        if (expression.contains(dividZero)) {
            display.setText("Error: Cannot divide by zero");
        } else if (parentheses != 0) {
            display.setText("Error: Uneven amount of parentheses");
        } else if (doubles == 1) {
            display.setText("Error: Something is wrong with the syntax");
        } else if (expression.contains(power)) {
            String powExpression = "Math.pow(";
            powExpression = powExpression + expression.replace("^", ", ") + ")";
            display.setText(calculate(powExpression));
        } else {
            display.setText(calculate(expression));
        }
    }

    //calculate method that takes a string as input and returns a string
    //used a scriptengine to use the eval method from javascript to evaluate
    //the expression that is input by the user
    public String calculate(String expression) {

        ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");
        try {
            Object result = engine.eval(expression);
            return result.toString();
        } catch (ScriptException er) {
            return "Error: That is an invalid expression";
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a new calculator object which builds the GUI
        Calculator calculator = new Calculator();
    }

}