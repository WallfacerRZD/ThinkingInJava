# 类型信息
## Class对象
Class类是继承自Object的一个特殊类, 用Class类来表示一个类的信息.  

`Class.forName("className");` 通过类名获取一个Class实例  

`reference.getClass();` 通过引用获取一个Class实例

### 类字面常量
为了使用类所做的工作:
1. 加载:  由类加载器执行.该步骤将查找字节码, 并从这些字节码中创建一个Class对象
2. 链接: 在链接阶段将验证类中的字节码, 为静态域分配存储空间, 并且如果必需的话, 将解析这个类创建的对其他类的所有引用
3. 初始化: 如果该类具有超类, 则对其初始化, 执行静态初始化器和静态初始化块.  


className.class生成Class对象的引用, 不会触发初始化   

Class.forName()会立即初始化  

通过`类名.字段`访问编译期常量不会触发初始化, 访问非编译期常量会触发初始化.  


### 泛化的Class引用
Class引用总是指向某个Class对象, 它可以制造类的实例, 并包含可作为于这些实例的所有方法代码, 静态成员.  

可以对Class引用所指向的Class对象的类型进行限定.[GenericClassReference.java](./GenericClassReference.java)  

创建一个Class引用, 它被限定为某种类型[BoundedClassReference.java](./BoundedClassReference.java)  

newInstance()将返回该对象的确切类型  

### 新的转型语法
`class.cast(b)`将参数b转换为具体的class类型.  

## 类型转换前先做检查
RTTI形式包括:
1. 传统的类型转换: 如果执行了一个错误的类型转换, 就会抛出一个ClassCastException异常
2. 代表对象的类型的Class对象: 通过查询Class对象可以获取运行时所需的信息
3. instanceof关键字: 判断对象是不是某个特定类型的实例

### 使用类字面常量
[PetCount.java](./PetCount.java)   

[PetCount3.java](./PetCount3.java)

## instanceof与Class的等价性
...

## 反射:运行时的类信息

## 动态代理
[Interface.java](./Interface.java)  
[DynamicProxyHandler.java](./DynamicProxyHandler.java)
## 空对象
[Person.java](./Person.java)
