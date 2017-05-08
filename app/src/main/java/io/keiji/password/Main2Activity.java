package io.keiji.password;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button button1 = (Button) findViewById(R.id.button11);
        final Button button2 = (Button) findViewById(R.id.button12);
        final Button button3 = (Button) findViewById(R.id.button13);
        final Button button4 = (Button) findViewById(R.id.button14);
        final Button button5 = (Button) findViewById(R.id.button15);
        final Button button6 = (Button) findViewById(R.id.button16);
        final Button button7 = (Button) findViewById(R.id.button17);
        final Button button8 = (Button) findViewById(R.id.button18);
        final Button button9 = (Button) findViewById(R.id.button19);
        final Button button10 = (Button) findViewById(R.id.button20);

        //保存されたデータの呼び出しと書き込み
        callsharepreference();


        Button ok_b = (Button) findViewById(R.id.ok_b3);
        ok_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteCheck(1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteCheck(2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteCheck(3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteCheck(4);


            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteCheck(5);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteCheck(6);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteCheck(7);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteCheck(8);
            }
        });



        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteCheck(9);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteCheck(10);
            }
        });

    }

    private void deleteCheck(int i){
        final Button button1 = (Button) findViewById(R.id.button11);
        final Button button2 = (Button) findViewById(R.id.button12);
        final Button button3 = (Button) findViewById(R.id.button13);
        final Button button4 = (Button) findViewById(R.id.button14);
        final Button button5 = (Button) findViewById(R.id.button15);
        final Button button6 = (Button) findViewById(R.id.button16);
        final Button button7 = (Button) findViewById(R.id.button17);
        final Button button8 = (Button) findViewById(R.id.button18);
        final Button button9 = (Button) findViewById(R.id.button19);
        final Button button10 = (Button) findViewById(R.id.button20);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        final int j = i;
        // AlertDialogのタイトル設定します
        alertDialogBuilder.setTitle("削除");
        // AlertDialogのメッセージ設定
        alertDialogBuilder.setMessage("本当に削除しますか？");
        // AlertDialogのYesボタンのコールバックリスナーを登録
        alertDialogBuilder.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Context context = getApplicationContext();
                        CharSequence text = "削除しました";
                        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);

                        if (j == 1){
                            //SharePreferencesに保存されたaccount名の呼び出し
                            SharedPreferences acc_data = getSharedPreferences("account1", Context.MODE_PRIVATE);
                            SharedPreferences.Editor edit_a = acc_data.edit();
                            edit_a.remove("account1");
                            edit_a.commit();

                            //SharePreferencesに保存されたパスワードの呼び出し
                            SharedPreferences pass_data = getSharedPreferences("pass1", Context.MODE_PRIVATE);
                            SharedPreferences.Editor edit_p = pass_data.edit();
                            edit_p.remove(("pass1"));
                            edit_p.commit();

                            toast.show();

                            button1.setText("Nothing");
                        }else if(j == 2){
                            //SharePreferencesに保存されたaccount名の呼び出し
                            SharedPreferences acc_data = getSharedPreferences("account2", Context.MODE_PRIVATE);
                            SharedPreferences.Editor edit_a = acc_data.edit();
                            edit_a.remove("account2");
                            edit_a.commit();

                            //SharePreferencesに保存されたパスワードの呼び出し
                            SharedPreferences pass_data = getSharedPreferences("pass2", Context.MODE_PRIVATE);
                            SharedPreferences.Editor edit_p = pass_data.edit();
                            edit_p.remove(("pass2"));
                            edit_p.commit();

                            toast.show();

                            button2.setText("Nothing");
                        }else if(j == 3){
                            //SharePreferencesに保存されたaccount名の呼び出し
                            SharedPreferences acc_data = getSharedPreferences("account3", Context.MODE_PRIVATE);
                            SharedPreferences.Editor edit_a = acc_data.edit();
                            edit_a.remove("account3");
                            edit_a.commit();

                            //SharePreferencesに保存されたパスワードの呼び出し
                            SharedPreferences pass_data = getSharedPreferences("pass3", Context.MODE_PRIVATE);
                            SharedPreferences.Editor edit_p = pass_data.edit();
                            edit_p.remove(("pass3"));
                            edit_p.commit();

                            toast.show();

                            button3.setText("Nothing");
                        }else if(j == 4){
                            //SharePreferencesに保存されたaccount名の呼び出し
                            SharedPreferences acc_data = getSharedPreferences("account4", Context.MODE_PRIVATE);
                            SharedPreferences.Editor edit_a = acc_data.edit();
                            edit_a.remove("account4");
                            edit_a.commit();

                            //SharePreferencesに保存されたパスワードの呼び出し
                            SharedPreferences pass_data = getSharedPreferences("pass4", Context.MODE_PRIVATE);
                            SharedPreferences.Editor edit_p = pass_data.edit();
                            edit_p.remove(("pass4"));
                            edit_p.commit();

                            toast.show();

                            button4.setText("Nothing");
                        }else if(j == 5){
                            //SharePreferencesに保存されたaccount名の呼び出し
                            SharedPreferences acc_data = getSharedPreferences("account5", Context.MODE_PRIVATE);
                            SharedPreferences.Editor edit_a = acc_data.edit();
                            edit_a.remove("account5");
                            edit_a.commit();

                            //SharePreferencesに保存されたパスワードの呼び出し
                            SharedPreferences pass_data = getSharedPreferences("pass5", Context.MODE_PRIVATE);
                            SharedPreferences.Editor edit_p = pass_data.edit();
                            edit_p.remove(("pass5"));
                            edit_p.commit();

                            toast.show();

                            button5.setText("Nothing");
                        }else if(j == 6){
                            //SharePreferencesに保存されたaccount名の呼び出し
                            SharedPreferences acc_data = getSharedPreferences("account6", Context.MODE_PRIVATE);
                            SharedPreferences.Editor edit_a = acc_data.edit();
                            edit_a.remove("account6");
                            edit_a.commit();

                            //SharePreferencesに保存されたパスワードの呼び出し
                            SharedPreferences pass_data = getSharedPreferences("pass6", Context.MODE_PRIVATE);
                            SharedPreferences.Editor edit_p = pass_data.edit();
                            edit_p.remove(("pass6"));
                            edit_p.commit();

                            toast.show();

                            button6.setText("Nothing");
                        }else if(j == 7){
                            //SharePreferencesに保存されたaccount名の呼び出し
                            SharedPreferences acc_data = getSharedPreferences("account7", Context.MODE_PRIVATE);
                            SharedPreferences.Editor edit_a = acc_data.edit();
                            edit_a.remove("account7");
                            edit_a.commit();

                            //SharePreferencesに保存されたパスワードの呼び出し
                            SharedPreferences pass_data = getSharedPreferences("pass7", Context.MODE_PRIVATE);
                            SharedPreferences.Editor edit_p = pass_data.edit();
                            edit_p.remove(("pass7"));
                            edit_p.commit();

                            toast.show();

                            button7.setText("Nothing");
                        }else if(j == 8){
                            //SharePreferencesに保存されたaccount名の呼び出し
                            SharedPreferences acc_data = getSharedPreferences("account8", Context.MODE_PRIVATE);
                            SharedPreferences.Editor edit_a = acc_data.edit();
                            edit_a.remove("account8");
                            edit_a.commit();

                            //SharePreferencesに保存されたパスワードの呼び出し
                            SharedPreferences pass_data = getSharedPreferences("pass8", Context.MODE_PRIVATE);
                            SharedPreferences.Editor edit_p = pass_data.edit();
                            edit_p.remove(("pass8"));
                            edit_p.commit();

                            toast.show();

                            button8.setText("Nothing");
                        }else if(j == 9){
                            //SharePreferencesに保存されたaccount名の呼び出し
                            SharedPreferences acc_data = getSharedPreferences("account9", Context.MODE_PRIVATE);
                            SharedPreferences.Editor edit_a = acc_data.edit();
                            edit_a.remove("account9");
                            edit_a.commit();

                            //SharePreferencesに保存されたパスワードの呼び出し
                            SharedPreferences pass_data = getSharedPreferences("pass9", Context.MODE_PRIVATE);
                            SharedPreferences.Editor edit_p = pass_data.edit();
                            edit_p.remove(("pass9"));
                            edit_p.commit();

                            toast.show();

                            button9.setText("Nothing");
                        }else if(j == 10){
                            //SharePreferencesに保存されたaccount名の呼び出し
                            SharedPreferences acc_data = getSharedPreferences("account10", Context.MODE_PRIVATE);
                            SharedPreferences.Editor edit_a = acc_data.edit();
                            edit_a.remove("account10");
                            edit_a.commit();

                            //SharePreferencesに保存されたパスワードの呼び出し
                            SharedPreferences pass_data = getSharedPreferences("pass10", Context.MODE_PRIVATE);
                            SharedPreferences.Editor edit_p = pass_data.edit();
                            edit_p.remove(("pass10"));
                            edit_p.commit();

                            toast.show();

                            button10.setText("Nothing");
                        }



                    }
                });
        // AlertDialogのNoボタンのコールバックリスナーを登録
    alertDialogBuilder.setNeutralButton("No",
            new DialogInterface.OnClickListener()

    {
        @Override
        public void onClick (DialogInterface dialog,int which){
        finish();
                    }
                });
    // AlertDialogのキャンセルができるように設定
        alertDialogBuilder.setCancelable(true);

        AlertDialog alertDialog = alertDialogBuilder.create();
        // AlertDialogの表示
        alertDialog.show();
    }

    public void callsharepreference(){
        final Button button1 = (Button) findViewById(R.id.button11);
        final Button button2 = (Button) findViewById(R.id.button12);
        final Button button3 = (Button) findViewById(R.id.button13);
        final Button button4 = (Button) findViewById(R.id.button14);
        final Button button5 = (Button) findViewById(R.id.button15);
        final Button button6 = (Button) findViewById(R.id.button16);
        final Button button7 = (Button) findViewById(R.id.button17);
        final Button button8 = (Button) findViewById(R.id.button18);
        final Button button9 = (Button) findViewById(R.id.button19);
        final Button button10 = (Button) findViewById(R.id.button20);

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
    }


}