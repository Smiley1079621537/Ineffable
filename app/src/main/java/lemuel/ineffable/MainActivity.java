package lemuel.ineffable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    TestHttp.testHttpPostOnSubThread();
                    TestHttp.testHttpGetonSubThread();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
