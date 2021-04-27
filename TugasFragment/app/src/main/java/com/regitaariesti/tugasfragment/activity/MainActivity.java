package com.regitaariesti.tugasfragment.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.regitaariesti.tugasfragment.R;
import com.regitaariesti.tugasfragment.fragment.About;
import com.regitaariesti.tugasfragment.fragment.Explore;
import com.regitaariesti.tugasfragment.fragment.Home;
import com.regitaariesti.tugasfragment.fragment.Search;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    Button btn_home, btn_explore, btn_search, btn_about;

    Home fragmentHome;
    Explore fragmentExplore;
    Search fragmentSearch;
    About fragmentAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_home = findViewById(R.id.btn_home);
        btn_explore = findViewById(R.id.btn_explore);
        btn_search = findViewById(R.id.btn_search);
        btn_about = findViewById(R.id.btn_about);

        btn_home.setOnClickListener(this);
        btn_explore.setOnClickListener(this);
        btn_search.setOnClickListener(this);
        btn_about.setOnClickListener(this);
    }

    void menuHome(){
        fragmentHome = new Home();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentHome);
        ft.commit();
    }

    void menuExplore(){
        fragmentExplore = new Explore();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentExplore);
        ft.commit();
    }

    void menuSearch(){
        fragmentSearch = new Search();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentSearch);
        ft.commit();
    }

    void menuAbout(){
        fragmentAbout = new About();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentAbout);
        ft.commit();
    }

    @Override
    public void onClick(View v) {
        if (v == btn_home){
            menuHome();
        }
        if (v == btn_explore){
            menuExplore();
        }
        if (v == btn_search){
            menuSearch();
        }
        if (v == btn_about){
            menuAbout();
        }
    }
}