package com.example.android.mainapplication;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.NoConnectionError;
import com.android.volley.VolleyError;
import com.example.android.mainapplication.httprequest.HttpListener;
import com.example.android.mainapplication.httprequest.HttpRequest;
import com.example.android.mainapplication.httprequest.urls;

import org.json.JSONException;
import org.json.JSONObject;

public class Login_Activity extends AppCompatActivity implements HttpListener {
    private static final int REQUEST_LOGIN = 1212;
    private Button submit;
    private EditText emailField,passwordField;
    public static boolean isLoggedIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        findAllViews();
        initClickListener();
    }

    private void initClickListener() {
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String user = emailField.getText().toString();
                String pass = passwordField.getText().toString();
                if(!Register_Activity.isValidEmailAddress(user))
                {
                    final Dialog dialog = new Dialog(Login_Activity.this);
                    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                    dialog.setContentView(R.layout.dailogeerror_login);
                    dialog.findViewById(R.id.ok).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                    dialog.show();

                    return;
                }

                if(emailField.getText().toString().trim().equals("") || passwordField.getText().toString().trim().equals(""))
                {
                    final Dialog dialog = new Dialog(Login_Activity.this);
                    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                    dialog.setContentView(R.layout.dailogeone);
                    dialog.findViewById(R.id.ok).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                    dialog.show();
                    return;
                }//tag=login&user=tanviralam&pass=nihal
                HttpRequest request = new HttpRequest(urls.domainAddress+""+"?"+"tag=login"+"&user="+user+"&pass="+pass,REQUEST_LOGIN,Login_Activity.this);
                request.execute("post");

            }
        });
    }
    private void findAllViews()
    {
        submit = (Button) findViewById(R.id.login);
        emailField = (EditText) findViewById(R.id.email);
        passwordField = (EditText) findViewById(R.id.password);

    }
    @Override
    public void respond(String jsonRespond, int respondId, HttpRequest parent) {

        if(respondId == REQUEST_LOGIN)
        {
            try {
                JSONObject response = new JSONObject(jsonRespond);
                String isValidEmail = new JSONObject(jsonRespond).getString("status");
                Log.i("nihal","login =");
                if(isValidEmail.equals("ok"))
                {
                  //  SharedPreferences.Editor editor = getSharedPreferences(urls.pref_file_name,MODE_PRIVATE).edit();
                    //editor.putString("access_token",response.getJSONObject("jsonResponse").getJSONObject("response").getJSONObject("userData").getString("authToken"));
                    //editor.putString("user_id",response.getJSONObject("jsonResponse").getJSONObject("response").getJSONObject("userData").getString("userID"));
                    //editor.commit();
                    Intent intent = new Intent(Login_Activity.this,MainActivity.class);
                    startActivity(intent);

                }
                else
                {
                    final Dialog dialog = new Dialog(Login_Activity.this);
                    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                    dialog.setContentView(R.layout.dailogeerror);
                    dialog.findViewById(R.id.ok).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                    dialog.show();

                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void errorRespond(VolleyError e, int respondId, HttpRequest parent) {
        Log.i("tanvir","loginout =");
        if(e instanceof NoConnectionError)
        {
            Toast.makeText(Login_Activity.this,"No Connection",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(Login_Activity.this,"invalid",Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public Context getContext() {
        return Login_Activity.this;
    }
}
