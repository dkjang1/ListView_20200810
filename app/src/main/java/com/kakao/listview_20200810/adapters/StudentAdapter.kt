package com.kakao.listview_20200810.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.kakao.listview_20200810.R
import com.kakao.listview_20200810.datas.Student

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: List<Student>
) : ArrayAdapter<Student>(mContext, resId, mList) {

    //    xml을 가지고 객체로 변환(inflate)주는 변수
    val inf = LayoutInflater.from(mContext)

    //    각가의 줄에 표시될 모양 + 데이터조합함수
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        return super.getView(position, convertView, parent)
//        convertView 변수는 내용물 변경불가
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }

        val row = tempRow!!

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)

//      상황에 맞는 position에 맞게 데이터변수(mList) 가져오기
        val data =  mList[position]

       nameTxt.text = data.name

//       최종완성 row
        return row
    }


}