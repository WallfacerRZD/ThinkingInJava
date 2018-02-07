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

