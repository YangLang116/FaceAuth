package com.xtu.faceauth.bean;

import cn.bmob.v3.BmobUser;

/**
 * Created by Administrator on 2016/5/14.
 */
public class TYUser extends BmobUser {

    private String mNickName;     //昵称
    private String mMsg;    //用户个性签名
    private String IconPath; //用户头像网络地址

    public String getmNickName() {
        return mNickName;
    }

    public void setmNickName(String mNickName) {
        this.mNickName = mNickName;
    }

    public String getmMsg() {
        return mMsg;
    }

    public void setmMsg(String mMsg) {
        this.mMsg = mMsg;
    }

    public String getIconPath() {
        return IconPath;
    }

    public void setIconPath(String iconPath) {
        IconPath = iconPath;
    }
}