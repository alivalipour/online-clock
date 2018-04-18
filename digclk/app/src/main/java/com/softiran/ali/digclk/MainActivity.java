package com.softiran.ali.digclk;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Type;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Date d=new Date();
        final int h = d.getHours();
        final TextView H =(TextView)findViewById(R.id.t1);

        final int m = d.getMinutes();
        final TextView M =(TextView)findViewById(R.id.t3);

        final int s = d.getSeconds();
        final TextView S =(TextView)findViewById(R.id.t5);

        final MediaPlayer v1 = MediaPlayer.create(this,R.raw.s1);
        final MediaPlayer v2 = MediaPlayer.create(this,R.raw.s1o);
        final MediaPlayer v3 = MediaPlayer.create(this,R.raw.s2);
        final MediaPlayer v4 = MediaPlayer.create(this,R.raw.s2o);
        final MediaPlayer v5 = MediaPlayer.create(this,R.raw.s3);
        final MediaPlayer v6 = MediaPlayer.create(this,R.raw.s3o);
        final MediaPlayer v7 = MediaPlayer.create(this,R.raw.s4);
        final MediaPlayer v8 = MediaPlayer.create(this,R.raw.s4o);
        final MediaPlayer v9 = MediaPlayer.create(this,R.raw.s5);
        final MediaPlayer v10 = MediaPlayer.create(this,R.raw.s5o);
        final MediaPlayer v11 = MediaPlayer.create(this,R.raw.s6);
        final MediaPlayer v12 = MediaPlayer.create(this,R.raw.s6o);
        final MediaPlayer v13 = MediaPlayer.create(this,R.raw.s7);
        final MediaPlayer v14 = MediaPlayer.create(this,R.raw.s7o);
        final MediaPlayer v15 = MediaPlayer.create(this,R.raw.s8);
        final MediaPlayer v16 = MediaPlayer.create(this,R.raw.s8o);
        final MediaPlayer v17 = MediaPlayer.create(this,R.raw.s9);
        final MediaPlayer v18 = MediaPlayer.create(this,R.raw.s9o);
        final MediaPlayer v19 = MediaPlayer.create(this,R.raw.s10);
        final MediaPlayer v20 = MediaPlayer.create(this,R.raw.s10o);
        final MediaPlayer v21 = MediaPlayer.create(this,R.raw.s11);
        final MediaPlayer v22 = MediaPlayer.create(this,R.raw.s11o);
        final MediaPlayer v23 = MediaPlayer.create(this,R.raw.s12);
        final MediaPlayer v24 = MediaPlayer.create(this,R.raw.s12o);
        final MediaPlayer v25 = MediaPlayer.create(this,R.raw.s13);
        final MediaPlayer v26 = MediaPlayer.create(this,R.raw.s13o);
        final MediaPlayer v27 = MediaPlayer.create(this,R.raw.s14);
        final MediaPlayer v28 = MediaPlayer.create(this,R.raw.s14o);
        final MediaPlayer v29 = MediaPlayer.create(this,R.raw.s15);
        final MediaPlayer v30 = MediaPlayer.create(this,R.raw.s15o);
        final MediaPlayer v31 = MediaPlayer.create(this,R.raw.s16);
        final MediaPlayer v32 = MediaPlayer.create(this,R.raw.s16o);
        final MediaPlayer v33 = MediaPlayer.create(this,R.raw.s17);
        final MediaPlayer v34 = MediaPlayer.create(this,R.raw.s17o);
        final MediaPlayer v35 = MediaPlayer.create(this,R.raw.s18);
        final MediaPlayer v36 = MediaPlayer.create(this,R.raw.s18o);
        final MediaPlayer v37 = MediaPlayer.create(this,R.raw.s19);
        final MediaPlayer v38 = MediaPlayer.create(this,R.raw.s19o);
        final MediaPlayer v39 = MediaPlayer.create(this,R.raw.s20);
        final MediaPlayer v40 = MediaPlayer.create(this,R.raw.s20o);
        final MediaPlayer v41 = MediaPlayer.create(this,R.raw.d30);
        final MediaPlayer v42 = MediaPlayer.create(this,R.raw.d30o);
        final MediaPlayer v43 = MediaPlayer.create(this,R.raw.d40);
        final MediaPlayer v44 = MediaPlayer.create(this,R.raw.d40o);
        final MediaPlayer v45 = MediaPlayer.create(this,R.raw.d50);
        final MediaPlayer v46 = MediaPlayer.create(this,R.raw.d50o);
        final MediaPlayer v47 = MediaPlayer.create(this,R.raw.saat);
        final MediaPlayer v48 = MediaPlayer.create(this,R.raw.daghigheh);
        final MediaPlayer v49 = MediaPlayer.create(this,R.raw.daghigheho);
        final MediaPlayer v50 = MediaPlayer.create(this,R.raw.sanieh);

        Button B1=(Button) findViewById(R.id.b1);
        B1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                H.setText(String.valueOf(h));
                M.setText(String.valueOf(m));
                S.setText(String.valueOf(s));

                v47.start();

                if (h==0)
                {
                    switch (m) {

                        case  1 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v1.start();
                                }
                            });
                            break;
                        case  2 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v3.start();
                                }
                            });
                            break;
                        case  3 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v5.start();
                                }
                            });
                            break;
                        case  4 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v7.start();
                                }
                            });
                            break;
                        case  5 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v9.start();
                                }
                            });
                            break;
                        case  6 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v11.start();
                                }
                            });
                            break;
                        case  7 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v13.start();
                                }
                            });
                            break;
                        case  8 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v15.start();
                                }
                            });
                            break;
                        case  9 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v17.start();
                                }
                            });
                            break;
                        case  10 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v19.start();
                                }
                            });
                            break;
                        case  11 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v21.start();
                                }
                            });
                            break;
                        case  12 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v23.start();
                                }
                            });
                            break;
                        case  13:
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v25.start();
                                }
                            });
                            break;
                        case  14 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v27.start();
                                }
                            });
                            break;
                        case  15 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v29.start();
                                }
                            });
                            break;
                        case  16 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v31.start();
                                }
                            });
                            break;
                        case  17 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v33.start();
                                }
                            });
                            break;
                        case  18 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v35.start();
                                }
                            });
                            break;
                        case  19 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v37.start();
                                }
                            });
                            break;
                        case  20 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v39.start();
                                }
                            });
                            break;
                        case  30 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v41.start();
                                }
                            });
                            break;
                        case  40 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v43.start();
                                }
                            });
                            break;
                        case  50 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v45.start();
                                }
                            });
                            break;


                    }

                }
                if (m==0){

                    switch (h){

                        case  1 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v1.start();
                                }
                            });
                            break;
                        case  2 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v3.start();
                                }
                            });
                            break;
                        case  3 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v5.start();
                                }
                            });
                            break;
                        case  4 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v7.start();
                                }
                            });
                            break;
                        case  5 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v9.start();
                                }
                            });
                            break;
                        case  6 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v11.start();
                                }
                            });
                            break;
                        case  7 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v13.start();
                                }
                            });
                            break;
                        case  8 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v15.start();
                                }
                            });
                            break;
                        case  9 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v17.start();
                                }
                            });
                            break;
                        case  10 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v19.start();
                                }
                            });
                            break;
                        case  11 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v21.start();
                                }
                            });
                            break;
                        case  12 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v23.start();
                                }
                            });
                            break;
                        case  13:
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v25.start();
                                }
                            });
                            break;
                        case  14 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v27.start();
                                }
                            });
                            break;
                        case  15 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v29.start();
                                }
                            });
                            break;
                        case  16 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v31.start();
                                }
                            });
                            break;
                        case  17 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v33.start();
                                }
                            });
                            break;
                        case  18 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v35.start();
                                }
                            });
                            break;
                        case  19 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v37.start();
                                }
                            });
                            break;
                        case  20 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v39.start();
                                }
                            });
                            break;

                    }

                }
                if (h!=0){

                    switch (h) {

                        case  1 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v2.start();
                                }
                            });
                            break;
                        case  2 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v4.start();
                                }
                            });
                            break;
                        case  3 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v6.start();
                                }
                            });
                            break;
                        case  4 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v8.start();
                                }
                            });
                            break;
                        case  5 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v10.start();
                                }
                            });
                            break;
                        case  6 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v12.start();
                                }
                            });
                            break;
                        case  7 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v14.start();
                                }
                            });
                            break;
                        case  8 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v16.start();
                                }
                            });
                            break;
                        case  9 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v18.start();
                                }
                            });
                            break;
                        case  10 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v20.start();
                                }
                            });
                            break;
                        case  11 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v22.start();
                                }
                            });
                            break;
                        case  12 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v24.start();
                                }
                            });
                            break;
                        case  13 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v26.start();
                                }
                            });
                            break;
                        case  14 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v28.start();
                                }
                            });
                            break;
                        case  15 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v30.start();
                                }
                            });
                            break;
                        case  16 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v32.start();
                                }
                            });
                            break;
                        case  17 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v34.start();
                                }
                            });
                            break;
                        case  18 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v36.start();
                                }
                            });
                            break;
                        case  19 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v38.start();
                                }
                            });
                            break;
                        case  20 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v40.start();
                                }
                            });
                            break;


                    }



                    }
                if (m!=0){

                    switch (m){
                        case  1 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v1.start();
                                }
                            });
                            break;
                        case  2 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v3.start();
                                }
                            });
                            break;
                        case  3 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v5.start();
                                }
                            });
                            break;
                        case  4 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v7.start();
                                }
                            });
                            break;
                        case  5 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v9.start();
                                }
                            });
                            break;
                        case  6 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v11.start();
                                }
                            });
                            break;
                        case  7 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v13.start();
                                }
                            });
                            break;
                        case  8 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v15.start();
                                }
                            });
                            break;
                        case  9 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v17.start();
                                }
                            });
                            break;
                        case  10 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v19.start();
                                }
                            });
                            break;
                        case  11 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v21.start();
                                }
                            });
                            break;
                        case  12 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v23.start();
                                }
                            });
                            break;
                        case  13:
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v25.start();
                                }
                            });
                            break;
                        case  14 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v27.start();
                                }
                            });
                            break;
                        case  15 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v29.start();
                                }
                            });
                            break;
                        case  16 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v31.start();
                                }
                            });
                            break;
                        case  17 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v33.start();
                                }
                            });
                            break;
                        case  18 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v35.start();
                                }
                            });
                            break;
                        case  19 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v37.start();
                                }
                            });
                            break;
                        case  20 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v39.start();
                                }
                            });
                            break;
                        case  30 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v41.start();
                                }
                            });
                            break;
                        case  40 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v43.start();
                                }
                            });
                            break;
                        case  50 :
                            v47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    v45.start();
                                }
                            });
                            break;


                    }


                }



                TextView t1=(TextView) findViewById(R.id.t1);
                Typeface T1= Typeface.createFromAsset(getAssets(),"DS-DIGI.TTF");
                t1.setTypeface(T1);

                TextView t2=(TextView) findViewById(R.id.t2);
                Typeface T2= Typeface.createFromAsset(getAssets(), "DS-DIGI.TTF");
                t2.setTypeface(T2);

                TextView t3=(TextView) findViewById(R.id.t3);
                Typeface T3= Typeface.createFromAsset(getAssets(), "DS-DIGI.TTF");
                t3.setTypeface(T3);

                TextView t4=(TextView) findViewById(R.id.t4);
                Typeface T4= Typeface.createFromAsset(getAssets(), "DS-DIGI.TTF");
                t4.setTypeface(T4);

                TextView t5=(TextView) findViewById(R.id.t5);
                Typeface T5= Typeface.createFromAsset(getAssets(), "DS-DIGI.TTF");
                t5.setTypeface(T5);

                TextView t6=(TextView) findViewById(R.id.t6);
                Typeface T6= Typeface.createFromAsset(getAssets(), "DS-DIGI.TTF");
                t6.setTypeface(T6);

                ImageView img1=(ImageView) findViewById(R.id.img1);
                img1.setImageResource(R.drawable.alarm);

                ImageView img2=(ImageView) findViewById(R.id.img2);
                img2.setImageResource(R.drawable.not);


            }
        });

    }


}
