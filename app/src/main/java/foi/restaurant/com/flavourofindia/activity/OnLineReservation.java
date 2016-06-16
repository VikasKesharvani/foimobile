package foi.restaurant.com.flavourofindia.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import foi.restaurant.com.flavourofindia.R;

public class OnLineReservation extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_reservation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //toolbar.setTitle("OnLine Reservation");

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        FindViewByIsSetListner();



    }

    private void FindViewByIsSetListner() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
//            case R.id.button_table_booking_form:
//
//                break;
        }
    }
}
