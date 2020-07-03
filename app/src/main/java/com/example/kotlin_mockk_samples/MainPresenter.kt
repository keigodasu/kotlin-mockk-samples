package com.example.kotlin_mockk_samples

class MainPresenter(val view: Contract.View): Contract.Presenter {
    override fun showUp() {
        view.showMessage()
    }
}