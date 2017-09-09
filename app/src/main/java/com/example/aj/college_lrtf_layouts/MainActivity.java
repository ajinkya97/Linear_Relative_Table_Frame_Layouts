package com.example.aj.college_lrtf_layouts;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.linerlayoutH:
                    Linear_Layout_Horizontal llh=new Linear_Layout_Horizontal();
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, llh).commit();
                    return true;
                case R.id.lineralayoutV:
                    Linear_Layout_Vertical llv=new Linear_Layout_Vertical();
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, llv).commit();
                    return true;
                case R.id.tablelayout:
                    Table_Layout tl=new Table_Layout();
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, tl).commit();
                    return true;
                case R.id.relativelayout:
                    Relative_Layout rv=new Relative_Layout();
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, rv).commit();
                    return true;
                case R.id.framelayout:
                    Frame_layout fl=new Frame_layout();
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, fl).commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
