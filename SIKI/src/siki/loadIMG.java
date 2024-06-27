package siki;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author briandparmana 2201010659
 * TGL: 2024-06-15
 */
public class loadIMG {
    public static BufferedImage loadImage(String urlGambar){
        BufferedImage bimg = null;
        try{
            bimg = ImageIO.read(new File(urlGambar));
        }catch(IOException e){
            System.out.println("Gagal load gambar; "+e.getMessage());
            
        }
        return bimg;
    }
}
