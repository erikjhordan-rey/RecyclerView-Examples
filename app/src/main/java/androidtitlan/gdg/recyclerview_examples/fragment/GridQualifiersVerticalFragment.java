package androidtitlan.gdg.recyclerview_examples.fragment;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import androidtitlan.gdg.recyclerview_examples.R;
import androidtitlan.gdg.recyclerview_examples.adapter.AdapterExample;
import androidtitlan.gdg.recyclerview_examples.model.Picture;

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

