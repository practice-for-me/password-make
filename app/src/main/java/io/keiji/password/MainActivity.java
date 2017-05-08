package io.keiji.password;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Random;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        //ボタンのインスタンス化
        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);
        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button8 = (Button) findViewById(R.id.button8);
        final Button button9 = (Button) findViewById(R.id.button9);
        final Button button10 = (Button) findViewById(R.id.button10);
        final Button delete_b = (Button) findViewById(R.id.del_b);


        button1.setAllCaps(false);
        button2.setAllCaps(false);
        button3.setAllCaps(false);
        button4.setAllCaps(false);
        button5.setAllCaps(false);
        button6.setAllCaps(false);
        button7.setAllCaps(false);
        button8.setAllCaps(false);
        button9.setAllCaps(false);
        button10.setAllCaps(false);

        //SharePreferencesに保存されたデータの呼び出し
        SharedPreferences data1 = getSharedPreferences("account1", Context.MODE_PRIVATE);
        //keyがaccuontの保存データを読み出し代入
        String string1 = data1.getString("account1", "Nothing");
        button1.setText(string1);

        //SharePreferencesに保存されたデータの呼び出し
        SharedPreferences data2 = getSharedPreferences("account2", Context.MODE_PRIVATE);
        //keyがaccuontの保存データを読み出し代入
        String string2 = data2.getString("account2", "Nothing");
        button2.setText(string2);

        //SharePreferencesに保存されたデータの呼び出し
        SharedPreferences data3 = getSharedPreferences("account3", Context.MODE_PRIVATE);
        //keyがaccuontの保存データを読み出し代入
        String string3 = data3.getString("account3", "Nothing");
        button3.setText(string3);

        //SharePreferencesに保存されたデータの呼び出し
        SharedPreferences data4 = getSharedPreferences("account4", Context.MODE_PRIVATE);
        //keyがaccuontの保存データを読み出し代入
        String string4 = data4.getString("account4", "Nothing");
        button4.setText(string4);

        //SharePreferencesに保存されたデータの呼び出し
        SharedPreferences data5 = getSharedPreferences("account5", Context.MODE_PRIVATE);
        //keyがaccuontの保存データを読み出し代入
        String string5 = data5.getString("account5", "Nothing");
        button5.setText(string5);

        //SharePreferencesに保存されたデータの呼び出し
        SharedPreferences data6 = getSharedPreferences("account6", Context.MODE_PRIVATE);
        //keyがaccuontの保存データを読み出し代入
        String string6 = data6.getString("account6", "Nothing");
        button6.setText(string6);

        //SharePreferencesに保存されたデータの呼び出し
        SharedPreferences data7 = getSharedPreferences("account7", Context.MODE_PRIVATE);
        //keyがaccuontの保存データを読み出し代入
        String string7 = data7.getString("account7", "Nothing");
        button7.setText(string7);

        //SharePreferencesに保存されたデータの呼び出し
        SharedPreferences data8 = getSharedPreferences("account8", Context.MODE_PRIVATE);
        //keyがaccuontの保存データを読み出し代入
        String string8 = data8.getString("account8", "Nothing");
        button8.setText(string8);

        //SharePreferencesに保存されたデータの呼び出し
        SharedPreferences data9 = getSharedPreferences("account9", Context.MODE_PRIVATE);
        //keyがaccuontの保存データを読み出し代入
        String string9 = data9.getString("account9", "Nothing");
        button9.setText(string9);

        //SharePreferencesに保存されたデータの呼び出し
        SharedPreferences data10 = getSharedPreferences("account10", Context.MODE_PRIVATE);
        //keyがaccuontの保存データを読み出し代入
        String string10 = data10.getString("account10", "Nothing");
        button10.setText(string10);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //SharePreferencesに保存されたaccount名の呼び出し
                SharedPreferences acc_data = getSharedPreferences("account1", Context.MODE_PRIVATE);
                //keyがaccuntの保存データを読み出し代入
                String acc_str = acc_data.getString("account1", "Nothing");

                //SharePreferencesに保存されたパスワードの呼び出し
                SharedPreferences pass_data = getSharedPreferences("pass1", Context.MODE_PRIVATE);
                //keyがpassの保存データを読み出し代入
                String pass_str = pass_data.getString("pass1", "Nothing");
                //トーストの表示

                button1.setText(acc_str);

                if (acc_str.equals("Nothing")) {
                    //subActivityを呼び出すIntentを生成
                    Intent intent = new Intent(MainActivity.this, SubActivity.class);
                    intent.putExtra("check", 1);
                    startActivity(intent);

                } else {
                    Context context = getApplicationContext();
                    CharSequence text = pass_str;
                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //SharePreferencesに保存されたaccount名の呼び出し
                SharedPreferences acc_data = getSharedPreferences("account2", Context.MODE_PRIVATE);
                //keyがaccuntの保存データを読み出し代入
                String acc_str = acc_data.getString("account2", "Nothing");

                //SharePreferencesに保存されたパスワードの呼び出し
                SharedPreferences pass_data = getSharedPreferences("pass2", Context.MODE_PRIVATE);
                //keyがpassの保存データを読み出し代入
                String pass_str = pass_data.getString("pass2", "Nothing");
                //トーストの表示

                button2.setText(acc_str);

                if (acc_str.equals("Nothing")) {
                    //subActivityを呼び出すIntentを生成
                    Intent intent = new Intent(MainActivity.this, SubActivity.class);
                    intent.putExtra("check", 2);
                    startActivity(intent);

                } else {
                    Context context = getApplicationContext();
                    CharSequence text = pass_str;
                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //SharePreferencesに保存されたaccount名の呼び出し
                SharedPreferences acc_data = getSharedPreferences("account3", Context.MODE_PRIVATE);
                //keyがaccuntの保存データを読み出し代入
                String acc_str = acc_data.getString("account3", "Nothing");

                //SharePreferencesに保存されたパスワードの呼び出し
                SharedPreferences pass_data = getSharedPreferences("pass3", Context.MODE_PRIVATE);
                //keyがpassの保存データを読み出し代入
                String pass_str = pass_data.getString("pass3", "Nothing");
                //トーストの表示

                button3.setText(acc_str);

                if (acc_str.equals("Nothing")) {
                    //subActivityを呼び出すIntentを生成
                    Intent intent = new Intent(MainActivity.this, SubActivity.class);
                    intent.putExtra("check", 3);
                    startActivity(intent);

                } else {
                    Context context = getApplicationContext();
                    CharSequence text = pass_str;
                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //SharePreferencesに保存されたaccount名の呼び出し
                SharedPreferences acc_data = getSharedPreferences("account4", Context.MODE_PRIVATE);
                //keyがaccuntの保存データを読み出し代入
                String acc_str = acc_data.getString("account4", "Nothing");

                //SharePreferencesに保存されたパスワードの呼び出し
                SharedPreferences pass_data = getSharedPreferences("pass4", Context.MODE_PRIVATE);
                //keyがpassの保存データを読み出し代入
                String pass_str = pass_data.getString("pass4", "Nothing");
                //トーストの表示

                button4.setText(acc_str);

                if (acc_str.equals("Nothing")) {
                    //subActivityを呼び出すIntentを生成
                    Intent intent = new Intent(MainActivity.this, SubActivity.class);
                    intent.putExtra("check", 4);
                    startActivity(intent);

                } else {
                    Context context = getApplicationContext();
                    CharSequence text = pass_str;
                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //SharePreferencesに保存されたaccount名の呼び出し
                SharedPreferences acc_data = getSharedPreferences("account5", Context.MODE_PRIVATE);
                //keyがaccuntの保存データを読み出し代入
                String acc_str = acc_data.getString("account5", "Nothing");

                //SharePreferencesに保存されたパスワードの呼び出し
                SharedPreferences pass_data = getSharedPreferences("pass5", Context.MODE_PRIVATE);
                //keyがpassの保存データを読み出し代入
                String pass_str = pass_data.getString("pass5", "Nothing");
                //トーストの表示

                button5.setText(acc_str);

                if (acc_str.equals("Nothing")) {
                    //subActivityを呼び出すIntentを生成
                    Intent intent = new Intent(MainActivity.this, SubActivity.class);
                    intent.putExtra("check", 5);
                    startActivity(intent);

                } else {
                    Context context = getApplicationContext();
                    CharSequence text = pass_str;
                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //SharePreferencesに保存されたaccount名の呼び出し
                SharedPreferences acc_data = getSharedPreferences("account6", Context.MODE_PRIVATE);
                //keyがaccuntの保存データを読み出し代入
                String acc_str = acc_data.getString("account6", "Nothing");

                //SharePreferencesに保存されたパスワードの呼び出し
                SharedPreferences pass_data = getSharedPreferences("pass6", Context.MODE_PRIVATE);
                //keyがpassの保存データを読み出し代入
                String pass_str = pass_data.getString("pass6", "Nothing");
                //トーストの表示

                button6.setText(acc_str);

                if (acc_str.equals("Nothing")) {
                    //subActivityを呼び出すIntentを生成
                    Intent intent = new Intent(MainActivity.this, SubActivity.class);
                    intent.putExtra("check", 6);
                    startActivity(intent);

                } else {
                    Context context = getApplicationContext();
                    CharSequence text = pass_str;
                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //SharePreferencesに保存されたaccount名の呼び出し
                SharedPreferences acc_data = getSharedPreferences("account7", Context.MODE_PRIVATE);
                //keyがaccuntの保存データを読み出し代入
                String acc_str = acc_data.getString("account7", "Nothing");

                //SharePreferencesに保存されたパスワードの呼び出し
                SharedPreferences pass_data = getSharedPreferences("pass7", Context.MODE_PRIVATE);
                //keyがpassの保存データを読み出し代入
                String pass_str = pass_data.getString("pass7", "Nothing");
                //トーストの表示

                button7.setText(acc_str);

                if (acc_str.equals("Nothing")) {
                    //subActivityを呼び出すIntentを生成
                    Intent intent = new Intent(MainActivity.this, SubActivity.class);
                    intent.putExtra("check", 7);
                    startActivity(intent);

                } else {
                    Context context = getApplicationContext();
                    CharSequence text = pass_str;
                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //SharePreferencesに保存されたaccount名の呼び出し
                SharedPreferences acc_data = getSharedPreferences("account8", Context.MODE_PRIVATE);
                //keyがaccuntの保存データを読み出し代入
                String acc_str = acc_data.getString("account8", "Nothing");

                //SharePreferencesに保存されたパスワードの呼び出し
                SharedPreferences pass_data = getSharedPreferences("pass8", Context.MODE_PRIVATE);
                //keyがpassの保存データを読み出し代入
                String pass_str = pass_data.getString("pass8", "Nothing");
                //トーストの表示

                button8.setText(acc_str);

                if (acc_str.equals("Nothing")) {
                    //subActivityを呼び出すIntentを生成
                    Intent intent = new Intent(MainActivity.this, SubActivity.class);
                    intent.putExtra("check", 8);
                    startActivity(intent);

                } else {
                    Context context = getApplicationContext();
                    CharSequence text = pass_str;
                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });



        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //SharePreferencesに保存されたaccount名の呼び出し
                SharedPreferences acc_data = getSharedPreferences("account9", Context.MODE_PRIVATE);
                //keyがaccuntの保存データを読み出し代入
                String acc_str = acc_data.getString("account9", "Nothing");

                //SharePreferencesに保存されたパスワードの呼び出し
                SharedPreferences pass_data = getSharedPreferences("pass9", Context.MODE_PRIVATE);
                //keyがpassの保存データを読み出し代入
                String pass_str = pass_data.getString("pass9", "Nothing");
                //トーストの表示

                button9.setText(acc_str);

                if (acc_str.equals("Nothing")) {
                    //subActivityを呼び出すIntentを生成
                    Intent intent = new Intent(MainActivity.this, SubActivity.class);
                    intent.putExtra("check", 9);
                    startActivity(intent);

                } else {
                    Context context = getApplicationContext();
                    CharSequence text = pass_str;
                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //SharePreferencesに保存されたaccount名の呼び出し
                SharedPreferences acc_data = getSharedPreferences("account10", Context.MODE_PRIVATE);
                //keyがaccuntの保存データを読み出し代入
                String acc_str = acc_data.getString("account10", "Nothing");

                //SharePreferencesに保存されたパスワードの呼び出し
                SharedPreferences pass_data = getSharedPreferences("pass10", Context.MODE_PRIVATE);
                //keyがpassの保存データを読み出し代入
                String pass_str = pass_data.getString("pass10", "Nothing");
                //トーストの表示

                button10.setText(acc_str);

                if (acc_str.equals("Nothing")) {
                    //subActivityを呼び出すIntentを生成
                    Intent intent = new Intent(MainActivity.this, SubActivity.class);
                    intent.putExtra("check", 10);
                    startActivity(intent);

                } else {
                    Context context = getApplicationContext();
                    CharSequence text = pass_str;
                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        delete_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

    }
}


