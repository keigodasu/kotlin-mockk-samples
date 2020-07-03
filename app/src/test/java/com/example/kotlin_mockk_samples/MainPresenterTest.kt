package com.example.kotlin_mockk_samples

import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.SpyK
import io.mockk.junit5.MockKExtension
import io.mockk.mockk
import io.mockk.spyk
import io.mockk.verify
import org.junit.Before
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith


@ExtendWith(MockKExtension::class)
internal class MainPresenterTest {

    val view: Contract.View = spyk()

    @Test
    fun showUp() {
        val presenter = MainPresenter(view)
        presenter.showUp()

        verify(exactly = 1, verifyBlock = {view.showMessage()})
    }
}