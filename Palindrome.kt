//check if Strings are a palindrome
// "The quick brown fox jumps over the lazy dog", "Oozy Rat in a Sanitary Zoo", "I love programming"

fun main(){
    var stringToCheck = arrayListOf("The quick brown fox jumps over the lazy dog", "Oozy Rat in a Sanitary Zoo", "I love programming")

    for (string in stringToCheck){
        if (string.replace(" ","").lowercase() == string.replace(" ","").lowercase().reversed()){
            println("$string is a palindrome")
        }else{
            println("$string is not a palindrome")
        }
    }
}

//Thanks for watching and happy coding!
//Explenation in description! :)

