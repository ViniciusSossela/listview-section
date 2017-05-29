package com.vsossella.azsidebar;

import android.app.Service;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;

/**
 * Created by vsossella on 04/05/17.
 */

public class ForwardButton extends AppCompatButton {

    Context context;
    private final Paint mPaint = new Paint();
    private static int l = 1;
    public String isOpen = "";

//    SoftKeyboard softKeyboard;

    public ForwardButton(Context context) {
        this(context, null);
    }


    public ForwardButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ForwardButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        this.context = context;

//        RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.activity_main); // You must use the layout root
//        InputMethodManager im = (InputMethodManager) context.getSystemService(Service.INPUT_METHOD_SERVICE);
//
//        softKeyboard = new SoftKeyboard(mainLayout, im);
//        softKeyboard.setSoftKeyboardCallback(new SoftKeyboard.SoftKeyboardChanged() {
//
//            @Override
//            public void onSoftKeyboardHide() {
//                invalidate();
//                // Code here
//            }
//
//            @Override
//            public void onSoftKeyboardShow() {
//                invalidate();
//                // Code here
//            }
//        });

//        init(context, attrs);
    }


    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        

        if(l==1) {
            mPaint.setColor(getTextColors().getDefaultColor());
            canvas.drawRect(0, 50, getWidth(), getHeight(), mPaint);
        }
        l++;
    }
}

