package com.corp.isdev.calculator;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by USER on 22/05/2015.
 */
public abstract class BaseActivity extends AppCompatActivity {
    public void UpdateProperty(String propertyName,String propertyValue)
    {
        int id = getResources().getIdentifier(propertyName, "id", getPackageName());
        View view = findViewById(id);

        if(view instanceof TextView)
        {
            ((TextView)view).setText(propertyValue);
        }

    }
}
