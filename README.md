# VirtuePay Java SDK

## 简介

1. [docs](/docs) 目录下为 VirtuePay Java SDK 的使用文档。
2. [example](/example) 目录下为示例工程。
3. [src](/src) 为 VirtuePay Java SDK 的源代码，可以关联到 virtuepay-java-x.x.x.jar 文件。或者直接把源代码引入到工程之中。

## 版本要求

Java 要求 JDK 8 及以上。

## 安装

### maven 安装

``` xml
<dependency>
    <groupId>cn.virtuepay</groupId>
    <artifactId>virtuepay-java</artifactId>
    <version>1.0.0</version>
</dependency>
```

### gradle 安装

```
compile 'cn.virtuepay:virtuepay-java:1.0.0'
```

## 初始化

```
VirtuePay.apiKey = "YOUR_API_KEY";
```

## 使用示例

* [example](/example) 示例项目工程。该工程提供了付款、退款等 demo。
* [test](/src/test/java/cn/virtuepay) 目录下的示例。
