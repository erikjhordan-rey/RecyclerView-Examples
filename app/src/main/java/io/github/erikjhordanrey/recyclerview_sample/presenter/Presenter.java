package io.github.erikjhordanrey.recyclerview_sample.presenter;

public interface Presenter <V> {

    void attachedView(V view);

    void detachView();

    void onResume();

    void onItemSelected(int position);
}
