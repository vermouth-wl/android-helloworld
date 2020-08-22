package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // 添加常量
    public static final String EXTRA_MESSAGE = "com.example.helloworld.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // 添加一个sendMeg()方法
    public void sendMsg(View view){

        // 实例化Intent对象, Intent是相互独立的两个组件（如两个Activity）之间提供运行时绑定功能的对象，标识执行某项操作的意图
        // 此处的Intent对象将用于启动另一个Activity, DisplayMessageActivity为第二个Activity
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editText = (EditText) findViewById(R.id.editText);

        String message = editText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);
    }
}
