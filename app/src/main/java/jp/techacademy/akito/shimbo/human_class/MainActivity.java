package jp.techacademy.akito.shimbo.human_class;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Human tom = new Human("トム",19,"トレーニング");

        tom.say();
        tom.think();
    }
}
