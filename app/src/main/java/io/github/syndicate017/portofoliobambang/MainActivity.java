package io.github.syndicate017.portofoliobambang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.github.syndicate017.portofoliobambang.cv.CVFragment;
import io.github.syndicate017.portofoliobambang.home.HomeFragment;
import io.github.syndicate017.portofoliobambang.portofolio.PortofolioFragment;
import io.github.syndicate017.portofoliobambang.team.TeamFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setPortofolioFragment();
//        setTeamFragment();
//        setCVFragment();
//        setHomeFragment();
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

}