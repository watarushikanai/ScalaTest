package com.test

object Main {

  def main(args: Array[String]): Unit = {

    // インスタンスの生成
    val objects = new classObject(10, "first")

    // 初期値の出力
    println("number:" + objects.number)
    println("str:" + objects.str)

    // numberはvalで定義しているため、setterを呼び出すとコンパイルエラー
    //　objects.number = 11

    // varで定義したフィールドへ直接設定しているように見えるが実際は、setterを呼び出している
    objects.str = "second"

    // フィールドの変更後
    println("str:" + objects.str)

  }

}