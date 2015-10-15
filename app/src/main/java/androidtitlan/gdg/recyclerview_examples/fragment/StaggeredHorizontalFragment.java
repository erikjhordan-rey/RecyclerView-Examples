package androidtitlan.gdg.recyclerview_examples.fragment;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import androidtitlan.gdg.recyclerview_examples.R;

/**
 * Created by Jhordan on 13/10/15.
 */
public class StaggeredHorizontalFragment extends BaseFragment {

    public static StaggeredHorizontalFragment newInstance() {
        return new StaggeredHorizontalFragment();
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
                StaggeredGridLayoutManager.HORIZONTAL);
        //Sets the gap handling strategy for StaggeredGridLayoutManager
        staggeredGridLayoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);

        return staggeredGridLayoutManager;
    }
}

