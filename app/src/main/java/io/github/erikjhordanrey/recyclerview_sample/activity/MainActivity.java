package io.github.erikjhordanrey.recyclerview_sample.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import com.google.android.material.navigation.NavigationView;
import io.github.erikjhordanrey.recyclerview_sample.R;
import io.github.erikjhordanrey.recyclerview_sample.databinding.ActivityMainBinding;
import io.github.erikjhordanrey.recyclerview_sample.drawer.DrawerPresenterImpl;

public class MainActivity extends AppCompatActivity implements DrawerPresenterImpl.DrawerView, NavigationView.OnNavigationItemSelectedListener {

    private ActivityMainBinding binding;
    private DrawerPresenterImpl drawerPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupViews();
        drawerPresenter = new DrawerPresenterImpl(this);
        binding.navView.getMenu().performIdentifierAction(R.id.nav_linear_v, 0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings)
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://erikjhordan-rey.github.io/blog/2015/10/04/ANDROID-recyclerview.html")));

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        setBackPressed();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerPresenter.navigationItemSelected(item, binding.drawerLayout);
        return true;
    }

    @Override
    public void navigateUsingTo(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment).commit();
    }

    private void setupViews() {
        setSupportActionBar(binding.contentMain.toolbar);
        setUpActionBarDrawerToggle();
        binding.navView.setNavigationItemSelectedListener(this);
    }

    private void setUpActionBarDrawerToggle() {
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                binding.drawerLayout,
                binding.contentMain.toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        binding.drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    private void setBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START))
            binding.drawerLayout.closeDrawer(GravityCompat.START);
        else
            super.onBackPressed();
    }
}
