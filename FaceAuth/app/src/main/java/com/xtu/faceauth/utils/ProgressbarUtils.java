package com.xtu.faceauth.utils;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by Administrator on 2016/5/14.
 */
public class ProgressbarUtils {

    private static ProgressDialog mProgressDialog;

    public static void showDialog(Context context,String msg){
        mProgressDialog = new ProgressDialog(context);
        mProgressDialog.setMessage(msg);
        mProgressDialog.setCancelable(false);
        mProgressDialog.show();
    }

    public static void hideDialog(){
        mProgressDialog.dismiss();
    }

}
