package com.example.mainactivityactionbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

public class MainActivityActionBar extends AppCompatActivity {








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_action_bar);


        ActionBar actionBar = getSupportActionBar();


        assert actionBar != null;
        actionBar.setTitle(" GfG | Action Bar");


        actionBar.setSubtitle(" Design a custom Action Bar");


        actionBar.setIcon(R.mipmap.ic_launcher);


        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

    }


    @Override
    public boolean onCreateOptionsMenu( Menu menu ) {

        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected( @NonNull MenuItem item ) {
        switch (item.getItemId()){
            case R.id.search:
                showAlertDialog();
                break;
            case R.id.refresh:
                DialogFragment dialogFragment=new DialogFragment();
                dialogFragment.show(getSupportFragmentManager(), "My Fragment");
                break;
            case R.id.copy:
                Toast.makeText(this, "Copy Clicked", Toast.LENGTH_SHORT).show();
                break;

        }
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Alert!")
                    .setMessage("Danger you are failing!");
            builder.setPositiveButton("I know!", (dialog, which) -> {

            });

            AlertDialog dialog = builder.create();
            dialog.show();
        }
        return false;
    }

    private void showAlertDialog() {

    }
    }
