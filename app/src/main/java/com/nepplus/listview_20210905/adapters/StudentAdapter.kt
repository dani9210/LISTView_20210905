package com.nepplus.listview_20210905.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.nepplus.listview_20210905.R
import com.nepplus.listview_20210905.datas.StudentData

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData>) : ArrayAdapter<StudentData>(mContext, resId, mList) {

    //     한 줄xml + StudentData클래스의 정보 결합 -> 리스트뷰의 각 자리에 뿌려주자.
//        xml로 그려둔 한줄 모양을 => kt 안에서 활용할 수 있어야함.
//        활용을 도와주는 도구도 필요하다.


     val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.student_list_item, null)
        }

//         tempRow는 절대 null일 가능성이 없다. => 진짜 row 로 옮겨담자.

        val row = tempRow!!

//        만들어진 row를 getView 작업의 결과물로 지정.

        return row
    }

}