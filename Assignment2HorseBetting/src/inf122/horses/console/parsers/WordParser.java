// WordParser.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Interface for objects that parse single words and return a value
// of some type.  It is expected that these throw exceptions deriving
// from RuntimeException when they fail.

package inf122.horses.console.parsers;


interface WordParser<T>
{
	T parse(String word);
}
