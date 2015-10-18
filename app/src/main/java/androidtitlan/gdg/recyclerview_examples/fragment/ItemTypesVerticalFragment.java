package androidtitlan.gdg.recyclerview_examples.fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import androidtitlan.gdg.recyclerview_examples.R;
import androidtitlan.gdg.recyclerview_examples.adapter.AdapterExampleTypes;
import androidtitlan.gdg.recyclerview_examples.model.Picture;

/**
 * Created by Jhordan on 13/10/15.
 */
public class ItemTypesVerticalFragment extends BaseFragment {

    public static ItemTypesVerticalFragment newInstance() {
        return new ItemTypesVerticalFragment();
    }

    @Override protected int getLayout() {
        return R.layout.fragment_base;
    }

    @Override protected RecyclerView.LayoutManager getLayoutManager() {
        return getGridLayoutManager();
    }

    @Override protected RecyclerView.Adapter getAdapter(ArrayList<Picture> pictureList) {
        return new AdapterExampleTypes(pictureList,R.layout.item_type_two);
    }


    private GridLayoutManager getGridLayoutManager() {
        return new GridLayoutManager(
                getActivity(),
                2,
                GridLayoutManager.VERTICAL,
                false);

    }
}

