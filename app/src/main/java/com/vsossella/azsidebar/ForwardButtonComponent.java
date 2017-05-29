package com.vsossella.azsidebar;

import android.content.Context;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;

/**
 * Created by vsossella on 05/05/17.
 */

public class ForwardButtonComponent extends LinearLayoutCompat {


    Button btn1;
    Button btn2;

    public ForwardButtonComponent(Context context) {
        this(context, null);
    }

    public ForwardButtonComponent(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ForwardButtonComponent(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initControl(context);
    }


    /**
     * Load component XML layout
     */
    private void initControl(Context context)
    {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        inflater.inflate(R.layout.forward_button, this);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        // layout is inflated, assign local variables to components
//        header = (LinearLayout)findViewById(R.id.calendar_header);
//        btnPrev = (ImageView)findViewById(R.id.calendar_prev_button);
//        btnNext = (ImageView)findViewById(R.id.calendar_next_button);
//        txtDate = (TextView)findViewById(R.id.calendar_date_display);
//        grid = (GridView)findViewById(R.id.calendar_grid);
    }

    public void updateButton() {
        btn1.setVisibility(GONE);
    }

}
