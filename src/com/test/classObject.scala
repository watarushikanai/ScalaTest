package com.test

// 引数ありのコンストラクタの場合はクラス定義に記述する
class classObject(number: Int, str: String) {
  // 基本コンストラクタで行う初期処理はクラス定義直後に記述する。
  println("No." + number + " it's a " + str)

  // 1番目の補助コンストラクタの定義
  def this(number: Int) {
    // 必ず別に定義されたコンストラクタを呼び出すこと。(ここは基本コンストラクタのみ指定可能)
    this(number, "SuppotConstructor1.")
  }

  // 2番目の補助コンストラクタの定義
  def this(str: String) {
    // 必ず別に定義されたコンストラクタを呼び出すこと。(ここは基本コンストラクタまたは1番目の補助コンストラクタを指定可能)
    this(2, str)
  }
}