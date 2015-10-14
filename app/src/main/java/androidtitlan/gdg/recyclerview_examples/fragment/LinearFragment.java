package androidtitlan.gdg.recyclerview_examples.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Jhordan on 13/10/15.
 */
public class LinearFragment extends BaseFragment {

    public static LinearFragment newInstance() {
        return new LinearFragment();
    }


    @Override
    protected RecyclerView.LayoutManager getLayoutManager() {
        return getLinearLayoutManager();
    }


    private LinearLayoutManager getLinearLayoutManager() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                getActivity(),
                LinearLayoutManager.VERTICAL,
                false);

        return linearLayoutManager;
    }
}

