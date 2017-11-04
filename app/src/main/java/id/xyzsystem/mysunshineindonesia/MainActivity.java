package id.xyzsystem.mysunshineindonesia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.weather_day_title)
    TextView weatherDayTitle;

    @BindView(R.id.img_weather)
    ImageView weatherDesc;

    @BindView(R.id.weather_temperature)
    TextView weatherTemperature;

    @BindView(R.id.weather_List)
    RecyclerView weatherList;

    private weatherAdapter weatherAdapter;

    TextView weatherDayTitle;
    ImageView imgWeather;
    TextView weatherDesc;
    TextView weatherTemperature;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        weatherDayTitle = (TextView) findViewById(R.id.weather_day_title);
        imgWeather = (ImageView) findViewById(R.id.img_weather);
        weatherDesc = (TextView) findViewById(R.id.weather_desc);
        weatherTemperature = (TextView) findViewById(R.id.weather_temperature);
        */
        weatherDayTitle.setText("Hari Minggu");
        weatherDesc.setText("Hari Terang Benderang");
        weatherTemperature.setText("30 Derajat Aja");

        //imgWeather.setImageResource(R.drawable.ic_launcher_foreground);

        weatherList.setLayoutManager(
                    new LinearLayoutManager(
                            this, LinearLayoutManager.VERTICAL, false));


        new weatherAdapter = new WeatherAdapter();

        weatherList.setAdapter(weatherAdapter);
    }
}
