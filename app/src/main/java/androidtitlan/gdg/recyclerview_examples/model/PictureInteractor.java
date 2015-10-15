package androidtitlan.gdg.recyclerview_examples.model;


import android.os.Handler;

import java.util.ArrayList;

import androidtitlan.gdg.recyclerview_examples.R;

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

        int picturesImages[] = {
                R.drawable.cohete_flat,
                R.drawable.london_flat,
                R.drawable.material_flat,
                R.drawable.moon_flat,
                R.drawable.mountain_flat,
                R.drawable.mountain_mo_flat,
                R.drawable.moutain_go_flat,
                R.drawable.pine_flat,
                R.drawable.towers_flat,
                R.drawable.vulcan_flat};
        ArrayList<Picture> pictures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Picture picture = new Picture("Title " + Integer.toString(i), picturesImages[i]);
            pictures.add(picture);
        }


        return pictures;

    }
}
