package app.kali.mana.mana;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Intent i = new Intent("jackpal.androidterm.RUN_SCRIPT");
        i.addCategory(Intent.CATEGORY_DEFAULT);
        i.putExtra("jackpal.androidterm.iInitialCommand", "su\rbootkali\rmana");
        startActivity(i);
        finish();
    }
}