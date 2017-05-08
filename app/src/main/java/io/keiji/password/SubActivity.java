package io.keiji.password;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        //ボタンを操作するインスタンスを生成
        Button button1 = (Button) findViewById(R.id.not_b);
        Button button2 = (Button) findViewById(R.id.ok_b1);
        Button button3 = (Button) findViewById(R.id.acc_b);
        Button button4 = (Button) findViewById(R.id.ok_b2);


        //パスワード選び直すボタンの操作 (not_b)
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = password();
                TextView pass_view = (TextView) findViewById(R.id.pass_View);
                pass_view.setText(str);

                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                }
            }
        });

        //画面を切り替えるボタン（ok_b1）
        button2.setOnClickListener(new View.OnClickListener() {
            Intent intent = getIntent();
            int i = intent.getIntExtra("check",0);
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        //account名を取得するボタン(acc_b)
        button3.setOnClickListener(new View.OnClickListener(){
            Intent intent = getIntent();
            int i = intent.getIntExtra("check", 0);
            @Override
            public void onClick(View v){
                //アカウント名を取得
                EditText textView1 = (EditText) findViewById(R.id.acc_edit);
                String account = textView1.getText().toString();

                switch (i){
                    case 1:
                    //アカウント名を記憶
                        SharedPreferences a_data1 = getSharedPreferences("account1",Context.MODE_PRIVATE);
                        SharedPreferences.Editor a_editor1 = a_data1.edit();
                        a_editor1.putString("account1", account);
                        a_editor1.commit();
                        break;
                    case 2:
                        SharedPreferences a_data2 = getSharedPreferences("account2",Context.MODE_PRIVATE);
                        SharedPreferences.Editor a_editor2 = a_data2.edit();
                        a_editor2.putString("account2", account);
                        a_editor2.commit();
                        break;
                    case 3:
                        //アカウント名を記憶
                        SharedPreferences a_data3 = getSharedPreferences("account3",Context.MODE_PRIVATE);
                        SharedPreferences.Editor a_editor3 = a_data3.edit();
                        a_editor3.putString("account3", account);
                        a_editor3.commit();
                        break;
                    case 4:
                        SharedPreferences a_data4 = getSharedPreferences("account4",Context.MODE_PRIVATE);
                        SharedPreferences.Editor a_editor4 = a_data4.edit();
                        a_editor4.putString("account4", account);
                        a_editor4.commit();
                        break;
                    case 5:
                        SharedPreferences a_data5 = getSharedPreferences("account5",Context.MODE_PRIVATE);
                        SharedPreferences.Editor a_editor5 = a_data5.edit();
                        a_editor5.putString("account5", account);
                        a_editor5.commit();
                        break;
                    case 6:
                        //アカウント名を記憶
                        SharedPreferences a_data6 = getSharedPreferences("account6",Context.MODE_PRIVATE);
                        SharedPreferences.Editor a_editor6 = a_data6.edit();
                        a_editor6.putString("account6", account);
                        a_editor6.commit();
                        break;
                    case 7:
                        SharedPreferences a_data7 = getSharedPreferences("account7",Context.MODE_PRIVATE);
                        SharedPreferences.Editor a_editor7 = a_data7.edit();
                        a_editor7.putString("account7", account);
                        a_editor7.commit();
                        break;
                    case 8:
                        SharedPreferences a_data8 = getSharedPreferences("account8",Context.MODE_PRIVATE);
                        SharedPreferences.Editor a_editor8 = a_data8.edit();
                        a_editor8.putString("account8", account);
                        a_editor8.commit();
                        break;
                    case 9:
                        SharedPreferences a_data9 = getSharedPreferences("account9",Context.MODE_PRIVATE);
                        SharedPreferences.Editor a_editor9 = a_data9.edit();
                        a_editor9.putString("account9", account);
                        a_editor9.commit();
                        break;
                    case 10:
                        //アカウント名を記憶
                        SharedPreferences a_data10 = getSharedPreferences("account10",Context.MODE_PRIVATE);
                        SharedPreferences.Editor a_editor10 = a_data10.edit();
                        a_editor10.putString("account10", account);
                        a_editor10.commit();
                        break;


                }

                Context context = getApplicationContext();
                CharSequence text = "id名を保存しました";
                Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                toast.show();

            }
        });

        //パスワードを取得するボタン (ok_b2)
        button4.setOnClickListener(new View.OnClickListener(){
            Intent intent = getIntent();
            int i = intent.getIntExtra("check",0);
            @Override
            public void onClick(View v){
                //パスワードを取得
                TextView pass_view = (TextView) findViewById(R.id.pass_View);
                String pass = pass_view.getText().toString();

                switch (i){
                    //パスワードを記憶
                    case 1:
                        SharedPreferences pass_data1 = getSharedPreferences("pass1", Context.MODE_PRIVATE);
                        SharedPreferences.Editor pass_editor1 = pass_data1.edit();
                        pass_editor1.putString("pass1", pass);
                        pass_editor1.commit();
                        break;
                    case 2:
                        SharedPreferences pass_data2 = getSharedPreferences("pass2", Context.MODE_PRIVATE);
                        SharedPreferences.Editor pass_editor2 = pass_data2.edit();
                        pass_editor2.putString("pass2", pass);
                        pass_editor2.commit();
                        break;
                    case 3:
                        SharedPreferences pass_data3 = getSharedPreferences("pass3", Context.MODE_PRIVATE);
                        SharedPreferences.Editor pass_editor3 = pass_data3.edit();
                        pass_editor3.putString("pass3", pass);
                        pass_editor3.commit();
                        break;
                    case 4:
                        SharedPreferences pass_data4 = getSharedPreferences("pass4", Context.MODE_PRIVATE);
                        SharedPreferences.Editor pass_editor4 = pass_data4.edit();
                        pass_editor4.putString("pass4", pass);
                        pass_editor4.commit();
                        break;
                    case 5:
                        SharedPreferences pass_data5 = getSharedPreferences("pass5", Context.MODE_PRIVATE);
                        SharedPreferences.Editor pass_editor5 = pass_data5.edit();
                        pass_editor5.putString("pass5", pass);
                        pass_editor5.commit();
                        break;
                    case 6:
                        SharedPreferences pass_data6 = getSharedPreferences("pass6", Context.MODE_PRIVATE);
                        SharedPreferences.Editor pass_editor6 = pass_data6.edit();
                        pass_editor6.putString("pass6", pass);
                        pass_editor6.commit();
                        break;
                    case 7:
                        SharedPreferences pass_data7 = getSharedPreferences("pass7", Context.MODE_PRIVATE);
                        SharedPreferences.Editor pass_editor7 = pass_data7.edit();
                        pass_editor7.putString("pass7", pass);
                        pass_editor7.commit();
                        break;
                    case 8:
                        SharedPreferences pass_data8 = getSharedPreferences("pass8", Context.MODE_PRIVATE);
                        SharedPreferences.Editor pass_editor8 = pass_data8.edit();
                        pass_editor8.putString("pass8", pass);
                        pass_editor8.commit();
                        break;
                    case 9:
                        SharedPreferences pass_data9 = getSharedPreferences("pass9", Context.MODE_PRIVATE);
                        SharedPreferences.Editor pass_editor9 = pass_data9.edit();
                        pass_editor9.putString("pass9", pass);
                        pass_editor9.commit();
                        break;

                    case 10:
                        SharedPreferences pass_data10 = getSharedPreferences("pass10", Context.MODE_PRIVATE);
                        SharedPreferences.Editor pass_editor10 = pass_data10.edit();
                        pass_editor10.putString("pass10", pass);
                        pass_editor10.commit();
                        break;

                }
                Context context = getApplicationContext();
                CharSequence text = "パスワードを保存しました";
                Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                toast.show();

            }
        });


    }

    //パスワード自動生成関数
    public String password(){
        char pas[] = {'A','B','C','D','E','F','G','H','I','J','K','M','N','L','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e',
                'f','g','h','i','j','k','m','n','l','o','p','q','r','s','t','u','v','w','y','z','0','1','2','3','4','5','6','7','8','9'};
        StringBuilder str = new StringBuilder();


        for(int i = 0; i < 8;i++){
            Random r = new Random();
            int j = r.nextInt(62);

            str.append(pas[j]);

        }
        String p;
        p = new String(str);

        return p;
    }
}
