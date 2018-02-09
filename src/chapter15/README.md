# 泛型
基本类型无法作为类型参数   

## 泛型方法
是否拥有泛型方法, 与所在类是否是泛型没有关系  

[GenericMethods.java](./GenericMethods.java)  

### 杠杆利用类型参数推断
Java SE7 已经支持参数推断.  
`List<Integer> list = new ArrayList<>();`

### 可变参数与泛型方法
泛型方法与可变参数列表能够很好地共存

### 用于Generator的泛型方法
...

### 一个通用的Generator
[BaseGenerator.java](./BaseGenerator.java)

### 简化元组的使用
[Tuple.java](./Tuple.java)

### 一个Set实用工具
[Sets.java](./Sets.java)

## 匿名内部类
泛型可以应用在内部类以及匿名内部类中  

## 构建复杂模型
...

## 擦除的神秘之处
Java泛型是使用擦除来实现的, 在使用泛型时, 任何具体的类型信息都被擦除了, 你唯一知道的就是你在使用一个对象.  

### C++方式
[Manipulator.cpp](./Manipulator.cpp)  

[Manipulator.java](./Manipulator.java)  

泛型类型参数将擦除到它的第一个边界.  

### 迁移兼容性
> 擦除是Java泛型实现中的一种折中, 因为泛型不是Java语言出现时就有的组成部分, 所有这种折中是必需的

### 擦除的问题
> 泛型不能用于显示地引用运行时类型的操作中, 例如转型, instanceof操作和new表达式, 因为所以关于参数的类型信息都丢失了, 无论何时, 当你在编写泛型代码时, 必须时刻提醒自己, 你只是看起来好像拥有有关参数的类型信息而已.

### 边界处的动作
...

## 擦除的补偿
如果引用类型标签, 就可以转而使用动态的IsInstance()  

[ClassTypeCapture.java](./ClassTypeCapture.java)  

### 创建类型实例
创建泛型类型的对象, Java中的解决方案是传递一个工厂对象.  

最便利的工厂对象是Class对象[ClassAsFactory.java](./ClassAsFactory.java)  

建议使用显示的工厂[FactoryConstraint.java](./FactoryConstraint.java)

### 泛型数组


## 边界
因为擦除移出了类型信息, 所以, 可以用无界泛型参数调用的方法只是那些可以用Object调用的方法.  

Java泛型重用了extends关键字  

使用边界[BasicBounds.java](./BasicBounds.java)  

在继承的每个层次上添加边界限制[EpicBattle.java](./EpicBattle.java)

## 通配符
编译时是Fruit[], 运行时是Apple[][CovariantArrays.java](./CovariantArrays.java)  

Apple的List在类型上不等价于Fruit的List, 即使Apple是一种Fruit类型`List<Fruit> flist = new List<Apple>(); //Compile Error`真正的问题是我们在讨论容器的类型, 而不是容器的持有类型.  

无法再添加[GenericsAndCovariance.java](./GenericsAndCovariance.java)  

### 编译器有多聪明
[CompilerIntelligence.java](./CompilerIntelligence.java)  

[Holder.java](./Holder.java)  

### 逆变
超类型通配符`<? super MyClass>`, 可以安全写入[GenericWriting.java](./GenericWriting.java)  

[GenericReader.java](./GenericReader.java)

### 无界通配符
<?> 可以被认为是一种修饰"我想用Java的泛型来编写这段代码, 我在这里并不是要用原生类型, 但是在当前这种情况下, 泛型参数可以持有任何类型"[UnboundedWildcards1.java](./UnboundedWildcards1.java)  

List实际上表示"持有任何Object类型的原生List", List<?>表示"具有某种特定类型的非原生List, 只是我们不知道那种类型是什么"  

[Wildcards.java](./Wildcards.java)  










