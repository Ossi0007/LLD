Factory:when we need to create an object multiple times based on the the condition then we use this DP

Abstract factory: It can be called as a factory of factories
eg: Vehicle-->Lux Vehicle--------->Vehicle Factory--> Another Factory above it
           --> Ordinary----------->Vehicle Factory-->


**Real-Life Use Case in Payment Gateways:**

**Factory Pattern:** To select the appropriate payment method such as Credit Card, Debit Card, UPI,
                    Net Banking, etc.
**Abstract Factory Pattern:** To support multiple banks, where each bank offers its implementation 
                    of payment methods.


**Real-Life Use Cases in Banking:**

**Factory Pattern:**
Creating different account types: Savings, Current, Fixed Deposit, etc.

**Abstract Factory Pattern:**
--Managing accounts for multiple banks or financial services.
--Handling platform-specific implementations (e.g., mobile banking, internet banking,
  or enterprise-level solutions).

