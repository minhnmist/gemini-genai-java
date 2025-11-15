import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class FilmAppPanel extends JPanel {
    private FilmAppWindow w;
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public FilmAppPanel(FilmAppWindow win) {
        w = win;

        setSize(w.getWidth(), w.getHeight());
        setBackground(new Color(200, 180, 180));
        setLayout(null);

        loadComponents();
    }

    private void loadComponents() {
        textArea = new JTextArea();
        textArea.setForeground(Color.BLACK);
        textArea.setBackground(Color.WHITE);
        textArea.setLineWrap(true);
        
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(w.getWidth() / 8, w.getHeight() / 3, 300, 100);
        add(scrollPane);
    }
}