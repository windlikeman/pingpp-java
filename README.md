pingpp Java SDK 
=================

****

## 简介

src/main/java/com/pingplusplus 文件夹下是 Java SDK 文件，<br>
lib 文件夹下是此 SDK 所依赖的 gson 包， <br>
example 文件夹里面是一个简单的接入示例，该示例仅供参考。

## 版本要求

Java SDK 要求 JDK 1.6 及以上版本

## 接入方法

关于如何使用 SDK 请参考 [技术文档](https://pingxx.com/document) 或者参考 [example](https://github.com/PingPlusPlus/pingpp-java/tree/master/example) 文件夹里的示例。

## 更新日志

### 2.0.1
* 更改：<br>
修改 wx credential 里的 timeStamp 类型为字符串，防止变成科学计数法

### 2.0.0
* 更改：<br>
添加新渠道支持：百付宝、百付宝WAP、微信公众平台

### 1.0.4
* 更改：<br>
添加 `Expanding` 机制