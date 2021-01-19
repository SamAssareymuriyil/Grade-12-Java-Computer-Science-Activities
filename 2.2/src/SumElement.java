/*
@author: Sam Assareymuriyil
Assignment: 2.2
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class SumElement {
    private JTextField oNum;
    private JTextArea arrOut;
    private JButton addButton;
    private JButton removeButton;
    private JButton sumOddButton;
    private JButton sumEvenButton;
    private JButton sumAllButton;
    private JButton exitButton;
    private JTextField sumOut;
    private JPanel mainPanel;

    //creates a global ArrayList so that it can be accessed throughout the file
    ArrayList<String> numList = new ArrayList<String>();

    public SumElement() {
        addButton.addActionListener(new ActionListener() {
            @Override
            //collect, sort and add to the ArrayList
            public void actionPerformed(ActionEvent e) {
                var num = "";
                num = oNum.getText();
                numList.add(num);
                Collections.sort(numList);
                String a;
                String temp = "";
                //output values in the array list to textarea
                Iterator stepper = numList.iterator();
                while (stepper.hasNext()) {
                    a = (String) stepper.next();
                    temp = temp + a + "\n";
                }
                arrOut.setText(temp);
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            //close the application with an exit code of 0
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        removeButton.addActionListener(new ActionListener() {
            @Override
            //remove, sort and remove from the ArrayList
            public void actionPerformed(ActionEvent e) {
                var num = "";
                num = oNum.getText();
                numList.remove(num);
                Collections.sort(numList);
                String a;
                String temp = "";
                //output updated values in textarea
                Iterator stepper = numList.iterator();
                while (stepper.hasNext()) {
                    a = (String) stepper.next();
                    temp = temp + a + "\n";
                    arrOut.setText(temp);
                }
            }
        });
        sumAllButton.addActionListener(new ActionListener() {
            @Override
            //add all values in the ArrayList
            public void actionPerformed(ActionEvent e) {
                int sum = 0;
                String a;
                String temp = "";
                Iterator stepper = numList.iterator();
                while (stepper.hasNext()) {
                    //calculate and update display (done in case user uses this after odd or even)
                    a = (String) stepper.next();
                    temp = temp + a + "\n";
                    sum = sum + Integer.parseInt(a);
                }
                arrOut.setText(temp);
                //set output sum
                sumOut.setText("The sum of all the numbers is equal to " + Integer.toString(sum));
            }
        });
        sumOddButton.addActionListener(new ActionListener() {
            @Override
            //add all odd values in the ArrayList
            public void actionPerformed(ActionEvent e) {
                int sum = 0;
                String a;
                String temp = "Odd Elements\n";
                Iterator stepper = numList.iterator();
                while (stepper.hasNext()) {
                    //calculate and update display to show only odd elements
                    a = (String) stepper.next();
                    if (Integer.parseInt(a) % 2 != 0) {
                        temp = temp + a + "\n";
                        sum = sum + Integer.parseInt(a);
                    }
                }
                arrOut.setText(temp);
                //set output sum
                sumOut.setText("The sum of all odd numbers is equal to " + Integer.toString(sum));
            }
        });
        sumEvenButton.addActionListener(new ActionListener() {
            @Override
            //add all even values in the ArrayList
            public void actionPerformed(ActionEvent e) {
                int sum = 0;
                String a;
                String temp = "Even Elements\n";
                Iterator stepper = numList.iterator();
                while (stepper.hasNext()) {
                    //calculate and update display to show only even elements
                    a = (String) stepper.next();
                    if (Integer.parseInt(a) % 2 == 0) {
                        temp = temp + a + "\n";
                        sum = sum + Integer.parseInt(a);
                    }
                }
                arrOut.setText(temp);
                //set output sum
                sumOut.setText("The sum of all even numbers is equal to " + Integer.toString(sum));
            }
        });
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        arrOut = new JTextArea();
        arrOut.setEditable(false);
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridheight = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        mainPanel.add(arrOut, gbc);
        oNum = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridheight = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(oNum, gbc);
        final JLabel label1 = new JLabel();
        label1.setText("Enter an Integer:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        mainPanel.add(label1, gbc);
        addButton = new JButton();
        addButton.setText("Add");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(addButton, gbc);
        removeButton = new JButton();
        removeButton.setText("Remove");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(removeButton, gbc);
        sumOddButton = new JButton();
        sumOddButton.setText("Sum Odd");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(sumOddButton, gbc);
        sumEvenButton = new JButton();
        sumEvenButton.setText("Sum Even");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(sumEvenButton, gbc);
        sumAllButton = new JButton();
        sumAllButton.setText("Sum All");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(sumAllButton, gbc);
        exitButton = new JButton();
        exitButton.setText("Exit");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(exitButton, gbc);
        sumOut = new JTextField();
        sumOut.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(sumOut, gbc);
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$(null, -1, 36, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setText("Integer Sums");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        mainPanel.add(label2, gbc);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Integer Sums");
        frame.setContentPane(new SumElement().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
        frame.setVisible(true);
    }

}
