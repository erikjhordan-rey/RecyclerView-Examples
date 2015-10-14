package androidtitlan.gdg.recyclerview_examples.drawer;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

import androidtitlan.gdg.recyclerview_examples.fragment.LinearFragment;
import androidtitlan.gdg.recyclerview_examples.R;

/**
 * Created by Jhordan on 13/10/15.
 */
public class DrawerInteractorImpl implements DrawerInteractor {

    @Override
    public void navigateTo(MenuItem item, DrawerLayout drawerLayout, DrawerListener listener) {

        switch (item.getItemId()) {
            case R.id.nav_linear:
                listener.fragmentReplace(LinearFragment.newInstance());
                break;
            case R.id.nav_grid:
                listener.fragmentReplace(LinearFragment.newInstance());
                break;
            case R.id.nav_staggered:
                listener.fragmentReplace(LinearFragment.newInstance());
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
    }
}
