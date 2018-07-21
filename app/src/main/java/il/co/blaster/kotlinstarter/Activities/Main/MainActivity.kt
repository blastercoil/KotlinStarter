package il.co.blaster.kotlinstarter.Activities.Main

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import il.co.blaster.kotlinstarter.Activities.BaseActivity
import il.co.blaster.kotlinstarter.BasePresentation
import il.co.blaster.kotlinstarter.R

class MainActivity : AppCompatActivity(), BaseActivity, BasePresentation {

    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        attachPresenter(this)
        setContentView(R.layout.activity_main)
    }

    override fun getViewContext(): Context {
        return this@MainActivity
    }

    override fun attachPresenter(presentation: BasePresentation) {
        presenter = MainPresenter(presentation)
    }

}
