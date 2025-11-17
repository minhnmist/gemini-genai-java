import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LibraryPanel extends JPanel {
    private FilmAppWindow w;
    private JLabel text;
    private JButton homeButton, searchButton, dashboardButton, libraryButton, settingsButton;

    public LibraryPanel(FilmAppWindow win) {
        w = win;
        text = new JLabel();
        homeButton = new JButton();
        searchButton = new JButton();
        dashboardButton = new JButton();
        libraryButton = new JButton();
        settingsButton = new JButton();

        setSize(w.getWidth(), w.getHeight());
        setBackground(new Color(250, 250, 250));
        setLayout(null);

        loadComponents();
    }

    private void loadComponents() {
        int width = 250, left = w.getWidth() / 2 - (width / 2), length = 65;

        text.setText("LIBRARY");
        text.setBounds(left, w.getHeight() / 22, width, 50);
        add(text);
        
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
        searchButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                w.getContentPane().removeAll();
                w.add(new SearchPanel(w));
                w.revalidate();
                w.repaint();
            }
        });
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