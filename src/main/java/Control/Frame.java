package Control;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import vista.ImageDisplay;
import vista.SwingImageDisplay;

public class Frame extends JFrame {

    private ImageDisplay imageDisplay;

    public Frame() {
        setTitle("Image Viewer");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1366, 768);
        setLocationRelativeTo(null);
        getContentPane().add(imageDisplay());
        getContentPane().add(toolbar(), BorderLayout.SOUTH);
        setVisible(true);
    }

    private JPanel toolbar() {
        JPanel panel = new JPanel();
        panel.add(prevButton());
        panel.add(nextButton());
        return panel;
    }

    private Component prevButton() {
        JButton button = new JButton("<");
        button.addActionListener(prevImage());
        return button;
    }

    private ActionListener prevImage() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                imageDisplay.show(imageDisplay.current().prev());
            }
        };
    }

    private Component nextButton() {
        JButton button = new JButton(">");
        button.addActionListener(nextImage());
        return button;
    }

    private ActionListener nextImage() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                imageDisplay.show(imageDisplay.current().next());
            }
        };
    }

    private JPanel imageDisplay() {
        SwingImageDisplay sid = new SwingImageDisplay();
        this.imageDisplay = sid;
        return sid;
    }

    public ImageDisplay getImageDisplay() {
        return imageDisplay;
    }

}