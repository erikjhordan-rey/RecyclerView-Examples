package io.github.erikjhordanrey.recyclerview_sample.fragment;

import androidx.recyclerview.widget.RecyclerView;
import io.github.erikjhordanrey.recyclerview_sample.R;
import java.util.ArrayList;
import io.github.erikjhordanrey.recyclerview_sample.adapter.AdapterExample;
import io.github.erikjhordanrey.recyclerview_sample.model.Picture;

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
