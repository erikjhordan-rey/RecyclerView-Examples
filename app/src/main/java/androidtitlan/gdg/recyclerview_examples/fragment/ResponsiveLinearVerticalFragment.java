package androidtitlan.gdg.recyclerview_examples.fragment;

import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import androidtitlan.gdg.recyclerview_examples.R;
import androidtitlan.gdg.recyclerview_examples.adapter.AdapterExample;
import androidtitlan.gdg.recyclerview_examples.model.Picture;

/**
 * This fragment is responsive according with display screen.
 * Created by Jhordan on 13/10/15.
 */
public class ResponsiveLinearVerticalFragment extends BaseFragment {


    public static ResponsiveLinearVerticalFragment newInstance() {
        return new ResponsiveLinearVerticalFragment();
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_responsive;
    }

    @Override
    protected RecyclerView.LayoutManager getLayoutManager() {
        return null;
    }


    @Override
    protected RecyclerView.Adapter getAdapter(ArrayList<Picture> pictureList) {
        return new AdapterExample(pictureList, R.layout.item_type_one);


    }


}

