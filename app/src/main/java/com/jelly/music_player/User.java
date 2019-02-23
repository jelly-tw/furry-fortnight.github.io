package com.jelly.music_player;

public class User {
    /**
     * 用户名称键值
     */
    public static final String USER_NAME = "user_name";
    /**
     * 用户名称密码
     */
    public static final String USER_PASSWORD = "user_password";
    /**
     * 新用户登录
     */
    public static final int NEW_USER=0x11;
    /**
     * 历史用户登录
     */
    public static final int HISTORY_USER=0x12;
    private String name;
    private String password;

}
