package io.github.erikjhordanrey.recyclerview_sample.drawer;

import android.view.MenuItem;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

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
