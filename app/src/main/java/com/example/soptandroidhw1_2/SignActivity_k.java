//package com.example.soptandroidhw1_2;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class SignActivity_k extends AppCompatActivity {
//
//    private EditText editText1;
//    private EditText editText2;
//
//    private Button button1;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.sign_activity);
//
//
//        editText1 = (EditText) findViewById(R.id.editText1);
//        editText2 = (EditText) findViewById(R.id.editText2);
//
//        button1 = (Button) findViewById(R.id.button);
//        button1.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(View v){
//
//                Toast.makeText(getApplicationContext(), "가입완료를 축하합니다.", Toast.LENGTH_SHORT).show();
//
//                String email = editText1.getText().toString();
//                String password = editText2.getText().toString();
//
//                Intent intent = new Intent(SignActivity_k.this, MainActivity.class);
//
//                intent.putExtra("email", email);
//                intent.putExtra("password", password);
//
//                startActivity(intent);
//
//            }
//        });
//
//    }
//}
