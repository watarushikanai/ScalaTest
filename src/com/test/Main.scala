package com.test

object Main {

  def main(args: Array[String]): Unit = {

    // 関数の定義は変数へ代入可能
    val fuction = (str: String) => {
      println(str)
    }

    // 上記とは動作が異なる関数を定義
    val fuction2 = (str: String) => {
      println("It's a Scala" + str)
    }

    // メソッドの引数へ関数を設定
    execute(fuction)
    execute(fuction2)

  }

  // メソッドの引数に関数を定義する場合
  def execute(function: (String) => Unit) {
    function("World")
  }

}