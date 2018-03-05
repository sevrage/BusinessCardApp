package com.example.android.ambidatacard;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public static final String URL_YOUTUBE = "https://www.youtube.com/results?search_query=ambidata";
    public static final String URL_FACEBOOK = "https://www.facebook.com/Ambidata";
    public static final String URL_TWITTER = "https://twitter.com/AmbidataLda";
    public static final String URL_LINKEDIN = "https://www.linkedin.com/company/265425";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Open Urls Image Click Events
        ImageView imageViewYoutube = findViewById(R.id.imagebtn_youtube);
        imageViewYoutube.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse(URL_YOUTUBE);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ImageView imageViewFacebook = findViewById(R.id.imagebtn_facebook);
        imageViewFacebook.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse(URL_FACEBOOK);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ImageView imageViewTwitter = findViewById(R.id.imagebtn_twitter);
        imageViewTwitter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse(URL_TWITTER);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ImageView imageViewLinkedin = findViewById(R.id.imagebtn_linkedin);
        imageViewLinkedin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse(URL_LINKEDIN);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }

        });

    }


}
