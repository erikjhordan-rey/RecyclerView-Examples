package androidtitlan.gdg.recyclerview_examples.drawer;

import android.view.MenuItem;

import androidx.drawerlayout.widget.DrawerLayout;

public interface DrawerInteractor {
    void navigateTo(MenuItem item, DrawerLayout drawerLayout, DrawerListener listener);
}
