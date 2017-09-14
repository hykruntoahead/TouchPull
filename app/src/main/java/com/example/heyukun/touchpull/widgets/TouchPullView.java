package com.example.heyukun.touchpull.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.v4.content.res.ResourcesCompat;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by heyukun on 2017/9/14.
 */

public class TouchPullView extends View {

    private Paint mCirclePaint;
    private int mCircleRadius = 150;

    public TouchPullView(Context context) {
        super(context);
        init();
    }

    public TouchPullView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TouchPullView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }



    private void init(){
        mCirclePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        //防锯齿
        mCirclePaint.setAntiAlias(true);
        //防抖动
        mCirclePaint.setDither(true);


        mCirclePaint.setStyle(Paint.Style.FILL);
        mCirclePaint.setColor(ResourcesCompat.getColor(getResources(),android.R.color.black,null));


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //相当于除以2
        int x = getWidth() >> 1;
        int y  = getHeight() >> 1;

        canvas.drawCircle(x,y,mCircleRadius,mCirclePaint);
    }
}
