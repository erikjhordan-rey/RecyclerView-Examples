package androidtitlan.gdg.recyclerview_examples.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidtitlan.gdg.recyclerview_examples.R;
import androidtitlan.gdg.recyclerview_examples.drawer.DrawerPresenterImpl;
import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements DrawerPresenterImpl.DrawerView, NavigationView.OnNavigationItemSelectedListener {


    @Bind(R.id.toolbar) Toolbar toolbar;
    @Bind(R.id.drawer_layout) DrawerLayout drawerLayout;
    @Bind(R.id.nav_view) NavigationView navigationView;
    private DrawerPresenterImpl drawerPresenter;


    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setupViews();
        drawerPresenter = new DrawerPresenterImpl(this);
        navigationView.getMenu().performIdentifierAction(R.id.nav_linear_v, 0);
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings)
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/erikcaffrey/RecyclerView-Examples")));

        return super.onOptionsItemSelected(item);
    }


    @Override public void onBackPressed() {
        setBackPressed();
    }


    @Override public boolean onNavigationItemSelected(MenuItem item) {
        drawerPresenter.navigationItemSelected(item, drawerLayout);
        return true;
    }

    @Override public void navigateUsingTo(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container,fragment).commit();
    }

    // setup views
    private void setupViews() {
        setSupportActionBar(toolbar);
        setUpActionBarDrawerToggle();
        navigationView.setNavigationItemSelectedListener(this);
    }

    // create a ActionBarDrawerToggle
    private void setUpActionBarDrawerToggle() {
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();
    }

    // setting for BackPressed
    private void setBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START))
            drawerLayout.closeDrawer(GravityCompat.START);
        else
            super.onBackPressed();
    }


}
