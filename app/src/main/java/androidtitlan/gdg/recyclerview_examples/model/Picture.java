package androidtitlan.gdg.recyclerview_examples.model;

/**
 * Created by Jhordan on 13/10/15.
 */
public class Picture {

    private int image;
    private String name;

    public Picture(String name, int image) {
        this.name = name;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

}
