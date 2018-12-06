# Lab 08 - Object Oriented Design: Java Quotes

This lab creates an app that prints out a random quote generated from the recentquotes.json file.

## App Description

In order to print out a random quote, we read in the json file with BufferedReader.  From there we use Gson to parse the quotes into a quote array.  The last step is to generate a random index of the array and print the quote, using the ```toAuthorAndTextString()``` method in our Quote class.


## Instructions

The app can be run from the command line (without any arguments) to print a random quote from the file.  The gradle command is:   
```gradle run```


## Quote Class Description

The Quote class is made up of the following fields:   
```
private String text;
private String[] tags;
private String author;
private String likes;
```   
The Quote class has a constructor, a ```getText()``` function to return a quote, and ```public String toAuthorAndTextString()``` which returns a String formatted for printing.

       
## Testing

We utilized JUnit testing to test every method in the Quote class, and make sure we were generating an approximately normal distribution of indexes with our getRandomQuote() method.


## Dependencies

* [Gson](https://github.com/google/gson)