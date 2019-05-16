package edu.hzuapps.androidlabs.soft1714080902110;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class Soft1714080902110Activity extends AppCompatActivity {
//    双击退出参数
    public boolean isExit = false;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soft_1714080902110_activity);

//        布局控件获取
        Button start_game = findViewById(R.id.start_game);
        Button rank_list = findViewById(R.id.rank_list);
        Button country_list = findViewById(R.id.country_list);

//        实现各按钮跳转
        start_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start_game = new Intent (Soft1714080902110Activity.this, Game.class);
                startActivity(start_game);
            }
        });
        rank_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rank_list = new Intent(Soft1714080902110Activity.this, RankList.class);
                startActivity(rank_list);
            }
        });

        country_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent country_list = new Intent(Soft1714080902110Activity.this, CountryList.class);
                startActivity(country_list);
            }
        });
    }

//    返回键检测
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exit();
        }
        return false;
    }

//    双击退出功能实现
    private void exit() {
        Timer timer;
        if (!isExit) {
            isExit = true;
            Toast exit_game = Toast.makeText(Soft1714080902110Activity.this, "", Toast.LENGTH_SHORT);
            exit_game.setText("再按一次退出游戏");
            exit_game.show();
            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    isExit = false;
                }
            }, 2000);
        } else {
            finish();
        }
    }
}
