# 字符串
## 不可变String
String对象是不可变的

## 重载"+"与StringBuilder
用于String的"+"与"+="是Java中仅有的两个重载过的操作符, Java不允许程序员重载任何操作符.  

如果字符串操作比较简单, 那么可以信赖编译器(用加号拼接), 如果要用循环 , 最好自己创建一个StringBuilder对象  

## 无意识的递归
