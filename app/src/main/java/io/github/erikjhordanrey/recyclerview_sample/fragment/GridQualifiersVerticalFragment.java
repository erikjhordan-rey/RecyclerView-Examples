package io.github.erikjhordanrey.recyclerview_sample.fragment;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.github.erikjhordanrey.recyclerview_sample.R;
import java.util.ArrayList;
import io.github.erikjhordanrey.recyclerview_sample.adapter.AdapterExample;
import io.github.erikjhordanrey.recyclerview_sample.model.Picture;

public class GridQualifiersVerticalFragment extends BaseFragment {

    public static GridQualifiersVerticalFragment newInstance() {
        return new GridQualifiersVerticalFragment();
    }

    @Override protected int getLayout() {
        return R.layout.fragment_base;
    }


    @Override protected RecyclerView.LayoutManager getLayoutManager() {
        return getGridLayoutManager();
    }

    @Override protected RecyclerView.Adapter getAdapter(ArrayList<Picture> pictureList) {
        return new AdapterExample(pictureList, R.layout.item_type_two);
    }

    private GridLayoutManager getGridLayoutManager() {

        final int spans = getResources().getInteger(R.integer.number_of_columns);
        return new GridLayoutManager(
                getActivity(),
                spans,
                RecyclerView.VERTICAL,
                false);
    }
}

