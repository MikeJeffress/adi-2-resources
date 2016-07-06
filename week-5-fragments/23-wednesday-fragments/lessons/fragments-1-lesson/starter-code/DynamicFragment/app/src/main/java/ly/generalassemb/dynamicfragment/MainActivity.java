package ly.generalassemb.dynamicfragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button dailyWeather, weeklyWeather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupButtons();

        // TODO: setup fragment manager and transaction
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // TODO: create dailyForecast fragment
        DailyFragment fragment_daily = new DailyFragment();

        // TODO: add the daily forecast fragment to the container and commit the change
        fragmentTransaction.add(R.id.daily_button, fragment_daily);
        fragmentTransaction.commit();

    }

    private void setupButtons(){
        dailyWeather = (Button) findViewById(R.id.daily_button);
        weeklyWeather = (Button) findViewById(R.id.weekly_button);

        dailyWeather.setOnClickListener(this);
        weeklyWeather.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.daily_button:
                // todo replace with dailyWeather fragment
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                // TODO: create dailyForecast fragment
                DailyFragment fragment_daily = new DailyFragment();

                // TODO: add the daily forecast fragment to the container and commit the change
                fragmentTransaction.replace(R.id.daily_button, fragment_daily);
                fragmentTransaction.commit();
                break;
            case R.id.weekly_button:
                FragmentManager fragmentManager1 = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();

                WeeklyFragment fragment_weekly  = new WeeklyFragment();

                fragmentTransaction1.replace(R.id.daily_button, fragment_weekly);
                fragmentTransaction1.commit();
                break;
            default:
                break;
        }

    }

}
