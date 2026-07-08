# 🚀 DSA Day 2 – Find Second Smallest and Second Largest Element in an Array (Java)

## 📝 Problem

Given an integer array, find the **second smallest** and **second largest** **unique** elements in the array.

> **Note:** Duplicate elements should be ignored.

### Example 1

**Input**

```text
[1, 2, 4, 7, 7, 5]
```

**Output**

```text
Second Smallest = 2
Second Largest = 5
```

---

## 💡 Approach (Optimal - One Pass)

Instead of sorting the array, we can find the answer in a **single traversal**.

Maintain four variables:

* `smallest`
* `secondSmallest`
* `largest`
* `secondLargest`

For every element:

* If it is smaller than the current smallest, update both `smallest` and `secondSmallest`.
* Otherwise, if it is greater than the smallest but smaller than the second smallest, update `secondSmallest`.
* Similarly, update `largest` and `secondLargest` while ignoring duplicate values.

This allows us to find the answer in **O(n)** time.

---

## ☕ Java Solution

```java
public class SecondLargestSmallest {

    public static void findSecondSmallestAndLargest(int[] arr) {

        if (arr.length < 2) {
            System.out.println("Array should have at least 2 elements.");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            // Find Smallest & Second Smallest
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }

            // Find Largest & Second Largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE)
            System.out.println("Second Smallest doesn't exist.");
        else
            System.out.println("Second Smallest = " + secondSmallest);

        if (secondLargest == Integer.MIN_VALUE)
            System.out.println("Second Largest doesn't exist.");
        else
            System.out.println("Second Largest = " + secondLargest);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 7, 7, 5};

        findSecondSmallestAndLargest(arr);
    }
}
```

---

## 🔍 Dry Run

Array:

```text
[1, 2, 4, 7, 7, 5]
```

| Current Number | Smallest | Second Smallest | Largest | Second Largest |
| -------------: | :------: | :-------------: | :-----: | :------------: |
|              1 |     1    |        -        |    1    |        -       |
|              2 |     1    |        2        |    2    |        1       |
|              4 |     1    |        2        |    4    |        2       |
|              7 |     1    |        2        |    7    |        4       |
|              7 |     1    |        2        |    7    |        4       |
|              5 |     1    |        2        |    7    |        5       |

**Final Answer**

```text
Second Smallest = 2
Second Largest = 5
```

---

## ⏱ Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)`

---

## ⚠️ Edge Cases

* Array contains duplicate values only.

```text
Input:
[5, 5, 5]

Output:
Second Smallest doesn't exist.
Second Largest doesn't exist.
```

* Array contains negative numbers.

```text
Input:
[-10, -5, -20, -1]

Output:
Second Smallest = -10
Second Largest = -5
```

---

## 📚 Key Learning

* Single-pass array traversal
* Tracking multiple values simultaneously
* Ignoring duplicate elements
* Using `Integer.MAX_VALUE` and `Integer.MIN_VALUE`
* Solving the problem without sorting

---

## 🎯 Interview Tip

Most beginners solve this problem by sorting the array, which takes **O(n log n)** time.

A better interview solution is to traverse the array only **once** while maintaining:

* Smallest
* Second Smallest
* Largest
* Second Largest

This achieves the optimal complexity of **O(n)** time and **O(1)** extra space.
