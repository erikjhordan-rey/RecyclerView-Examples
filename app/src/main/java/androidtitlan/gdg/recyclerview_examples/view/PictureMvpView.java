package androidtitlan.gdg.recyclerview_examples.view;

import java.util.ArrayList;

import androidtitlan.gdg.recyclerview_examples.model.Picture;

public interface PictureMvpView {

    void setItems(ArrayList<Picture> pictureList);

    void showProgress();

    void hideProgress();

    void showMessage(String message);

}
