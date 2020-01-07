package vista;

import modelo.Image;
import persistencia.ImageLoader;

public class WebImageLoader implements ImageLoader {
    private String url;

    public WebImageLoader(String url) {
        this.url = url;
    }
    
    @Override
    public Image load() {
        return null;
    }
    
}