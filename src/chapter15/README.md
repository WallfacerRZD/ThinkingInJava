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