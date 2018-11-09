package wshop

import com.github.thomasnield.rxkotlinfx.events
import javafx.scene.input.ScrollEvent
import tornadofx.*

class MyApp : App(MyView::class)

class MyView : View() {

    override val root = vbox {

        button(text = "Press me bitte")
                .events(ScrollEvent.SCROLL)
                .subscribe {
                    println("Last delta: Y[${it.deltaY}]")
                }

    }
}

fun main(args: Array<String>) {
    launch<MyApp>(args)
}
