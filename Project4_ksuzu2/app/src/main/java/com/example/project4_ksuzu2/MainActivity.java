package com.example.project4_ksuzu2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnFocusChangeListener,
        View.OnClickListener{

    int MAXSTRING=12;
    TabHost host;

    EditText rosterNum1, rosterNum2, rosterNum3, rosterNum4, rosterNum5,rosterNum6, rosterNum7,
            rosterNum8, rosterNum9, rosterNum10, rosterNum11, rosterNum12, rosterNum13;

    EditText rosterName1, rosterName2, rosterName3, rosterName4, rosterName5, rosterName6,
            rosterName7, rosterName8, rosterName9, rosterName10, rosterName11, rosterName12,
            rosterName13;

    TextView shotsName1, shotsName2, shotsName3, shotsName4, shotsName5, shotsName6, shotsName7,
            shotsName8, shotsName9, shotsName10, shotsName11, shotsName12, shotsName13;

    TextView shotsMade1, shotsMade2, shotsMade3, shotsMade4, shotsMade5, shotsMade6, shotsMade7,
            shotsMade8, shotsMade9, shotsMade10, shotsMade11, shotsMade12, shotsMade13;

    TextView shotsMissed1, shotsMissed2, shotsMissed3, shotsMissed4, shotsMissed5, shotsMissed6, shotsMissed7,
            shotsMissed8, shotsMissed9, shotsMissed10, shotsMissed11, shotsMissed12, shotsMissed13;

    TextView statsName1, statsName2, statsName3, statsName4, statsName5, statsName6, statsName7,
            statsName8, statsName9, statsName10, statsName11, statsName12, statsName13;

    TextView statsStat1, statsStat2, statsStat3, statsStat4, statsStat5, statsStat6, statsStat7,
            statsStat8, statsStat9, statsStat10, statsStat11, statsStat12, statsStat13;

    Button shotsMadeUp1,shotsMadeUp2, shotsMadeUp3, shotsMadeUp4, shotsMadeUp5, shotsMadeUp6,
            shotsMadeUp7, shotsMadeUp8, shotsMadeUp9, shotsMadeUp10, shotsMadeUp11, shotsMadeUp12,
            shotsMadeUp13;

    Button shotsMadeDown1,shotsMadeDown2, shotsMadeDown3, shotsMadeDown4, shotsMadeDown5,
            shotsMadeDown6, shotsMadeDown7, shotsMadeDown8, shotsMadeDown9, shotsMadeDown10,
            shotsMadeDown11, shotsMadeDown12, shotsMadeDown13;

    Button shotsMissedUp1,shotsMissedUp2, shotsMissedUp3, shotsMissedUp4, shotsMissedUp5,
            shotsMissedUp6, shotsMissedUp7, shotsMissedUp8, shotsMissedUp9, shotsMissedUp10,
            shotsMissedUp11, shotsMissedUp12, shotsMissedUp13;

    Button shotsMissedDown1,shotsMissedDown2, shotsMissedDown3, shotsMissedDown4, shotsMissedDown5,
            shotsMissedDown6, shotsMissedDown7, shotsMissedDown8, shotsMissedDown9,
            shotsMissedDown10, shotsMissedDown11, shotsMissedDown12, shotsMissedDown13;


    int[] shotsMade = new int[14];
    int[] shotsMissed = new int[14];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rosterNum1 = (EditText) findViewById(R.id.rosterRow1EditNum);
        rosterNum1.setOnFocusChangeListener(this);
        rosterNum2 = (EditText) findViewById(R.id.rosterRow2EditNum);
        rosterNum2.setOnFocusChangeListener(this);
        rosterNum3 = (EditText) findViewById(R.id.rosterRow3EditNum);
        rosterNum3.setOnFocusChangeListener(this);
        rosterNum4 = (EditText) findViewById(R.id.rosterRow4EditNum);
        rosterNum4.setOnFocusChangeListener(this);
        rosterNum5 = (EditText) findViewById(R.id.rosterRow5EditNum);
        rosterNum5.setOnFocusChangeListener(this);
        rosterNum6 = (EditText) findViewById(R.id.rosterRow6EditNum);
        rosterNum6.setOnFocusChangeListener(this);
        rosterNum7 = (EditText) findViewById(R.id.rosterRow7EditNum);
        rosterNum7.setOnFocusChangeListener(this);
        rosterNum8 = (EditText) findViewById(R.id.rosterRow8EditNum);
        rosterNum8.setOnFocusChangeListener(this);
        rosterNum9 = (EditText) findViewById(R.id.rosterRow9EditNum);
        rosterNum9.setOnFocusChangeListener(this);
        rosterNum10 = (EditText) findViewById(R.id.rosterRow10EditNum);
        rosterNum10.setOnFocusChangeListener(this);
        rosterNum11 = (EditText) findViewById(R.id.rosterRow11EditNum);
        rosterNum11.setOnFocusChangeListener(this);
        rosterNum12 = (EditText) findViewById(R.id.rosterRow12EditNum);
        rosterNum12.setOnFocusChangeListener(this);
        rosterNum13 = (EditText) findViewById(R.id.rosterRow13EditNum);
        rosterNum13.setOnFocusChangeListener(this);

        rosterName1 = (EditText) findViewById(R.id.rosterRow1EditName);
        rosterName1.setOnFocusChangeListener(this);
        rosterName2 = (EditText) findViewById(R.id.rosterRow2EditName);
        rosterName2.setOnFocusChangeListener(this);
        rosterName3 = (EditText) findViewById(R.id.rosterRow3EditName);
        rosterName3.setOnFocusChangeListener(this);
        rosterName4 = (EditText) findViewById(R.id.rosterRow4EditName);
        rosterName4.setOnFocusChangeListener(this);
        rosterName5 = (EditText) findViewById(R.id.rosterRow5EditName);
        rosterName5.setOnFocusChangeListener(this);
        rosterName6 = (EditText) findViewById(R.id.rosterRow6EditName);
        rosterName6.setOnFocusChangeListener(this);
        rosterName7 = (EditText) findViewById(R.id.rosterRow7EditName);
        rosterName7.setOnFocusChangeListener(this);
        rosterName8 = (EditText) findViewById(R.id.rosterRow8EditName);
        rosterName8.setOnFocusChangeListener(this);
        rosterName9 = (EditText) findViewById(R.id.rosterRow9EditName);
        rosterName9.setOnFocusChangeListener(this);
        rosterName10 = (EditText) findViewById(R.id.rosterRow10EditName);
        rosterName10.setOnFocusChangeListener(this);
        rosterName11 = (EditText) findViewById(R.id.rosterRow11EditName);
        rosterName11.setOnFocusChangeListener(this);
        rosterName12 = (EditText) findViewById(R.id.rosterRow12EditName);
        rosterName12.setOnFocusChangeListener(this);
        rosterName13 = (EditText) findViewById(R.id.rosterRow13EditName);
        rosterName13.setOnFocusChangeListener(this);

        shotsName1 = (TextView) findViewById(R.id.shotsRow1Name);
        shotsName2 = (TextView) findViewById(R.id.shotsRow2Name);
        shotsName3 = (TextView) findViewById(R.id.shotsRow3Name);
        shotsName4 = (TextView) findViewById(R.id.shotsRow4Name);
        shotsName5 = (TextView) findViewById(R.id.shotsRow5Name);
        shotsName6 = (TextView) findViewById(R.id.shotsRow6Name);
        shotsName7 = (TextView) findViewById(R.id.shotsRow7Name);
        shotsName8 = (TextView) findViewById(R.id.shotsRow8Name);
        shotsName9 = (TextView) findViewById(R.id.shotsRow9Name);
        shotsName10 = (TextView) findViewById(R.id.shotsRow10Name);
        shotsName11 = (TextView) findViewById(R.id.shotsRow11Name);
        shotsName12 = (TextView) findViewById(R.id.shotsRow12Name);
        shotsName13 = (TextView) findViewById(R.id.shotsRow13Name);

        shotsMade1 = (TextView) findViewById(R.id.shotsRow1Made);
        shotsMade2 = (TextView) findViewById(R.id.shotsRow2Made);
        shotsMade3 = (TextView) findViewById(R.id.shotsRow3Made);
        shotsMade4 = (TextView) findViewById(R.id.shotsRow4Made);
        shotsMade5 = (TextView) findViewById(R.id.shotsRow5Made);
        shotsMade6 = (TextView) findViewById(R.id.shotsRow6Made);
        shotsMade7 = (TextView) findViewById(R.id.shotsRow7Made);
        shotsMade8 = (TextView) findViewById(R.id.shotsRow8Made);
        shotsMade9 = (TextView) findViewById(R.id.shotsRow9Made);
        shotsMade10 = (TextView) findViewById(R.id.shotsRow10Made);
        shotsMade11 = (TextView) findViewById(R.id.shotsRow11Made);
        shotsMade12 = (TextView) findViewById(R.id.shotsRow12Made);
        shotsMade13 = (TextView) findViewById(R.id.shotsRow13Made);

        shotsMissed1 = (TextView) findViewById(R.id.shotsRow1Missed);
        shotsMissed2 = (TextView) findViewById(R.id.shotsRow2Missed);
        shotsMissed3 = (TextView) findViewById(R.id.shotsRow3Missed);
        shotsMissed4 = (TextView) findViewById(R.id.shotsRow4Missed);
        shotsMissed5 = (TextView) findViewById(R.id.shotsRow5Missed);
        shotsMissed6 = (TextView) findViewById(R.id.shotsRow6Missed);
        shotsMissed7 = (TextView) findViewById(R.id.shotsRow7Missed);
        shotsMissed8 = (TextView) findViewById(R.id.shotsRow8Missed);
        shotsMissed9 = (TextView) findViewById(R.id.shotsRow9Missed);
        shotsMissed10 = (TextView) findViewById(R.id.shotsRow10Missed);
        shotsMissed11 = (TextView) findViewById(R.id.shotsRow11Missed);
        shotsMissed12 = (TextView) findViewById(R.id.shotsRow12Missed);
        shotsMissed13 = (TextView) findViewById(R.id.shotsRow13Missed);

        statsName1 = (TextView) findViewById(R.id.statsRow1Name);
        statsName2 = (TextView) findViewById(R.id.statsRow2Name);
        statsName3 = (TextView) findViewById(R.id.statsRow3Name);
        statsName4 = (TextView) findViewById(R.id.statsRow4Name);
        statsName5 = (TextView) findViewById(R.id.statsRow5Name);
        statsName6 = (TextView) findViewById(R.id.statsRow6Name);
        statsName7 = (TextView) findViewById(R.id.statsRow7Name);
        statsName8 = (TextView) findViewById(R.id.statsRow8Name);
        statsName9 = (TextView) findViewById(R.id.statsRow9Name);
        statsName10 = (TextView) findViewById(R.id.statsRow10Name);
        statsName11 = (TextView) findViewById(R.id.statsRow11Name);
        statsName12 = (TextView) findViewById(R.id.statsRow12Name);
        statsName13 = (TextView) findViewById(R.id.statsRow13Name);

        statsStat1 = (TextView) findViewById(R.id.statsRow1Stat);
        statsStat2 = (TextView) findViewById(R.id.statsRow2Stat);
        statsStat3 = (TextView) findViewById(R.id.statsRow3Stat);
        statsStat4 = (TextView) findViewById(R.id.statsRow4Stat);
        statsStat5 = (TextView) findViewById(R.id.statsRow5Stat);
        statsStat6 = (TextView) findViewById(R.id.statsRow6Stat);
        statsStat7 = (TextView) findViewById(R.id.statsRow7Stat);
        statsStat8 = (TextView) findViewById(R.id.statsRow8Stat);
        statsStat9 = (TextView) findViewById(R.id.statsRow9Stat);
        statsStat10 = (TextView) findViewById(R.id.statsRow10Stat);
        statsStat11 = (TextView) findViewById(R.id.statsRow11Stat);
        statsStat12 = (TextView) findViewById(R.id.statsRow12Stat);
        statsStat13 = (TextView) findViewById(R.id.statsRow13Stat);

        shotsMadeUp1 = (Button) findViewById(R.id.shotsRow1UpMade);
        shotsMadeUp1.setOnClickListener(this);
        shotsMadeUp2 = (Button) findViewById(R.id.shotsRow2UpMade);
        shotsMadeUp2.setOnClickListener(this);
        shotsMadeUp3 = (Button) findViewById(R.id.shotsRow3UpMade);
        shotsMadeUp3.setOnClickListener(this);
        shotsMadeUp4 = (Button) findViewById(R.id.shotsRow4UpMade);
        shotsMadeUp4.setOnClickListener(this);
        shotsMadeUp5 = (Button) findViewById(R.id.shotsRow5UpMade);
        shotsMadeUp5.setOnClickListener(this);
        shotsMadeUp6 = (Button) findViewById(R.id.shotsRow6UpMade);
        shotsMadeUp6.setOnClickListener(this);
        shotsMadeUp7 = (Button) findViewById(R.id.shotsRow7UpMade);
        shotsMadeUp7.setOnClickListener(this);
        shotsMadeUp8 = (Button) findViewById(R.id.shotsRow8UpMade);
        shotsMadeUp8.setOnClickListener(this);
        shotsMadeUp9 = (Button) findViewById(R.id.shotsRow9UpMade);
        shotsMadeUp9.setOnClickListener(this);
        shotsMadeUp10 = (Button) findViewById(R.id.shotsRow10UpMade);
        shotsMadeUp10.setOnClickListener(this);
        shotsMadeUp11 = (Button) findViewById(R.id.shotsRow11UpMade);
        shotsMadeUp11.setOnClickListener(this);
        shotsMadeUp12 = (Button) findViewById(R.id.shotsRow12UpMade);
        shotsMadeUp12.setOnClickListener(this);
        shotsMadeUp13 = (Button) findViewById(R.id.shotsRow13UpMade);
        shotsMadeUp13.setOnClickListener(this);

        shotsMadeDown1 = (Button) findViewById(R.id.shotsRow1DownMade);
        shotsMadeDown1.setOnClickListener(this);
        shotsMadeDown2 = (Button) findViewById(R.id.shotsRow2DownMade);
        shotsMadeDown2.setOnClickListener(this);
        shotsMadeDown3 = (Button) findViewById(R.id.shotsRow3DownMade);
        shotsMadeDown3.setOnClickListener(this);
        shotsMadeDown4 = (Button) findViewById(R.id.shotsRow4DownMade);
        shotsMadeDown4.setOnClickListener(this);
        shotsMadeDown5 = (Button) findViewById(R.id.shotsRow5DownMade);
        shotsMadeDown5.setOnClickListener(this);
        shotsMadeDown6 = (Button) findViewById(R.id.shotsRow6DownMade);
        shotsMadeDown6.setOnClickListener(this);
        shotsMadeDown7 = (Button) findViewById(R.id.shotsRow7DownMade);
        shotsMadeDown7.setOnClickListener(this);
        shotsMadeDown8 = (Button) findViewById(R.id.shotsRow8DownMade);
        shotsMadeDown8.setOnClickListener(this);
        shotsMadeDown9 = (Button) findViewById(R.id.shotsRow9DownMade);
        shotsMadeDown9.setOnClickListener(this);
        shotsMadeDown10 = (Button) findViewById(R.id.shotsRow10DownMade);
        shotsMadeDown10.setOnClickListener(this);
        shotsMadeDown11 = (Button) findViewById(R.id.shotsRow11DownMade);
        shotsMadeDown11.setOnClickListener(this);
        shotsMadeDown12 = (Button) findViewById(R.id.shotsRow12DownMade);
        shotsMadeDown12.setOnClickListener(this);
        shotsMadeDown13 = (Button) findViewById(R.id.shotsRow13DownMade);
        shotsMadeDown13.setOnClickListener(this);

        shotsMissedUp1 = (Button) findViewById(R.id.shotsRow1UpMissed);
        shotsMissedUp1.setOnClickListener(this);
        shotsMissedUp2 = (Button) findViewById(R.id.shotsRow2UpMissed);
        shotsMissedUp2.setOnClickListener(this);
        shotsMissedUp3 = (Button) findViewById(R.id.shotsRow3UpMissed);
        shotsMissedUp3.setOnClickListener(this);
        shotsMissedUp4 = (Button) findViewById(R.id.shotsRow4UpMissed);
        shotsMissedUp4.setOnClickListener(this);
        shotsMissedUp5 = (Button) findViewById(R.id.shotsRow5UpMissed);
        shotsMissedUp5.setOnClickListener(this);
        shotsMissedUp6 = (Button) findViewById(R.id.shotsRow6UpMissed);
        shotsMissedUp6.setOnClickListener(this);
        shotsMissedUp7 = (Button) findViewById(R.id.shotsRow7UpMissed);
        shotsMissedUp7.setOnClickListener(this);
        shotsMissedUp8 = (Button) findViewById(R.id.shotsRow8UpMissed);
        shotsMissedUp8.setOnClickListener(this);
        shotsMissedUp9 = (Button) findViewById(R.id.shotsRow9UpMissed);
        shotsMissedUp9.setOnClickListener(this);
        shotsMissedUp10 = (Button) findViewById(R.id.shotsRow10UpMissed);
        shotsMissedUp10.setOnClickListener(this);
        shotsMissedUp11 = (Button) findViewById(R.id.shotsRow11UpMissed);
        shotsMissedUp11.setOnClickListener(this);
        shotsMissedUp12 = (Button) findViewById(R.id.shotsRow12UpMissed);
        shotsMissedUp12.setOnClickListener(this);
        shotsMissedUp13 = (Button) findViewById(R.id.shotsRow13UpMissed);
        shotsMissedUp13.setOnClickListener(this);

        shotsMissedDown1 = (Button) findViewById(R.id.shotsRow1DownMissed);
        shotsMissedDown1.setOnClickListener(this);
        shotsMissedDown2 = (Button) findViewById(R.id.shotsRow2DownMissed);
        shotsMissedDown2.setOnClickListener(this);
        shotsMissedDown3 = (Button) findViewById(R.id.shotsRow3DownMissed);
        shotsMissedDown3.setOnClickListener(this);
        shotsMissedDown4 = (Button) findViewById(R.id.shotsRow4DownMissed);
        shotsMissedDown4.setOnClickListener(this);
        shotsMissedDown5 = (Button) findViewById(R.id.shotsRow5DownMissed);
        shotsMissedDown5.setOnClickListener(this);
        shotsMissedDown6 = (Button) findViewById(R.id.shotsRow6DownMissed);
        shotsMissedDown6.setOnClickListener(this);
        shotsMissedDown7 = (Button) findViewById(R.id.shotsRow7DownMissed);
        shotsMissedDown7.setOnClickListener(this);
        shotsMissedDown8 = (Button) findViewById(R.id.shotsRow8DownMissed);
        shotsMissedDown8.setOnClickListener(this);
        shotsMissedDown9 = (Button) findViewById(R.id.shotsRow9DownMissed);
        shotsMissedDown9.setOnClickListener(this);
        shotsMissedDown10 = (Button) findViewById(R.id.shotsRow10DownMissed);
        shotsMissedDown10.setOnClickListener(this);
        shotsMissedDown11 = (Button) findViewById(R.id.shotsRow11DownMissed);
        shotsMissedDown11.setOnClickListener(this);
        shotsMissedDown12 = (Button) findViewById(R.id.shotsRow12DownMissed);
        shotsMissedDown12.setOnClickListener(this);
        shotsMissedDown13 = (Button) findViewById(R.id.shotsRow13DownMissed);
        shotsMissedDown13.setOnClickListener(this);

        host = (TabHost) findViewById(R.id.tabhost);
        host.setup();

        //TabHost.TabSpec spec;

        //roster tab
        TabHost.TabSpec  spec = host.newTabSpec("Tab One");
        spec.setContent(R.id.tabRoster);
        spec.setIndicator("Add Roster");
        host.addTab(spec);

        //shots tab
        spec = host.newTabSpec("Tab Two");
        spec.setContent(R.id.tabShots);
        spec.setIndicator("Add Shots");
        host.addTab(spec);

        //stats tab
        spec = host.newTabSpec("Tab Three");
        spec.setContent(R.id.tabStats);
        spec.setIndicator("View Stats");
        host.addTab(spec);
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        String newLabel;

        switch (v.getId()) {

            case R.id.rosterRow1EditNum:
            case R.id.rosterRow1EditName:

                newLabel = "#" + rosterNum1.getText() + " " + rosterName1.getText();
                if (newLabel.length() > MAXSTRING) {
                    newLabel = newLabel.substring(0,MAXSTRING-1) + "…";
                }
                shotsName1.setText(newLabel);
                statsName1.setText(newLabel);

                break;

            case R.id.rosterRow2EditNum:
            case R.id.rosterRow2EditName:

                newLabel = "#" + rosterNum2.getText() + " " + rosterName2.getText();
                if (newLabel.length() > MAXSTRING) {
                    newLabel = newLabel.substring(0,MAXSTRING-1) + "…";
                }
                shotsName2.setText(newLabel);
                statsName2.setText(newLabel);
                break;

            case R.id.rosterRow3EditNum:
            case R.id.rosterRow3EditName:

                newLabel = "#" + rosterNum3.getText() + " " + rosterName3.getText();
                if (newLabel.length() > MAXSTRING) {
                    newLabel = newLabel.substring(0,MAXSTRING-1) + "…";
                }
                shotsName3.setText(newLabel);
                statsName3.setText(newLabel);
                break;

            case R.id.rosterRow4EditNum:
            case R.id.rosterRow4EditName:

                newLabel = "#" + rosterNum4.getText() + " " + rosterName4.getText();
                if (newLabel.length() > MAXSTRING) {
                    newLabel = newLabel.substring(0,MAXSTRING-1) + "…";
                }
                shotsName4.setText(newLabel);
                statsName4.setText(newLabel);
                break;

            case R.id.rosterRow5EditNum:
            case R.id.rosterRow5EditName:

                newLabel = "#" + rosterNum5.getText() + " " + rosterName5.getText();
                if (newLabel.length() > MAXSTRING) {
                    newLabel = newLabel.substring(0,MAXSTRING-1) + "…";
                }
                shotsName5.setText(newLabel);
                statsName5.setText(newLabel);
                break;

            case R.id.rosterRow6EditNum:
            case R.id.rosterRow6EditName:

                newLabel = "#" + rosterNum6.getText() + " " + rosterName6.getText();
                if (newLabel.length() > MAXSTRING) {
                    newLabel = newLabel.substring(0,MAXSTRING-1) + "…";
                }
                shotsName6.setText(newLabel);
                statsName6.setText(newLabel);
                break;

            case R.id.rosterRow7EditNum:
            case R.id.rosterRow7EditName:

                newLabel = "#" + rosterNum7.getText() + " " + rosterName7.getText();
                if (newLabel.length() > MAXSTRING) {
                    newLabel = newLabel.substring(0,MAXSTRING-1) + "…";
                }
                shotsName7.setText(newLabel);
                statsName7.setText(newLabel);
                break;

            case R.id.rosterRow8EditNum:
            case R.id.rosterRow8EditName:

                newLabel = "#" + rosterNum8.getText() + " " + rosterName8.getText();
                if (newLabel.length() > MAXSTRING) {
                    newLabel = newLabel.substring(0,MAXSTRING-1) + "…";
                }
                shotsName8.setText(newLabel);
                statsName8.setText(newLabel);
                break;

            case R.id.rosterRow9EditNum:
            case R.id.rosterRow9EditName:

                newLabel = "#" + rosterNum9.getText() + " " + rosterName9.getText();
                if (newLabel.length() > MAXSTRING) {
                    newLabel = newLabel.substring(0,MAXSTRING-1) + "…";
                }
                shotsName9.setText(newLabel);
                statsName9.setText(newLabel);
                break;

            case R.id.rosterRow10EditNum:
            case R.id.rosterRow10EditName:

                newLabel = "#" + rosterNum10.getText() + " " + rosterName10.getText();
                if (newLabel.length() > MAXSTRING) {
                    newLabel = newLabel.substring(0,MAXSTRING-1) + "…";
                }
                shotsName10.setText(newLabel);
                statsName10.setText(newLabel);
                break;

            case R.id.rosterRow11EditNum:
            case R.id.rosterRow11EditName:

                newLabel = "#" + rosterNum11.getText() + " " + rosterName11.getText();
                if (newLabel.length() > MAXSTRING) {
                    newLabel = newLabel.substring(0,MAXSTRING-1) + "…";
                }
                shotsName11.setText(newLabel);
                statsName11.setText(newLabel);
                break;

            case R.id.rosterRow12EditNum:
            case R.id.rosterRow12EditName:

                newLabel = "#" + rosterNum12.getText() + " " + rosterName12.getText();
                if (newLabel.length() > MAXSTRING) {
                    newLabel = newLabel.substring(0,MAXSTRING-1) + "…";
                }
                shotsName12.setText(newLabel);
                statsName12.setText(newLabel);
                break;

            case R.id.rosterRow13EditNum:
            case R.id.rosterRow13EditName:

                newLabel = "#" + rosterNum13.getText() + " " + rosterName13.getText();
                if (newLabel.length() > MAXSTRING) {
                    newLabel = newLabel.substring(0,MAXSTRING-1) + "…";
                }
                shotsName13.setText(newLabel);
                statsName13.setText(newLabel);
                break;
        }
    }

    @Override
    public void onClick(View v) {

        double stat;
        String newStatLabel;

        switch (v.getId()) {

            case R.id.shotsRow1UpMade:
                shotsMade[1]++;
                shotsMade1.setText(String.valueOf(shotsMade[1]));
                stat = (double) shotsMade[1] / (shotsMade[1] + shotsMissed[1]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat1.setText(newStatLabel);
                break;

            case R.id.shotsRow2UpMade:
                shotsMade[2]++;
                shotsMade2.setText(String.valueOf(shotsMade[2]));
                stat = (double) shotsMade[2] / (shotsMade[2] + shotsMissed[2]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat2.setText(newStatLabel);

                break;

            case R.id.shotsRow3UpMade:
                shotsMade[3]++;
                shotsMade3.setText(String.valueOf(shotsMade[3]));
                stat = (double) shotsMade[3] / (shotsMade[3] + shotsMissed[3]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat3.setText(newStatLabel);
                break;

            case R.id.shotsRow4UpMade:
                shotsMade[4]++;
                shotsMade4.setText(String.valueOf(shotsMade[4]));
                stat = (double) shotsMade[4] / (shotsMade[4] + shotsMissed[4]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat4.setText(newStatLabel);
                break;

            case R.id.shotsRow5UpMade:
                shotsMade[5]++;
                shotsMade5.setText(String.valueOf(shotsMade[5]));
                stat = (double) shotsMade[5] / (shotsMade[5] + shotsMissed[5]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat5.setText(newStatLabel);
                break;

            case R.id.shotsRow6UpMade:
                shotsMade[6]++;
                shotsMade6.setText(String.valueOf(shotsMade[6]));
                stat = (double) shotsMade[6] / (shotsMade[6] + shotsMissed[6]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat6.setText(newStatLabel);
                break;

            case R.id.shotsRow7UpMade:
                shotsMade[7]++;
                shotsMade7.setText(String.valueOf(shotsMade[7]));
                stat = (double) shotsMade[7] / (shotsMade[7] + shotsMissed[7]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat7.setText(newStatLabel);
                break;

            case R.id.shotsRow8UpMade:
                shotsMade[8]++;
                shotsMade8.setText(String.valueOf(shotsMade[8]));
                stat = (double) shotsMade[8] / (shotsMade[8] + shotsMissed[8]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat8.setText(newStatLabel);
                break;

            case R.id.shotsRow9UpMade:
                shotsMade[9]++;
                shotsMade9.setText(String.valueOf(shotsMade[9]));
                stat = (double) shotsMade[9] / (shotsMade[9] + shotsMissed[9]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat9.setText(newStatLabel);
                break;

            case R.id.shotsRow10UpMade:
                shotsMade[10]++;
                shotsMade10.setText(String.valueOf(shotsMade[10]));
                stat = (double) shotsMade[10] / (shotsMade[10] + shotsMissed[10]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat10.setText(newStatLabel);
                break;

            case R.id.shotsRow11UpMade:
                shotsMade[11]++;
                shotsMade11.setText(String.valueOf(shotsMade[11]));
                stat = (double) shotsMade[11] / (shotsMade[11] + shotsMissed[11]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat11.setText(newStatLabel);
                break;

            case R.id.shotsRow12UpMade:
                shotsMade[12]++;
                shotsMade12.setText(String.valueOf(shotsMade[12]));
                stat = (double) shotsMade[12] / (shotsMade[12] + shotsMissed[12]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat12.setText(newStatLabel);
                break;

            case R.id.shotsRow13UpMade:
                shotsMade[13]++;
                shotsMade13.setText(String.valueOf(shotsMade[13]));
                stat = (double) shotsMade[13] / (shotsMade[13] + shotsMissed[13]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat13.setText(newStatLabel);
                break;


            case R.id.shotsRow1DownMade:
                if (shotsMade[1] > 0) {
                    shotsMade[1]--;
                    shotsMade1.setText(String.valueOf(shotsMade[1]));

                    if ((shotsMade[1] == 0) && (shotsMissed[1] == 0)) {
                        statsStat1.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[1] / (shotsMade[1] + shotsMissed[1]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat1.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow2DownMade:
                if (shotsMade[2] > 0) {
                    shotsMade[2]--;
                    shotsMade2.setText(String.valueOf(shotsMade[2]));

                    if ((shotsMade[2] == 0) && (shotsMissed[2] == 0)) {
                        statsStat2.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[2] / (shotsMade[2] + shotsMissed[2]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat2.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow3DownMade:
                if (shotsMade[3] > 0) {
                    shotsMade[3]--;
                    shotsMade3.setText(String.valueOf(shotsMade[3]));

                    if ((shotsMade[3] == 0) && (shotsMissed[3] == 0)) {
                        statsStat3.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[3] / (shotsMade[3] + shotsMissed[3]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat3.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow4DownMade:
                if (shotsMade[4] > 0) {
                    shotsMade[4]--;
                    shotsMade4.setText(String.valueOf(shotsMade[4]));

                    if ((shotsMade[4] == 0) && (shotsMissed[4] == 0)) {
                        statsStat4.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[4] / (shotsMade[4] + shotsMissed[4]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat4.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow5DownMade:
                if (shotsMade[5] > 0) {
                    shotsMade[5]--;
                    shotsMade5.setText(String.valueOf(shotsMade[5]));

                    if ((shotsMade[5] == 0) && (shotsMissed[5] == 0)) {
                        statsStat5.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[5] / (shotsMade[5] + shotsMissed[5]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat5.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow6DownMade:
                if (shotsMade[6] > 0) {
                    shotsMade[6]--;
                    shotsMade6.setText(String.valueOf(shotsMade[6]));

                    if ((shotsMade[6] == 0) && (shotsMissed[6] == 0)) {
                        statsStat6.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[6] / (shotsMade[6] + shotsMissed[6]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat6.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow7DownMade:
                if (shotsMade[7] > 0) {
                    shotsMade[7]--;
                    shotsMade7.setText(String.valueOf(shotsMade[7]));

                    if ((shotsMade[7] == 0) && (shotsMissed[7] == 0)) {
                        statsStat7.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[7] / (shotsMade[7] + shotsMissed[7]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat7.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow8DownMade:
                if (shotsMade[8] > 0) {
                    shotsMade[8]--;
                    shotsMade8.setText(String.valueOf(shotsMade[8]));

                    if ((shotsMade[8] == 0) && (shotsMissed[8] == 0)) {
                        statsStat8.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[8] / (shotsMade[8] + shotsMissed[8]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat8.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow9DownMade:
                if (shotsMade[9] > 0) {
                    shotsMade[9]--;
                    shotsMade9.setText(String.valueOf(shotsMade[9]));

                    if ((shotsMade[9] == 0) && (shotsMissed[9] == 0)) {
                        statsStat9.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[9] / (shotsMade[9] + shotsMissed[9]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat9.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow10DownMade:
                if (shotsMade[10] > 0) {
                    shotsMade[10]--;
                    shotsMade10.setText(String.valueOf(shotsMade[10]));

                    if ((shotsMade[10] == 0) && (shotsMissed[10] == 0)) {
                        statsStat10.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[10] / (shotsMade[10] + shotsMissed[10]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat10.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow11DownMade:
                if (shotsMade[11] > 0) {
                    shotsMade[11]--;
                    shotsMade11.setText(String.valueOf(shotsMade[11]));

                    if ((shotsMade[11] == 0) && (shotsMissed[11] == 0)) {
                        statsStat11.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[11] / (shotsMade[11] + shotsMissed[11]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat11.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow12DownMade:
                if (shotsMade[12] > 0) {
                    shotsMade[12]--;
                    shotsMade12.setText(String.valueOf(shotsMade[12]));

                    if ((shotsMade[12] == 0) && (shotsMissed[12] == 0)) {
                        statsStat12.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[12] / (shotsMade[12] + shotsMissed[12]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat12.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow13DownMade:
                if (shotsMade[13] > 0) {
                    shotsMade[13]--;
                    shotsMade13.setText(String.valueOf(shotsMade[13]));

                    if ((shotsMade[13] == 0) && (shotsMissed[13] == 0)) {
                        statsStat13.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[13] / (shotsMade[13] + shotsMissed[13]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat13.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow1UpMissed:
                shotsMissed[1]++;
                shotsMissed1.setText(String.valueOf(shotsMissed[1]));
                stat = (double) shotsMade[1] / (shotsMade[1] + shotsMissed[1]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat1.setText(newStatLabel);

                break;

            case R.id.shotsRow2UpMissed:
                shotsMissed[2]++;
                shotsMissed2.setText(String.valueOf(shotsMissed[2]));
                stat = (double) shotsMade[2] / (shotsMade[2] + shotsMissed[2]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat2.setText(newStatLabel);

                break;

            case R.id.shotsRow3UpMissed:
                shotsMissed[3]++;
                shotsMissed3.setText(String.valueOf(shotsMissed[3]));
                stat = (double) shotsMade[3] / (shotsMade[3] + shotsMissed[3]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat3.setText(newStatLabel);
                break;

            case R.id.shotsRow4UpMissed:
                shotsMissed[4]++;
                shotsMissed4.setText(String.valueOf(shotsMissed[4]));
                stat = (double) shotsMade[4] / (shotsMade[4] + shotsMissed[4]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat4.setText(newStatLabel);
                break;

            case R.id.shotsRow5UpMissed:
                shotsMissed[5]++;
                shotsMissed5.setText(String.valueOf(shotsMissed[5]));
                stat = (double) shotsMade[5] / (shotsMade[5] + shotsMissed[5]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat5.setText(newStatLabel);
                break;

            case R.id.shotsRow6UpMissed:
                shotsMissed[6]++;
                shotsMissed6.setText(String.valueOf(shotsMissed[6]));
                stat = (double) shotsMade[6] / (shotsMade[6] + shotsMissed[6]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat6.setText(newStatLabel);
                break;

            case R.id.shotsRow7UpMissed:
                shotsMissed[7]++;
                shotsMissed7.setText(String.valueOf(shotsMissed[7]));
                stat = (double) shotsMade[7] / (shotsMade[7] + shotsMissed[7]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat7.setText(newStatLabel);
                break;

            case R.id.shotsRow8UpMissed:
                shotsMissed[8]++;
                shotsMissed8.setText(String.valueOf(shotsMissed[8]));
                stat = (double) shotsMade[8] / (shotsMade[8] + shotsMissed[8]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat8.setText(newStatLabel);
                break;

            case R.id.shotsRow9UpMissed:
                shotsMissed[9]++;
                shotsMissed9.setText(String.valueOf(shotsMissed[9]));
                stat = (double) shotsMade[9] / (shotsMade[9] + shotsMissed[9]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat9.setText(newStatLabel);
                break;

            case R.id.shotsRow10UpMissed:
                shotsMissed[10]++;
                shotsMissed10.setText(String.valueOf(shotsMissed[10]));
                stat = (double) shotsMade[10] / (shotsMade[10] + shotsMissed[10]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat10.setText(newStatLabel);
                break;

            case R.id.shotsRow11UpMissed:
                shotsMissed[11]++;
                shotsMissed11.setText(String.valueOf(shotsMissed[11]));
                stat = (double) shotsMade[11] / (shotsMade[11] + shotsMissed[11]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat11.setText(newStatLabel);
                break;

            case R.id.shotsRow12UpMissed:
                shotsMissed[12]++;
                shotsMissed12.setText(String.valueOf(shotsMissed[12]));
                stat = (double) shotsMade[12] / (shotsMade[12] + shotsMissed[12]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat12.setText(newStatLabel);
                break;

            case R.id.shotsRow13UpMissed:
                shotsMissed[13]++;
                shotsMissed13.setText(String.valueOf(shotsMissed[13]));
                stat = (double) shotsMade[13] / (shotsMade[13] + shotsMissed[13]) * 100;
                newStatLabel = String.format("%.1f", stat) + "%";
                statsStat13.setText(newStatLabel);
                break;


            case R.id.shotsRow1DownMissed:
                if (shotsMissed[1] > 0) {
                    shotsMissed[1]--;
                    shotsMissed1.setText(String.valueOf(shotsMissed[1]));

                    if ((shotsMade[1] == 0) && (shotsMissed[1] == 0)) {
                        statsStat1.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[1] / (shotsMade[1] + shotsMissed[1]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat1.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow2DownMissed:
                if (shotsMissed[2] > 0) {
                    shotsMissed[2]--;
                    shotsMissed2.setText(String.valueOf(shotsMissed[2]));

                    if ((shotsMade[2] == 0) && (shotsMissed[2] == 0)) {
                        statsStat2.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[2] / (shotsMade[2] + shotsMissed[2]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat2.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow3DownMissed:
                if (shotsMissed[3] > 0) {
                    shotsMissed[3]--;
                    shotsMissed3.setText(String.valueOf(shotsMissed[3]));

                    if ((shotsMade[3] == 0) && (shotsMissed[3] == 0)) {
                        statsStat3.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[3] / (shotsMade[3] + shotsMissed[3]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat3.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow4DownMissed:
                if (shotsMissed[4] > 0) {
                    shotsMissed[4]--;
                    shotsMissed4.setText(String.valueOf(shotsMissed[4]));

                    if ((shotsMade[4] == 0) && (shotsMissed[4] == 0)) {
                        statsStat4.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[4] / (shotsMade[4] + shotsMissed[4]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat4.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow5DownMissed:
                if (shotsMissed[5] > 0) {
                    shotsMissed[5]--;
                    shotsMissed5.setText(String.valueOf(shotsMissed[5]));

                    if ((shotsMade[5] == 0) && (shotsMissed[5] == 0)) {
                        statsStat5.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[5] / (shotsMade[5] + shotsMissed[5]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat5.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow6DownMissed:
                if (shotsMissed[6] > 0) {
                    shotsMissed[6]--;
                    shotsMissed6.setText(String.valueOf(shotsMissed[6]));

                    if ((shotsMade[6] == 0) && (shotsMissed[6] == 0)) {
                        statsStat6.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[6] / (shotsMade[6] + shotsMissed[6]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat6.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow7DownMissed:
                if (shotsMissed[7] > 0) {
                    shotsMissed[7]--;
                    shotsMissed7.setText(String.valueOf(shotsMissed[7]));

                    if ((shotsMade[7] == 0) && (shotsMissed[7] == 0)) {
                        statsStat7.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[7] / (shotsMade[7] + shotsMissed[7]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat7.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow8DownMissed:
                if (shotsMissed[8] > 0) {
                    shotsMissed[8]--;
                    shotsMissed8.setText(String.valueOf(shotsMissed[8]));

                    if ((shotsMade[8] == 0) && (shotsMissed[8] == 0)) {
                        statsStat8.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[8] / (shotsMade[8] + shotsMissed[8]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat8.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow9DownMissed:
                if (shotsMissed[9] > 0) {
                    shotsMissed[9]--;
                    shotsMissed9.setText(String.valueOf(shotsMissed[9]));

                    if ((shotsMade[9] == 0) && (shotsMissed[9] == 0)) {
                        statsStat9.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[9] / (shotsMade[9] + shotsMissed[9]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat9.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow10DownMissed:
                if (shotsMissed[10] > 0) {
                    shotsMissed[10]--;
                    shotsMissed10.setText(String.valueOf(shotsMissed[10]));

                    if ((shotsMade[10] == 0) && (shotsMissed[10] == 0)) {
                        statsStat10.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[10] / (shotsMade[10] + shotsMissed[10]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat10.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow11DownMissed:
                if (shotsMissed[11] > 0) {
                    shotsMissed[11]--;
                    shotsMissed11.setText(String.valueOf(shotsMissed[11]));

                    if ((shotsMade[11] == 0) && (shotsMissed[11] == 0)) {
                        statsStat11.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[11] / (shotsMade[11] + shotsMissed[11]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat11.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow12DownMissed:
                if (shotsMissed[12] > 0) {
                    shotsMissed[12]--;
                    shotsMissed12.setText(String.valueOf(shotsMissed[12]));

                    if ((shotsMade[12] == 0) && (shotsMissed[12] == 0)) {
                        statsStat12.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[12] / (shotsMade[12] + shotsMissed[12]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat12.setText(newStatLabel);
                    }
                }
                break;

            case R.id.shotsRow13DownMissed:
                if (shotsMissed[13] > 0) {
                    shotsMissed[13]--;
                    shotsMissed13.setText(String.valueOf(shotsMissed[13]));

                    if ((shotsMade[13] == 0) && (shotsMissed[13] == 0)) {
                        statsStat13.setText("NA (0 attempts)");
                    }
                    else {
                        stat = (double) shotsMade[13] / (shotsMade[13] + shotsMissed[13]) * 100;
                        newStatLabel = String.format("%.1f", stat) + "%";
                        statsStat13.setText(newStatLabel);
                    }
                }
                break;
        }
    }
}
