import javax.swing.JFrame;

public class FilmAppWindow extends JFrame {
    public FilmAppWindow() {
        setSize(400, 900);
        setTitle("FILM RECOMMENDATIONS");
        setLocationRelativeTo(null);
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        add(new FilmAppPanel(this));

        setVisible(true);
    }
}