package io.github.erikjhordanrey.recyclerview_sample.drawer;

import android.view.MenuItem;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import io.github.erikjhordanrey.recyclerview_sample.R;
import io.github.erikjhordanrey.recyclerview_sample.fragment.GridHorizontalFragment;
import io.github.erikjhordanrey.recyclerview_sample.fragment.GridQualifiersVerticalFragment;
import io.github.erikjhordanrey.recyclerview_sample.fragment.GridSpanSizeVerticalFragment;
import io.github.erikjhordanrey.recyclerview_sample.fragment.GridVerticalFragment;
import io.github.erikjhordanrey.recyclerview_sample.fragment.ItemTypesVerticalFragment;
import io.github.erikjhordanrey.recyclerview_sample.fragment.LinearHorizontalFragment;
import io.github.erikjhordanrey.recyclerview_sample.fragment.LinearVerticalFragment;
import io.github.erikjhordanrey.recyclerview_sample.fragment.ResponsiveLinearVerticalFragment;
import io.github.erikjhordanrey.recyclerview_sample.fragment.StaggeredHorizontalFragment;
import io.github.erikjhordanrey.recyclerview_sample.fragment.StaggeredVerticalFragment;

public class DrawerInteractorImpl implements DrawerInteractor {

    @Override
    public void navigateTo(MenuItem item, DrawerLayout drawerLayout, DrawerListener listener) {

        switch (item.getItemId()) {
            case R.id.nav_linear_v:
                listener.replaceFragment(LinearVerticalFragment.newInstance());
                break;
            case R.id.nav_linear_h:
                listener.replaceFragment(LinearHorizontalFragment.newInstance());
                break;
            case R.id.nav_grid_v:
                listener.replaceFragment(GridVerticalFragment.newInstance());
                break;
            case R.id.nav_grid_h:
                listener.replaceFragment(GridHorizontalFragment.newInstance());
                break;
            case R.id.nav_grid_span:
                listener.replaceFragment(GridSpanSizeVerticalFragment.newInstance());
                break;
            case R.id.nav_staggered_v:
                listener.replaceFragment(StaggeredVerticalFragment.newInstance());
                break;
            case R.id.nav_staggered_h:
                listener.replaceFragment(StaggeredHorizontalFragment.newInstance());
                break;

            case R.id.nav_item_types:
                listener.replaceFragment(ItemTypesVerticalFragment.newInstance());
                break;
            case R.id.nav_item_responsive:
                listener.replaceFragment(ResponsiveLinearVerticalFragment.newInstance());
                break;
            case R.id.nav_item_qualifiers:
                listener.replaceFragment(GridQualifiersVerticalFragment.newInstance());
                break;

        }
        drawerLayout.closeDrawer(GravityCompat.START);
    }
}
