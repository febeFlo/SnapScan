package com.example.textscanner;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class OnBoardingScreen extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addFragment(new Step.Builder().setTitle("Extract Text from Images using ML")
                .setContent("Recognize text in images with ML Kit on Android")
                .setBackgroundColor(Color.parseColor("#4C2A85"))
                .setDrawable(R.drawable.onboarding1)
                .setSummary("You can use ML Kit to recognize text in images or video, such as the text of a street sign")
                .build());

        addFragment(new Step.Builder().setTitle("Copy and Use the Extracted Text in Seconds")
                .setContent("Recognize text in images with ML Kit on Android")
                .setBackgroundColor(Color.parseColor("#4C2A85"))
                .setDrawable(R.drawable.onboarding2)
                .setSummary("You can use ML Kit to recognize text in images or video, such as the text of a street sign")
                .build());

        addFragment(new Step.Builder().setTitle("Help You Read a Text on Images")
                .setContent("Recognize text in images with ML Kit on Android")
                .setBackgroundColor(Color.parseColor("#4C2A85"))
                .setDrawable(R.drawable.onboarding3)
                .setSummary("You can use ML Kit to recognize text in images or video, such as the text of a street sign")
                .build());
    }

    @Override
    public void finishTutorial(){
        Intent i = new Intent(this, MainPage.class);
        startActivity(i);
    }

    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}