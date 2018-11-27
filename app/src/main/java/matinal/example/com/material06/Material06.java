package matinal.example.com.material06;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Material06 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material06);

        final TabLayout tabLayout = findViewById(R.id.tabLayout);


        TabLayout.Tab primerTab = tabLayout.newTab();
        TabLayout.Tab segundoTab = tabLayout.newTab();
        TabLayout.Tab tercerTab = tabLayout.newTab();

        primerTab.setText("TAB 01");
        primerTab.setIcon(R.mipmap.ic_launcher);
        tabLayout.addTab(primerTab);

        segundoTab.setText("TAB 02");
        segundoTab.setIcon(R.drawable.icono1);
        tabLayout.addTab(segundoTab);

        tercerTab.setText("TAB 03");
        tercerTab.setIcon(R.drawable.icono2);
        tabLayout.addTab(tercerTab, 1);
        tabLayout.addTab(tercerTab, true);
        tabLayout.addTab(tercerTab, 1, true);

        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setTabTextColors(Color.RED, Color.WHITE);
        tabLayout.setTabTextColors(Color.argb(255,50,50,50),Color.argb(255,0,200,200));
        tabLayout.setTabTextColors(Color.rgb(50,50,50), Color.rgb(0,200,200));
        tabLayout.setSelectedTabIndicatorColor(Color.GREEN);
        tabLayout.setSelectedTabIndicatorHeight(12);
    }
}
