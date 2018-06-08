package wshop

import com.github.thomasnield.rxkotlinfx.actionEvents
import javafx.application.Application
import tornadofx.*

class MyApp : App(MyView::class)

class MyView : View() {

    override val root = vbox {

        val countingLabel = label("0")
        var counter = 0

        button("Press me bitte")
                .actionEvents()
                .subscribe({
                    counter += 1
                    countingLabel.text = counter.toString()
                })
    }
}

fun main(args: Array<String>) {
    Application.launch(MyApp::class.java, *args)
}