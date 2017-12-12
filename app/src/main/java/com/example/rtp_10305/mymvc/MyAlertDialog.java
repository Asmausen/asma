package com.example.rtp_10305.mymvc;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import java.util.ConcurrentModificationException;

/**
 * Created by RTP-10305 on 12/12/2560.
 */

public class MyAlertDialog {

    private void NoChooseEveryThing(){

    }
    private AlertDialog.Builder objAlert;

    public void NoChoseEvervThing(Context context){
        objAlert = new AlertDialog.Builder(context);
        objAlert.setIcon(R.drawable.danger);
        objAlert.setTitle("Please chose Answer ?");
        objAlert.setMessage("please Choose Answer on Rabiobutton");
        objAlert.setCancelable(false);
        objAlert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }
    }   objAlert.show();
}
