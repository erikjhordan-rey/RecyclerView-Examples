package androidtitlan.gdg.recyclerview_examples.fragment;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import androidtitlan.gdg.recyclerview_examples.R;

/**
 * Created by Jhordan on 13/10/15.
 */
public class StaggeredVerticalFragment extends BaseFragment {

    public static StaggeredVerticalFragment newInstance() {
        return new StaggeredVerticalFragment();
    }


    @Override
    protected RecyclerView.LayoutManager getLayoutManager() {
        return getStaggeredLayoutManager();
    }

    @Override
    protected int getItemLayout() {
        return R.layout.simple_item_tree;
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

