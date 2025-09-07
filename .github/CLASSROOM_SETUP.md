# GitHub Classroom Configuration - ANTLR Grammar Template

This project is configured as a **template** for GitHub Classroom with automated testing and grading for any ANTLR4 grammar.

## Overview

This ANTLR4 grammar validation template includes:
- **Generic** ANTLR grammar compilation testing
- **Flexible** grammar validation framework supporting any grammar
- **Simple** scoring based on compilation success and test execution
- **Template-friendly** autograding that doesn't depend on specific grammar names

## Autograding Tests (Total: 100 points)

### 1. Grammar Compilation (30 points)
- **Purpose**: Verifies that any ANTLR grammar compiles successfully
- **Validates**: 
  - At least 2 Java classes are generated (typically Lexer + Parser)
  - ANTLR compilation process completes without errors
- **Grammar-agnostic**: Works with any .g4 file in `src/main/glc/`
- **Timeout**: 15 seconds

### 2. Grammar Test Execution (70 points)
- **Purpose**: Executes the grammar validation framework
- **Validates**: 
  - `mvn test` runs successfully
  - Grammar validation framework processes test cases
  - Test execution completes (regardless of pass/fail percentage)
- **Flexible scoring**: Based on successful test execution, not specific results
- **Timeout**: 30 seconds

## Workflow Features

### GitHub Actions Workflow (`.github/workflows/classroom.yml`)
- **Java Version**: OpenJDK 21 (Temurin distribution)
- **Caching**: Maven dependencies cached for faster builds
- **Validation Steps**:
  1. Grammar compilation with ANTLR
  2. Test execution with detailed reporting
  3. Quality threshold validation (80% minimum)
  4. Comprehensive result reporting

### Template Benefits
- **Grammar-agnostic**: Works with any grammar name and structure
- **Flexible**: Students can implement different types of grammars
- **Simple**: Only 2 tests to keep autograding lightweight
- **Extensible**: Framework automatically discovers new grammars

## Student Workflow

Students need to:
1. Implement their grammar(s) in `src/main/glc/*.g4`
2. Create corresponding test cases in `src/test/resources/*.yaml`
3. Test locally with `mvn test`
4. Push changes to trigger automated grading

The framework will automatically discover and test any grammar added to the project.

## Instructor Setup

1. **Import to GitHub Classroom**: Use this repository as a template
2. **Configure Assignment**: Set point values and deadlines
3. **Enable Actions**: Ensure GitHub Actions are enabled for the classroom
4. **Review Configuration**: Adjust quality thresholds if needed in `autograding.json`

## Local Testing Commands

```bash
# Compile any grammars and generate classes
mvn clean compile

# Run validation tests for all grammars
mvn test

# Check generated ANTLR files
ls target/generated-sources/antlr4/

# Test specific grammar (if multiple exist)
mvn exec:java -Dexec.mainClass="edu.eam.ingesoft.tlf.SimpleGrammarValidator" -Dexec.args="GrammarName"
```

## Files Structure

```
.github/
├── workflows/
│   └── classroom.yml          # Main GitHub Actions workflow (grammar-agnostic)
└── classroom/
    ├── autograding.json       # Simple autograding configuration  
    └── autograding.yml        # Alternative autograding format
src/
├── main/
│   ├── glc/
│   │   └── *.g4              # Student's grammar implementations (any name)
│   └── java/
│       └── edu/eam/ingesoft/tlf/
│           └── SimpleGrammarValidator.java  # Generic validation framework
└── test/
    └── resources/
        └── *.yaml            # Test cases for each grammar (matching names)
```

## Troubleshooting

### Common Issues
1. **Java Version**: Ensure Java 21+ is available in the environment
2. **ANTLR Plugin**: Maven plugin configured to use correct source directory
3. **Package Names**: Generated classes must be in `org.example` package
4. **Test Format**: YAML test files must follow the expected structure

### Debug Commands
```bash
# Check generated classes
ls -la target/generated-sources/antlr4/

# Verify package declaration
head -5 target/generated-sources/antlr4/ArithmeticLexer.java

# Test individual validations
grep -q 'grammar Arithmetic' src/main/glc/Arithmetic.g4 && echo "OK"
```