package com.parkingswap;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.parkingswap.R;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by jaskiratsingh on 10/22/16.
 */
public class user_info_activity extends AppCompatActivity {
    TextView Model;
    TextView Make;
    TextView Color;
    public static String file = "mydata.txt";
    FileOutputStream fOut;
    BufferedReader br;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_info_activity);
        Model = (TextView)findViewById(R.id.car_model);
        Make = (TextView)findViewById(R.id.car_make);
        Color = (TextView)findViewById(R.id.car_color);
        //mcontext = this;
        if (!fileExists(this,file)) {
            try {
                fOut = openFileOutput(file, MODE_WORLD_READABLE);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        else
        {
            try {
                ArrayList<String> line = new ArrayList<>();
                FileInputStream fin = openFileInput(file);
                br = new BufferedReader(new InputStreamReader(fin));
                for(int i = 0; i<3;i++)
                {
                    line.add(i,br.readLine());
                }
                if (line.get(0) == null)
                {
                    fOut = openFileOutput(file, MODE_WORLD_READABLE);
                }
                Model.setText(line.get(0).toString());
                Make.setText(line.get(1).toString());
                Color.setText(line.get(2).toString());
                br.close();



            }
            catch(Exception e){
            }
        }


    }
    boolean cancel = false;
    public void onModelClick(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final View view = this.getLayoutInflater().inflate(R.layout.model_fragment, null);
        builder.setView(view)
                // Add action buttons
                .setTitle("Enter model of your car")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                        EditText Enter_Model = (EditText) view.findViewById(R.id.edit_model);
                        Model.setText(Enter_Model.getText());


                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        cancel = true;
                    }
                })
        .show();

    }
    public void onMakeClick(View v) {
        //final TextView Make = (TextView)findViewById(R.id.car_make);
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final View view = this.getLayoutInflater().inflate(R.layout.make_fragment, null);
        builder.setView(view)
                // Add action buttons
                .setTitle("Enter make of your car")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                        EditText Enter_Make = (EditText) view.findViewById(R.id.edit_make);
                        Make.setText(Enter_Make.getText());
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        cancel = true;
                    }
                })
                .show();
    }

    public void onColorClick(View v) {
        //final TextView Color = (TextView) findViewById(R.id.car_color);
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final View view = this.getLayoutInflater().inflate(R.layout.color_fragment, null);
        builder.setView(view)
                // Add action buttons
                .setTitle("Enter color of your car")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                        EditText Enter_Color = (EditText)view.findViewById(R.id.edit_color);
                        Color.setText(Enter_Color.getText());
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        cancel = true;
                    }
                })
                .show();
    }
    public void Save(View v){
        try {
            fOut = openFileOutput(file, MODE_WORLD_READABLE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> line = new ArrayList<>();
        writeToFile(Model.getText().toString());
        writeToFile(Make.getText().toString());
        writeToFile(Color.getText().toString());
        FileInputStream fin = null;
        try {
            fin = openFileInput(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        br = new BufferedReader(new InputStreamReader(fin));
        try {
            for(int i = 0; i<3;i++)
            {
                line.add(i,br.readLine());
            }
            Model.setText(line.get(0).toString());
            Make.setText(line.get(1).toString());
            Color.setText(line.get(2).toString());
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void writeToFile(String data){
        try {
            fOut.write(data.getBytes());
            fOut.write("\n".getBytes());
            Toast.makeText(this,"file saved",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public boolean fileExists(Context context, String filename) {
        File file = context.getFileStreamPath(filename);
        if(file == null || !file.exists()) {
            return false;
        }
        return true;
    }
}
