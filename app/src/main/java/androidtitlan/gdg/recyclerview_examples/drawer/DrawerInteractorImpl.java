package androidtitlan.gdg.recyclerview_examples.drawer;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

import androidtitlan.gdg.recyclerview_examples.fragment.GridHorizontalFragment;
import androidtitlan.gdg.recyclerview_examples.fragment.GridQualifiersVerticalFragment;
import androidtitlan.gdg.recyclerview_examples.fragment.GridSpanSizeVerticalFragment;
import androidtitlan.gdg.recyclerview_examples.fragment.GridVerticalFragment;
import androidtitlan.gdg.recyclerview_examples.fragment.ItemTypesVerticalFragment;
import androidtitlan.gdg.recyclerview_examples.fragment.LinearHorizontalFragment;
import androidtitlan.gdg.recyclerview_examples.fragment.LinearVerticalFragment;
import androidtitlan.gdg.recyclerview_examples.R;
import androidtitlan.gdg.recyclerview_examples.fragment.ResponsiveLinearVerticalFragment;
import androidtitlan.gdg.recyclerview_examples.fragment.StaggeredHorizontalFragment;
import androidtitlan.gdg.recyclerview_examples.fragment.StaggeredVerticalFragment;

/**
 * Created by Jhordan on 13/10/15.
 */
public class DrawerInteractorImpl implements DrawerInteractor {

    @Override
    public void navigateTo(MenuItem item, DrawerLayout drawerLayout, DrawerListener listener) {

        switch (item.getItemId()) {
            case R.id.nav_linear_v:
                listener.fragmentReplace(LinearVerticalFragment.newInstance());
                break;
            case R.id.nav_linear_h:
                listener.fragmentReplace(LinearHorizontalFragment.newInstance());
                break;
            case R.id.nav_grid_v:
                listener.fragmentReplace(GridVerticalFragment.newInstance());
                break;
            case R.id.nav_grid_h:
                listener.fragmentReplace(GridHorizontalFragment.newInstance());
                break;
            case R.id.nav_grid_span:
                listener.fragmentReplace(GridSpanSizeVerticalFragment.newInstance());
                break;
            case R.id.nav_staggered_v:
                listener.fragmentReplace(StaggeredVerticalFragment.newInstance());
                break;
            case R.id.nav_staggered_h:
                listener.fragmentReplace(StaggeredHorizontalFragment.newInstance());
                break;

            case R.id.nav_item_types:
                listener.fragmentReplace(ItemTypesVerticalFragment.newInstance());
                break;
            case R.id.nav_item_responsive:
                listener.fragmentReplace(ResponsiveLinearVerticalFragment.newInstance());
                break;
            case R.id.nav_item_qualifiers:
                listener.fragmentReplace(GridQualifiersVerticalFragment.newInstance());
                break;

        }
        drawerLayout.closeDrawer(GravityCompat.START);
    }
}
