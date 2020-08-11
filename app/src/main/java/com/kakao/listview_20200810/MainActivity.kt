package com.kakao.listview_20200810

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kakao.listview_20200810.adapters.StudentAdapter
import com.kakao.listview_20200810.datas.Student
import kotlinx.android.synthetic.main.activity_main.*
import java.security.KeyStore

class MainActivity : AppCompatActivity() {

//    학생명부가 담길 목록변수
    val mStudentList = ArrayList<Student>()

//    Adapter는 멤버변수 초기화할수없다
//    초기화면 나중으로 미루자

    lateinit var mStudentAdapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        학생명부에 실제학생 데이터추가
        mStudentList.add(Student("조경진","서울시 은평구", true, 1988))
        mStudentList.add(Student("강윤정","경기도 안양시", false, 1991))
        mStudentList.add(Student("구주영","서울시 용산구", true, 1968))
        mStudentList.add(Student("윤은영","경기도 수원시", false, 1992))
        mStudentList.add(Student("이선영","경기도 고양시", false, 1985))
        mStudentList.add(Student("이용찬","서울시 노원구", true, 1976))
        mStudentList.add(Student("장동국","서울시 은평구", true, 1974))
        mStudentList.add(Student("최인선","서울시 영등포구", false, 1992))

//        Adapter변수 onCreate 내부에서 초기화함
        mStudentAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

//        xml에 있는 리스트뷰의 어댑터 지정
        studentListView.adapter = mStudentAdapter

//        학생을 선택하면 토스트를 뛰우자
        studentListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedStudent = mStudentList[position]
            Toast.makeText(this, clickedStudent.name, Toast.LENGTH_SHORT).show()

        }

    }
}