/*=====================================================================
□ Infomation
  ○ Data : 07.03.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ Function
  ○ 각각의 Item에 맞게 View를 제작

□ Study
  ○
=====================================================================*/
package com.eun1310434.listview01;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class View_ItemA extends LinearLayout {
    TextView textView;
    TextView textView2;
    ImageView imageView;

    public View_ItemA(Context context) {
        super(context);
        init(context);
    }

    public View_ItemA(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public void init(Context context) {
        //Background에서 실행중인 서비스 중 LAYOUT_INFLATER_SERVICE를 활용
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_item_a, this, true); // this = (ViewGroup) this.getRootView() //LinearLayout
        //inflater.inflate(R.layout.view_item_a, (ViewGroup) this.getRootView(), true);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void setItem(ItemData it) {
        textView.setText(it.Title);
        textView2.setText(it.Contents);
        imageView.setImageResource(it.ImgResId);
    }
}
