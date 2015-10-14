package androidtitlan.gdg.recyclerview_examples.fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

/**
 * Created by Jhordan on 13/10/15.
 */
public class StaggeredFragment extends BaseFragment {

    public static StaggeredFragment newInstance() {
        return new StaggeredFragment();
    }


    @Override
    protected RecyclerView.LayoutManager getLayoutManager() {
        return getStaggeredLayoutManager();
    }


    private StaggeredGridLayoutManager getStaggeredLayoutManager() {

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(
                2, //number of grid columns
                GridLayoutManager.VERTICAL);
        //Sets the gap handling strategy for StaggeredGridLayoutManager
        staggeredGridLayoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);

        return staggeredGridLayoutManager;
    }
}

