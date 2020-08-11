package com.kakao.listview_20200810.datas

import java.util.*

class Student(
    val name: String,
    val address: String,
    val isMale: Boolean,
    val birthYear: Int
) {
//    학생이 갖는 하위정보(이름/거주지/성별/생년)
//    멤버변수로 만들자 => 생성자를 멤버변수까지 동시에 세팅

    //    성별을 String형태로 출력함수 만들기
    fun getGenderString(): String {
        when (this.isMale) {
            true -> {
                return "남성"
            }
            else -> {
                return "여성"
            }
        }
    }

    //    생년을 String형태로 출력함수
    fun getKoreanAge(): Int {
//        Calendar 클래스기능이용 (설정 > 시스템 > 날짜및시간 > 날짜/시간자동설정)
        val now = Calendar.getInstance()
        return now.get(Calendar.YEAR) - this.birthYear + 1
    }

}