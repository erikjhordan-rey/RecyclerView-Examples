package androidtitlan.gdg.recyclerview_examples.model;


import android.os.Handler;

import java.util.ArrayList;

/**
 * Created by Jhordan on 13/10/15.
 */
public class PictureInteractor implements Interactor {


    @Override
    public void loadItems(final LoaderListener loaderListener) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                loaderListener.onFinished(createCollectionPictures());
            }
        }, 2000);
    }


    private ArrayList<Picture> createCollectionPictures() {

        ArrayList<Picture> pictures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Picture picture = new Picture("Title " + Integer.toString(i), i);
            pictures.add(picture);
        }


        return pictures;

    }
}
