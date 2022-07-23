package com.codebygus.cbgbasicanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.codebygus.cbgbasicanimations.databinding.BasicAnimationsBinding

class BasicAnimations : AppCompatActivity() {
    private lateinit var conAnim: BasicAnimationsBinding
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

        conAnim.btnTranslate.setOnClickListener {
            conAnim.imgLogo.startAnimation(animTranslate)
        }
        conAnim.btnOvershoot.setOnClickListener {
            conAnim.imgLogo.startAnimation(animOvershoot)
        }
        conAnim.btnFadeIn.setOnClickListener {
            conAnim.imgLogo.startAnimation(animFadeIn)
        }
        conAnim.btnFadeOut.setOnClickListener {
            conAnim.imgLogo.startAnimation(animFadeOut)
        }
        conAnim.btnGrow.setOnClickListener {
            conAnim.imgLogo.startAnimation(animGrow)
        }
        conAnim.btnPulse.setOnClickListener {
            conAnim.imgLogo.startAnimation(animPulse)
        }
        conAnim.btnRotate.setOnClickListener {
            conAnim.imgLogo.startAnimation(animRotate)
        }
        conAnim.btnRotateGrow.setOnClickListener {
            conAnim.imgLogo.startAnimation(animRotateGrow)
        }
        conAnim.btnRoll.setOnClickListener {
            conAnim.imgLogo.startAnimation(animRoll)
        }
        conAnim.btnSpinGrow.setOnClickListener {
            conAnim.imgLogo.startAnimation(animSpinGrow)
        }
        conAnim.btnShrink.setOnClickListener {
            conAnim.imgLogo.startAnimation(animShrink)
        }
        conAnim.btnSpinShrink.setOnClickListener {
            conAnim.imgLogo.startAnimation(animSpinShrink)
        }
        conAnim.btnExit.setOnClickListener {
            conAnim.imgLogo.startAnimation(animFadeOut)
            finish()
        }
    }
}