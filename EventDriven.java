import java.awt.*;
import java.awt.event.*;

public class EventDriven 
{
    private static Frame mainFrame;
    private static Label headerLabel;
    private static Label resultLabel;
    private static TextField textField;
    private static Panel controlPanel;
    
    public EventDriven()
    {
        prepareGUI();
    }
    public static void main(String[] args) 
    {
        EventDriven obj = new EventDriven();
        obj.showEvent();
    }
    private void prepareGUI()
    {
        mainFrame = new Frame("AWT Count");
        mainFrame.setSize(500, 500);
        mainFrame.setLocation(400, 100);
        mainFrame.setLayout(new GridLayout(4, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        
        headerLabel = new Label();
        headerLabel.setText("Count Number of Characters");
        headerLabel.setSize(300, 300);
        headerLabel.setAlignment(Label.CENTER);
        
        textField = new TextField();
        textField.setSize(300, 300);
        
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
        
        resultLabel = new Label();
        resultLabel.setAlignment(Label.CENTER);
        
        mainFrame.add(headerLabel);
        mainFrame.add(textField);
        mainFrame.add(controlPanel);
        mainFrame.add(resultLabel);
        mainFrame.setVisible(true);
    }
    private void showEvent()
    {
        Button countButton = new Button("Count");
        Button exitButton = new Button("Exit");
        
        countButton.setActionCommand("Count");
        exitButton.setActionCommand("Exit");
        
        countButton.addActionListener(new ButtonClickListener());
        exitButton.addActionListener(new ButtonClickListener());
        
        controlPanel.add(countButton);
        controlPanel.add(exitButton);
        mainFrame.setVisible(true);
    }

    private static class ButtonClickListener implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            String action = e.getActionCommand();
            if(action.equals("Count"))
            {
                String text = textField.getText();
                resultLabel.setText("Number of Characters: " + text.length());
            }
            if(action.equals("Exit"))
            {
                System.exit(0);
            }
        }
    }  
}
