# CharacterDecode
汉字转拼音

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
