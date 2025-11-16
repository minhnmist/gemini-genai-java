import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FilmAppPanel extends JPanel {
    private FilmAppWindow w;
    private JButton submitButton;
    private JTextArea textArea, response;
    private JScrollPane scrollPane, responsePane;
    private GenerateTextFromTextInput aiOutput;

    public FilmAppPanel(FilmAppWindow win) {
        w = win;
        submitButton = new JButton();
        textArea = new JTextArea();
        response = new JTextArea();
        responsePane = new JScrollPane(response);
        scrollPane = new JScrollPane(textArea);
        aiOutput = new GenerateTextFromTextInput();

        setSize(w.getWidth(), w.getHeight());
        setBackground(new Color(250, 250, 250));
        setLayout(null);

        loadComponents();
    }

    private void loadComponents() {
        response.setLineWrap(true);

        textArea.setForeground(Color.BLACK);
        textArea.setBackground(Color.WHITE);
        textArea.setLineWrap(true);
        
        scrollPane.setBounds(w.getWidth() / 9, w.getHeight() / 8, 300, 100);

        submitButton.setText("SUBMIT");
        submitButton.setBackground(Color.WHITE);
        submitButton.setBounds(w.getWidth() / 9, w.getHeight() / 3 * 2, 300, 30);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.out.println(textArea.getText());
                response.setText(aiOutput.getResponse(textArea.getText()));
                // array = aiOutput.getResponse(textArea.getText()).split(" ");

                // int lineLength = 30;
                // String responseStr = "";
                
                // for (int x = 0; x < array.length; x++) {
                //     lineLength -= array[x].length();
                //     System.out.println(lineLength);
                //     if (lineLength < 0) {
                //         responseStr += "\n";
                //         lineLength = 50;
                //     }
                //     responseStr += array[x];
                //     responseStr += " ";
                // }
                // System.out.println(responseStr);
                // response.setText(responseStr);
            }
        });

        responsePane.setBackground(new Color(245, 245, 245));
        responsePane.setBounds(w.getWidth() / 9, w.getHeight() / 4, 300, 300);
        
        add(scrollPane);
        add(submitButton);
        add(responsePane);
    }
}