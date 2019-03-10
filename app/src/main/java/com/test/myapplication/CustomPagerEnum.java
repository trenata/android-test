package com.test.myapplication;

public enum CustomPagerEnum {

    PAGE_1(R.string.pg1, R.layout.view_page_1),
    PAGE_2(R.string.pg2, R.layout.view_page_2),
    PAGE_3(R.string.pg3, R.layout.view_page_3),
    PAGE_4(R.string.pg4, R.layout.view_page_4);

    private int mTitleResId;
    private int mLayoutResId;

    CustomPagerEnum(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}

