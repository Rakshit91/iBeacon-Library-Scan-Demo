package com.faberslab.ibeaconscandemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.faberslab.ibeacon.iBeaconClass;

public class BeaconDetailsActivity extends AppCompatActivity {

    private TextView mNameTextView;
    private TextView mRssiTextView;
    private TextView mMacTextView;
    private TextView mUuidTextView;
    private TextView mMajorTextView;
    private TextView mMinorTextView;
    private iBeaconClass.iBeacon device;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beacon_details);

        mNameTextView = (TextView) findViewById(R.id.txt_name_value);
        mRssiTextView = (TextView) findViewById(R.id.txt_rssi_value);
        mMacTextView = (TextView) findViewById(R.id.txt_mac_value);
        mUuidTextView = (TextView) findViewById(R.id.txt_uuid_value);
        mMajorTextView = (TextView) findViewById(R.id.txt_major_value);
        mMinorTextView = (TextView) findViewById(R.id.txt_minor_value);

        device = (iBeaconClass.iBeacon) getIntent().getSerializableExtra("iBeacon");

        mNameTextView.setText(" : " + device.name);
        mRssiTextView.setText(" : " + String.valueOf(device.rssi));
        mMacTextView.setText(" : " + device.bluetoothAddress);
        mUuidTextView.setText(" : " + device.proximityUuid);
        mMajorTextView.setText(" : " + String.valueOf(device.major));
        mMinorTextView.setText(" : " + String.valueOf(device.minor));
    }

}
