package com.jelly.music_player.activity;

import com.jelly.music_player.R;
import com.jelly.music_player.User;
import com.jelly.music_player.UserAttestatInfo;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class LoginActivity extends BaseActivity{


    @Override
    public int setLayout() {
        return R.layout.activity_login;
    }

    @Override
    public void initUi() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void initEventListener() {

    }

    /**
     * 登录
     */
    public void logUsers(UserAttestatInfo info){

    }

    /**
     * 用户信息认证
     * @param info
     */
    private void userAttestat(UserAttestatInfo info){
        OkHttpClient client=new OkHttpClient();
        //添加表单
        FormBody.Builder formBody = new FormBody.Builder();
        formBody.add(User.USER_NAME,info.getName());
        formBody.add(User.USER_PASSWORD,info.getPassword());
        //创建Request 对象。
        Request request = new Request.Builder()
                .url("http://www.baidu.com")
                .post(formBody.build())//传递请求体
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

            }
        });

    }
}
