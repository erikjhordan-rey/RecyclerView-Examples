package androidtitlan.gdg.recyclerview_examples.drawer;

import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

/**
 * Created by Jhordan on 13/10/15.
 */
public interface DrawerPresenter {
    void navigationItemSelected(MenuItem item, DrawerLayout drawerLayout);
}
