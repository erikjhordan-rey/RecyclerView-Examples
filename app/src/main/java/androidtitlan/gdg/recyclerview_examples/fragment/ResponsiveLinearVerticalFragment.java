package androidtitlan.gdg.recyclerview_examples.fragment;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import androidtitlan.gdg.recyclerview_examples.R;
import androidtitlan.gdg.recyclerview_examples.adapter.AdapterExample;
import androidtitlan.gdg.recyclerview_examples.model.Picture;

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
