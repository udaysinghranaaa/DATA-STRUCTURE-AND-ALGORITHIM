# Count Digits of a Number (Java)

## 📝 Problem Statement

Given an integer **N**, count the total number of digits present in the number.

### Examples

**Example 1**

**Input**

```text
12345
```

**Output**

```text
5
```

**Explanation**

The number `12345` contains **5 digits**.

---

**Example 2**

**Input**

```text
987654321
```

**Output**

```text
9
```

---

**Example 3**

**Input**

```text
0
```

**Output**

```text
1
```

---

## 💡 Approach

The idea is simple:

* Every time we divide a number by `10`, its last digit is removed.
* We keep removing the last digit until the number becomes `0`.
* Each time we remove a digit, we increase the counter by `1`.

### Example

```
12345
 ↓
1234
 ↓
123
 ↓
12
 ↓
1
 ↓
0
```

The number became `0` after **5** divisions.

Hence, the answer is **5**.

---

## 🧠 Algorithm

1. Initialize `count = 0`.
2. While `n > 0`

   * Increment `count`.
   * Divide `n` by `10`.
3. Print `count`.

---

## ☕ Java Code

```java
public class Main {

    public static void main(String[] args) {

        int n = 12345;
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println(count);
    }
}
```

---

## 🔍 Dry Run

Initial Values

```
n = 12345
count = 0
```

| Iteration | n Before | count | n After (`n / 10`) |
| --------- | -------: | ----: | -----------------: |
| 1         |    12345 |     1 |               1234 |
| 2         |     1234 |     2 |                123 |
| 3         |      123 |     3 |                 12 |
| 4         |       12 |     4 |                  1 |
| 5         |        1 |     5 |                  0 |

Loop stops because `n` becomes `0`.

Final Answer:

```
5
```

---

## ⏱ Time Complexity

* **O(d)**

Where **d** is the number of digits in the number.

---

## 💾 Space Complexity

* **O(1)**

No extra space is used.

---

## 🎯 Key Concept

Two operations are used:

```java
count++;
```

Counts one digit.

```java
n = n / 10;
```

Removes the last digit from the number.

These two operations are repeated until the number becomes `0`.

---

## 📚 Related Problems

* Reverse a Number
* Palindrome Number
* Armstrong Number
* Sum of Digits
* Count Even and Odd Digits
* Digit Frequency
