package io.github.syndicate017.portofoliobambang.sidemenu;

import java.util.ArrayList;
import java.util.List;

import io.github.syndicate017.portofoliobambang.R;

public class MenuUtil {

    public static final int HOME_FRAGMENT_CODE = 0;
    public static final int CV_FRAGMENT_CODE = 1;
    public static final int PORTOFOLIO_FRAGMENT_CODE = 2;
    public static final int TEAM_FRAGMENT_CODE = 3;

    public static List<MenuItem> getMenuList() {

        List<MenuItem> list = new ArrayList<>();

        //First menu item is selected
        list.add(new MenuItem(R.drawable.ic_baseline_home_24, HOME_FRAGMENT_CODE, true));
        list.add(new MenuItem(R.drawable.ic_baseline_school_24, CV_FRAGMENT_CODE, false));
        list.add(new MenuItem(R.drawable.ic_baseline_group_24, TEAM_FRAGMENT_CODE, false));
        list.add(new MenuItem(R.drawable.ic_baseline_dashboard_24, PORTOFOLIO_FRAGMENT_CODE, false));

        return list;
    }

}
