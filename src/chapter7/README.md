# 复用类
## 组合语法
将对象的引用置于新类中即可.  

toString(): 每个非基本类型的对象都有一个toString()方法, 当编译器需要一个String而你却只有一个对象时, 该方法就会被调用.  

类中域为基本类型时能够自动被初始化为零, 对象的引用会被初始化为null.  

可以在代码下列位置初始化引用:
1. 在定义对象的地方.
2. 在类的构造器中.
3. 在正要使用这些对象之前(惰性初始化)
4. 使用实例初始化
[初始化](./initializaion.java)

## 继承语法
继承会得到基类中所有的域和方法.  

同一个文件中每个类都可以创建一个main()方法, 可以相互调用, 包访问权限的类其public main()仍然可以访问

### 初始化基类
继承并不只是复制基类的接口, 当创建了一个导出类的对象时, 该对象包含了一个基类的子对象.这个子对象与用基类直接创建的对象是一样的.二者的区别后者来自外部, 基类的子对象被包装在导出类对象内部  

Java会自动在导出类的构造器中插入对基类构造器的调用, 如果导出类没有构造器, 编译器也会合成一个默认的构造器, 该构造器将调用基类的构造器   

基类构造器总会被调用, 且在导出类构造器之前调用   

#### 带参数的构造器
如果没有默认的基类构造器, 或者想调用一个带参数的基类构造器, 就必须使用关键字super显示编写调用基类构造器的语句.   
 
## 代理
将一个成员对象置于所要构造的类中, 与此同时在新类中暴露了该成员对象的所有方法(含有某个对象, 太空船和太空船控制器的关系)  

## 结合使用组合和继承
..

### 确保正确清理
Java中没有C++中析构函数的概念.如果想要某个类清理一些东西, 必须显示地编写一个特殊方法来做这件事.  

清理方法的调用顺序同生成顺序相反(通常要求基类元素依旧存活)  

### 名称屏蔽
如果基类拥有某个被多次重载的方法, 在导出类中重新定义该方法名称并不会屏蔽其在基类中的任何版本(在Java中正常重载, 在C++中则会屏蔽父类的同名函数)  

@Override关键字: 在重载而非覆写中使用此关键字, 编译器会报错  

## 在组合与继承之间选择
组合和继承都允许在新的类中放置子对象, 组合时显示这样做, 而继承则是隐式地做.  

- 组合: 组合通常用于想在新类中使用现有类的功能而非它的接口这种情形(has-a关系)
- 继承: 继承意味着使用一个通用类, 并为了某种特殊需要而将其特殊化(is-a关系)

## protected关键字




