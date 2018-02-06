package com.kkxx.passwordviewlib

/**
 * 定义密码盘的基本功能
 *
 * @author zsmj
 * @date 2018/2/5
 */
interface PasswordLayoutWrapper {

    /**
     * password验证正确后执行行为
     */
    fun passwordCorrect()

    /**
     * password验证正确后执行行为
     */
    fun passwordInCorrect()

    /**
     * 取消输入密码
     */
    fun cancelInputPassword()

    /**
     * 删除已经输入的密码
     */
    fun delInputPassword()
}