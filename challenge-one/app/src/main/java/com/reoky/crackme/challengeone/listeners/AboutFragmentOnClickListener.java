package com.reoky.crackme.challengeone.listeners;

import android.view.View;

import com.reoky.crackme.challengeone.R;

/**
 * Simple listener class to listener for click events on the about tab fragment
 * author: Lucas Thoresen
 */
public class AboutFragmentOnClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_quit:
                view.setEnabled(false);
                System.exit(0);
        }
    }
}
