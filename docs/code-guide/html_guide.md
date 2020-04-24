 
4
2
tab
1  <ul>
2
3
<li>first</li>
<li>second</li></ul>
120
class
-
class
1 <!-- good --><div class="sidebar"></div>
2 <!-- bad --><div class="left"></div>
id
 
 
id
-
id  class
1 <!-- good --><div id="nav"></div><!-- bad --><div id="navigation"></div>
2 <!-- good --><p class="comment"></p><!-- bad --><p class="com"></p>
3 <!-- good --><span class="author"></span><!-- bad --><span class="red"></span>
hook
class
name   id
1 <input name="foo"><div id="foo"></div><script> // IE6
alert(document.getElementById('foo').tagName); </script>
INPUT
1 <!-- good --><p>Hello StyleGuide!</p>
2 <!-- bad --><P>Hello StyleGuide!</P>
1 <!-- good --><input type="text" name="title">
 
 
2 <!-- bad --><input type="text" name="title" />
HTML5
1 <!-- good --><ul>
2
3
<li>first</li>
<li>second</li></ul>
4 <!-- bad --><ul>
5
6
<li>first
<li>second</ul>
Elements
HTML
 
 
1 <!-- good --><p>Esprima serves as an important <strong>building block</strong> for
some JavaScript language tools.</p>
2 <!-- bad --><div>Esprima serves as an important <span class="strong">building
block</span> for some JavaScript language tools.</div>
CSS
1 <!-- good --><img class="avatar" src="image.png">
2 <!-- bad --><span class="avatar">
3
<img src="image.png"></span>
1 <!-- good --><table cellspacing="0">...</table>
2 <!-- bad --><table cellSpacing="0">...</table>
1 <!-- good --><script src="esl.js"> </script>
2 <!-- bad --><script src='esl.js'> </script><script src=esl.js> </script>
1 <input type="text" disabled><input type="checkbox" value="1" checked>
xxx-
data-
 
 
1 <ol data-ui-type="Select"></ol>
HTML5   doctype
DOCTYPE
1 <!DOCTYPE html>
1 <meta http-equiv="X-UA-Compatible" content="IE=Edge">
html
:lang(*-Hans)
1 <html lang="zh-CN">
1 <html lang="zh-cmn-Hans">
1 <html lang="zh-cmn-Hant">
 
 
meta
head
1  <html>
2
3
4
5
6
7
8
<head>
<meta charset="UTF-8">
......
</head>
<body>
......
</body></html>
HTML
BOM   UTF-8
CSS
rel="stylesheet"
1 <link rel="stylesheet" href="page.css">
CSS   JavaScript
type
text/css   text/javascript
CSS
JavaScript
head
CSS
 
 
JavaScript
1  <body>
2
3
<!-- a lot of elements -->
<script src="init-behavior.js"> </script></body>
URL
protocol-relative  URL
protocol-relative  URL
IE7/8
1 <script src="//s1.bdstatic.com/cache/static/jquery-1.10.2.min_f2fb5194.js">
</script>
title
title
head
charset
1  <head>
2
3
<meta charset="UTF-8">
<title>
</title></head>
favicon
 
 
1 <link rel="shortcut icon" href="path/to/favicon.ico">
viewport
img   src
src
img
title
alt
width   height
img
CSS
 
 
label
1 <label><input type="checkbox" name="confirm" value="on">
</label>
2 <label for="username">
id="username">
</label> <input type="textbox" name="username"
button
type
1 <button type="submit">   </button><button type="button">    </button>
name
DOM
 
 
float: right
1 <!-- good --><style> .buttons .button-group { float: right; } </style>
2 <div class="buttons">
3
4
5
6
<div class="button-group">
<button type="submit">   </button>
<button type="button">   </button>
</div></div>
7 <!-- bad --><style> .buttons button { float: right; } </style>
8 <div class="buttons">
9
<button type="button">   </button>
10
<button type="submit">   </button></div>
JavaScript
1 <form action="/login" method="post">
2
3
<p><input name="username" type="text" placeholder="
"></p>
<p><input name="password" type="password" placeholder="   "></p></form>
type
1 <input type="date">
audio    video
 
 
HTML5
audio   video
1 <audio controls>
2
3
4
5
6
<source src="audio.mp3" type="audio/mpeg">
<source src="audio.ogg" type="audio/ogg">
<object width="100" height="50" data="audio.mp3">
<embed width="100" height="50" src="audio.swf">
</object></audio>
7 <video width="100" height="50" controls>
8
9
<source src="video.mp4" type="video/mp4">
<source src="video.ogg" type="video/ogg">
<object width="100" height="50" data="video.mp4">
<embed width="100" height="50" src="video.swf">
</object></video>
10
11
12
object
1 <object width="100" height="50" data="something.swf">DO NOT SUPPORT THIS
TAG</object>
HTML
 
 
1 <!-- good -->
2 {if $display == true}<div>
3
4
5
6
7
<ul>
{foreach $item_list as $item}
<li>{$item.name}<li>
{/foreach}
</ul></div>
8  {/if}
9 <!-- bad -->
10 {if $display == true}
11
12
13
14
15
16
17
<div>
<ul>
{foreach $item_list as $item}
<li>{$item.name}<li>
{/foreach}
</ul>
</div>
18  {/if}
HTML
1 <!-- good --><li class="{if $item.type_id == $current_type}focus{/if}">{
$item.type_name }</li>
2 <!-- bad --><li {if $item.type_id == $current_type} class="focus"{/if}>{
$item.type_name }</li>
1 <!-- good --><table>
2
3
4
5
{foreach $item_list as $item_group}
<tr>
{foreach $item_group as $item}
<td>{ $item.name }</td>
 
 
6
7
8
{/foreach}
<tr>
{/foreach}</table>
9 <!-- bad --><table><tr>
{foreach $item_list as $item}
10
11
12
13
14
15
16
<td>{ $item.name }</td>
{if $item@iteration is div by 5}
</tr>
<tr>
{/if}
{/foreach}</tr></table>

