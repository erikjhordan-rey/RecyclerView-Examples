package androidtitlan.gdg.recyclerview_examples.fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import androidtitlan.gdg.recyclerview_examples.R;
import androidtitlan.gdg.recyclerview_examples.adapter.AdapterExample;
import androidtitlan.gdg.recyclerview_examples.model.Picture;

/**
 * Created by Jhordan on 13/10/15.
 */
public class GridHorizontalFragment extends BaseFragment {

    public static GridHorizontalFragment newInstance() {
        return new GridHorizontalFragment();
    }

    @Override protected int getLayout() {
        return R.layout.fragment_base;
    }

    @Override protected RecyclerView.LayoutManager getLayoutManager() {
        return getGridLayoutManager();
    }

    @Override protected RecyclerView.Adapter getAdapter(ArrayList<Picture> pictureList) {
        return new AdapterExample(pictureList,R.layout.item_type_two);
    }

    private GridLayoutManager getGridLayoutManager() {
       return new GridLayoutManager(
                getActivity(),
                2,
                GridLayoutManager.HORIZONTAL,
                false);
    }
}

