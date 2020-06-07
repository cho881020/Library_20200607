package kr.co.tjoeun.library_20200607

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }
    
    override fun setupEvents() {

        profileImg.setOnClickListener {
            val myIntent = Intent(mContext, ViewProfileImageActivity::class.java)
            startActivity(myIntent)
        }

    }

    override fun setValues() {

        Glide.with(mContext).load("https://m.wingbling.co.kr/web/upload/NNEditor/20191210/%EC%95%84%EC%8A%A4%ED%8A%B8%EB%A1%9C%20%EA%B3%B5%EC%8B%9D%20%ED%8A%B8%EC%9C%84%ED%84%B0%20-%20%EC%95%84%EC%8A%A4%ED%8A%B8%EB%A1%9C%20%EC%B0%A8%EC%9D%80%EC%9A%B0%20(%EC%85%80%EB%A0%88%EB%82%98%20%EB%AA%A9%EA%B1%B8%EC%9D%B4)_shop1_002508.jpg").into(profileImg)

    }

}
