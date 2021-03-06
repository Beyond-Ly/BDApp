package com.beyond.beidou;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.beyond.beidou.data.DataHomeFragment;
import com.beyond.beidou.my.MyFragment;
import com.beyond.beidou.project.ProjectFragment;
import com.beyond.beidou.warning.WarningFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends BaseActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    private Fragment projectFragment;
    private Fragment dataFragment;
    private Fragment warningFragment;
    private Fragment myFragment;
    private Fragment nowFragment = null;
    private Fragment chartFragment = null;
    private BottomNavigationView navigationView;

    @Override
    public void init() {
        navigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public void initData() {
        projectFragment = new ProjectFragment();
    }

    @Override
    public void initView() {
        navigationView = findViewById(R.id.layout_bottomNavigation);
    }

    @Override
    public void initEvent() {
        //首次启动时，应显示工程的Fragment
        switchFragment(nowFragment,projectFragment);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initEvent();
        init();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        changePageFragment(item.getItemId());
        return true;
    }

    /**
     * 当点击导航栏时改变fragment
     *
     * @param id 选择的ItemId
     */
    public void changePageFragment(int id) {
        switch (id) {
            case R.id.nav_my:
                if (myFragment == null) { //减少new fragment,避免不必要的内存消耗
                    myFragment = new MyFragment();
                }
                switchFragment(nowFragment, myFragment);
                break;
            case R.id.nav_project:
                if (projectFragment == null) {
                    projectFragment = new ProjectFragment();
                }
                switchFragment(nowFragment, projectFragment);
                break;
            case R.id.nav_data:
                if (nowFragment == chartFragment)
                    break;
                if (chartFragment != null)
                {
                    switchFragment(nowFragment,chartFragment);
                    break;
                }
                else if (dataFragment == null) {
                    dataFragment = new DataHomeFragment();
                }
                switchFragment(nowFragment, dataFragment);
                break;
            case R.id.nav_warning:
                if (warningFragment == null) {
                    warningFragment = new WarningFragment();
                }
                switchFragment(nowFragment, warningFragment);
                break;
        }
    }
    /**
     * 隐藏显示fragment
     *
     * @param from 需要隐藏的fragment
     * @param to   需要显示的fragment
     */
    public void switchFragment(Fragment from, Fragment to) {
        if (to == null)
            return;
       FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (!to.isAdded()) {
            if (from == null) {
                transaction.add(R.id.layout_home, to).show(to).commit();
            } else {
                // 隐藏当前的fragment，add下一个fragment到Activity中
                transaction.hide(from).add(R.id.layout_home, to).commitAllowingStateLoss();
            }
        } else {
            // 隐藏当前的fragment，显示下一个
            transaction.hide(from).show(to).commit();
        }
        nowFragment = to;
    }



    /**
     * 监听物理返回键，判断当前是否是chartfragment，解决返回重影问题
     */
    @Override
    public void onBackPressed() {
        if (nowFragment == chartFragment)
        {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.remove(chartFragment).show(dataFragment);
            nowFragment = dataFragment;
            chartFragment = null;
        }
        super.onBackPressed();

    }

    public Fragment getChartFragment() {
        return chartFragment;
    }

    public void setChartFragment(Fragment chartFragment) {
        this.chartFragment = chartFragment;
    }

    public Fragment getNowFragment() {
        return nowFragment;
    }

    public void setNowFragment(Fragment nowFragment) {
        this.nowFragment = nowFragment;
    }

    public Fragment getDataFragment() {
        return dataFragment;
    }

    public void setDataFragment(Fragment dataFragment) {
        this.dataFragment = dataFragment;
    }


    public BottomNavigationView getNavigationView() {
        return navigationView;
    }
}