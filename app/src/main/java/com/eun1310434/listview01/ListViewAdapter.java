/*=====================================================================
□ Infomation
  ○ Data : 07.03.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ Function
  ○ ListView에 표현하는데 많은 Item들을 효과적으로 관리

□ Study
  ○
=====================================================================*/
package com.eun1310434.listview01;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    ArrayList<ItemData> items = new ArrayList<ItemData>();
    Context ApplicationContext;

    public ListViewAdapter(Context context){
        ApplicationContext = context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    public void addItem(ItemData item) {
        items.add(item);
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }



    View_ItemA view;
    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        //각각의 Item을 보여주기 위한 부분화면 만들기
        if(convertView == null){
            view = new View_ItemA(ApplicationContext);
        }else{
            view = (View_ItemA) convertView;
        }

        ItemData item = items.get(position);
        view.setItem(item);
        return view;
    }
}