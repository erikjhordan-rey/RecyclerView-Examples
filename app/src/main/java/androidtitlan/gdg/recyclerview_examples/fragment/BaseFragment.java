package androidtitlan.gdg.recyclerview_examples.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

import androidtitlan.gdg.recyclerview_examples.R;
import androidtitlan.gdg.recyclerview_examples.adapter.AdapterExample;
import androidtitlan.gdg.recyclerview_examples.adapter.AdapterExampleTypes;
import androidtitlan.gdg.recyclerview_examples.model.Picture;
import androidtitlan.gdg.recyclerview_examples.presenter.PicturePresenter;
import androidtitlan.gdg.recyclerview_examples.presenter.RecyclerItemClickListener;
import androidtitlan.gdg.recyclerview_examples.view.PictureMvpView;
import androidtitlan.gdg.recyclerview_examples.widget.DividerDecoration;
import androidtitlan.gdg.recyclerview_examples.widget.ItemOffsetDecoration;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Jhordan on 13/10/15.
 */
public abstract class BaseFragment extends Fragment implements PictureMvpView, RecyclerItemClickListener {

    @Bind(R.id.recycler_view) RecyclerView recyclerView;
    @Bind(R.id.progress_bar) ProgressBar progressBar;
    private PicturePresenter picturePresenter;
    RecyclerView.Adapter adapter;

    @Nullable
    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(getLayout(), container, false);
        ButterKnife.bind(this, rootView);

        picturePresenter = new PicturePresenter();
        picturePresenter.attachedView(this);
        setupRecyclerView();

        return rootView;
    }

    @Override public void onResume() {
        super.onResume();
        picturePresenter.onResume();
    }

    @Override public void setItems(ArrayList<Picture> pictureList) {
        adapter = getAdapter(pictureList);
        recyclerView.setAdapter(adapter);

        if(adapter instanceof AdapterExample)
            ((AdapterExample) adapter).setRecyclerItemClickListener(this);
        else if(adapter instanceof AdapterExampleTypes)
            ((AdapterExampleTypes) adapter).setRecyclerItemClickListener(this);

    }

    @Override public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        recyclerView.setVisibility(View.INVISIBLE);
    }

    @Override public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
        recyclerView.setVisibility(View.VISIBLE);
    }

    @Override public void showMessage(String message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }

    @Override public void onDestroy() {
        picturePresenter.detachView();
        super.onDestroy();
    }

    @Override
    public void onItemClickListener(int position) {
        picturePresenter.onItemSelected(position);
    }

    private void setupRecyclerView() {

        if(getLayoutManager() != null)
            recyclerView.setLayoutManager(getLayoutManager());

        recyclerView.addItemDecoration(new ItemOffsetDecoration(recyclerView.getContext(), R.dimen.item_decoration));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }

    protected abstract int getLayout();

    protected abstract RecyclerView.LayoutManager getLayoutManager();

    protected abstract RecyclerView.Adapter getAdapter(ArrayList<Picture> pictureList);




    //protected abstract RecyclerView.ItemDecoration getItemDecoration();
}
