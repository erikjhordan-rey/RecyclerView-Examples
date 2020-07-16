package io.github.erikjhordanrey.recyclerview_sample.presenter;

import java.util.ArrayList;

import io.github.erikjhordanrey.recyclerview_sample.model.LoaderListener;
import io.github.erikjhordanrey.recyclerview_sample.model.Picture;
import io.github.erikjhordanrey.recyclerview_sample.model.PictureInteractor;
import io.github.erikjhordanrey.recyclerview_sample.view.PictureMvpView;

public class PicturePresenter implements Presenter<PictureMvpView>, LoaderListener {

    private PictureMvpView pictureMvpView;
    private final PictureInteractor pictureInteractor;

    public PicturePresenter() {
        pictureInteractor = new PictureInteractor();
    }

    @Override
    public void attachedView(PictureMvpView view) {
        if (view == null)
            throw new IllegalArgumentException("You can't set a null view");
        pictureMvpView = view;
    }

    @Override public void detachView() {
        pictureMvpView = null;
    }

    @Override public void onResume() {
        pictureMvpView.showProgress();
        pictureInteractor.loadItems(this);
    }

    @Override public void onItemSelected(int position) {
        pictureMvpView.showMessage(Integer.toString(position));

    }

    @Override public void onFinished(ArrayList<Picture> pictureList) {
        pictureMvpView.setItems(pictureList);
        pictureMvpView.hideProgress();
    }
}
