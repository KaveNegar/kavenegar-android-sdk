# kavenegar-android-sdk
# [Kavenegar RESTful API Document](http://kavenegar.com/rest.html)
If you need to future information about API document Please visit RESTful Document

## Installation
First of all, You need to make an account on Kavenegar from [Kaveneagr webpage](https://panel.kavenegar.com/Client/Membership/Register)


After that you just need to pick API-KEY up from [My Account](http://panel.kavenegar.com/Client/setting/index) section.
Here You can download the [Java SDK] (https://github.com/KaveNegar/kavenegar-java/archive/master.zip) or just pull it.
Anyway there is good tutorial about [Pull  request](http://gun.io/blog/how-to-github-fork-branch-and-pull-request/)

### To get a Git project into your build:

Add it depend on what you are using .

#### gradle
 Step 1 <p> Add the JitPack repository to your build file </p>
 
```java
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2<p>Add the dependency</p>

```java
dependencies {
		compile 'com.github.KaveNegar:kavenegar-android-sdk:v1.beta'
	}
```
#### maven

 Step 1 <p> Add the JitPack repository to your build file </p>
 
```java
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
Step 2<p>Add the dependency</p>

```java
	<dependency>
	    <groupId>com.github.KaveNegar</groupId>
	    <artifactId>kavenegar-android-sdk</artifactId>
	    <version>v1.beta</version>
	</dependency>
```
####  sbt

Step 1 <p> Add the JitPack repository to your build file </p>
 
```java
    resolvers += "jitpack" at "https://jitpack.io"

```
Step 2<p>Add the dependency</p>

```java
    libraryDependencies += "com.github.KaveNegar" % "kavenegar-android-sdk" % "v1.beta"	

```
#### leiningen

Step 1 <p> Add the JitPack repository to your build file </p>
 
```java
    :repositories [["jitpack" "https://jitpack.io"]]
```
Step 2<p>Add the dependency</p>

```java
    :dependencies [[com.github.KaveNegar/kavenegar-android-sdk "v1.beta"]]

```
## Usage
Well,You can see an example of sending SMS through JAVA below . 

```java

try {
     KavenegarApi  api= new KavenegarApi("");
      SendResult Result = api.Send("SenderLine", "Your Receptor", "خدمات پیام کوتاه کاوه نگار");
}
catch (HttpException ex)
{ // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
  System.out.print("HttpException  : " + ex.getMessage());
}
catch (ApiException ex)
{ // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
   System.out.print("ApiException : " + ex.getMessage());
}

```

# Contribution

 Bug fixes, docs, and enhancements welcome!I know that there are so many people do these thingi you're one of the  just 
please let us know  [support@kavenegar.com](mailto:support@kavenegar.com?Subject=SDK)
 <hr>
<div dir='rtl'>
	
## راهنما

### معرفی سرویس کاوه نگار

کاوه نگار یک وب سرویس ارسال و دریافت پیامک و تماس صوتی است که به راحتی میتوانید از آن استفاده نمایید.

### ساخت حساب کاربری

اگر در وب سرویس کاوه نگار عضو نیستید میتوانید از [لینک عضویت](http://panel.kavenegar.com/client/membership/register) ثبت نام  و اکانت آزمایشی برای تست API دریافت نمایید.

### مستندات

برای مشاهده اطلاعات کامل مستندات [وب سرویس پیامک](http://kavenegar.com/وب-سرویس-پیامک.html)  به صفحه [مستندات وب سرویس](http://kavenegar.com/rest.html) مراجعه نمایید.

### راهنمای فارسی

در صورتی که مایل هستید راهنمای فارسی کیت توسعه کاوه نگار را مطالعه کنید به صفحه [کد ارسال پیامک](http://kavenegar.com/sdk.html) مراجعه نمایید.

### اطالاعات بیشتر
برای مطالعه بیشتر به صفحه معرفی
[وب سرویس اس ام اس ](http://kavenegar.com)
کاوه نگار
مراجعه نمایید .

 اگر در استفاده از کیت های سرویس کاوه نگار مشکلی یا پیشنهادی  داشتید ما را با یک Pull Request  یا  ارسال ایمیل به support@kavenegar.com  خوشحال کنید.
 
##
![http://kavenegar.com](http://kavenegar.com/public/images/logo.png)		

[http://kavenegar.com](http://kavenegar.com)	

</div>


