# Classroom Attendance Tracker

This is a simple Java console application for tracking classroom attendance.

## Features
- Accepts student names as input until "done" is entered
- Tracks all sign-ins and counts total sign-ins
- Identifies and lists unique students who attended
- Displays a sorted attendance list

## How It Works
1. Run the application.
2. Enter each student's name when prompted. Type "done" to finish.
3. The app will display:
   - Total sign-ins
   - Number of unique students
   - Alphabetically sorted attendance list

## Example Output
```
Enter student names (type "done" to finish):
Alice
Bob
Alice
Charlie
done
Total sign-ins: 4
Unique students: 3
Attendance list: [Alice, Bob, Charlie]
```

## File Structure
- `src/main/java/org/example/Main.java`: Main application logic

## Requirements
- Java 8 or higher

## Usage
Compile and run the `Main.java` file:
```sh
javac src/main/java/org/example/Main.java
java -cp src/main/java org.example.Main
```
