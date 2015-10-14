package androidtitlan.gdg.recyclerview_examples.fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Jhordan on 13/10/15.
 */
public class GridHorizontalFragment extends BaseFragment {

    public static GridHorizontalFragment newInstance() {
        return new GridHorizontalFragment();
    }


    @Override
    protected RecyclerView.LayoutManager getLayoutManager() {
        return getGridLayoutManager();
    }


    private GridLayoutManager getGridLayoutManager() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(
                getActivity(),
                2,
                GridLayoutManager.HORIZONTAL,
                false);

        return gridLayoutManager;
    }
}

