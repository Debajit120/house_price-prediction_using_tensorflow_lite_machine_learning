package com.example.houseprice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signup extends AppCompatActivity {

    Uri filepath;

    public FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mAuth=FirebaseAuth.getInstance();
    }
    public void ssignup(View view)
    {
        String email="deba123@gmail.com";
        String password="123456";

        mAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(signup.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information

                            FirebaseUser user = mAuth.getCurrentUser();
                            TextView t=findViewById(R.id.textView);
                            t.setText("hoiya gese bhai");

                        } else {

                            // If sign in fails, display a message to the user.

                            TextView t=findViewById(R.id.textView);
                            t.setText("hedarput baler motoni input des");
                            // ...
                        }

                        // ...
                    }
                });

        //   TextView tt=findViewById(R.id.textView);
     //   tt.setText("hedarput baler motoni input des");
      //  FirebaseDatabase db=FirebaseDatabase.getInstance();
      //  DatabaseReference root=db.getReference();
     //   EditText use=findViewById(R.id.emailtxt);
     ////   EditText pas=findViewById(R.id.passtxt);
     //   EditText cpas=findViewById(R.id.confirmtxt);
       // if(pas.getText().toString().equals(cpas.getText().toString()) && pas.getText().toString()!="")
      //  {



        }
      //  else
       // {
            //TextView t=findViewById(R.id.textView);
         //   t.setText("hedarput baler motoni input des");

      //  }

   // }
}