# 👥 OrangeHRM Automation Framework

<p align="center">
  <img src="https://img.shields.io/badge/Java-100%25-orange?style=for-the-badge&logo=openjdk&logoColor=white"/>
  <img src="https://img.shields.io/badge/Selenium-WebDriver-43B02A?style=for-the-badge&logo=selenium&logoColor=white"/>
  <img src="https://img.shields.io/badge/POM-Design%20Pattern-blue?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/TestNG-Runner-red?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white"/>
  <img src="https://img.shields.io/badge/ExtentReports-HTML-blueviolet?style=for-the-badge"/>
</p>

<p align="center">
  A <strong>Selenium automation framework</strong> for the <strong>OrangeHRM</strong> web application, built with <strong>Java</strong> and the <strong>Page Object Model (POM)</strong> design pattern. Covers login, employee management, and leave module test cases with integrated reporting.
</p>

---

## 📑 Table of Contents
- [Overview](#-overview)
- [Tech Stack](#-tech-stack)
- [Modules Covered](#-modules-covered)
- [Project Structure](#-project-structure)
- [Prerequisites](#-prerequisites)
- [Setup & Run](#-setup--run)
- [Test Scenarios](#-test-scenarios)
- [Key Features](#-key-features)

---

## 🔍 Overview

The **OrangeHRM Automation Framework** tests the core modules of the [OrangeHRM](https://opensource-demo.orangehrmlive.com/) HR Management application. Built entirely in Java using Selenium WebDriver and the Page Object Model, it provides a clean, scalable automation solution for HR system testing.

The framework covers three primary modules — **Login**, **Employee Management**, and **Leave Management** — with test execution managed by TestNG and results reported via ExtentReports.

**Languages:** Java 100%

---

## 🛠 Tech Stack

| Technology         | Purpose                           |
|--------------------|-----------------------------------|
| Java               | Core programming language         |
| Selenium WebDriver | Web browser automation            |
| TestNG             | Test runner and assertion library |
| Maven              | Build and dependency management   |
| ExtentReports      | HTML test reporting               |
| Page Object Model  | Framework design pattern          |
| Git & GitHub       | Version control                   |

---

## 📋 Modules Covered

### 🔐 Login Module
- Valid login with correct credentials
- Invalid login with wrong password
- Login with empty fields validation
- Logout functionality

### 👤 Employee Management Module
- Add a new employee
- Search for an existing employee
- Update employee details
- Delete an employee record

### 🗓 Leave Management Module
- Apply for leave
- View leave balance
- Approve / reject leave requests
- Cancel a leave application

---

## 📁 Project Structure

```
Orangehrm_Atutomation_Code/
├── Leave_management/
│   └── (leave module automation files)
├── src/
│   ├── main/java/pages/
│   │   ├── BasePage.java
│   │   ├── LoginPage.java
│   │   ├── DashboardPage.java
│   │   ├── EmployeePage.java
│   │   └── LeavePage.java
│   └── test/java/tests/
│       ├── LoginTest.java
│       ├── EmployeeTest.java
│       └── LeaveTest.java
├── reports/
├── pom.xml
└── testng.xml
```

---

## ✅ Prerequisites

- Java JDK 17+
- Apache Maven 3.8+
- Google Chrome (latest)
- IntelliJ IDEA or Eclipse

---

## ⚙️ Setup & Run

**1. Clone the repository**
```
git clone https://github.com/Karthik-0304/Orangehrm_Atutomation_Code.git
cd Orangehrm_Atutomation_Code
```

**2. Install dependencies**
```
mvn clean install
```

**3. Run all tests**
```
mvn clean test
```

**4. Run specific module**
```
mvn test -Dgroups="login"
mvn test -Dgroups="employee"
mvn test -Dgroups="leave"
```

---

## 🧪 Test Scenarios

| Module              | Test Case                              | Expected Result                     |
|---------------------|----------------------------------------|-------------------------------------|
| Login               | Login with valid credentials           | Dashboard page loads successfully   |
| Login               | Login with invalid password            | Error message displayed             |
| Employee Management | Add new employee                       | Employee appears in the list        |
| Employee Management | Search for employee by name            | Matching employee record found      |
| Employee Management | Update employee contact details        | Details saved successfully          |
| Leave Management    | Apply for annual leave                 | Leave request submitted             |
| Leave Management    | View leave balance                     | Balance displayed correctly         |
| Leave Management    | Cancel pending leave request           | Leave status updated to cancelled   |

---

## 💡 Key Features

- ✅ Clean Page Object Model — locators and actions are separated from test logic
- ✅ Three complete module suites — Login, Employee, Leave
- ✅ TestNG for parallel and grouped test execution
- ✅ ExtentReports HTML dashboard with pass/fail/skip summary
- ✅ Screenshots captured on test failure
- ✅ Reusable BasePage with common Selenium actions

---

<p align="center">Made with ❤️ by <a href="https://github.com/Karthik-0304">Karthik Sivakumar</a> · <a href="https://www.linkedin.com/in/karthik-s-772930248/">LinkedIn</a></p>
