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

public class SearchPanel extends JPanel {
    private FilmAppWindow w;
    private JLabel searchText;
    private JButton homeButton, searchButton, dashboardButton, libraryButton, settingsButton;
    private JButton submitButton;
    private JTextArea textArea, response;
    private JScrollPane scrollPane, responsePane;
    private GenerateTextFromTextInput aiOutput;

    public SearchPanel(FilmAppWindow win) {
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
        add(searchText);

        textArea.setForeground(Color.BLACK);
        textArea.setBackground(Color.WHITE);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setBounds(w.getWidth() / 2 - (width / 2), w.getHeight() / 10, width, height);
        add(scrollPane);

        response.setEditable(false);
        response.setBackground(new Color(245, 245, 245));
        response.setLineWrap(true);
        response.setWrapStyleWord(true);
        response.setText("WHAT ARE YOU LOOKING FOR?"
            + aiOutput.getSuggestions());
        responsePane.setBounds(left, w.getHeight() / 10 + 55, width, height * 5);
        add(responsePane);

        submitButton.setText("SUBMIT");
        submitButton.setBackground(Color.WHITE);
        submitButton.setBounds(left, w.getHeight() / 2, width, height - 20);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                response.setText(aiOutput.getResponse(textArea.getText()));
                textArea.setText("");
            }
        });
        add(submitButton);

        homeButton.setText("HOME");
        homeButton.setMargin(new Insets(1, 1, 1, 1));
        homeButton.setBackground(Color.WHITE);
        homeButton.setBounds(left - 40, 560, length, length);
        homeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                w.getContentPane().removeAll();
                w.add(new HomePanel(w));
                w.revalidate();
                w.repaint();
            }
        });
        add(homeButton);

        searchButton.setText("SEARCH");
        searchButton.setMargin(new Insets(1, 1, 1, 1));
        searchButton.setBackground(Color.WHITE);
        searchButton.setBounds(left - 40 + length, 560, length, length);
        add(searchButton);

        dashboardButton.setText("DASHBOARD");
        dashboardButton.setMargin(new Insets(1, 1, 1, 1));
        dashboardButton.setBackground(Color.WHITE);
        dashboardButton.setBounds(left - 40 + length * 2, 560, length, length);
        dashboardButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                w.getContentPane().removeAll();
                w.add(new DashboardPanel(w));
                w.revalidate();
                w.repaint();
            }
        });
        add(dashboardButton);

        libraryButton.setText("LIBRARY");
        libraryButton.setMargin(new Insets(1, 1, 1, 1));
        libraryButton.setBackground(Color.WHITE);
        libraryButton.setBounds(left - 40 + length * 3, 560, length, length);
        libraryButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                w.getContentPane().removeAll();
                w.add(new LibraryPanel(w));
                w.revalidate();
                w.repaint();
            }
        });
        add(libraryButton);

        settingsButton.setText("SETTINGS");
        settingsButton.setMargin(new Insets(1, 1, 1, 1));
        settingsButton.setBackground(Color.WHITE);
        settingsButton.setBounds(left - 40 + length * 4, 560, length, length);
        settingsButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                w.getContentPane().removeAll();
                w.add(new SettingsPanel(w));
                w.revalidate();
                w.repaint();
            }
        });
        add(settingsButton);
    }
}