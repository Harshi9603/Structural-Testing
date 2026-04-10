🔹 Description

The VendingMachine.java program simulates a vending machine that:

Accepts an integer input (money)
Allows selection of:
Candy (20 cents)
Coke (25 cents)
Coffee (45 cents)
Returns:
Item + change OR
Error message if insufficient funds
🧪 Testing Approach
Implemented JUnit 5 test cases
Designed 13 test cases (including constructor coverage)
Covered:
Exact payment
Overpayment (change returned)
Underpayment (various conditions)
📊 Coverage Tool
JaCoCo (Java Code Coverage)
Integrated using Maven
✅ Results
Statement Coverage: 100%
Branch Coverage: ~93%

📌 Note:
Full branch coverage is not achievable due to overlapping conditional logic in the code.

📁 Coverage Report

Generated at:

target/site/jacoco/index.html
🧩 Part 2: Static Analysis
🔹 Tool Used
PMD (Static Code Analysis Tool)
🔍 Analysis Focus
Detect data flow anomalies such as:
Unused variables
Improper string comparisons
Code structure issues
⚠️ Findings
Unused variables (data flow anomaly)
Incorrect string comparison using ==
Missing braces in control statements
Class design warnings
🧠 Evaluation of Tool
✔ Features
Detects bugs, code smells, and style issues
Provides detailed reports with line numbers
✔ Coverage
Identifies:
Dead code
Duplicate code
Potential runtime errors
✔ Ease of Use
Easy integration with Maven
Clear and structured output
🛠️ Technologies Used
Java (JDK 17+)
Maven
JUnit 5
JaCoCo
PMD
▶️ How to Run
Run Tests
mvn clean test
Generate Coverage Report
mvn clean test

Open:

target/site/jacoco/index.html

