fun main() {
	val button = Button("Click me")
	button.click()
	println(button.text)
	button.text = "Don't click me"
	button.click()
}

open class View {
	open fun click() {
		println("${javaClass.name} clicked")
	}
}

class ViewGroup : View() {
	var onlyView: View? = null

	fun addView(v: View) {
		onlyView = v
	}
}

open class TextView(var text: String = "") : View() {
	override fun click() {
		println("${javaClass.name}($text) clicked")
	}
}

class Button(text: String) : TextView(text)