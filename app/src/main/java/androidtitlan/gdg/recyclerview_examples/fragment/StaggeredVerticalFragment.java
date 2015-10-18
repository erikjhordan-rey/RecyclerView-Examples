package androidtitlan.gdg.recyclerview_examples.fragment;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

import androidtitlan.gdg.recyclerview_examples.R;
import androidtitlan.gdg.recyclerview_examples.adapter.AdapterExample;
import androidtitlan.gdg.recyclerview_examples.model.Picture;

/**
 * Created by Jhordan on 13/10/15.
 */
public class StaggeredVerticalFragment extends BaseFragment {

    public static StaggeredVerticalFragment newInstance() {
        return new StaggeredVerticalFragment();
    }

    @Override protected int getLayout() {
        return R.layout.fragment_base;
    }

    @Override protected RecyclerView.LayoutManager getLayoutManager() {
        return getStaggeredLayoutManager();
    }

    @Override protected RecyclerView.Adapter getAdapter(ArrayList<Picture> pictureList) {
        return new AdapterExample(pictureList,R.layout.item_type_three);
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

