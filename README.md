# Length Converter Program

This Java application demonstrates the use of the Chain of Responsibility (CoR) and Decorator design patterns to convert lengths from kilometers to various units such as miles, yards, and feet.

## Table of Contents

- [Introduction](#introduction)
- [Design Patterns Used](#design-patterns-used)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Dependencies](#dependencies)

## Introduction

The Length Converter Program is a Java application that allows users to convert lengths from kilometers to other units such as miles, yards, and feet. It leverages the Chain of Responsibility pattern to handle different units of conversion and the Decorator pattern to format the output.

## Design Patterns Used

### Chain of Responsibility (CoR)

The Chain of Responsibility pattern is used to handle conversion requests in a chain of converters. Each converter in the chain attempts to process the request. If it can handle the conversion, it does so; otherwise, it passes the request to the next converter in the chain.

### Decorator

The Decorator pattern is used to format the output of the conversion. The program applies decorators to round the output to the second decimal place, represent the output in exponential notation, and append the unit name to the converted amount.

## Usage

To use the Length Converter Program:

1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Run the `App.java` file to start the GUI.
4. Enter a numeric value in kilometers in the input field.
5. Select the desired unit (Mile, Yard, or Foot) from the dropdown menu.
6. Click the "Convert!" button to perform the conversion.
7. The converted and formatted result will be displayed in the output field.

## Project Structure

The project is structured as follows:

- `Q1A`: Contains the classes for implementing the Chain of Responsibility pattern.
- `Q1B`: Contains the classes for implementing the Decorator pattern and the Client class.
- `App.java`: Main entry point of the program.

## Dependencies

This project does not have any external dependencies. It is written in pure Java.

## UML Diagram
![Assignment 4](https://github.com/UMMEATHIYA/OOP_Assignment4_Decorator_Example/assets/43459908/99820dbc-afaa-41a6-a267-fe119dec56f1)

## Screenshots

![image](https://github.com/UMMEATHIYA/OOP_Assignment4_Decorator_Example/assets/43459908/502b0759-d821-47d5-9830-f675a9097d1b)
                              Figure 1.1 -> Kilometer to Miles conversion

![image](https://github.com/UMMEATHIYA/OOP_Assignment4_Decorator_Example/assets/43459908/4c4f8ea6-c977-4ded-bbff-737e228bf45b)
Figure 1.2 -> Kilometer to Yard conversion

![image](https://github.com/UMMEATHIYA/OOP_Assignment4_Decorator_Example/assets/43459908/4ff2994f-e13b-4abd-835e-8edd9017142a)
Figure 1.3 -> Kilometer to Foot conversion
