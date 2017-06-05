### Viewshot

Viewshot is a Android library that saves any `View`, `ViewGroup` or `SurfaceView` as an image in either `JPG/PNG/.nomedia.`
Perfect for apps like photofilter, quotes, meme and drawing apps!


<a href="https://github.com/Muddz/Viewshot/raw/master/demo.apk">Download the demo.apk</a>

### Features

- The library saves in an ```AsyncTask``` thread
- Save your Views in: ```.JPG```  ```.PNG ``` ```.nomedia```
- Set a listener that gives you a boolean value and String path for when/if the image is saved.
- Set filename and specifiy your own directory/path or leave it to defaults.
- Support from API 19+
- Very simple to use!
----

### Example of the simplest usage:

```java
   Viewshot.of(view).toJPG().save();
```

### With all current attributes:

```java
             Viewshot.of(view)
                        .setOnSaveResultListener(this)
                        .setFilename("My image")
                        .setDirectoryPath("Pictures/myAppName")
                        .toPNG()
                        .save();
```
    
    
### Installation

Add the depedency in your build.gradle. The library is distributed via jCenter

```groovy
dependencies {
    compile 'com.muddzdev:viewshot:1.0.2'  
}
```
 ----

### License

    Copyright 2017 Muddii Walid (Muddz)

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
