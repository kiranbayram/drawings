package com.drawing

import scala.scalajs.js._

object SampleJSApp extends JSApp {
  def main(): Unit = {
    println("Hello world! This is a scala js app.")

    eval("alert('Alerted')")
  }
}
