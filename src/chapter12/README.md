# 通过异常处理错误
## 概念
...

## 基本异常
...

## 异常参数
所有标准异常类都有两个构造器, 一个默认构造器, 另一个是接受字符串作为参数.  

`throw new NullPointerException("t == null")`

## 捕获异常
### try块
```$xslt
try {
    // code that might generate exceptions
}
```

### 异常处理程序
```$xslt
try {
    // code that might generate exceptions
} catch(Type1 id1) {
    // Handle exceptions of Type1
} catch(Type2 id2) {
     // Handle exceptions of Type2
}
..
```  

当异常被抛出时, 异常处理机制可以负责搜寻参数与异常类型相匹配的第一个处理程序, 然后进入catch子句执行, 一旦catch子句结束, 则处理程序的查找过程结束.  

#### 终止与恢复
异常处理理论上有两种基本模型:
1. 终止模型: 一旦异常被抛出, 就表明错误已无法挽回, 也不能回来继续执行.
2. 恢复模型: 异常处理程序的工作是修正错误, 然后重新尝试调用出问题的方法, 并认为第二次能成功.

恢复模型开始显得很吸引人, 但不是很实用.其中的主要原因是它所导致的耦合 

## 创建自定义异常
```$xslt
class MyException extends Exception() {
    public MyException() {}
    
    public MyException(String msg) {
        super(msg);
    }
}
```

## 异常与记录日志
...

## 异常说明
`void f() throws TooBig, TooSmall.. { //`  

可以声明方法将抛出异常, 实际上却不抛出  

## 捕获所有异常
通过捕获异常类型的基类Exception来捕获所有类型的异常, 最好把它放在处理程序列表的末尾.  

### 栈轨迹
getStackTrace(): 返回栈轨迹中元素所构成的数组

### 重新抛出异常
可以把刚捕获的异常重新抛出, 重抛异常会把异常抛给上一级环境中的异常处理程序, 同一个try块的后续catch子句将被忽略.  

重新抛出的异常是原来异常抛出点的调用栈信息, 可以用fillStackTrace()方法更新这个信息.  

### 异常链
...
## Java标准异常
Throwable类被用来表示任何可以作为异常被抛出的类.Trowable对象可分为两种类型: 
1. Error: 用来表示编译时和系统错误(一般不用关心)
2. Exception: 可以被抛出的基本类型

### 特例: RuntimeException
由Java虚拟机自动抛出, 不必在异常说明中把它们列出来.  

如果RuntimeException没有被捕获而直达main(), 那么在程序退出前将调用异常的printStackTrace()  

## 使用finally进行清理
###finally用来做什么
把出内存之外的资源恢复到它们的初始状态, 这些资源包括: 
- 已打开的文件或网络连接
- 在屏幕上画的图形
- 外部世界的某个开关

在异常没有被当前的异常处理程序捕获的情况下, 异常处理机制也会在跳到更高一层的异常处理程序之前, 执行finally子句.  

当涉及break和continue语句时, finally子句也会得到执行


### 在return中使用finally
finally子句会在return之前执行

### 缺憾: 异常丢失
[LostMessage.java](./LostMessage.java)