# Project Interim Report

## On

**File Compression Simulator (Using Core Java & OOP Concepts)**

**RU-100-01-00012**

**Object Oriented Programming with Java**

**SESSION: 2025-26**

---

**Submitted By:**

| Name | ERP -id  |
|------|-----------------|
| Mayank Kumar | 10795 |

Bachelor of Technology in Computer Science & Engineering with AI and ML in association with IBM

Under the Guidance of **Mr. Santanu Sasmal, IBM SME and Expert**

**SCHOOL OF COMPUTER SCIENCE AND ENGINEERING**
**RUNGTA INTERNATIONAL SKILLS UNIVERSITY, BHILAI, CG**

**(April 2026)**

---

## Certificate

This is to certify that the project titled **"File Compression Simulator"** has been submitted by **Mayank Kumar** (ARP ID: 10795) in partial fulfillment of the requirements for the course **Object Oriented Programming with Java (RU-100-01-00012)** during the academic session 2025-26.

The work presented in this report is genuine and carried out under the guidance of **Mr. Santanu Sasmal**, IBM SME and Expert, School of Computer Science and Engineering, Rungta International Skills University, Bhilai, CG.

**Signature of Guide:** ___________________

**Signature of HOD:** ___________________

**Date:** April 2026

---

## Acknowledgement

I would like to express my sincere gratitude to **Mr. Santanu Sasmal**, IBM SME and Expert, for his constant guidance and support throughout this project. His insights into object-oriented programming and real-world problem solving helped me understand the project requirements clearly.

I also thank the **School of Computer Science and Engineering** at Rungta International Skills University for providing the necessary resources and a conducive learning environment. The structured curriculum of the OOP with Java course gave me the foundation needed to design and implement this project.

Finally, I am grateful to my classmates and family for their encouragement during the development of this project.

---

## Abstract

The **File Compression Simulator** is a console-based Java application that demonstrates the fundamental concept of data compression and decompression using a technique known as **Run-Length Encoding (RLE)**. In today's digital world, data compression plays a vital role in reducing storage space and speeding up data transfer. This project simulates that process at a conceptual level without relying on any external library.

The system accepts a string from the user, compresses it by counting consecutive repeating characters, and then reconstructs the original string from the compressed form. For example, the string `aaaabbc` is compressed to `a4b2c1` and then decompressed back to `aaaabbc`.

This project is built entirely using **Core Java** and demonstrates key **Object-Oriented Programming (OOP)** concepts including class design, method implementation, and string manipulation. It targets students who want to understand how compression algorithms work in practice, using a simple and intuitive approach.

---

## Introduction

Data compression is the process of encoding information using fewer bits than the original representation. It is widely used in file formats, network protocols, and storage systems. Real-world algorithms like ZIP and GZIP use complex mathematical techniques, but the core idea can be understood through simple approaches like Run-Length Encoding.

This project implements a **File Compression Simulator** in Java using the RLE approach. RLE works by replacing sequences of repeated characters with a single character followed by the number of times it repeats. This makes it ideal for strings that have long runs of the same character, such as images stored as pixel data or simple text patterns.

The project consists of two main Java classes:
- **Compressor** — handles the compression and decompression logic
- **CompressionDemo** — acts as the main driver class that takes user input and displays results

Key features of this project:
- Accepts any string input from the user
- Compresses the string using Run-Length Encoding
- Decompresses the string back to its original form
- Verifies that the decompressed output exactly matches the original input
- Demonstrates clean OOP class design with focused methods

---

## Objectives

- To understand and implement the concept of Run-Length Encoding (RLE)
- To design a class-based system following OOP principles
- To implement string manipulation techniques using Java's built-in methods
- To simulate the real-world concept of file compression at a basic level
- To strengthen logical thinking and problem-solving skills through hands-on coding

---

## Scope

This project is suitable for learning and demonstration purposes in an academic environment. It currently handles single-character run-length encoding on simple alphabetic strings. In the future, it can be extended to:

- Handle spaces and special characters
- Read and write to actual files on disk
- Support more advanced compression algorithms
- Show compression ratio statistics
- Provide a menu-driven interface for repeated operations

---

## System Requirements

**Hardware:**
- Computer with minimum 2 GB RAM
- Any processor running at 1 GHz or above

**Software:**
- Java JDK 8 or above
- IDE: VS Code, Eclipse, or EditPlus
- Operating System: Windows / Linux / macOS

---

## Methodology

The working of the File Compression Simulator follows these steps:

1. **Input Stage:** The user runs the program and enters a string through the console.
2. **Compression Stage:** The `compress()` method of the `Compressor` class reads the string character by character, counts consecutive repeated characters, and builds a new compressed string in the format `character + count`.
3. **Decompression Stage:** The `decompress()` method reads the compressed string, extracts each character-count pair, and reconstructs the original string by repeating each character the specified number of times.
4. **Verification Stage:** The program compares the decompressed output with the original input and displays whether the process was successful.
5. **Display Stage:** All three strings (original, compressed, decompressed) are printed on the console for the user to verify.

---

## Flowchart

```
START
  |
  v
Accept string input from user
  |
  v
Call compress(input)
  |
  v
[Loop through string]
  - Pick current character
  - Count consecutive same characters
  - Append character + count to result
  |
  v
Compressed string ready
  |
  v
Call decompress(compressed string)
  |
  v
[Loop through compressed string]
  - Read character
  - Read the number after it
  - Repeat character that many times
  |
  v
Decompressed string ready
  |
  v
Compare original == decompressed?
  |          |
 YES         NO
  |           |
Print        Print
SUCCESS      FAILED
  |
  v
END
```

### Class Diagram

**Compressor**
- No instance variables
- `compress(String input) : String`
- `decompress(String compressed) : String`

**CompressionDemo**
- `main(String[] args) : void`
  - Creates a `Compressor` object
  - Takes input using `Scanner`
  - Calls `compress()` and `decompress()`
  - Displays all results

---

## Implementation

### Compressor Class

The `Compressor` class is the core of this project. It contains two methods:

**compress() method:**
This method takes a string as input. It uses a `while` loop to traverse the string from the first character to the last. For each character, it uses an inner loop to count how many times that character repeats consecutively. Once the count is determined, the character and its count are appended to a `StringBuilder`. The index moves forward by the count value to skip already-processed characters. The final compressed string is returned.

**decompress() method:**
This method takes a compressed string as input. It reads one character at a time, then reads all digit characters that follow it to form the count number. It then uses a loop to append that character the required number of times to a `StringBuilder`. This continues until the entire compressed string is processed, and the reconstructed original string is returned.

### CompressionDemo Class

This is the main driver class. It creates a `Scanner` object to read input from the user and a `Compressor` object to perform operations. It calls `compress()` on the user's input, then calls `decompress()` on the result, and finally prints all three strings along with a verification message.

---

## Sample Input/Output

```
Enter String: aaaabbc

Original String   : aaaabbc
Compressed String : a4b2c1
Decompressed String: aaaabbc

Verification: SUCCESS - Decompressed string matches original.
```

```
Enter String: aabbccdd

Original String   : aabbccdd
Compressed String : a2b2c2d2
Decompressed String: aabbccdd

Verification: SUCCESS - Decompressed string matches original.
```

```
Enter String: abcdef

Original String   : abcdef
Compressed String : a1b1c1d1e1f1
Decompressed String: abcdef

Verification: SUCCESS - Decompressed string matches original.
```

*(Note: Screenshots of actual terminal output to be attached in the final PDF submission)*

---

## Future Enhancements

- **File I/O Support:** Instead of console input, allow users to select a text file, compress its content, and save the compressed output to a new file.
- **Compression Ratio Display:** Calculate and display how much space was saved, e.g., original length vs compressed length.
- **Special Character Support:** Handle spaces, digits, and symbols in the input string.
- **Menu-Driven Interface:** Add a menu so the user can choose between compressing, decompressing, or exiting.
- **Invalid Input Handling:** Detect and handle malformed compressed strings gracefully.
- **Huffman Encoding:** Extend the project to implement Huffman Encoding as a more advanced compression technique.

---

## Gantt Chart

| Task | Week 1 | Week 2 | Week 3 | Week 4 |
|------|--------|--------|--------|--------|
| Understanding Requirements | ✓ | | | |
| Designing Class Structure | ✓ | | | |
| Implementing Compressor Class | | ✓ | | |
| Implementing CompressionDemo | | ✓ | | |
| Testing with Sample Inputs | | | ✓ | |
| Report Writing | | | ✓ | ✓ |
| Final Review and Submission | | | | ✓ |

**Planning & Structure:** The project was broken into logical phases — understanding the RLE algorithm, designing the classes, coding, testing, and finally writing the report. This approach ensured that each component was completed and verified before moving to the next.

**Time Management:** Each week was allocated specific tasks. Coding was focused in Week 2, testing in Week 3, and documentation was maintained throughout but finalized in Week 4 before submission.

---

## Conclusion

The **File Compression Simulator** project successfully demonstrates the concept of data compression using Run-Length Encoding in Java. The project achieves all its defined objectives — it compresses a given string into a compact form and accurately reconstructs the original string through decompression.

Through this project, key OOP principles such as class design, method implementation, and encapsulation were applied. Java string manipulation methods like `charAt()`, `StringBuilder`, `Character.isDigit()`, and `Integer.parseInt()` were used effectively.

The project also verifies the correctness of its output by comparing the decompressed result with the original input, ensuring reliability. This hands-on implementation gave a clear practical understanding of why and how compression algorithms are used in the real world.

---

## References

[1] H. Schildt, *Java: The Complete Reference*, 11th ed. New York: McGraw-Hill, 2018.

[2] Oracle, "Java Documentation," Oracle. [Online]. Available: https://docs.oracle.com

[3] GeeksforGeeks, "Run Length Encoding," GeeksforGeeks. [Online]. Available: https://www.geeksforgeeks.org/run-length-encoding/

[4] A. Sharma and R. Gupta, "Data Compression Techniques in Modern Systems," *International Journal of Computer Science*, vol. 7, no. 3, pp. 88-95, 2021.
