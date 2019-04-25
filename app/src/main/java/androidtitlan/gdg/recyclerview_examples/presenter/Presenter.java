package androidtitlan.gdg.recyclerview_examples.presenter;

public interface Presenter <V> {

    void attachedView(V view);

    void detachView();

    void onResume();

    void onItemSelected(int position);
}
