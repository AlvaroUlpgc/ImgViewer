  
package vista;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import modelo.Image;

public class SwingImageDisplay  extends JPanel implements ImageDisplay {
    private Image currentImage;
    private Image prevImage;
            
    @Override
    public Image current() {
        return currentImage;
    }

    public Image prev() {
        return prevImage;
    }
    
    @Override
    public void show(Image image) {
        this.currentImage = image;
        this.repaint();
    }
    
    @Override
    public void paint(Graphics g) {
        if (currentImage == null) return;
        g.drawImage(imageOf(currentImage), 0, 0, null);
    }

    private BufferedImage imageOf(Image image) {
        try {
            return ImageIO.read(image.stream());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    };
}