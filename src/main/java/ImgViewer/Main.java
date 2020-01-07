package ImgViewer;

import Control.Frame;
import java.io.File;
import modelo.Image;
import persistencia.FileImageLoader;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Alvaro\\Desktop\\Rok");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();
        Frame mainFrame = new Frame();
        mainFrame.getImageDisplay().show(image);
    }
    
}