import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FilmAppPanel extends JPanel {
    private FilmAppWindow w;
    private JLabel searchText;
    private JButton homeButton, searchButton, dashboardButton, libraryButton, settingsButton;
    private JButton submitButton;
    private JTextArea textArea, response;
    private JScrollPane scrollPane, responsePane;
    private GenerateTextFromTextInput aiOutput;

    public FilmAppPanel(FilmAppWindow win) {
        w = win;
        searchText = new JLabel();
        homeButton = new JButton();
        searchButton = new JButton();
        dashboardButton = new JButton();
        libraryButton = new JButton();
        settingsButton = new JButton();
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
        int width = 250, height = 50, left = w.getWidth() / 2 - (width / 2), length = 65;

        searchText.setText("SEARCH");
        searchText.setBounds(left, w.getHeight() / 22, width, height);

        textArea.setForeground(Color.BLACK);
        textArea.setBackground(Color.WHITE);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setBounds(w.getWidth() / 2 - (width / 2), w.getHeight() / 10, width, height);

        response.setEditable(false);
        response.setBackground(new Color(245, 245, 245));
        response.setLineWrap(true);
        response.setWrapStyleWord(true);
        response.setText("WHAT ARE YOU LOOKING FOR?"
            + aiOutput.getSuggestions());

        responsePane.setBounds(left, w.getHeight() / 10 + 55, width, height * 5);

        submitButton.setText("SUBMIT");
        submitButton.setBackground(Color.WHITE);
        submitButton.setBounds(left, w.getHeight() / 2, width, height - 20);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.out.println(textArea.getText());
                response.setText(aiOutput.getResponse(textArea.getText()));
                textArea.setText("");
            }
        });

        homeButton.setText("HOME");
        homeButton.setMargin(new Insets(2, 2, 2, 2));
        homeButton.setBackground(Color.WHITE);
        homeButton.setBounds(left - 40, w.getHeight() - 340, length, length);
        homeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("GO TO HOME");
            }
        });

        searchButton.setText("SEARCH");
        searchButton.setMargin(new Insets(2, 2, 2, 2));
        searchButton.setBackground(Color.WHITE);
        searchButton.setBounds(left - 40 + length, w.getHeight() - 340, length, length);
        searchButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("GO TO SEARCH");
            }
        });

        dashboardButton.setText("DASHBOARD");
        dashboardButton.setMargin(new Insets(2, 2, 2, 2));
        dashboardButton.setBackground(Color.WHITE);
        dashboardButton.setBounds(left - 40 + length * 2, w.getHeight() - 340, length, length);
        dashboardButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("GO TO DASHBOARD");
            }
        });

        libraryButton.setText("LIBRARY");
        libraryButton.setMargin(new Insets(2, 2, 2, 2));
        libraryButton.setBackground(Color.WHITE);
        libraryButton.setBounds(left - 40 + length * 3, w.getHeight() - 340, length, length);
        libraryButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("GO TO LIBRARY");
            }
        });

        settingsButton.setText("SETTINGS");
        settingsButton.setMargin(new Insets(2, 2, 2, 2));
        settingsButton.setBackground(Color.WHITE);
        settingsButton.setBounds(left - 40 + length * 4, w.getHeight() - 340, length, length);
        settingsButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("GO TO SETTINGS");
            }
        });
        
        add(searchText);
        add(homeButton);
        add(searchButton);
        add(dashboardButton);
        add(libraryButton);
        add(settingsButton);
        add(scrollPane);
        add(submitButton);
        add(responsePane);
    }
}