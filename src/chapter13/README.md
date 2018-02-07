# 字符串
## 不可变String
String对象是不可变的

## 重载"+"与StringBuilder
用于String的"+"与"+="是Java中仅有的两个重载过的操作符, Java不允许程序员重载任何操作符.  

如果字符串操作比较简单, 那么可以信赖编译器(用加号拼接), 如果要用循环 , 最好自己创建一个StringBuilder对象  

## 无意识的递归
[InfiniteRecursion.java](./InfiniteRecursion.java)

## String上的操作
当需要改变字符串的内容时, String类的方法都会返回一个新的String对象, 如果内容没有发生改变, String方法只是返回指向原对象的引用而已.  

## 格式化输出
System.out.format("Row 1: [%d %f]\n.", x, y);

### Formatter类
```
Formatter f = new Formatter(System.out);
f.format("...");
```

### 格式化说明符
`f.format("%-15s %5s %10.2f\n", "Tax", "", "2.333");`

### Formatter转换
...

### String.format()
String.format()返回格式化的String对象.  

## 正则表达式
### 基础
在Java中"\\"的意思是插入一个正则表达式的反斜线  

"\\\"插入普通反斜线, 换行和制表符只需用单反斜线: "\n\t"  

split()方法, 将字符串从正则表达式匹配的地方切开.  

### 创建正则表达式
...

## 扫描输入
Scanner的构造器可以接受任何类型的输入对象, 包括FIle对象, InputStream, String...  

分词以及翻译的操作都隐藏在不同类型的next方法中, 所有基本类型(除了char之外)都有对应的next方法  

### Scanner定界符
默认情况下, Scanner根据空白字符对输入进行分词, 可以用正则表达式指定定界符.  

### 用正则表达式扫描
```
scanner.hasNext(parttern);
scanner.next(parttern);
```

## StringTokenizer
已经遗弃不用了.