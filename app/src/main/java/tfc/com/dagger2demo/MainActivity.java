package tfc.com.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import javax.inject.Inject;

import tfc.com.dagger2demo.dagger.DaggerMainActivityComponent;
import tfc.com.dagger2demo.vo.Performer;

public class MainActivity extends AppCompatActivity {
    @Inject
    Performer performer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.builder().build().inject(this);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, performer.show(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
