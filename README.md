# 🧠 LeetCode Java задачи с пояснениями.

Тут будет хранится разбор задач с сайта [LeetCode](https://leetcode.com/). Все задачи выполнены на языке Java. Каждая задача сопровождается примером и ключевыми моментами.

---

## ➕ TwoSum

Нужно найти индексы двух чисел в массиве, которые в сумме дают target.

```java
int[] nums = {2, 7, 11, 15}; int target = 9; -> [0, 1].

🔹 Основные моменты:
    📌 Первый цикл перебирает массив nums.
    📌 Второй цикл ищет вторую часть пары nums[j].
    📌 Подойдетдля маленьких массивов (n < 100) или когда важна простота кода.

## ◀️ Palindrome Number

Дано целое число x. Нужно определить, является ли оно палиндромом.

int x = 1221; -> true  
int x = -121; -> false

🔹 Основные моменты:
    📌 Сначала отбрасываются отрицательные числа и числа, оканчивающиеся на 0 (исключение — 0).
    📌 Переворачивается только половина числа, чтобы избежать переполнения и лишних вычислений.
    📌 Сравниваются оригинал и перевёрнутая половина.

## 🔄 Valid Parentheses

Дана строка s, содержащая только символы '(', ')', '{', '}', '[' и ']'. Необходимо определить, является ли строка валидной.

(validator.isValid("()")); -> true
(validator.isValid("()[]{}")); -> true
(validator.isValid("(]")); -> false
(validator.isValid("([)]")); -> false

🔹 Основные моменты:
    📌 Используется стек (LIFO - Last In First Out) для отслежевания скобок. 
    📌 Проходит по строке циклом for.
    📌 Обрабатывает случаи с открытыми скобками.
    📌 Обрабатывает случаи с закрытыми скобками.
