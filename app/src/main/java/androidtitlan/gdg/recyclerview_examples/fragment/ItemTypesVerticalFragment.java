package androidtitlan.gdg.recyclerview_examples.fragment;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import androidtitlan.gdg.recyclerview_examples.R;
import androidtitlan.gdg.recyclerview_examples.adapter.AdapterExampleTypes;
import androidtitlan.gdg.recyclerview_examples.model.Picture;

public class ItemTypesVerticalFragment extends BaseFragment {

    public static ItemTypesVerticalFragment newInstance() {
        return new ItemTypesVerticalFragment();
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_base;
    }

    @Override
    protected RecyclerView.LayoutManager getLayoutManager() {
        return getGridLayoutManager();
    }

    @Override
    protected RecyclerView.Adapter getAdapter(ArrayList<Picture> pictureList) {
        return new AdapterExampleTypes(pictureList, R.layout.item_type_two);
    }


    private GridLayoutManager getGridLayoutManager() {
        return new GridLayoutManager(
                getActivity(),
                2,
                RecyclerView.VERTICAL,
                false);

    }
}

