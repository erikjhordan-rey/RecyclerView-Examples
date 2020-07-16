package io.github.erikjhordanrey.recyclerview_sample.fragment;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.github.erikjhordanrey.recyclerview_sample.R;
import java.util.ArrayList;
import io.github.erikjhordanrey.recyclerview_sample.adapter.AdapterExample;
import io.github.erikjhordanrey.recyclerview_sample.model.Picture;

public class GridVerticalFragment extends BaseFragment {

    public static GridVerticalFragment newInstance() {
        return new GridVerticalFragment();
    }

    @Override
    protected RecyclerView.LayoutManager getLayoutManager() {
        return getGridLayoutManager();
    }

    @Override
    protected RecyclerView.Adapter getAdapter(ArrayList<Picture> pictureList) {
        return new AdapterExample(pictureList, R.layout.item_type_two);
    }

    private GridLayoutManager getGridLayoutManager() {
        return new GridLayoutManager(
                getActivity(),
                2,
                RecyclerView.VERTICAL,
                false);
    }
}

