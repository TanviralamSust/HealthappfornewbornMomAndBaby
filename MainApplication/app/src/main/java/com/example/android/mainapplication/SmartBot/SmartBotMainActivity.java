package com.example.android.mainapplication.SmartBot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.android.mainapplication.R;

import java.util.ArrayList;

public class SmartBotMainActivity extends AppCompatActivity {


    private ListView mListView;
    private Button mButtonSend;
    private EditText mEditTextMessage;
    private ImageView mImageView;
    private ChatMessageAdapter mAdapter;
    private int state = 0;
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart_bot_main);
        mListView = (ListView) findViewById(R.id.listView);
        mButtonSend = (Button) findViewById(R.id.btn_send);
        mEditTextMessage = (EditText) findViewById(R.id.et_message);
        mImageView = (ImageView) findViewById(R.id.iv_image);
        mAdapter = new ChatMessageAdapter(this, new ArrayList<ChatMessage>());
        mListView.setAdapter(mAdapter);

//code for sending the message
        mButtonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = mEditTextMessage.getText().toString();
                userInput(message);
                mEditTextMessage.setText("");
                mListView.setSelection(mAdapter.getCount() - 1);
            }
        });
    }

    private void userInput(String message){
        ChatMessage chatMessage = new ChatMessage(message, true, false);
        mAdapter.add(chatMessage);
        state++;
        questionSelect(state,message);

    }
    public void questionSelect(int states, String answer){
        states = state;
        answer= message;
        if (answer.equals("hi") & states==1){
            mimicOtherMessage("kono Q achhe tomar?");
        }
        else if(answer.equals("yes")& states==2){
            mimicOtherMessage("tomar symtom bolo");
        }
        else if(answer.equals("patla paykhana")& states==3){
            mimicOtherMessage("rokto ber hoy...???");
        }
        else if(answer.equals("yes")& states==4){
            mimicOtherMessage("shishur probably amashoy hoyechhe");
        }
        else if(answer.equals("no")& states==4){
            mimicOtherMessage("chokh boshhe gechhe?");
        }
        else if(answer.equals("yes")& states==5){
            mimicOtherMessage("bar bar bomi hochhe??");
        }
        else if(answer.equals("no")& states==5){
            mimicOtherMessage("bar bar bomi hochhe??");
        }
        else if(answer.equals("yes")& states==6){
            mimicOtherMessage("buker dud tene khete pare na??");
        }
        else if(answer.equals("no")& states==6){
            mimicOtherMessage("Shishur food poisoning hoyechhe");
        }
        else if(answer.equals("yes")& states==7){
            mimicOtherMessage("shishur probably direaea hoyeche");
        }
        else if(answer.equals("no")& states==7){
            mimicOtherMessage("Shishur food poisoning hoyechhe");
        }
        else{
            mimicOtherMessage("app close kore 1st theke try korun :)");
        }
    }

    private void mimicOtherMessage(String message) {

        ChatMessage chatMessage = new ChatMessage(message, false, false);
        mAdapter.add(chatMessage);
    }

    private void sendMessage() {
        ChatMessage chatMessage = new ChatMessage(null, true, true);
        mAdapter.add(chatMessage);

        mimicOtherMessage();
    }

    private void mimicOtherMessage() {
        ChatMessage chatMessage = new ChatMessage(null, false, true);
        mAdapter.add(chatMessage);
    }

}
