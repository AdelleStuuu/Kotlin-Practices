fun main() {
    
    print("\nEnter First number! ");
    var num1 = readln();
    print("Enter Second number! ");
    var num2 = readln();
    print("Enter Third number! ");
    var num3 = readln();

    var numOne: Int = num1.toInt();
    var numTwo: Int = num2.toInt();
    var numThree: Int = num3.toInt();

    var biggestNum: Int;
    if (numOne > numTwo && numOne > numThree) {
        biggestNum = numOne;
    } else if (numTwo > numOne && numTwo > numThree) {
        biggestNum = numTwo;
    } else {
        biggestNum = numThree;
    }
    print("\nThe biggest number among the three is $biggestNum!\n\n");
}
