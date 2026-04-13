# File Compression Simulator
### Using Core Java & OOP Concepts

A console-based Java application that simulates file compression and decompression using **Run-Length Encoding (RLE)**.

---

## About the Project

This project was developed as part of the course **Object Oriented Programming with Java (RU-100-01-00012)** at **Rungta International Skills University, Bhilai, CG** during the session 2025-26.

The system takes a string input, compresses it by encoding consecutive repeated characters, and then accurately reconstructs the original string through decompression.

**Submitted by:** Mayank Kumar (ARP ID: 10795)
**Guide:** Mr. Santanu Sasmal, IBM SME and Expert

---

## How It Works

Run-Length Encoding replaces sequences of repeated characters with the character followed by its count.

**Example:**
```
Input  : aaaabbc
Output : a4b2c1
```
Decompressing `a4b2c1` gives back `aaaabbc`.

---

## Project Structure

```
FileCompressionSimulator/
│
├── src/
│   ├── Compressor.java       # Core class with compress() and decompress()
│   └── CompressionDemo.java  # Main driver class
│
└── Project_Report.md         # Full project report
```

---

## Classes

### Compressor
| Method | Description |
|--------|-------------|
| `compress(String input)` | Compresses the input string using RLE |
| `decompress(String compressed)` | Reconstructs the original string from compressed form |

### CompressionDemo
- Contains the `main()` method
- Reads user input via `Scanner`
- Calls `compress()` and `decompress()`
- Displays all results and verifies correctness

---

## Sample Output

```
Enter String: aaaabbc

Original String   : aaaabbc
Compressed String : a4b2c1
Decompressed String: aaaabbc

Verification: SUCCESS - Decompressed string matches original.
```

---

## How to Run

**Requirements:** Java JDK 8 or above

```bash
# Step 1: Navigate to the src folder
cd src

# Step 2: Compile
javac Compressor.java CompressionDemo.java

# Step 3: Run
java CompressionDemo
```

---

## Concepts Used

- Classes and Objects
- String Manipulation (`charAt()`, `StringBuilder`, `Character.isDigit()`)
- Loops and Conditional Statements
- OOP Method Design

---

## Course Details

| Field | Detail |
|-------|--------|
| Course | Object Oriented Programming with Java |
| Course Code | RU-100-01-00012 |
| University | Rungta International Skills University |
| Session | 2025-26 |
| Project No. | 34 |
