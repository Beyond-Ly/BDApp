package com.beyond.beidou.util;

import android.text.TextUtils;
import android.util.Log;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Response;


public class LoginUtil {

    public static final int LOGINBYPHONE = 1;
    public static final int LOGINBYPWD = 2;
    public static final int LOGINBYEMAIL = 3;


    public LoginUtil() {
    }
    /**
     * 判断手机号是否有效
     * @param account 用户输入的手机号或者邮箱
     * @param loginType 登录方式
     * @return  手机号有效返回为true，手机号无效返回false
     */
    public boolean checkAccount(String account, int loginType)
    {
        Pattern p = null;
        if (loginType == LOGINBYPHONE)
        {
            //设置手机号正则表达式
            p = Pattern.compile("^1(3([0-35-9]\\d|4[1-8])|4[14-9]\\d|5([0-35689]\\d|7[1-79])|66\\d|7[2-35-8]\\d|8\\d{2}|9[13589]\\d)\\d{7}$");
        }else if (loginType == LOGINBYEMAIL)
        {
            //设置邮箱正则表达式
            p = Pattern.compile("^[a-z\\d]+(\\.[a-z\\d]+)*@([\\da-z](-[\\da-z])?)+(\\.{1,2}[a-z]+)+$");
        }

        Matcher m = p.matcher(account);
        if (m.matches())
        {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 判断密码的有效性
     * @param pwd 用户输入的密码
     * @return 有效返回true,无效返回false
     */
    public boolean checkPwd(String pwd)
    {
        //密码8-16位且包含数字，大小写字母以及特殊符号
        Pattern p = Pattern.compile("(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%\\^&\\*()\\_]).{8,16}");
        Matcher m = p.matcher(pwd);
        if (m.matches())
        {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 获取SessionUUID
     * @return SessionUUID
     */
    public String getSessionId()
    {
            Log.e("App中的SessionUUID", APIUtil.getSessionUUID());
            FormBody body = new FormBody.Builder()
                    .add("sessionUUID", APIUtil.getSessionUUID())
                    .build();

            HttpUtil.sendOkHttpRequestFormBody(APIUtil.getDoSessionUrl(), body, new Callback() {
                @Override
                public void onFailure(@NotNull Call call, @NotNull IOException e) {
                    Log.e("请求session失败","错误原因" + e.getMessage());
                }

                @Override
                public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                    /*
                        注意okHttp3中.string()方法只能调用一次，
                        否则会出现EAndroidRuntime FATAL EXCEPTION OkHttp Dispatcher错误
                     */
                    String responseText = response.body().string();
                    Log.e("response的内容",responseText);
                    if (!TextUtils.isEmpty(responseText)) {
                        try {
                            JSONObject object = new JSONObject(responseText);

                            Log.e("解析的SessionUUID",object.getString("SessionUUID"));

                            APIUtil.setSessionUUID(object.getString("SessionUUID"));
                        } catch (JSONException e) {
                            e.printStackTrace();
                            Log.e("JsonException","错误信息为" + e.getMessage());
                        }
                    }
                    Log.e("请求成功，SessionUUID为", APIUtil.getSessionUUID());
                }
            });

        return APIUtil.getSessionUUID();
    }


    public void loginByPwd(String userName, String password, String imageCode, Callback callback)
    {
        FormBody body = new FormBody.Builder()
                .add("sessionUUID", APIUtil.getSessionUUID())
                .add("userName",userName)
                .add("password",password)
                .add("imageCode",imageCode)
                .build();
        HttpUtil.sendOkHttpRequestFormBody(APIUtil.getDoLoginUrl(),body,callback);
    }



   /* public void test(String imageCode)
        {
            Log.e("test中的SessionUUID",App.getSessionUUID());
        FormBody body = new FormBody.Builder()
                .add("sessionUUID", App.getSessionUUID())
                .add("userName","qwerASD5")
                .add("password","qwertyuiiopASDFG5*")
                .add("imageCode",imageCode)
                .build();
        HttpUtil.sendOkHttpRequest(App.getDoLoginUrl(), body, new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                Log.e("请求失败","错误原因是"+ e.getMessage());
            }
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                Log.e("请求成功，返回数据为",response.body().string());
            }
        });
    }*/

}