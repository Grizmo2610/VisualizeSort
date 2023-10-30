package Sort;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        new Config();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App();
            }
        });
    }
}
