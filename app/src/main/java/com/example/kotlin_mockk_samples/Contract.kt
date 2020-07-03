package com.example.kotlin_mockk_samples

interface Contract {
    interface View {
        fun showMessage()
    }

    interface Presenter {
        fun showUp()
    }
}