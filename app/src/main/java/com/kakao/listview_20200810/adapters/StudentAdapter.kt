package com.kakao.listview_20200810.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.kakao.listview_20200810.datas.Student

class StudentAdapter(
    val mContext: Context,
    val resId: int,
    val mList: List<Student>
) : ArrayAdapter<Student>(mContext, resId, mList) {
}