package com.lifeapp.www.democounter.Model;

import android.os.CountDownTimer;
import android.widget.TextView;

/**
 * Created by Prakhar on 12/31/2016.
 */

public class CountDownTextView extends CountDownTimer {
    private  TextView mTextField;

    public CountDownTextView(TextView mTextField,long millisInFuture, long countDownInterval,orderItem orderItem) {
        super(millisInFuture, countDownInterval);
        this.mTextField=mTextField;
    }

    @Override
    public void onTick(long millisUntilFinished) {
        mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
    }

    @Override
    public void onFinish() {
        mTextField.setText("done!");;

    }
}
