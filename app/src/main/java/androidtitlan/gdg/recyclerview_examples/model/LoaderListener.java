package androidtitlan.gdg.recyclerview_examples.model;

import java.util.ArrayList;

import androidtitlan.gdg.recyclerview_examples.model.Picture;

public interface LoaderListener {

    void onFinished(ArrayList<Picture> pictureList);
}
