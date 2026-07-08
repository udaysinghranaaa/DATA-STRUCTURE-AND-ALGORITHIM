# 🚀 DSA Day 1 – Largest Element in an Array (Java)

## 📝 Problem

Given an integer array, find the **largest element** present in the array.

### Example

**Input**

```text
[4, 2, 7, 1, 9, 3]
```

**Output**

```text
9
```

---

## 💡 Approach

* Assume the first element is the largest.
* Traverse the array from the second element.
* If the current element is greater than the current largest, update it.
* After traversing the entire array, return the largest element.

---

## ☕ Java Solution

```java
public class LargestElement {

    public static int findLargest(int[] arr) {

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9, 3};
        System.out.println(findLargest(arr));
    }
}
```

---

## 🔍 Dry Run

Array:

```text
[4, 2, 7, 1, 9, 3]
```

| Current Element | Largest So Far |
| --------------- | -------------- |
| 4               | 4              |
| 2               | 4              |
| 7               | 7              |
| 1               | 7              |
| 9               | 9              |
| 3               | 9              |

**Answer:** `9`

---

## ⏱ Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)`

---

## ⚠️ Interview Tip

Don't initialize the largest element with `0`.

❌ Wrong:

```java
int largest = 0;
```

This fails for arrays containing only negative numbers.

✅ Correct:

```java
int largest = arr[0];
```

This works for both positive and negative values.

---

### 📌 Key Learning

* Linear traversal of an array
* Maintaining a running maximum
* Handling edge cases like negative numbers
* A common interview question for beginners
