package com.test

object Main {

  def main(args: Array[String]): Unit = {

    // 基本コンストラクタの生成
    val BasicConstructor = new classObject(0, "BasicConstructor.")
    // 補助コンストラクタの生成1
    val SuppotConstructor3 = new classObject(1)
    // 補助コンストラクタの生成2
    val SuppotConstructor2 = new classObject("SuppotConstructor2.")
  }
}