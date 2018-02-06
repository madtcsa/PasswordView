package com.kkxx.passwordviewlib;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * @author zsmj
 * @date 2018/2/5
 */
public abstract class BaseViewLayout extends RelativeLayout {

    protected Context mContext;

    public BaseViewLayout(Context context) {
        this(context,null);
    }

    public BaseViewLayout(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public BaseViewLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initBaseLayout();
    }

    private void initBaseLayout(){

    }
    /**
     * 返回当前密码盘的布局资源id
     *
     * @return 资源id
     */
    abstract int getLayoutId();

}
