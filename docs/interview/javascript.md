### 数据类型

#### JavaScript 有几种类型
基本数据类型：undefined、null、boolean、number、string、symbol(es6的新数据类型)
引用数据类型：object、array、function(统称为object)

#### 数据类型检测
```javascript
typeof 对于基本数据类型来说，除了 null 都可以显示正确的类型，typeof 对于对象来说，除了函数都会显示 objec
typeof 5 // 'number'
typeof '5' // 'string'
typeof undefined // 'undefined'
typeof false// 'boolean'
typeof Symbol() // 'symbol'
console.log(typeof null)  //object
console.log(typeof NaN)   //number

typeof [] // 'object'
typeof {} // 'object'
typeof console.log // 'function'
```
instanceof通过原型链来判断数据类型的
```javascript
p1 = new Person()
p1 instanceof Person // true
Object.prototype.toString.call()可以检测所有的数据类型，算是一个比较完美的方法了。
var obj={}
var arr=[]
console.log(Object.prototype.toString.call(obj))    //[object Object]
console.log(Object.prototype.toString.call(arr))    //[object Array]
```

### 深浅拷贝

#### 浅拷贝
```javascript
Object.assign()    //es6的方法
```

Object.assign会合并对象生成一个新对象。如果对象的属性是普通类型改变之后新对象不会改变，如果是引用类型改变后新对象也会改变，所以Object.assign实际上还是浅拷贝。

```javascript
var obj={aa:1,b:{item:'45'}};
var newObj=Object.assign({},obj);
obj.aa=2;
obj.b.item='kk';
console.log(newObj.aa);        //1
console.log(newObj.b.item);    //kk
```

#### 深拷贝
```javascript
JSON.parse(JSON.stringify(obj))
```
利用JSON.stringify(obj)将对象先转为json字符串，再JSON.parse(）转回为json对象可以实现深拷贝，这也是比较常用的一种方法。

#### 用js实现一个深拷贝
```javascript
其实深拷贝可以拆分成 2 步，浅拷贝 + 递归，浅拷贝时判断属性值是否是对象，如果是对象就进行递归操作，两个一结合就实现了深拷贝。
  function cloneDeep(source) {
      if (!isObject(source)) return source; // 非对象返回自身
      var target = Array.isArray(source) ? [] : {};
      for (var key in source) {
        if (source.hasOwnProperty(i)) {
          if (isObject(source[key])) {
            target[key] = cloneDeep(source[key]); // 注意这里
          } else {
            target[key] = source[key];
          }
        }
      }
      return target;
    }
function isObject(obj) {
    return typeof obj === 'object' && obj != null;
}
```

### 作用域

#### 变量声明提升
- 在 JavaScript 中，函数声明（function aa(){}）与变量声明（var）经常被 JavaScript 引擎隐式地提升到当前作用域的顶部。
- 函数声明的优先级高于变量，如果变量名跟函数名相同且未赋值，则函数声明会覆盖变量声明
- 声明语句中的赋值部分并不会被提升，只有变量的名称被提升

#### 作用域链
因为函数的嵌套形成作用域的层级关系。当函数执行时，从当前作用域开始搜，没有找到的变量，会向上层作用域查找，直至全局函数，这就是作用域链。
- 在 JavaScript 中，作用域为 function(){}内的区域，称为函数作用域。
- 全局函数无法查看局部函数的内部细节，但局部函数可以查看其上层的函数细节，直至全局细节

#### 闭包
闭包的原理就是作用域链，比函数F内部有一个函数G，函数 G可以访问到函数F中的变量，那么函数G就是闭包。
```javascript
function F() {
  let a = 1
  window.G = function () {
      console.log(a)
  }
}
F()  // 1
```

### 原型和继承
#### js 创建对象的几种方式

字面量创建
```javascript
var obj={};
```

new一个构造函数
```javascript
function Pel(){}
    var p=new Pel();
    p.name="hu";
    p.age="25";
    p.address=function(){
 }
```

new关键字创建
```javascript
var obj=new Object();
```

Object.create（）创建对象
```javascript
var test = Object.create({x:1});
```

#### new Object() 、 Object.create()、{}，这三种方式创建对象有什么区别。

- 字面量和new关键字创建的对象是Object的实例，原型指向Object.prototype，继承内置对象Object，只是字面量创建更高效一些，少了__proto__指向赋值和this。
- Object.create(arg, pro)创建的对象的原型取决于arg，arg为null，新对象是空对象，没有原型，不继承任何对象；arg为指定对象，新对象的原型指向指定对象，继承指定对象


### JS 如何实现一个类
#### 构造函数法
缺点：用到了 this 和 prototype，编写复杂，可读性差
```javascript
function P(name, age){
     this.name = name;
     this.age= age;
   }
   P.prototype.sal= function(){
      
   }
   var pel= new P("jj", 1);
   pel.sell()
```

#### ES6 语法糖 class
```javascript
class Point {
       constructor(x, y) {
         this.x = x;
         this.y = y;
       }
       toString() {
         return '(' + this.x + ', ' + this.y + ')';
       }
     }
  var point = new Point(2, 3);
```

### 原型链
一句话解析什么是原型链
> 遍历一个实列的属性时，先遍历实列对象上的属性，再遍历它的原型对象，一直遍历到Object
任何一个类（函数）都有原型对象，原型对象至少有两个属性（constructor,proto）。constructor指向函数本身，proto指向父类原型对象。

函数上有一个prototype属性，指向原型对象，通过它可以访问原型对象

函数的实列可以直接访问原型对象(因为实列上有proto指向构造函数的原型对象)
```javascript
function Dog(){}        //类         
var obj=new Dog();      //实列
obj.name='沪江';
Dog.prototype.name="旺财";
Dog.prototype.eat=function(){
    console.log(this.name);
};
console.log(Dog.prototype.name);  //旺财
console.log(obj.prototype);      //undefined,prototype是类上才有的，实列上没有
obj.eat();  /沪江（先遍历实列对象上的属性，再遍历它的原型对象）
```

### 继承
Js如何实现继承？
构造函数绑定：使用 call 或 apply 方法，将父对象的构造函数绑定在子对象上
```javascript
function Cat(name,color){
 　Animal.apply(this, arguments);
 　this.name = name;
 　this.color = color;
}
```
实例继承：将子对象的 prototype 指向父对象的一个实例
```javascript
Cat.prototype = new Animal();
Cat.prototype.constructor = Cat;
```

拷贝继承：如果把父对象的所有属性和方法，拷贝进子对象
```javascript
function extend(Child, Parent) {
　　　var p = Parent.prototype;
　　　var c = Child.prototype;
　　　for (var i in p) {
　　　   c[i] = p[i];
　　　}
　　　c.uber = p;
}
```
原型继承：将子对象的 prototype 指向父对象的 prototype
```javascript
function extend(Child, Parent) {
    var F = function(){};
    　F.prototype = Parent.prototype;
    　Child.prototype = new F();
    　Child.prototype.constructor = Child;
    　Child.uber = Parent.prototype;
}
```
ES6 语法糖 extends继承
```javascript
class ColorPoint extends Point {
    constructor(x, y, color) {
        super(x, y); // 调用父类的constructor(x, y)
        this.color = color;
    }
    toString() {
        return this.color + ' ' + super.toString(); // 调用父类的toString()
    }
}
```

%[{ contactme.md }]%