package com.example.friendsdiary;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class User_Create extends AppCompatActivity {

    EditText et_user_name;
    TextView btn_mbti[] = new TextView[16];
    int select_mbti_num = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_create);
        init();
        set_mbti_btn();
    }

    void init() {
        btn_mbti[0] = findViewById(R.id.btn_ENFP);
        btn_mbti[1] = findViewById(R.id.btn_ENFJ);
        btn_mbti[2] = findViewById(R.id.btn_ENTP);
        btn_mbti[3] = findViewById(R.id.btn_ENTJ);
        btn_mbti[4] = findViewById(R.id.btn_ESFP);
        btn_mbti[5] = findViewById(R.id.btn_ESFJ);
        btn_mbti[6] = findViewById(R.id.btn_ESTJ);
        btn_mbti[7] = findViewById(R.id.btn_ESTP);
        btn_mbti[8] = findViewById(R.id.btn_INFP);
        btn_mbti[9] = findViewById(R.id.btn_INFJ);
        btn_mbti[10] = findViewById(R.id.btn_INTP);
        btn_mbti[11] = findViewById(R.id.btn_INTJ);
        btn_mbti[12] = findViewById(R.id.btn_ISFP);
        btn_mbti[13] = findViewById(R.id.btn_ISFJ);
        btn_mbti[14] = findViewById(R.id.btn_ISTJ);
        btn_mbti[15] = findViewById(R.id.btn_ISTP);
    }
    void set_mbti_btn() {
        for (int i = 0; i < btn_mbti.length; i++) {
            int finalI = i;
            btn_mbti[finalI].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    reset_mbti(select_mbti_num);
                    select_mbti(finalI);
                    select_mbti_num = finalI;
                }
            });
        }
    }

    void select_mbti(int jimin) {
        if((jimin >= 0 && jimin <= 1) || (jimin >= 8 && jimin <= 9)) {
            btn_mbti[jimin].setBackgroundColor(this.getResources().getColor(R.color.mbti_nf_back));
            btn_mbti[jimin].setTextColor(this.getResources().getColor(R.color.mbti_nf_text));
        } else if((jimin >= 2 && jimin <= 3) || (jimin >= 10 && jimin <= 11)) {
            btn_mbti[jimin].setBackgroundColor(this.getResources().getColor(R.color.mbti_nt_back));
            btn_mbti[jimin].setTextColor(this.getResources().getColor(R.color.mbti_nt_text));
        } else if((jimin >= 5 && jimin <= 6) || (jimin >= 13 && jimin <= 14)) {
            btn_mbti[jimin].setBackgroundColor(this.getResources().getColor(R.color.mbti_sj_back));
            btn_mbti[jimin].setTextColor(this.getResources().getColor(R.color.mbti_sj_text));
        } else {
            btn_mbti[jimin].setBackgroundColor(this.getResources().getColor(R.color.mbti_sp_back));
            btn_mbti[jimin].setTextColor(this.getResources().getColor(R.color.mbti_sp_text));
        }
    }

    void reset_mbti(int seojun) {
        btn_mbti[seojun].setBackgroundColor(this.getResources().getColor(R.color.mbti_default_back));
        btn_mbti[seojun].setTextColor(this.getResources().getColor(R.color.mbti_default_text));
    }
}

