package androidtitlan.gdg.recyclerview_examples.drawer;

import android.view.MenuItem;

import androidx.drawerlayout.widget.DrawerLayout;

public interface DrawerPresenter {
    void navigationItemSelected(MenuItem item, DrawerLayout drawerLayout);
}
