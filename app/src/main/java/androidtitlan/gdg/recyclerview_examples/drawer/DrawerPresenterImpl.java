package androidtitlan.gdg.recyclerview_examples.drawer;

import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

/**
 * Created by Jhordan on 13/10/15.
 */
public class DrawerPresenterImpl implements DrawerPresenter, DrawerListener {

    private final DrawerInteractorImpl drawerInteractor;
    private final DrawerView drawerView;

    public DrawerPresenterImpl(DrawerView drawerView) {
        this.drawerView = drawerView;
        drawerInteractor = new DrawerInteractorImpl();
    }

    @Override
    public void navigationItemSelected(MenuItem item, DrawerLayout drawerLayout) {
        drawerInteractor.navigateTo(item, drawerLayout, this);
    }

    @Override
    public void replaceFragment(Fragment fragment) {
        drawerView.navigateUsingTo(fragment);
    }

    public interface DrawerView {
        void navigateUsingTo(Fragment fragment);
    }

}
