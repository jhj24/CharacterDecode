# 汉字转拼音
## 简介
实现汉字对拼音的转换，支持多音字（可能不支持有些多音字，可补全）

## 示例

![重庆](https://github.com/jhj24/CharacterDecode/raw/master/app/screenshot/chongqing.png)        ![重要](https://github.com/jhj24/CharacterDecode/raw/master/app/screenshot/chongqing.png)


## 依赖

gradle

/build.gradle
```
repositories {
    ...
    maven { url 'https://jitpack.io' }
}
```
/app/build.gradle
```
dependencies {
    ...
     compile 'com.github.jhj24:CharacterDecode:v1.0.0'
}
```

## 使用方法
```
String string = "刘德华";
CharacterUtil character = CharacterUtil.getInstence(this)

String allSpelling = character.getAllSpelling(string);
//liudehua

String firstSpelling = character.getFirstSpelling(string);
//liu

String allAlpha = character.getAllAlpha(string);
//ldh

String firstAlpha = character.getFirstAlpha(string);
//l

String array = Arrays.toString(character.getStringArray(string));
//[liu, de, hua]

```
