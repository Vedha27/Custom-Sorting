# Custom-Sorting
# 🧮 Java Mini Project: Multi-level Custom Sorting Using Comparator

## 📌 Project Description

This mini-project demonstrates how to perform **multi-level custom sorting** in Java using the `Comparator` interface. It sorts a list of employees based on multiple fields with a defined priority:

### 🔢 Sorting Priority:
1. `name` (alphabetical order)
2. `salary` (ascending)
3. `dept` (alphabetical order)
4. `id` (ascending)

The project highlights how to chain multiple comparators to achieve complex sorting logic without modifying the original data class.

---

## 🏗️ Project Structure


---

## ✅ Key Features

- Uses **Comparator chaining** to sort by multiple fields.
- Demonstrates **clean object-oriented design**.
- Sorts employee records in a meaningful and logical order.
- Can be extended to support more complex or dynamic sorting needs.

---

## 📚 Concepts Demonstrated

- `Comparator` interface
- `Collections.sort()` with lambda and method references
- Chained sorting with `thenComparing()`
- Java OOP principles (encapsulation, modular design)

---

## 🛠️ Technologies Used

- Java (JDK 8 or higher)
- IDE: Eclipse / IntelliJ / VS Code

---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/CustomSortingComparator.gitID   | Name     | Salary   | Dept
Sample Output:
-------------------------------
104  | Guna     | 40000.0  | HR
105  | Guna     | 50000.0  | Finance
102  | Guna     | 50000.0  | HR
103  | Guna     | 50000.0  | HR
106  | Murali   | 45000.0  | IT
101  | Vedha    | 60000.0  | IT

