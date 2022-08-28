package com.codebygus.cbgbasicanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.codebygus.cbgbasicanimations.databinding.BasicAnimationsBinding

class BasicAnimations : AppCompatActivity() {
    private lateinit var conAnim: BasicAnimationsBinding
    private lateinit var animScrollH: Animation
    private lateinit var animScrollH1: Animation
    private lateinit var animScrollH2: Animation
    private lateinit var animScrollH3: Animation
    private lateinit var animScrollV: Animation
    private lateinit var animTranslate: Animation
    private lateinit var animOvershoot: Animation
    private lateinit var animFadeIn: Animation
    private lateinit var animFadeOut: Animation
    private lateinit var animGrow: Animation
    private lateinit var animPulse: Animation
    private lateinit var animRotate: Animation
    private lateinit var animRotateGrow: Animation
    private lateinit var animRoll: Animation
    private lateinit var animSpinGrow: Animation
    private lateinit var animShrink: Animation
    private lateinit var animSpinShrink: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        conAnim = BasicAnimationsBinding.inflate(layoutInflater)
        setContentView(conAnim.root)
        animScrollH = AnimationUtils.loadAnimation(this,R.anim.scroll_h)
        animScrollH1 = AnimationUtils.loadAnimation(this,R.anim.scroll_h_1)
        animScrollH2 = AnimationUtils.loadAnimation(this,R.anim.scroll_h_2)
        animScrollH3 = AnimationUtils.loadAnimation(this,R.anim.scroll_h_3)
        animScrollV = AnimationUtils.loadAnimation(this,R.anim.scroll_v)
        animTranslate = AnimationUtils.loadAnimation(this,R.anim.translate)
        animOvershoot = AnimationUtils.loadAnimation(this,R.anim.overshoot)
        animFadeIn = AnimationUtils.loadAnimation(this,R.anim.fade_in)
        animFadeOut = AnimationUtils.loadAnimation(this,R.anim.fade_out)
        animGrow = AnimationUtils.loadAnimation(this,R.anim.grow)
        animPulse = AnimationUtils.loadAnimation(this,R.anim.pulse)
        animRotate = AnimationUtils.loadAnimation(this,R.anim.rotate)
        animRotateGrow = AnimationUtils.loadAnimation(this,R.anim.rotate_grow)
        animRoll = AnimationUtils.loadAnimation(this,R.anim.roll)
        animSpinGrow = AnimationUtils.loadAnimation(this,R.anim.spin_grow)
        animShrink = AnimationUtils.loadAnimation(this,R.anim.shrink)
        animSpinShrink = AnimationUtils.loadAnimation(this,R.anim.spin_shrink)

        conAnim.btnScrollH.setOnClickListener {
            conAnim.imgLogo01.startAnimation(animScrollH)
            conAnim.imgLogo02.startAnimation(animScrollH1)
            conAnim.imgLogo03.startAnimation(animScrollH2)
            conAnim.imgLogo04.startAnimation(animScrollH3)
        }
        conAnim.btnScrollV.setOnClickListener {
            conAnim.imgLogo01.startAnimation(animScrollV)
        }
        conAnim.btnTranslate.setOnClickListener {
            conAnim.imgLogo01.startAnimation(animTranslate)
        }
        conAnim.btnOvershoot.setOnClickListener {
            conAnim.imgLogo01.startAnimation(animOvershoot)
        }
        conAnim.btnFadeIn.setOnClickListener {
            conAnim.imgLogo01.startAnimation(animFadeIn)
        }
        conAnim.btnFadeOut.setOnClickListener {
            conAnim.imgLogo01.startAnimation(animFadeOut)
        }
        conAnim.btnGrow.setOnClickListener {
            conAnim.imgLogo01.startAnimation(animGrow)
        }
        conAnim.btnPulse.setOnClickListener {
            conAnim.imgLogo01.startAnimation(animPulse)
        }
        conAnim.btnRotate.setOnClickListener {
            conAnim.imgLogo01.startAnimation(animRotate)
        }
        conAnim.btnRotateGrow.setOnClickListener {
            conAnim.imgLogo01.startAnimation(animRotateGrow)
        }
        conAnim.btnRoll.setOnClickListener {
            conAnim.imgLogo01.startAnimation(animRoll)
        }
        conAnim.btnSpinGrow.setOnClickListener {
            conAnim.imgLogo01.startAnimation(animSpinGrow)
        }
        conAnim.btnShrink.setOnClickListener {
            conAnim.imgLogo01.startAnimation(animShrink)
        }
        conAnim.btnSpinShrink.setOnClickListener {
            conAnim.imgLogo01.startAnimation(animSpinShrink)
        }
        conAnim.btnExit.setOnClickListener {
            conAnim.imgLogo01.startAnimation(animFadeOut)
            finish()
        }
    }
}