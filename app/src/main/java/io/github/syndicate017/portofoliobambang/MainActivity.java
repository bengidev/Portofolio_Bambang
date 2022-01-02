package io.github.syndicate017.portofoliobambang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

import io.github.syndicate017.portofoliobambang.cv.CVFragment;
import io.github.syndicate017.portofoliobambang.home.HomeFragment;
import io.github.syndicate017.portofoliobambang.portofolio.PortofolioFragment;
import io.github.syndicate017.portofoliobambang.sidemenu.Callback;
import io.github.syndicate017.portofoliobambang.sidemenu.MenuAdapter;
import io.github.syndicate017.portofoliobambang.sidemenu.MenuItem;
import io.github.syndicate017.portofoliobambang.sidemenu.MenuUtil;
import io.github.syndicate017.portofoliobambang.team.TeamFragment;

public class MainActivity extends AppCompatActivity implements Callback {

    private RecyclerView menuRv;
    private List<MenuItem> menuItems;
    private MenuAdapter adapter;
    private int selectedMenuPos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set up side menu
        setupSideMenu();

        //Set the default fragment when activity launch
        setHomeFragment();
    }

    private void setupSideMenu() {
        menuRv = findViewById(R.id.rv_side_menu);

        //get menu list item will get data from a static data class
        menuItems = MenuUtil.getMenuList();
        adapter = new MenuAdapter(menuItems, this);
        menuRv.setLayoutManager(new LinearLayoutManager(this));
        menuRv.setAdapter(adapter);
    }

    private void setPortofolioFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new PortofolioFragment()).commit();
    }

    private void setTeamFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new TeamFragment()).commit();
    }

    private void setHomeFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();
    }

    private void setCVFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new CVFragment()).commit();
    }

    @Override
    public void onSideMenuItemClick(int i) {

        switch (menuItems.get(i).getCode()) {

            case MenuUtil.HOME_FRAGMENT_CODE:
                setHomeFragment();
                break;
            case MenuUtil.CV_FRAGMENT_CODE:
                setCVFragment();
                break;
            case MenuUtil.TEAM_FRAGMENT_CODE:
                setTeamFragment();
                break;
            case MenuUtil.PORTOFOLIO_FRAGMENT_CODE:
                setPortofolioFragment();
                break;
            default:
                setHomeFragment();
                break;
        }

        //Highlight the selected menu
        menuItems.get(selectedMenuPos).setSelected(false);
        menuItems.get(i).setSelected(true);
        selectedMenuPos = i;
        adapter.notifyDataSetChanged();
    }
}