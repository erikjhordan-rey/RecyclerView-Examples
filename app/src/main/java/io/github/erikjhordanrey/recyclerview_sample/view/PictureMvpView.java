package io.github.erikjhordanrey.recyclerview_sample.view;

import java.util.ArrayList;

import io.github.erikjhordanrey.recyclerview_sample.model.Picture;

public interface PictureMvpView {

    void setItems(ArrayList<Picture> pictureList);

    void showProgress();

    void hideProgress();

    void showMessage(String message);

}
