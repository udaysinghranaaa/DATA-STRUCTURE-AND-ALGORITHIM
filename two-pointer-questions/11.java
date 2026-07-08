# Count Digits of a Number (Java)

## 📌 Problem Statement

Given an integer `N`, count the total number of digits present in the number.

The number is taken as input from the user.

---

## 📝 Examples

### Example 1

**Input**

```text
12345
```

**Output**

```text
5
```

**Explanation**

The number `12345` contains 5 digits.

---

### Example 2

**Input**

```text
987654
```

**Output**

```text
6
```

**Explanation**

The number `987654` contains 6 digits.

---

### Example 3

**Input**

```text
0
```

**Output**

```text
1
```

**Explanation**

Zero itself is considered a single digit number.

---

# 💡 Approach

To count the digits:

1. Take the input number from the user.
2. Initialize a variable `count = 0`.
3. Remove the last digit of the number using division by `10`.
4. Increase the count after removing each digit.
5. Continue this process until the number becomes `0`.
6. Print the final count.

---

# 🧠 Algorithm

```
Step 1: Read number N
Step 2: Initialize count = 0
Step 3: If N is 0, answer is 1
Step 4: While N > 0:
            count++
            N = N / 10
Step 5: Print count
```

---

# ☕ Java Code

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Handling negative numbers
        n = Math.abs(n);

        // Special case for zero
        if (n == 0) {
            System.out.println("Number of digits: 1");
            return;
        }

        int count = 0;

        // Counting digits
        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
```

---

# 🔍 Dry Run

Input:

```
845729
```

Initial:

```
n = 845729
count = 0
```

| Iteration |     n | count |
| --------- | ----: | ----: |
| 1         | 84572 |     1 |
| 2         |  8457 |     2 |
| 3         |   845 |     3 |
| 4         |    84 |     4 |
| 5         |     8 |     5 |
| 6         |     0 |     6 |

Output:

```
Number of digits: 6
```

---

# ⏱ Time Complexity

```
O(d)
```

Where `d` is the number of digits in the number.

---

# 💾 Space Complexity

```
O(1)
```

Only a few variables are used.

---

# 🔑 Key Concepts Learned

* `% 10` is used to get the last digit of a number.
* `/ 10` is used to remove the last digit.
* Loop continues until the number becomes zero.
* Handles edge case `0`.

---

# 🚀 Related Problems

* Reverse a Number
* Palindrome Number
* Armstrong Number
* Sum of Digits
* Count Even and Odd Digits
* Digit Frequency

---

# 🏷️ Tags

`Java` `Basic Maths` `Number Manipulation` `Beginner DSA`
