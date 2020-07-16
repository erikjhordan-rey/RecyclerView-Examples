package io.github.erikjhordanrey.recyclerview_sample.fragment;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import io.github.erikjhordanrey.recyclerview_sample.R;
import java.util.ArrayList;
import io.github.erikjhordanrey.recyclerview_sample.adapter.AdapterExample;
import io.github.erikjhordanrey.recyclerview_sample.model.Picture;

public class StaggeredVerticalFragment extends BaseFragment {

    public static StaggeredVerticalFragment newInstance() {
        return new StaggeredVerticalFragment();
    }

    @Override
    protected RecyclerView.LayoutManager getLayoutManager() {
        return getStaggeredLayoutManager();
    }

    @Override
    protected RecyclerView.Adapter getAdapter(ArrayList<Picture> pictureList) {
        return new AdapterExample(pictureList, R.layout.item_type_three);
    }

    private StaggeredGridLayoutManager getStaggeredLayoutManager() {

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(
                2, //number of grid columns
                StaggeredGridLayoutManager.VERTICAL);
        //Sets the gap handling strategy for StaggeredGridLayoutManager
        staggeredGridLayoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
        return staggeredGridLayoutManager;
    }
}

