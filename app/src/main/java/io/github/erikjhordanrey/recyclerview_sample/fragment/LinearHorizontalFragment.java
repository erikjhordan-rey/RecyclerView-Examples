package io.github.erikjhordanrey.recyclerview_sample.fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.github.erikjhordanrey.recyclerview_sample.R;
import java.util.ArrayList;
import io.github.erikjhordanrey.recyclerview_sample.adapter.AdapterExample;
import io.github.erikjhordanrey.recyclerview_sample.model.Picture;

public class LinearHorizontalFragment extends BaseFragment {

    public static LinearHorizontalFragment newInstance() {
        return new LinearHorizontalFragment();
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_base;
    }

    @Override
    protected RecyclerView.LayoutManager getLayoutManager() {
        return getLinearLayoutManager();
    }

    @Override
    protected RecyclerView.Adapter getAdapter(ArrayList<Picture> pictureList) {
        return new AdapterExample(pictureList, R.layout.item_type_two);
    }

    private LinearLayoutManager getLinearLayoutManager() {
        return new LinearLayoutManager(
                getActivity(),
                LinearLayoutManager.HORIZONTAL,
                false);

    }
}

