package androidtitlan.gdg.recyclerview_examples.presenter;

import java.util.ArrayList;

import androidtitlan.gdg.recyclerview_examples.model.LoaderListener;
import androidtitlan.gdg.recyclerview_examples.model.Picture;
import androidtitlan.gdg.recyclerview_examples.model.PictureInteractor;
import androidtitlan.gdg.recyclerview_examples.view.PictureMvpView;

/**
 * Created by Jhordan on 13/10/15.
 */
public class PicturePresenter implements Presenter<PictureMvpView>, LoaderListener {

    private PictureMvpView pictureMvpView;
    private PictureInteractor pictureInteractor;

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
