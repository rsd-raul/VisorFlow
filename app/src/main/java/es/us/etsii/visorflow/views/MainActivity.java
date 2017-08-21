package es.us.etsii.visorflow.views;

import android.os.Bundle;
import es.us.etsii.visorflow.App;
import es.us.etsii.visorflow.R;

public class MainActivity extends BaseActivity {

    // ------------------------- CONSTRUCTOR -------------------------

    @Override
    protected void inject(App.AppComponent component) {
        component.inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
