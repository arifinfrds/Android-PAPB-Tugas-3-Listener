package com.arifinfrds.tugas3listener

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {

    var mSeekBar: SeekBar? = null
    var mIvArms: ImageView? = null
    var mIvBody: ImageView? = null
    var mIvEars: ImageView? = null
    var mIvEyeBrows: ImageView? = null
    var mIvEyes: ImageView? = null
    var mIvGlasses: ImageView? = null
    var mIvHat: ImageView? = null
    var mIvMouth: ImageView? = null
    var mIvMustache: ImageView? = null
    var mIvNose: ImageView? = null
    var mIvShoes: ImageView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        // toolbar.setTitleTextColor(getResources().getColor(R.color.black));

        mSeekBar = findViewById(R.id.seekBar_main) as SeekBar
        mSeekBar?.setOnSeekBarChangeListener(this)

        mIvArms = findViewById(R.id.iv_arms) as ImageView
        mIvBody = findViewById(R.id.iv_body) as ImageView
        mIvEars = findViewById(R.id.iv_ears) as ImageView
        mIvEyeBrows = findViewById(R.id.iv_eyebrows) as ImageView
        mIvEyes = findViewById(R.id.iv_eyes) as ImageView
        mIvGlasses = findViewById(R.id.iv_glasses) as ImageView
        mIvHat = findViewById(R.id.iv_hat) as ImageView
        mIvMouth = findViewById(R.id.iv_mouth) as ImageView
        mIvMustache = findViewById(R.id.iv_mustache) as ImageView
        mIvNose = findViewById(R.id.iv_nose) as ImageView
        mIvShoes = findViewById(R.id.iv_shoes) as ImageView

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater?.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
    }

    // MARK: - SeekBar.OnSeekBarChangeListener
    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        updateUIWithProgress(progress = progress)

    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
    }

    fun updateUIWithProgress(progress: Int) {
        when (progress) {
            0 -> {
                hideAllImage(hide = true)
            }
            1 -> {
                mIvArms?.visibility = View.INVISIBLE
                mIvBody?.visibility = View.INVISIBLE
                mIvEars?.visibility = View.INVISIBLE
                mIvEyeBrows?.visibility = View.INVISIBLE
                mIvEyes?.visibility = View.INVISIBLE
                mIvGlasses?.visibility = View.INVISIBLE
                mIvHat?.visibility = View.INVISIBLE
                mIvMouth?.visibility = View.INVISIBLE
                mIvMustache?.visibility = View.INVISIBLE
                mIvNose?.visibility = View.INVISIBLE
                mIvShoes?.visibility = View.VISIBLE
            }
            2 -> {
                mIvArms?.visibility = View.INVISIBLE
                mIvBody?.visibility = View.INVISIBLE
                mIvEars?.visibility = View.INVISIBLE
                mIvEyeBrows?.visibility = View.INVISIBLE
                mIvEyes?.visibility = View.INVISIBLE
                mIvGlasses?.visibility = View.INVISIBLE
                mIvHat?.visibility = View.INVISIBLE
                mIvMouth?.visibility = View.INVISIBLE
                mIvMustache?.visibility = View.INVISIBLE
                mIvNose?.visibility = View.VISIBLE
                mIvShoes?.visibility = View.VISIBLE
            }
            3 -> {
                mIvArms?.visibility = View.INVISIBLE
                mIvBody?.visibility = View.INVISIBLE
                mIvEars?.visibility = View.INVISIBLE
                mIvEyeBrows?.visibility = View.INVISIBLE
                mIvEyes?.visibility = View.INVISIBLE
                mIvGlasses?.visibility = View.INVISIBLE
                mIvHat?.visibility = View.INVISIBLE
                mIvMouth?.visibility = View.INVISIBLE
                mIvMustache?.visibility = View.VISIBLE
                mIvNose?.visibility = View.VISIBLE
                mIvShoes?.visibility = View.VISIBLE
            }
            4 -> {
                mIvArms?.visibility = View.INVISIBLE
                mIvBody?.visibility = View.INVISIBLE
                mIvEars?.visibility = View.INVISIBLE
                mIvEyeBrows?.visibility = View.INVISIBLE
                mIvEyes?.visibility = View.INVISIBLE
                mIvGlasses?.visibility = View.INVISIBLE
                mIvHat?.visibility = View.INVISIBLE
                mIvMouth?.visibility = View.VISIBLE
                mIvMustache?.visibility = View.VISIBLE
                mIvNose?.visibility = View.VISIBLE
                mIvShoes?.visibility = View.VISIBLE
            }
            5 -> {
                mIvArms?.visibility = View.INVISIBLE
                mIvBody?.visibility = View.INVISIBLE
                mIvEars?.visibility = View.INVISIBLE
                mIvEyeBrows?.visibility = View.INVISIBLE
                mIvEyes?.visibility = View.INVISIBLE
                mIvGlasses?.visibility = View.INVISIBLE
                mIvHat?.visibility = View.VISIBLE
                mIvMouth?.visibility = View.VISIBLE
                mIvMustache?.visibility = View.VISIBLE
                mIvNose?.visibility = View.VISIBLE
                mIvShoes?.visibility = View.VISIBLE
            }
            6 -> {
                mIvArms?.visibility = View.INVISIBLE
                mIvBody?.visibility = View.INVISIBLE
                mIvEars?.visibility = View.INVISIBLE
                mIvEyeBrows?.visibility = View.INVISIBLE
                mIvEyes?.visibility = View.INVISIBLE
                mIvGlasses?.visibility = View.VISIBLE
                mIvHat?.visibility = View.VISIBLE
                mIvMouth?.visibility = View.VISIBLE
                mIvMustache?.visibility = View.VISIBLE
                mIvNose?.visibility = View.VISIBLE
                mIvShoes?.visibility = View.VISIBLE
            }
            7 -> {
                mIvArms?.visibility = View.INVISIBLE
                mIvBody?.visibility = View.INVISIBLE
                mIvEars?.visibility = View.INVISIBLE
                mIvEyeBrows?.visibility = View.INVISIBLE
                mIvEyes?.visibility = View.VISIBLE
                mIvGlasses?.visibility = View.VISIBLE
                mIvHat?.visibility = View.VISIBLE
                mIvMouth?.visibility = View.VISIBLE
                mIvMustache?.visibility = View.VISIBLE
                mIvNose?.visibility = View.VISIBLE
                mIvShoes?.visibility = View.VISIBLE
            }
            8 -> {
                mIvArms?.visibility = View.INVISIBLE
                mIvBody?.visibility = View.INVISIBLE
                mIvEars?.visibility = View.INVISIBLE
                mIvEyeBrows?.visibility = View.VISIBLE
                mIvEyes?.visibility = View.VISIBLE
                mIvGlasses?.visibility = View.VISIBLE
                mIvHat?.visibility = View.VISIBLE
                mIvMouth?.visibility = View.VISIBLE
                mIvMustache?.visibility = View.VISIBLE
                mIvNose?.visibility = View.VISIBLE
                mIvShoes?.visibility = View.VISIBLE
            }
            9 -> {
                mIvArms?.visibility = View.INVISIBLE
                mIvBody?.visibility = View.INVISIBLE
                mIvEars?.visibility = View.VISIBLE
                mIvEyeBrows?.visibility = View.VISIBLE
                mIvEyes?.visibility = View.VISIBLE
                mIvGlasses?.visibility = View.VISIBLE
                mIvHat?.visibility = View.VISIBLE
                mIvMouth?.visibility = View.VISIBLE
                mIvMustache?.visibility = View.VISIBLE
                mIvNose?.visibility = View.VISIBLE
                mIvShoes?.visibility = View.VISIBLE
            }
            10 -> {
                hideAllImage(hide = false)
            }
        }


    }

    fun hideAllImage(hide: Boolean) {
        if (hide) {
            mIvArms?.visibility = View.INVISIBLE
            mIvBody?.visibility = View.INVISIBLE
            mIvEars?.visibility = View.INVISIBLE
            mIvEyeBrows?.visibility = View.INVISIBLE
            mIvEyes?.visibility = View.INVISIBLE
            mIvGlasses?.visibility = View.INVISIBLE
            mIvHat?.visibility = View.INVISIBLE
            mIvMouth?.visibility = View.INVISIBLE
            mIvMustache?.visibility = View.INVISIBLE
            mIvNose?.visibility = View.INVISIBLE
            mIvShoes?.visibility = View.INVISIBLE
        } else {
            mIvArms?.visibility = View.VISIBLE
            mIvBody?.visibility = View.VISIBLE
            mIvEars?.visibility = View.VISIBLE
            mIvEyeBrows?.visibility = View.VISIBLE
            mIvEyes?.visibility = View.VISIBLE
            mIvGlasses?.visibility = View.VISIBLE
            mIvHat?.visibility = View.VISIBLE
            mIvMouth?.visibility = View.VISIBLE
            mIvMustache?.visibility = View.VISIBLE
            mIvNose?.visibility = View.VISIBLE
            mIvShoes?.visibility = View.VISIBLE
        }
    }


}
