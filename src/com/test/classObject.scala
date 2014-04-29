package com.test

// valとvarを定義するとフィールドが自動で定義される
// valの場合getterが自動で定義される
// varの場合getterとsetterが自動で定義される(「str_」という名前のsetter)
class classObject(val number: Int, var str: String) {
}