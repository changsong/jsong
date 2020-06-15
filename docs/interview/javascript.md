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

[由浅入深：彻底弄懂JS原型与继承](https://mp.weixin.qq.com/s?__biz=MzI5MjU0Mjk5MA==&mid=2247483768&idx=1&sn=4579b7bd22420d18009505a5a7454a9d&chksm=ec7e8e19db09070f8d529cb6a3f9bb425c20ac3bd4d936f4eb9e918facbe3d7e6eecdd719c4c&token=816776520&lang=zh_CN#rd
)

### new和this
new 操作符具体干了什么？

> 当我们new一个数据的时候，new操作符到底做了什么？
1. 首先是创建实例对象{}
2. this 变量引用该对象，同时还继承了构造函数的原型
3. 其次属性和方法被加入到 this 引用的对象中
4. 并且新创建的对象由 this 所引用，最后隐式的返回 this

new的模拟实现
```javascript
function objectFactory() {

    var obj = new Object(),//从Object.prototype上克隆一个对象

    Constructor = [].shift.call(arguments);//取得外部传入的构造器

    var F=function(){};
    F.prototype= Constructor.prototype;
    obj=new F();//指向正确的原型

    var ret = Constructor.apply(obj, arguments);//借用外部传入的构造器给obj设置属性

    return typeof ret === 'object' ? ret : obj;//确保构造器总是返回一个对象

};
```

this 对象的理解

普通函数

this 总是指向函数的直接调用者
如果有 new 关键字，this 指向 new 出来的实例对象
在事件中，this 指向触发这个事件的对象
IE 下 attachEvent 中的 this 总是指向全局对象 Window
箭头函数中，函数体内的this对象，就是定义时所在作用域的对象，而不是使用时所在的作用域的对象。
function foo() {
  console.log(this.a)
}
var a = 1
foo()           //1       
​
const obj = {
  a: 2,
  foo: foo
}
obj.foo()      //2
​
const c = new foo()   //undefined
对于直接调用 foo 来说，不管 foo 函数被放在了什么地方，this 一定是window
对于 obj.foo() 来说，我们只需要记住，谁调用了函数，谁就是 this，所以在这个场景下 foo 函数中的 this 就是 obj 对象
对于 new 的方式来说，this 被永远绑定在了 new出来的对象上，不会被任何方式改变 this
说完了以上几种情况，其实很多代码中的 this 应该就没什么问题了，下面让我们看看箭头函数中的 this

%[{ contactme.md }]%