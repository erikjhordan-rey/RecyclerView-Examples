package androidtitlan.gdg.recyclerview_examples.model;

import java.util.ArrayList;

import androidtitlan.gdg.recyclerview_examples.model.Picture;

/**
 * Created by Jhordan on 13/10/15.
 */
public interface LoaderListener {

    void onFinished(ArrayList<Picture> pictureList);
}
