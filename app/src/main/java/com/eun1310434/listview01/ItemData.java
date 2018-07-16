/*=====================================================================
□ INFORMATION
  ○ Data : 23.05.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ STUDY
  ○ ListView에 표현하는데 많은 Item들을 Adapter를 활용하여 효과적으로 관리ㄴ

□ FUNCTION
  ○
=====================================================================*/
package com.eun1310434.listview01;

public class ItemData {

    private String Title;
    private String Contents;
    private int ImgResId;

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

    public String getContent() {
        return Contents;
    }

    public void setContent(String _Contents) {
        this.Contents = _Contents;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String _Title) {
        this.Title = _Title;
    }
}

