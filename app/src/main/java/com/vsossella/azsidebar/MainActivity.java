package com.vsossella.azsidebar;

import android.app.Service;
import android.content.res.Configuration;
import android.databinding.BindingAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.vsossella.corelib.Test;

import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

public class MainActivity extends BaseActivity {


    SoftKeyboard softKeyboard;
    ForwardButtonComponent forwardButtonComponent;

    @Override
    protected void onHideKeyboard() {
        super.onHideKeyboard();
        forwardButtonComponent.updateButton();
    }

    @Override
    protected void onShowKeyboard(int keyboardHeight) {
        super.onShowKeyboard(keyboardHeight);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        attachKeyboardListeners();
        StickyListHeadersListView stickyList = (StickyListHeadersListView) findViewById(R.id.list);
        forwardButtonComponent = (ForwardButtonComponent) findViewById(R.id.forward_button);
        MyAdapter adapter = new MyAdapter(this);
        stickyList.setAdapter(adapter);

         /*
        Instantiate and pass a callback
        */
//        RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.activity_main); // You must use the layout root
//        InputMethodManager im = (InputMethodManager) getSystemService(Service.INPUT_METHOD_SERVICE);
//
//        softKeyboard = new SoftKeyboard(mainLayout, im);
//        softKeyboard.setSoftKeyboardCallback(new SoftKeyboard.SoftKeyboardChanged() {
//
//            @Override
//            public void onSoftKeyboardHide() {
//                forwardButtonComponent.updateButton();
//                // Code here
//            }
//
//            @Override
//            public void onSoftKeyboardShow() {
//                String b = "";
//                // Code here
//            }
//        });
    }

//    @BindingAdapter({"bind:keyboardlistner"})
//    public static void setKeyboardlistner(final ForwardButton editText, String mask) {
//
//        RelativeLayout mainLayout = (RelativeLayout) editText.findViewById(R.id.activity_main); // You must use the layout root
//        InputMethodManager im = (InputMethodManager) editText.getContext().getSystemService(Service.INPUT_METHOD_SERVICE);
//        SoftKeyboard softKeyboard;
//
//        softKeyboard = new SoftKeyboard(mainLayout, im);
////        softKeyboard.setSoftKeyboardCallback(new SoftKeyboard.SoftKeyboardChanged() {
////
////            @Override
////            public void onSoftKeyboardHide() {
////                editText.invalidate();
////                // Code here
////            }
////
////            @Override
////            public void onSoftKeyboardShow() {
////                editText.invalidate();
////                // Code here
////            }
////        });
//
//
//
////        editText.addTextChangedListener(Mask.insert(mask, editText));
//    }




    /* Prevent memory leaks:
    */
    @Override
    public void onDestroy()
    {
        super.onDestroy();
//        softKeyboard.unRegisterSoftKeyboardCallback();
    }

}
