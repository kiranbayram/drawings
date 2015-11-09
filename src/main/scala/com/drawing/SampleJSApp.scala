package com.drawing

import org.scalajs.dom
import dom.document
import scala.scalajs.js._
import scala.scalajs.js.annotation.JSExport

object SampleJSApp extends JSApp {
  def main(): Unit = {
    println("Hello world! This is a scala js app.")

    eval("alert('Alerted')")

    appendPar(document.body, "Hello World")
  }

  private def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }

  @JSExport
  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!")
  }
}
