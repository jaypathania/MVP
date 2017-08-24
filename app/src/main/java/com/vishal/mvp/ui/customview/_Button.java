package com.vishal.mvp.ui.customview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

import com.vishal.mvp.R;

/**
 * Created by Administrator on 8/24/2017.
 */

public class _Button extends Button {

    public _Button(Context context) {
        super(context);
    }

    public _Button(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public _Button(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                getBackground().setColorFilter(getResources().getColor(R.color.colorPrimary), PorterDuff.Mode.SRC_ATOP);
                setTextColor(Color.WHITE);
                invalidate();
                break;
            }
            case MotionEvent.ACTION_UP: {
                getBackground().clearColorFilter();
                setTextColor(Color.BLACK);
                invalidate();
                break;
            }
        }
        return super.onTouchEvent(event);
    }
}