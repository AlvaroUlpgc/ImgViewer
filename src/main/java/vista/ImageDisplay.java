package vista;

import modelo.Image;

public interface ImageDisplay {
    Image current();
    void show(Image image);
}