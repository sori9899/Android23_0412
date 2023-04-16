package com.example.project10_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class ResultActivity extends Activity {


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        setTitle("투표 결과");

        Intent intent = getIntent();
        int[] voteResult = intent.getIntArrayExtra("VoteCount");
        String[] imageName = intent.getStringArrayExtra("ImgName");

        for(int i=0; i<imageName.length; i++){
            System.out.println(imageName[i]);
        }

        TextView tv[] = new TextView[imageName.length];
        RatingBar rbar[] = new RatingBar[imageName.length];

        Integer tvID[] = { R.id.tv1, R.id.tv2, R.id.tv3, R.id.tv4, R.id.tv5, R.id.tv6, R.id.tv7, R.id.tv8, R.id.tv9 };
        Integer rbarID[] = {R.id.rbar1, R.id.rbar2, R.id.rbar3, R.id.rbar4, R.id.rbar5, R.id.rbar6, R.id.rbar7, R.id.rbar8, R.id.rbar9};

        for(int i=0; i< imageName.length; i++){
            System.out.println(tvID[i]);
            System.out.println(rbarID[i]);
        }

        for(int i=0; i<voteResult.length; i++){
            tv[i] = (TextView)findViewById(tvID[i]);
            System.out.println(tv[i]);
            rbar[i] = (RatingBar) findViewById(rbarID[i]);
            System.out.println(rbar[i]);
        }

        System.out.println(voteResult.length);
        for(int j=0; j<voteResult.length; j++){
            tv[j].setText(imageName[j]);
            rbar[j].setRating((float) voteResult[j]);
        }

        Button btnReturn = (Button) findViewById(R.id.btnReturn);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
