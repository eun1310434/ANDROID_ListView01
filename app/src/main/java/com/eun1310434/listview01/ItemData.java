/*=====================================================================
□ Infomation
  ○ Data : 07.03.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ Function
  ○ 각각의 Item에 정보를 저장

□ Study
  ○
=====================================================================*/
package com.eun1310434.listview01;

public class ItemData {

    String Title;
    String Contents;
    int ImgResId;

    public ItemData(String _Title, String _Contents) {
        this.Title = _Title;
        this.Contents = _Contents;
    }

    public ItemData(String _Title, String _Contents, int _ImgResId) {
        this.Title = _Title;
        this.Contents = _Contents;
        this.ImgResId = _ImgResId;
    }


    public int getImgResId() {
        return ImgResId;
    }

    public void setImgResId(int _ImgResId) {
        this.ImgResId = _ImgResId;
    }

    public String getMobile() {
        return Contents;
    }

    public void setMobile(String _Contents) {
        this.Contents = _Contents;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String _Title) {
        this.Title = _Title;
    }
}

