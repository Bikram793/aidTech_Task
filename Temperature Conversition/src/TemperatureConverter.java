import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter {
    private JFrame frame;
    private JTextField inputField;
    private JLabel outputLabel;
    private JComboBox<String> scaleComboBox;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TemperatureConverter().createAndShowGUI();
            }
        });
    }

    public void createAndShowGUI() {
        frame = new JFrame("Temperature Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 1));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel inputLabel = new JLabel("Enter temperature:");
        inputField = new JTextField();
        JLabel outputTextLabel = new JLabel("Converted temperature:");
        outputLabel = new JLabel();

        panel.add(inputLabel);
        panel.add(inputField);
        panel.add(outputTextLabel);
        panel.add(outputLabel);

        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertTemperature();
            }
        });

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
                outputLabel.setText("");
            }
        });

        String[] scales = {"Celsius", "Fahrenheit", "Kelvin"};
        scaleComboBox = new JComboBox<>(scales);

        JButton switchButton = new JButton("Switch");
        switchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchScale();
            }
        });

        panel.add(convertButton);
        panel.add(clearButton);
        panel.add(scaleComboBox);
        panel.add(switchButton);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private void convertTemperature() {
        String inputText = inputField.getText();
        try {
            double inputTemperature = Double.parseDouble(inputText);
            String selectedScale = (String) scaleComboBox.getSelectedItem();
            double convertedTemperature = 0.0;

            switch (selectedScale) {
                case "Celsius":
                    convertedTemperature = celsiusToFahrenheit(inputTemperature);
                    break;
                case "Fahrenheit":
                    convertedTemperature = fahrenheitToCelsius(inputTemperature);
                    break;
                case "Kelvin":
                    convertedTemperature = kelvinToCelsius(inputTemperature);
                    break;
            }

            outputLabel.setText(Double.toString(convertedTemperature));
        } catch (NumberFormatException e) {
            outputLabel.setText("Invalid input");
        }
    }

    private double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private void switchScale() {
        String inputText = inputField.getText();
        try {
            double inputTemperature = Double.parseDouble(inputText);
            double convertedTemperature = 0.0;
            String selectedScale = (String) scaleComboBox.getSelectedItem();

            switch (selectedScale) {
                case "Celsius":
                    convertedTemperature = celsiusToFahrenheit(inputTemperature);
                    break;
                case "Fahrenheit":
                    convertedTemperature = fahrenheitToCelsius(inputTemperature);
                    break;
                case "Kelvin":
                    convertedTemperature = kelvinToCelsius(inputTemperature);
                    break;
            }

            outputLabel.setText(Double.toString(convertedTemperature));
        } catch (NumberFormatException e) {
            outputLabel.setText("Invalid input");
        }
    }
}

                   
