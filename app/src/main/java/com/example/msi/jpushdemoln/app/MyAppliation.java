package com.example.msi.jpushdemoln.app;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * <p>文件描述：<p>
 * <p>作者：${Ln}<p>
 * <p>创建时间：2019/4/7  14:26<p>
 * <p>更改时间：2019/4/7  14:26<p>
 * <p>版本号：1<p>
 */
public class MyAppliation extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
