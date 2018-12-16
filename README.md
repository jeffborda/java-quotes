# Java Quotes

This lab creates an app that prints out a random Ron Swanson quote from the internet and then saves it to a JSON file.

The app also has the capability to print a quote from the JSON file if there is a problem with the internet connection.


## Instructions

The app can be run from the command line (without any arguments) to print a random quote from the file.   
* The gradle command is:
```gradle run```   
* It can also be run with the command:
```java App```


## Quote Class Description

The Quote class is made up of the following fields:   
```
private String text;
private String author;
```   
     
The method: ```public String toString()``` has been overriden to return a String formatted for printing.

       
## Testing

We utilized JUnit testing to test every method in the Quote class, and make sure we were generating an approximately normal distribution of indexes with our getRandomQuote() method.


## Dependencies

* [Gson](https://github.com/google/gson)    

To install Gson, copy the following code into your dependencies:   
```
dependencies {
       implementation 'com.google.code.gson:gson:2.8.5'
}
```

## Credits

Credit for the Ron Swanson quote generator:

https://github.com/jamesseanwright/ron-swanson-quotes