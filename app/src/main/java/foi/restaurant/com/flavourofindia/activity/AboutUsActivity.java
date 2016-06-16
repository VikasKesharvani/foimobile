package foi.restaurant.com.flavourofindia.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import foi.restaurant.com.flavourofindia.R;

public class AboutUsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        View buttonAdd = findViewById(R.id.add);
        buttonAdd.setOnClickListener(this);

        View buttonRemove = findViewById(R.id.remove);
        buttonRemove.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.add:
                //Check if the Layout already exists
                LinearLayout hiddenLayout = (LinearLayout) findViewById(R.id.hiddenLayout);

                //Inflate the Hidden Layout Information View
                LinearLayout myLayout = (LinearLayout) findViewById(R.id.linearLayout2);
                View hiddenInfo = getLayoutInflater().inflate(R.layout.hidden, myLayout, false);
                myLayout.addView(hiddenInfo);


                //Get References to the TextView
                TextView myTextView = (TextView) findViewById(R.id.textView1);
                // Update the TextView Text
                myTextView.setText("This is not the original Text defined in the XML layout !");
                break;

            case R.id.remove:
                View myView = findViewById(R.id.hiddenLayout);
                ViewGroup parent = (ViewGroup) myView.getParent();
                parent.removeView(myView);


                break;
            // More buttons go here (if any) ...

        }
    }

}
