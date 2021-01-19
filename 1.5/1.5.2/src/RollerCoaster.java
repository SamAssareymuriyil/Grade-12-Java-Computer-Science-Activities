/**
 * ICS4UR Computer Science, 12
 * Brampton, Canada
 *
 * https://github.com/SamAssareymuriyil
 * https://repl.it/@SamTheMan/
 *
 * modified     20201008
 * date         20201008
 * @filename    RollerCoaster.java
 * @author      Sam Assareymuriyil
 * @version     1.0
 * @see         RollerCoaster program Assignment 1.5.2
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RollerCoaster extends JFrame {
    private JPanel mainPanel;
    private JTextField checkHeight;
    private JTextField checkBack;
    private JTextField checkHeart;
    private JTextField eligibRC;
    private JButton calculateButton;
    private JButton exitButton;

    //src: https://www.youtube.com/watch?v=-SmNpKskfJc
    public RollerCoaster(String title) {
        super("Roller Coaster Eligibility");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int height;
                    String back, heart;
                    height = Integer.parseInt(checkHeight.getText());
                    back = checkBack.getText();
                    heart = checkHeart.getText();
                    //src: https://stackoverflow.com/questions/1795808/and-and-or-in-if-statements
                    if (height >= 122 && height <= 188) {
                        eligibRC.setText("It is OKAY for you to ride this ride. ENJOY");
                        //src: https://www.w3resource.com/java-tutorial/string/string_equalsignorecase.php#:~:text=Java%20String%3A%20equalsIgnoreCase()%20Method&text=The%20equalsIgnoreCase()%20Method%20is,strings%20are%20equal%20ignoring%20case.
                        if (back.equalsIgnoreCase("n") && heart.equalsIgnoreCase("n")) {
                            eligibRC.setText("It is OKAY for you to ride this ride. ENJOY");
                        } else {
                            eligibRC.setText("Sorry it is not safe for you to ride");
                        }
                    } else {
                        eligibRC.setText("Sorry it is not safe for you to ride");
                    }
                }
                catch(Exception f){
                    eligibRC.setText("There was an error, please try again.");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new RollerCoaster("Roller Coaster Eligibility");
        frame.setVisible(true);
        // src: https://alvinalexander.com/java/jframe-size-example-screen/#:~:text=getScreenSize()%3B%20%2F%2F%20get%202,new%20Dimension(width%2C%20height))%3B
        frame.setSize(new Dimension(500, 300));
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
        checkHeight = new JTextField();
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(checkHeight, gbc);
        checkBack = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(checkBack, gbc);
        checkHeart = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(checkHeart, gbc);
        final JLabel label1 = new JLabel();
        label1.setText("Back Trouble (Y/N)");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        mainPanel.add(label1, gbc);
        final JLabel label2 = new JLabel();
        label2.setText("Heart Trouble (Y/N)");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        mainPanel.add(label2, gbc);
        final JLabel label3 = new JLabel();
        label3.setText("Height (cm)");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        mainPanel.add(label3, gbc);
        eligibRC = new JTextField();
        eligibRC.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(eligibRC, gbc);
        calculateButton = new JButton();
        calculateButton.setText("Calculate");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 10;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(calculateButton, gbc);
        exitButton = new JButton();
        exitButton.setText("Exit");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(exitButton, gbc);
        final JLabel label4 = new JLabel();
        Font label4Font = this.$$$getFont$$$(null, -1, 36, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setText("Roller Coaster Eligibility");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        mainPanel.add(label4, gbc);
    }
// hello all
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

}